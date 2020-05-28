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

public class RationCardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aadhaar_servies);


        GetId();




        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_chevron_left_black_24dp);
        toolbar.setTitle("Ration Services");
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

                new MyHomeData("Changes to White Ration Card From...", "35","","","Enqiry For Personal Loan", R.drawable.navigat,"#9C27B0","FB"),
                new MyHomeData("Apply for Corrections In Ration Card","36","","","Enqiry For Personal Loan", R.drawable.navigat,"#FF0000","Google"),
                new MyHomeData("Change address in Ration Card","37","","","Enqiry For Personal Loan", R.drawable.navigat,"#5C9B14","FB"),
                new MyHomeData("Delete a Member From Ration Card","38","","","Enqiry For Personal Loan", R.drawable.navigat,"#5C9B14","FB"),
                new MyHomeData("Add a New Member in Ration Card","39","","","Enqiry For Personal Loan", R.drawable.navigat,"#5C9B14","FB"),
                new MyHomeData("Apply For Duplicate Ration card Online","40","","","Enqiry For Personal Loan", R.drawable.navigat,"#5C9B14","FB"),
                new MyHomeData("Smart Ration Card","41","","","Enqiry For Personal Loan", R.drawable.navigat,"#5C9B14","FB"),
                new MyHomeData("State Wise Ration Card","42","","","Enqiry For Personal Loan", R.drawable.navigat,"#5C9B14","FB"),



        };



        RecyclerView recyclerView = (RecyclerView)  findViewById(R.id.recyclerView);
        HomeAdapter adapter = new HomeAdapter(myListData);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(adapter);


    }


}
