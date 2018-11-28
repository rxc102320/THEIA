package com.example.theia;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FallDetection extends AppCompatActivity implements SensorEventListener {
    private SensorManager sensorManager;
    TextView text_X;
    TextView text_Y;
    TextView text_Z;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fall_detection);

        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        sensorManager.registerListener(this, sensorManager.getDefaultSensor( Sensor.TYPE_GYROSCOPE ),SensorManager.SENSOR_DELAY_NORMAL );
        text_X=(TextView)findViewById(R.id.txtXValue);
        text_Y=(TextView)findViewById(R.id.txtYValue);
        text_Z=(TextView)findViewById(R.id.txtZValue);
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        if (event.sensor.getType() == Sensor.TYPE_GYROSCOPE) {
            showValue(event);
        }

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }

    private void showValue(SensorEvent event){
        float[] value=event.values;

        text_X.setText("Value X: \n"+value[0]);
        text_Y.setText("Value Y: \n"+value[1]);
        text_Z.setText("Value Z: \n"+value[2]);

    }
}
