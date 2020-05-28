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

public class GovtjobActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aadhaar_servies);


        GetId();




        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_chevron_left_black_24dp);
        toolbar.setTitle("Govt. Job Services");
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

                new MyHomeData("Naukri", "314","","","Enqiry For Personal Loan", R.drawable.navigat,"#9C27B0","FB"),
                new MyHomeData("Monster India","315","","","Enqiry For Personal Loan", R.drawable.navigat,"#FF0000","Google"),
                new MyHomeData("Shine","316","","","Enqiry For Personal Loan", R.drawable.navigat,"#5C9B14","FB"),
                new MyHomeData("Indeed India","317","","","Enqiry For Personal Loan", R.drawable.navigat,"#5C9B14","FB"),
                new MyHomeData("Times Jobs","318","","","Enqiry For Personal Loan", R.drawable.navigat,"#5C9B14","FB"),
                new MyHomeData("Careesma","319","","","Enqiry For Personal Loan", R.drawable.navigat,"#5C9B14","FB"),
                new MyHomeData("Freshersworld","320","","","Enqiry For Personal Loan", R.drawable.navigat,"#5C9B14","FB"),
                new MyHomeData("Jobrapido India","321","","","Enqiry For Personal Loan", R.drawable.navigat,"#5C9B14","FB"),
                new MyHomeData("Sarkari Naukri Blog","322","","","Enqiry For Personal Loan", R.drawable.navigat,"#5C9B14","FB"),
                new MyHomeData("Career Builder","323","","","Enqiry For Personal Loan", R.drawable.navigat,"#5C9B14","FB"),

        };



        RecyclerView recyclerView = (RecyclerView)  findViewById(R.id.recyclerView);
        HomeAdapter adapter = new HomeAdapter(myListData);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(adapter);


    }


}
