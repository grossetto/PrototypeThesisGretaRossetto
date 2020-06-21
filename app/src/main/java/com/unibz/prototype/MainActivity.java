package com.unibz.prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText startDay;
    EditText startHour;
    EditText departureCity;
    EditText arrivalCity;
    Button submitButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startDay = findViewById(R.id.startDay);
        startHour = findViewById(R.id.startHour);
        departureCity = findViewById(R.id.departureCity);
        arrivalCity = findViewById(R.id.arrivalCity);
        submitButton = findViewById(R.id.submitButton);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, PredictionResult.class);
                startActivity(intent);
            }
        });

    }
}