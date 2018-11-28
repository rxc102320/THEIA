package com.example.theia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        configureCommandButton();
        configureExtrasButton();
        configureSettingButton();
    }

    private void configureCommandButton(){
        ImageButton addButton = (ImageButton) findViewById(R.id.commandButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                startActivity(new Intent(MainActivity.this, FallDetection.class));
            }
        });
    }

    private void configureSettingButton(){
        ImageButton addButton = (ImageButton) findViewById(R.id.settingsButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                startActivity(new Intent(MainActivity.this, SettingsActivity.class));
            }
        });
    }

    private void configureExtrasButton(){
        ImageButton addButton = (ImageButton) findViewById(R.id.extrasButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                startActivity(new Intent(MainActivity.this, ExtrasActivity.class));
            }
        });
    }
}
