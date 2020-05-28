package com.solution.idealz.Dashbord.ui;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.solution.idealz.Dashbord.dto.HomeAdapter;
import com.solution.idealz.Dashbord.dto.MyHomeData;
import com.solution.idealz.R;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class PassportActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aadhaar_servies);


        GetId();




        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_chevron_left_black_24dp);
        toolbar.setTitle("Passport Services");
        toolbar.setTitleTextColor(Color.WHITE);

        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


    }

    private void GetId( ) {



        MyHomeData[] myListData = new MyHomeData[] {

                new MyHomeData("Quick Guides", "50","","","Enqiry For Personal Loan", R.drawable.navigat,"#9C27B0","FB"),
                new MyHomeData("New User Registration","51","","","Enqiry For Personal Loan", R.drawable.navigat,"#FF0000","Google"),
                new MyHomeData("Existing User Login","52","","","Enqiry For Personal Loan", R.drawable.navigat,"#5C9B14","FB"),
                new MyHomeData("Track Application Status", "53","","","Enqiry For Personal Loan", R.drawable.navigat,"#9C27B0","FB"),
                new MyHomeData("Check Appointment Availability Sta...","54","","","Enqiry For Personal Loan", R.drawable.navigat,"#FF0000","Google"),
                new MyHomeData("Tatkaal Appointment Opening Time","55","","","Enqiry For Personal Loan", R.drawable.navigat,"#5C9B14","FB"),
                new MyHomeData("List Of Document For Fresh Passport", "56","","","Enqiry For Personal Loan", R.drawable.navigat,"#9C27B0","FB"),
                new MyHomeData("List Of Document For Re-issue of Pa..","57","","","Enqiry For Personal Loan", R.drawable.navigat,"#FF0000","Google"),
                new MyHomeData("Passport Fee Calculator","58","","","Enqiry For Personal Loan", R.drawable.navigat,"#5C9B14","FB"),
                new MyHomeData("Know Your Police Station", "59","","","Enqiry For Personal Loan", R.drawable.navigat,"#9C27B0","FB"),
                new MyHomeData("Locate Passport Sewa Kendra","60","","","Enqiry For Personal Loan", R.drawable.navigat,"#FF0000","Google"),
                new MyHomeData("Locate Common Services Centers","61","","","Enqiry For Personal Loan", R.drawable.navigat,"#5C9B14","FB"),
                new MyHomeData("Madad Student Registration", "62","","","Enqiry For Personal Loan", R.drawable.navigat,"#9C27B0","FB"),
                new MyHomeData("Help","63","","","Enqiry For Personal Loan", R.drawable.navigat,"#FF0000","Google"),



        };



        RecyclerView recyclerView = (RecyclerView)  findViewById(R.id.recyclerView);
        HomeAdapter adapter = new HomeAdapter(myListData);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(adapter);


    }


}
