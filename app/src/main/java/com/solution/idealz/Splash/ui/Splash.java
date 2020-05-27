package com.solution.idealz.Splash.ui;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.loader.content.Loader;
import com.solution.idealz.Dashbord.ui.MainActivity;
import com.solution.idealz.R;


public class Splash extends AppCompatActivity {

      @Override
    protected void onPause() {
         super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();


    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);


        dashboardpage();



    }

    public void dashboardpage() {

        Thread timerThread = new Thread(){
            public void run(){
                try{
                    sleep(5000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{

                    startDashbord();
                }
            }
        };
        timerThread.start();
    }


    public void startDashbord() {
        Intent intent = new Intent(Splash.this, MainActivity.class);
        startActivity(intent);
        finish();
    }


    }
