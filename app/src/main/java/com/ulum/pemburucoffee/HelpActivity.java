package com.ulum.pemburucoffee;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class HelpActivity extends Activity {
    private ViewFlipper viewFlipper;
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        submit = findViewById(R.id.ok);
        viewFlipper = findViewById(R.id.view_flipper);
        viewFlipper.setFlipInterval(2000);
        viewFlipper.startFlipping();

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//            Toast.makeText(getApplicationContext(), "Terimakasih Telah Memberikan Penilaian ", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(HelpActivity.this, HomeActivity.class);
                startActivity(i);
            }
        });
    }


    public void previousView(View v) {
        viewFlipper.setInAnimation(this, R.anim.slide_in_right);
        viewFlipper.setOutAnimation(this, R.anim.slide_out_left);
        viewFlipper.showPrevious();
    }
    public void nextView(View v) {
        viewFlipper.setInAnimation(this, android.R.anim.slide_in_left);
        viewFlipper.setOutAnimation(this, android.R.anim.slide_out_right);
        viewFlipper.showNext();
    }

}
