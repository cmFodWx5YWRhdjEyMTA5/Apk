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

public class IndaneGasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aadhaar_servies);


        GetId();




        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_chevron_left_black_24dp);
        toolbar.setTitle("Indane Gas Services");
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

                new MyHomeData("Book Cylinder Online", "93","","","Enqiry For Personal Loan", R.drawable.navigat,"#9C27B0","FB"),
                new MyHomeData("Track Your Cylinder","94","","","Enqiry For Personal Loan", R.drawable.navigat,"#FF0000","Google"),
                new MyHomeData("Register New Connection","95","","","Enqiry For Personal Loan", R.drawable.navigat,"#5C9B14","FB"),
                new MyHomeData("Double Bottle Connection", "96","","","Enqiry For Personal Loan", R.drawable.navigat,"#9C27B0","FB"),
                new MyHomeData("Change Your Distributor","97","","","Enqiry For Personal Loan", R.drawable.navigat,"#FF0000","Google"),
                new MyHomeData("Rate Your Distributor","98","","","Enqiry For Personal Loan", R.drawable.navigat,"#5C9B14","FB"),
                new MyHomeData("Surrender Your Connection", "99","","","Enqiry For Personal Loan", R.drawable.navigat,"#9C27B0","FB"),
                new MyHomeData("Preferred Time Delivery","100","","","Enqiry For Personal Loan", R.drawable.navigat,"#FF0000","Google"),
                new MyHomeData("Buy 5 KG Cylinder","101","","","Enqiry For Personal Loan", R.drawable.navigat,"#5C9B14","FB"),
                new MyHomeData("Customer Care","102","","","Enqiry For Personal Loan", R.drawable.navigat,"#5C9B14","FB"),



        };



        RecyclerView recyclerView = (RecyclerView)  findViewById(R.id.recyclerView);
        HomeAdapter adapter = new HomeAdapter(myListData);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(adapter);


    }


}
