package com.ulum.pemburucoffee;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

//import android.app.Activity;

public class RatingAppActivity extends AppCompatActivity {
    private TextView getRating;
    private Button Submit;
    private RatingBar RatingBar;
    Button cardviewrating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_app);
        getRating = findViewById(R.id.rate);
        Submit = findViewById(R.id.submit);
        RatingBar = findViewById(R.id.penilaian);
//        cardviewrating = findViewById(R.id.submit);

        RatingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float nilai, boolean b) {

                getRating.setText("Rating: " + nilai);
            }
        });
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "Terimakasih Telah Memberikan Penilaian ", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(RatingAppActivity.this, HomeActivity.class);
                startActivity(i);
            }
        });

//        cardviewrating.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View view) {
//                Intent i = new Intent(RatingAppActivity.this, HomeActivity.class);
//                startActivity(i);
//
//            }
//        });

    }
}
