package com.solution.idealz.Dashbord.ui;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.solution.idealz.R;

public class HomeFragment extends Fragment implements View.OnClickListener {

    ImageView aadhaar,voter_card,pan_card_h,ration_card_h,driving_licence_h,passport_h,pf_service_h,postal_h,lpg_gas_h,train_h,bus_h,
                  net_banking_h,yojna_h,agriculture_h,govtjob_h,digital_locker_h,courier_truck_h,help_line_h,govt_link_h;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

         View v= inflater.inflate(R.layout.fragment_home, container, false);

         GetId(v);


        return v;
    }

    private void GetId(View v) {

        aadhaar=v.findViewById(R.id.aadhaar);
        voter_card=v.findViewById(R.id.voter_card);
        pan_card_h=v.findViewById(R.id.pan_card_h);
        ration_card_h=v.findViewById(R.id.ration_card_h);
        driving_licence_h=v.findViewById(R.id.driving_licence_h);

        passport_h=v.findViewById(R.id.passport_h);
        pf_service_h=v.findViewById(R.id.pf_service_h);
        postal_h=v.findViewById(R.id.postal_h);
        lpg_gas_h=v.findViewById(R.id.lpg_gas_h);

        train_h=v.findViewById(R.id.train_h);
        bus_h=v.findViewById(R.id.bus_h);
        net_banking_h=v.findViewById(R.id.net_banking_h);
        yojna_h=v.findViewById(R.id.yojna_h);
        agriculture_h=v.findViewById(R.id.agriculture_h);
        govtjob_h=v.findViewById(R.id.govtjob_h);
        digital_locker_h=v.findViewById(R.id.digital_locker_h);
        courier_truck_h=v.findViewById(R.id.courier_truck_h);
        help_line_h=v.findViewById(R.id.help_line_h);
        govt_link_h=v.findViewById(R.id.govt_link_h);

                aadhaar.setOnClickListener(this);
                voter_card.setOnClickListener(this);
                pan_card_h.setOnClickListener(this);
                ration_card_h.setOnClickListener(this);
                driving_licence_h.setOnClickListener(this);
                passport_h.setOnClickListener(this);
                pf_service_h.setOnClickListener(this);
                postal_h.setOnClickListener(this);
                lpg_gas_h.setOnClickListener(this);
                train_h.setOnClickListener(this);
                bus_h.setOnClickListener(this);
                net_banking_h.setOnClickListener(this);
                yojna_h.setOnClickListener(this);
                agriculture_h.setOnClickListener(this);
                govtjob_h.setOnClickListener(this);
                digital_locker_h.setOnClickListener(this);
                courier_truck_h.setOnClickListener(this);
                help_line_h.setOnClickListener(this);
                govt_link_h.setOnClickListener(this);





    }

    @Override
    public void onClick(View v) {

        if(v==aadhaar){


            startActivity(new Intent(getActivity(), AadhaarActivity.class));

        }

        if(v==voter_card){

            startActivity(new Intent(getActivity(), VoterActivity.class));

        }

        if(v==pan_card_h){}

        if(v==ration_card_h){}

        if(v==driving_licence_h){}

        if(v==passport_h){}

        if(v==pf_service_h){}

        if(v==postal_h){}

        if(v==lpg_gas_h){}

        if(v==train_h){}

        if(v==bus_h){}

        if(v== net_banking_h){}

        if(v==yojna_h){}

        if(v==agriculture_h){}

        if(v==govtjob_h){}

        if(v==digital_locker_h){}

        if(v==courier_truck_h){}

        if(v==help_line_h){}

        if(v==govt_link_h){}



    }
}