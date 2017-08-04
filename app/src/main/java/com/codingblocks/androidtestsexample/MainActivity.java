package com.codingblocks.androidtestsexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnCalc;
    EditText etKm, etMin;
    TextView tvFare;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalc = (Button) findViewById(R.id.btnCalc);
        etKm = (EditText) findViewById(R.id.etKm);
        etMin = (EditText) findViewById(R.id.etTime);
        tvFare = (TextView) findViewById(R.id.tvFare);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int km = Integer.valueOf(etKm.getText().toString());
                int min = Integer.valueOf(etMin.getText().toString());

                float fare = calcFare(km, min);
                tvFare.setText(String.valueOf(fare));

            }
        });
    }

    float calcFare (int km, int min) {

        float fare = 25;
        if (km > 2) {
            fare += (km - 2) * 8;
        }
        if (min > 15) {
            fare += min - 15;
        }

        return fare;
    }


}
