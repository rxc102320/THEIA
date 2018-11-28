package com.example.theia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ExtrasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extras);

        configureNavButton();
        configureEmergencyButton();
        configureSettingsButton();
    }

    private void configureNavButton(){
        Button addButton = (Button) findViewById(R.id.navButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                startActivity(new Intent(ExtrasActivity.this, NavigationActivity.class));
            }
        });
    }

    private void configureEmergencyButton(){
        Button addButton = (Button) findViewById(R.id.emergencyButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                startActivity(new Intent(ExtrasActivity.this, EmergencyActivity.class));
            }
        });
    }

    private void configureSettingsButton(){
        Button addButton = (Button) findViewById(R.id.preferencesButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                startActivity(new Intent(ExtrasActivity.this, UserSettings.class));
            }
        });
    }
}
