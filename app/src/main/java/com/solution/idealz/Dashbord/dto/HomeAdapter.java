package com.solution.idealz.Dashbord.dto;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.solution.idealz.Dashbord.ui.AadhaarEnrolmentActivity;
import com.solution.idealz.Dashbord.ui.AadhaarServiesActivity;
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

                 view.getContext().startActivity(new Intent(view.getContext(), AadhaarEnrolmentActivity.class));



                //  AadhaarEnrolmentActivity




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
