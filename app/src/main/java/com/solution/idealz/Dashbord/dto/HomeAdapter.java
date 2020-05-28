package com.solution.idealz.Dashbord.dto;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.solution.idealz.Dashbord.ui.AadhaarEnrolmentActivity;
import com.solution.idealz.Dashbord.ui.AadhaarServiceActivity;
import com.solution.idealz.Dashbord.ui.AadhaarUpdateActivity;
import com.solution.idealz.Dashbord.ui.BharatGasActivity;
import com.solution.idealz.Dashbord.ui.HPGasActivity;
import com.solution.idealz.Dashbord.ui.IndaneGasActivity;
import com.solution.idealz.Dashbord.ui.PostalBankingActivity;
import com.solution.idealz.Dashbord.ui.PostalMailActivity;
import com.solution.idealz.R;


public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder>{
    private MyHomeData[] listdata;

     public HomeAdapter(MyHomeData[] listdata) {
        this.listdata = listdata;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.home_adapter_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        final MyHomeData myListData = listdata[position];

        holder.descrition.setText(""+myListData.getDescription());


        holder.descrition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

              if(myListData.getLeadid().equals("0")){

                  //  AadhaarEnrolmentActivity
                  view.getContext().startActivity(new Intent(view.getContext(), AadhaarEnrolmentActivity.class));

              }
                if(myListData.getLeadid().equals("1")){

                    //  AadhaarUpdateActivity
                    view.getContext().startActivity(new Intent(view.getContext(), AadhaarUpdateActivity.class));

                }
                if(myListData.getLeadid().equals("2")){

                    //  AadhaarServiceActivity
                    view.getContext().startActivity(new Intent(view.getContext(), AadhaarServiceActivity.class));

                }

                if(myListData.getLeadid().equals("74")){

                    //  PostalMailActivity
                    view.getContext().startActivity(new Intent(view.getContext(), PostalMailActivity.class));

                }

                if(myListData.getLeadid().equals("75")){

                    //  PostalBankingActivity
                    view.getContext().startActivity(new Intent(view.getContext(), PostalBankingActivity.class));

                }

                if(myListData.getLeadid().equals("90")){

                    //  IndaneGasActivity
                    view.getContext().startActivity(new Intent(view.getContext(), IndaneGasActivity.class));

                }

                if(myListData.getLeadid().equals("91")){

                    //  BharatGasActivity
                    view.getContext().startActivity(new Intent(view.getContext(), BharatGasActivity.class));

                }

                if(myListData.getLeadid().equals("92")){

                    //  HPGasActivity
                    view.getContext().startActivity(new Intent(view.getContext(), HPGasActivity.class));

                }

            }
        });

    }


    @Override
    public int getItemCount() {
        return listdata.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

         TextView descrition;


        public ViewHolder(View itemView) {
            super(itemView);

            this.descrition = (TextView) itemView.findViewById(R.id.descrition);

         }
    }
}
