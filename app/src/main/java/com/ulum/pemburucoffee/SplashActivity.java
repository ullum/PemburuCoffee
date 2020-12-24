package com.ulum.pemburucoffee;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        Thread timer = new Thread() {
            public void run() {
                try {
                    // berapa lama splashscreen akan ditampilkan dalam milisecond
                    sleep(3000);
                } catch (InterruptedException e){
                    //TODO : handel exception
                    e.printStackTrace();
                }finally {
                    // activity yang akan dijalanakan setelah spalsscreen selesai
                    Intent i = new
                            Intent(SplashActivity.this,HomeActivity.class);
                    startActivity(i);
                }
            }
        };
        timer.start();
    }
}
