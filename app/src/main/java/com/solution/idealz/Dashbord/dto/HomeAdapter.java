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
import com.solution.idealz.Dashbord.ui.WebViewActivity;
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
                if(myListData.getLeadid().equals("3")){

                    //  Enrollment & Update Centres
                    Intent i=new Intent(view.getContext(), WebViewActivity.class);
                    i.putExtra("name","Enrollment & Update Centres");
                    i.putExtra("url","http://lucknowapi.org/about%20us.html");
                    view.getContext().startActivity(i);

                }
                if(myListData.getLeadid().equals("4")){

                    //  Locate Enrollment & Update Centers
                    Intent i=new Intent(view.getContext(), WebViewActivity.class);
                    i.putExtra("name","Locate Enrollment & Update Centers");
                    i.putExtra("url","http://lucknowapi.org/about%20us.html");
                    view.getContext().startActivity(i);

                }
                if(myListData.getLeadid().equals("5")){

                    //  Check Aadhaar Status
                    Intent i=new Intent(view.getContext(), WebViewActivity.class);
                    i.putExtra("name","Check Aadhaar Status");
                    i.putExtra("url","http://lucknowapi.org/about%20us.html");
                    view.getContext().startActivity(i);

                }
                if(myListData.getLeadid().equals("6")){

                    //  Download Aadhaar
                    Intent i=new Intent(view.getContext(), WebViewActivity.class);
                    i.putExtra("name","Download Aadhaar");
                    i.putExtra("url","http://lucknowapi.org/about%20us.html");
                    view.getContext().startActivity(i);

                }
                if(myListData.getLeadid().equals("7")){

                    //  Get Adhaar Number On Mobile
                    Intent i=new Intent(view.getContext(), WebViewActivity.class);
                    i.putExtra("name","Get Adhaar Number On Mobile");
                    i.putExtra("url","http://lucknowapi.org/about%20us.html");
                    view.getContext().startActivity(i);

                }
                if(myListData.getLeadid().equals("8")){

                    //  Retrieve Lost UID/EID
                    Intent i=new Intent(view.getContext(), WebViewActivity.class);
                    i.putExtra("name","Retrieve Lost UID/EID");
                    i.putExtra("url","http://lucknowapi.org/about%20us.html");
                    view.getContext().startActivity(i);

                }
                if(myListData.getLeadid().equals("9")){

                    //Update at Enrollment Centre
                    Intent i=new Intent(view.getContext(),WebViewActivity.class);
                    i.putExtra("name","Update at Enrollment Centre");
                    i.putExtra("url","http://lucknowapi.org/about%20us.html");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("10")){

                    //Check Status: Update done at Center
                    Intent i=new Intent(view.getContext(),WebViewActivity.class);
                    i.putExtra("name","Check Status: Update done at Center");
                    i.putExtra("url","http://lucknowapi.org/about%20us.html");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("11")){

                    //Address update request(Online)
                    Intent i=new Intent(view.getContext(),WebViewActivity.class);
                    i.putExtra("name","Address update request(Online)");
                    i.putExtra("url","http://lucknowapi.org/about%20us.html");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("12")){

                    //Check Status: Update done Online
                    Intent i=new Intent(view.getContext(),WebViewActivity.class);
                    i.putExtra("name","Check Status: Update done Online");
                    i.putExtra("url","http://lucknowapi.org/about%20us.html");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("13")){

                    //Aadhar Update Online
                    Intent i=new Intent(view.getContext(),WebViewActivity.class);
                    i.putExtra("name","Aadhar Update Online");
                    i.putExtra("url","http://lucknowapi.org/about%20us.html");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("14")){

                    //Verify Adhaar Number
                    Intent i=new Intent(view.getContext(),WebViewActivity.class);
                    i.putExtra("name","Verify Adhaar Number");
                    i.putExtra("url","http://lucknowapi.org/about%20us.html");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("15")){

                    //Verify Email/Mobile Number
                    Intent i=new Intent(view.getContext(),WebViewActivity.class);
                    i.putExtra("name","Verify Email/Mobile Number");
                    i.putExtra("url","http://lucknowapi.org/about%20us.html");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("16")){

                    //Lock/Unlock Biometrics
                    Intent i=new Intent(view.getContext(),WebViewActivity.class);
                    i.putExtra("name","Lock/Unlock Biometrics");
                    i.putExtra("url","http://lucknowapi.org/about%20us.html");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("17")){

                    //Check Adhaar & Bank Account Link
                    Intent i=new Intent(view.getContext(),WebViewActivity.class);
                    i.putExtra("name","Check Adhaar & Bank Account Link");
                    i.putExtra("url","http://lucknowapi.org/about%20us.html");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("18")){

                    //Adhaar Aunthentication History
                    Intent i=new Intent(view.getContext(),WebViewActivity.class);
                    i.putExtra("name","Adhaar Aunthentication History");
                    i.putExtra("url","http://lucknowapi.org/about%20us.html");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("19")){

                    //Virtual ID(VID) Generator
                    Intent i=new Intent(view.getContext(),WebViewActivity.class);
                    i.putExtra("name","Virtual ID(VID) Generator");
                    i.putExtra("url","http://lucknowapi.org/about%20us.html");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("20")){

                    //Know Your Booth, AC and PC
                    Intent i=new Intent(view.getContext(),WebViewActivity.class);
                    i.putExtra("name","Know Your Booth, AC and PC");
                    i.putExtra("url","http://lucknowapi.org/about%20us.html");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("21")){

                    //Know Your BLO, ERO amd DEO
                    Intent i=new Intent(view.getContext(),WebViewActivity.class);
                    i.putExtra("name","Know Your BLO, ERO amd DEO");
                    i.putExtra("url","http://lucknowapi.org/about%20us.html");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("22")){

                    //Link TO State/UT CEOs
                    Intent i=new Intent(view.getContext(),WebViewActivity.class);
                    i.putExtra("name","Link TO State/UT CEOs");
                    i.putExtra("url","http://lucknowapi.org/about%20us.html");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("23")){

                    //Voter List
                    Intent i=new Intent(view.getContext(),WebViewActivity.class);
                    i.putExtra("name","Voter List");
                    i.putExtra("url","http://lucknowapi.org/about%20us.html");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("24")){

                    //Voter Educational Channel
                    Intent i=new Intent(view.getContext(),WebViewActivity.class);
                    i.putExtra("name","Voter Educational Channel");
                    i.putExtra("url","http://lucknowapi.org/about%20us.html");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("25")){

                    //Pooling Process
                    Intent i=new Intent(view.getContext(),WebViewActivity.class);
                    i.putExtra("name","Pooling Process");
                    i.putExtra("url","http://lucknowapi.org/about%20us.html");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("26")){

                    //EVM Machine
                    Intent i=new Intent(view.getContext(),WebViewActivity.class);
                    i.putExtra("name","EVM Machine");
                    i.putExtra("url","http://lucknowapi.org/about%20us.html");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("27")){

                    //Complaint/Suggestions
                    Intent i=new Intent(view.getContext(),WebViewActivity.class);
                    i.putExtra("name","Complaint/Suggestions");
                    i.putExtra("url","http://lucknowapi.org/about%20us.html");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("28")){

                    //Help
                    Intent i=new Intent(view.getContext(),WebViewActivity.class);
                    i.putExtra("name","Help");
                    i.putExtra("url","http://lucknowapi.org/about%20us.html");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("29")){

                    //Guidline For Submission Pan Appl...
                    Intent i=new Intent(view.getContext(),WebViewActivity.class);
                    i.putExtra("name","Guidline For Submission Pan Appl...");
                    i.putExtra("url","http://lucknowapi.org/about%20us.html");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("30")){

                    //Apply For New Pan Card
                    Intent i=new Intent(view.getContext(),WebViewActivity.class);
                    i.putExtra("name","Apply For New Pan Card");
                    i.putExtra("url","http://lucknowapi.org/about%20us.html");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("31")){

                    //Track PAN/TAN Application Status
                    Intent i=new Intent(view.getContext(),WebViewActivity.class);
                    i.putExtra("name","Track PAN/TAN Application Status");
                    i.putExtra("url","http://lucknowapi.org/about%20us.html");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("32")){

                    //Apply For New Pan Car(Physically...
                    Intent i=new Intent(view.getContext(),WebViewActivity.class);
                    i.putExtra("name","Apply For New Pan Car(Physically...");
                    i.putExtra("url","http://lucknowapi.org/about%20us.html");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("33")){

                    //Pan Card Correction Online
                    Intent i=new Intent(view.getContext(),WebViewActivity.class);
                    i.putExtra("name","Pan Card Correction Online");
                    i.putExtra("url","http://lucknowapi.org/about%20us.html");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("34")){

                    //Steps For Online Correction
                    Intent i=new Intent(view.getContext(),WebViewActivity.class);
                    i.putExtra("name","Steps For Online Correction");
                    i.putExtra("url","http://lucknowapi.org/about%20us.html");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("35")){

                    //Changes to White Ration Card From...
                    Intent i=new Intent(view.getContext(),WebViewActivity.class);
                    i.putExtra("name","Changes to White Ration Card From...");
                    i.putExtra("url","http://lucknowapi.org/about%20us.html");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("36")){

                    //Apply for Corrections In Ration Card
                    Intent i=new Intent(view.getContext(),WebViewActivity.class);
                    i.putExtra("name","Apply for Corrections In Ration Card");
                    i.putExtra("url","http://lucknowapi.org/about%20us.html");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("37")){

                    //Change address in Ration Card
                    Intent i=new Intent(view.getContext(),WebViewActivity.class);
                    i.putExtra("name","Change address in Ration Card");
                    i.putExtra("url","http://lucknowapi.org/about%20us.html");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("38")){

                    //Delete a Member From Ration Card
                    Intent i=new Intent(view.getContext(),WebViewActivity.class);
                    i.putExtra("name","Delete a Member From Ration Card");
                    i.putExtra("url","http://lucknowapi.org/about%20us.html");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("39")){

                    //SAdd a New Member in Ration Card
                    Intent i=new Intent(view.getContext(),WebViewActivity.class);
                    i.putExtra("name","Add a New Member in Ration Card");
                    i.putExtra("url","http://lucknowapi.org/about%20us.html");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("40")){

                    //Apply For Duplicate Ration card Online
                    Intent i=new Intent(view.getContext(),WebViewActivity.class);
                    i.putExtra("name","Apply For Duplicate Ration card Online");
                    i.putExtra("url","http://lucknowapi.org/about%20us.html");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("41")){

                    //Smart Ration Card
                    Intent i=new Intent(view.getContext(),WebViewActivity.class);
                    i.putExtra("name","Smart Ration Card");
                    i.putExtra("url","http://lucknowapi.org/about%20us.html");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("42")){

                    //State Wise Ration Card
                    Intent i=new Intent(view.getContext(),WebViewActivity.class);
                    i.putExtra("name","State Wise Ration Card");
                    i.putExtra("url","http://lucknowapi.org/about%20us.html");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("43")){

                    //Apply for New Learner Licence
                    Intent i=new Intent(view.getContext(),WebViewActivity.class);
                    i.putExtra("name","Apply for New Learner Licence");
                    i.putExtra("url","http://lucknowapi.org/about%20us.html");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("44")){

                    //Apply for new driving licence
                    Intent i=new Intent(view.getContext(),WebViewActivity.class);
                    i.putExtra("name","Apply for new driving licence");
                    i.putExtra("url","http://lucknowapi.org/about%20us.html");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("45")){

                    //Track Application Status
                    Intent i=new Intent(view.getContext(),WebViewActivity.class);
                    i.putExtra("name","Track Application Status");
                    i.putExtra("url","http://lucknowapi.org/about%20us.html");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("46")){

                    //Renewal/Duplicate Licence
                    Intent i=new Intent(view.getContext(),WebViewActivity.class);
                    i.putExtra("name","Renewal/Duplicate Licence");
                    i.putExtra("url","http://lucknowapi.org/about%20us.html");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("47")){

                    //Smart Card Driving Licence
                    Intent i=new Intent(view.getContext(),WebViewActivity.class);
                    i.putExtra("name","Smart Card Driving Licence");
                    i.putExtra("url","http://lucknowapi.org/about%20us.html");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("48")){

                    //Know your RC Status
                    Intent i=new Intent(view.getContext(),WebViewActivity.class);
                    i.putExtra("name","Know your RC Status");
                    i.putExtra("url","http://lucknowapi.org/about%20us.html");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("49")){

                    //Driving Licence Test
                    Intent i=new Intent(view.getContext(),WebViewActivity.class);
                    i.putExtra("name","Driving Licence Test");
                    i.putExtra("url","http://lucknowapi.org/about%20us.html");
                    view.getContext().startActivity(i);
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
