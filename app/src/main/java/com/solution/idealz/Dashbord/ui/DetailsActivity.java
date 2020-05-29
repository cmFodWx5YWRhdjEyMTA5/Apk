package com.solution.idealz.Dashbord.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.solution.idealz.R;

public class DetailsActivity extends AppCompatActivity {

    TextView text;
    String posstion="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);



        posstion=getIntent().getStringExtra("posstion");


        text=findViewById(R.id.details);
        String[] jkj= getResources().getStringArray(R.array.D_AadharEnrollArray);
        text.setText(""+jkj[Integer.parseInt(posstion)]);



    }
}
