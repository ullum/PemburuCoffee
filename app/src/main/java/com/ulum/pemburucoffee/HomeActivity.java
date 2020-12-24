package com.ulum.pemburucoffee;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.cardview.widget.CardView;


public class HomeActivity extends Activity {
    CardView cardview;
    CardView cardviewabout;
    CardView cardviewrating;
    CardView cardviewfavorit;
    ImageView imghelp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        cardview = (CardView) findViewById(R.id.btncari);
        cardviewabout = (CardView) findViewById(R.id.btnabout);
        cardviewrating = (CardView) findViewById(R.id.btnrating);
        cardviewfavorit = (CardView) findViewById(R.id.btnfavorit);
        imghelp = (ImageView) findViewById(R.id.helps);


        cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomeActivity.this, CariActivity.class);
                startActivity(i);
            }
        });

        cardviewabout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent i = new Intent(HomeActivity.this, AboutActivity.class);
                startActivity(i);
            }
        });

        cardviewrating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent i = new Intent(HomeActivity.this, RatingAppActivity.class);
                startActivity(i);
            }
        });

        cardviewfavorit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent i = new Intent(HomeActivity.this, FavoritActivity.class);
                startActivity(i);
            }
        });

        imghelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent i = new Intent(HomeActivity.this, HelpActivity.class);
                startActivity(i);
            }
        });
    }
}