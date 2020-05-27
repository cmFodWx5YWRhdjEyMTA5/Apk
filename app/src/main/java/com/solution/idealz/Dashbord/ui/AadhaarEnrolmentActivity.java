package com.solution.idealz.Dashbord.ui;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.solution.idealz.Dashbord.dto.HomeAdapter;
import com.solution.idealz.Dashbord.dto.MyHomeData;
import com.solution.idealz.R;

public class AadhaarEnrolmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aadhaar_servies);


        GetId();




        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_chevron_left_black_24dp);
        toolbar.setTitle("Aadhar Enrollment");
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

                new MyHomeData("Enrollment & Update Centres", "DUN001","","","Enqiry For Personal Loan", R.drawable.navigat,"#9C27B0","FB"),
                new MyHomeData("","DUN002","","","Enqiry For Personal Loan", R.drawable.navigat,"#FF0000","Google"),
                new MyHomeData("Aadhar Services","DUN002","","","Enqiry For Personal Loan", R.drawable.navigat,"#5C9B14","FB"),



        };



        RecyclerView recyclerView = (RecyclerView)  findViewById(R.id.recyclerView);
        HomeAdapter adapter = new HomeAdapter(myListData);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(adapter);


    }


}
