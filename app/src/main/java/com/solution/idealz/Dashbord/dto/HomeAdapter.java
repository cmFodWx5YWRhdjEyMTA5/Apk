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
import com.solution.idealz.Dashbord.ui.DetailsActivity;
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
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","0");
                    view.getContext().startActivity(i);


                }
                if(myListData.getLeadid().equals("4")){

                    //  Locate Enrollment & Update Centers
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","1");
                    view.getContext().startActivity(i);

                }
                if(myListData.getLeadid().equals("5")){

                    //  Check Aadhaar Status
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","2");
                    view.getContext().startActivity(i);

                }
                if(myListData.getLeadid().equals("6")){

                    //  Download Aadhaar
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","3");
                    view.getContext().startActivity(i);

                }
                if(myListData.getLeadid().equals("7")){

                    //  Get Adhaar Number On Mobile
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","4");
                    view.getContext().startActivity(i);

                }
                if(myListData.getLeadid().equals("8")){

                    //  Retrieve Lost UID/EID
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","5");
                    view.getContext().startActivity(i);

                }
                if(myListData.getLeadid().equals("9")){

                    //Update at Enrollment Centre
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","6");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("10")){

                    //Check Status: Update done at Center
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","7");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("11")){

                    //Address update request(Online)
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","8");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("12")){

                    //Check Status: Update done Online
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","9");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("13")){

                    //Aadhar Update Online
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","10");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("14")){

                    //Verify Adhaar Number
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","11");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("15")){

                    //Verify Email/Mobile Number
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","12");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("16")){

                    //Lock/Unlock Biometrics
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","13");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("17")){

                    //Check Adhaar & Bank Account Link
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","14");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("18")){

                    //Adhaar Aunthentication History
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","15");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("19")){

                    //Virtual ID(VID) Generator
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","16");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("20")){

                    //Search Your Name In Electroral Roll
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","17");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("21")){

                    //Voter ID Card Status
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","18");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("22")){

                    //Apply Online For Registration of Ne...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","19");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("23")){

                    //Apply Online For Registration of Ov...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","20");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("24")){

                    //Correction Of Enteries In Electrol Roll
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","21");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("25")){

                    //Transportation Within Assembly
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","22");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("26")){

                    //Track Application Status
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","23");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("27")){

                    //Know Your Booth, AC and PC
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","24");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("28")){

                    //Know Your BLO, ERO amd DEO
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","25");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("29")){

                    //Link TO State/UT CEOs
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","26");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("30")){

                    //Voter List
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","27");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("31")){

                    //Voter Educational Channel
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","28");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("32")){

                    //Pooling Process
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","29");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("33")){

                    //EVM Machine
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","30");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("34")){

                    //Complaint/Suggestions
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","31");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("35")){

                    //Help
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","32");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("36")){

                    //Guidline For Submission Pan Appl...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","33");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("37")){

                    //Apply For New Pan Card
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","34");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("38")){

                    //Track PAN/TAN Application Status
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","35");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("39")){

                    //Apply For New Pan Car(Physically...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","36");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("40")){

                    //Pan Card Correction Online
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","37");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("41")){

                    //Steps For Online Correction
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","38");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("42")){

                    //Changes to White Ration Card From...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","39");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("43")){

                    //Apply for Corrections In Ration Card
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","40");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("44")){

                    //Change address in Ration Card
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","41");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("45")){

                    //Delete a Member From Ration Card
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","42");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("46")){

                    //Add a New Member in Ration Card
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","43");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("47")){

                    //Apply For Duplicate Ration card Online
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","44");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("48")){

                    //Smart Ration Card
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","45");
                    view.getContext().startActivity(i);
                }
                if(myListData.getLeadid().equals("49")){

                    //State Wise Ration Card
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","46");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("50")){

                    //Apply for New Learner Licence
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","47");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("51")){

                    //Apply for new driving licence
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","48");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("52")){

                    //Track Application Status
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","49");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("53")){


                    //Renewal/Duplicate Licence
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","50");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("54")){

                    //Smart Card Driving Licence
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","51");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("55")){

                    //Know your RC Status
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","52");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("56")){

                    //Driving Licence Test
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","53");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("57")){

                    //Quick Guides
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","54");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("58")){

                    //New User Registration
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","55");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("59")){

                    //Existing User Login
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","56");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("60")){

                    //Track Application Status
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","57");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("61")){

                    //Check Appointment Availability Sta...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","58");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("62")){

                    //Tatkaal Appointment Opening Time
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","59");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("63")){

                    //List Of Document For Fresh Passport
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","60");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("64")){

                    //List Of Document For Re-issue of Pa..
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","61");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("65")){

                    //Passport Fee Calculator
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","62");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("66")){

                    //Know Your Police Station
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","63");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("67")){

                    //Locate Passport Sewa Kendra
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","64");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("68")){

                    //Locate Common Services Centers
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","65");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("69")){

                    //Madad Student Registration
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","66");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("70")){

                    //Help
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","67");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("71")){

                    //Establishment Registration
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","68");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("72")){

                    //KYC Updation
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","69");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("73")){

                    //UMANG
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","70");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("74")){

                    //ECR/Returns And Payments
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","71");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("75")){

                    //Online Claims Member Account Tra...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","72");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("76")){

                    //e-passbook
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","73");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("77")){

                    //Shram suvidha Common ecr(EPFO/...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","74");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("78")){

                    //Pensioners Portal
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","75");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("79")){

                    //Passport Fee Calculator
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","76");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("80")){

                    //International Workers Portal
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","77");
                    view.getContext().startActivity(i);
                }


                if(myListData.getLeadid().equals("81")){

                    //  PostalMailActivity
                    view.getContext().startActivity(new Intent(view.getContext(), PostalMailActivity.class));

                }
                if(myListData.getLeadid().equals("82")){

                    //  PostalBankingActivity
                    view.getContext().startActivity(new Intent(view.getContext(), PostalBankingActivity.class));

                }

                if(myListData.getLeadid().equals("83")){

                    //Track Your Consignment and Trace
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","78");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("84")){

                    //Locate Your Postal Office
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","79");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("85")){

                    //Find Your Pincode
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","80");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("86")){

                    //Calculate Your Postage
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","81");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("87")){

                    //Speed Post Track
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","82");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("88")){

                    //Compare Services
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","83");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("89")){

                    //Click and Book
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","84");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("90")){

                    //Post Office Saving Scheme
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","85");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("91")){

                    //Money Order(MO)
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","86");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("92")){

                    //International Money Transfer
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","87");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("93")){

                    //Jansuraksha Scheme
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","88");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("94")){

                    //Mutual Funds
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","89");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("95")){

                    //National Pension System
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","90");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("96")){

                    //India Post Payment Bank
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","91");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("97")){

                    //  IndaneGasActivity
                    view.getContext().startActivity(new Intent(view.getContext(), IndaneGasActivity.class));

                }

                if(myListData.getLeadid().equals("98")){

                    //  BharatGasActivity
                    view.getContext().startActivity(new Intent(view.getContext(), BharatGasActivity.class));

                }

                if(myListData.getLeadid().equals("99")){

                    //  HPGasActivity
                    view.getContext().startActivity(new Intent(view.getContext(), HPGasActivity.class));

                }

                if(myListData.getLeadid().equals("100")){

                    //Book Cylinder Online
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","92");
                    view.getContext().startActivity(i);

                }
                if(myListData.getLeadid().equals("101")){

                    //Track Your Cylinder
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","93");
                    view.getContext().startActivity(i);

                }

                if(myListData.getLeadid().equals("102")){

                    //Register New Connection
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","94");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("103")){

                    //Double Bottle Connection
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","95");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("104")){

                    //Change Your Distributor
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","96");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("105")){

                    //Rate Your Distributor
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","97");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("106")){

                    //Surrender Your Connection
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","98");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("107")){

                    //Preferred Time Delivery
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","99");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("108")){

                    //Buy 5 KG Cylinder
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","100");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("109")){

                    //Customer Care
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","101");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("110")){

                    //Book Cylinder Online
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","102");
                    view.getContext().startActivity(i);

                }
                if(myListData.getLeadid().equals("111")){

                    //Track Your Cylinder
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","103");
                    view.getContext().startActivity(i);

                }

                if(myListData.getLeadid().equals("112")){

                    //Portability Of Distributor
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","104");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("113")){

                    //Apply For New Connection Online
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","105");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("114")){

                    //Register Second Connection
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","106");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("115")){

                    //Check If You Need KYC
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","107");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("116")){

                    //Know Your Distributor
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","108");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("117")){

                    //Find Your Nearest Distributor
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","109");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("118")){

                    //Give Up Subsidy Voluntarily
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","110");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("119")){

                    //Buy 5 KG Cylinder
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","111");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("120")){

                    //Find Your 17 Digit LPG ID
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","112");
                    view.getContext().startActivity(i);

                }
                if(myListData.getLeadid().equals("121")){

                    //Know Your PAHAL
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","113");
                    view.getContext().startActivity(i);

                }

                if(myListData.getLeadid().equals("122")){

                    //Surrender Multiple Connection
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","114");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("123")){

                    //Rate Your Distributor
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","115");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("124")){

                    //Book Cylinder Online
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","116");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("125")){

                    //Track Your Cylinder
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","117");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("126")){

                    //Portability Of Distributor
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","118");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("127")){

                    //Apply For New Connection Online
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","119");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("128")){

                    //Register Second Connection
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","120");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("129")){

                    //Check If You Need KYC
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","121");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("130")){

                    //Know Your Distributor
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","122");
                    view.getContext().startActivity(i);

                }
                if(myListData.getLeadid().equals("131")){

                    //Find Your Nearer Distributor
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","123");
                    view.getContext().startActivity(i);

                }

                if(myListData.getLeadid().equals("132")){

                    //Give Up Subsidy Voluntarily
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","124");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("133")){

                    //Buy 5 KG Cylinder
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","125");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("134")){

                    //Find Your 17 Digit LPG ID
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","126");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("135")){

                    //Know Your PAHAL
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","127");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("136")){

                    //Surrender Multiple Connection
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","128");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("137")){

                    //Rate Your Distributor
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","129");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("138")){

                    //Search Train
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","130");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("139")){

                    //Book Train Ticket
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","131");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("140")){

                    //Seat/Berth Availability
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","132");
                    view.getContext().startActivity(i);

                }
                if(myListData.getLeadid().equals("141")){

                    //Seat/Berth Booking
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","133");
                    view.getContext().startActivity(i);

                }

                if(myListData.getLeadid().equals("142")){

                    //Fare Enquiry
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","134");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("143")){

                    //PNR Status
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","135");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("144")){

                    //Cancel e-Ticket
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","136");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("145")){

                    //Cancel Counter Ticket
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","137");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("146")){

                    //Live Station
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","138");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("147")){

                    //Average Delay
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","139");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("148")){

                    //Train Between Station
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","140");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("149")){

                    //Train Schedule
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","141");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("150")){

                    //Trains Cancelled
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","142");
                    view.getContext().startActivity(i);

                }
                if(myListData.getLeadid().equals("151")){

                    //Partially Cancelled
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","143");
                    view.getContext().startActivity(i);

                }

                if(myListData.getLeadid().equals("152")){

                    //Trains Reschedule
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","144");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("153")){

                    //Trains Diverted
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","145");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("154")){

                    //IR Train Ticket
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","146");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("155")){

                    //Specials Trains
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","147");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("156")){

                    //Heritage Trains
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","148");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("157")){

                    //SMS Services
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","149");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("158")){

                    //Andhra Pradesh Bus Service
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","150");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("159")){

                    //Arunachal Pradesh Bus Service
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","151");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("160")){

                    //Assam Bus Services
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","152");
                    view.getContext().startActivity(i);

                }
                if(myListData.getLeadid().equals("161")){

                    //Banglore Bus Services
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","153");
                    view.getContext().startActivity(i);

                }

                if(myListData.getLeadid().equals("162")){

                    //Bihar Bus Services
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","154");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("163")){

                    //Calcutta Bus Services
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","155");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("164")){

                    //Chandigarh Bus Services
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","156");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("165")){

                    //Chennai Bus Services
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","157");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("166")){

                    //Delhi Bus Services
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","158");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("167")){

                    //Gujarat Bus Services
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","159");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("168")){

                    //Goa(Kadamba) Bus Services
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","160");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("169")){

                    //Haryana Bus Services
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","161");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("170")){

                    //Himachal Bus Services
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","162");
                    view.getContext().startActivity(i);

                }
                if(myListData.getLeadid().equals("171")){

                    //Hyderabad Bus Services
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","163");
                    view.getContext().startActivity(i);

                }

                if(myListData.getLeadid().equals("172")){

                    //Jammu and Kashmir Bus Services
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","164");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("173")){

                    //Kanpur Lucknow Bus Services
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","165");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("174")){

                    //Karnataka Bus Services
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","166");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("175")){

                    //Kerala Bus Services
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","167");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("176")){

                    //Lucknow Bus Services
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","168");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("177")){

                    //Maharashtra Bus Services
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","169");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("178")){

                    //Odisha Bus Services
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","170");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("179")){

                    //Punjab Bus Services
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","171");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("180")){

                    //Puducherry Bus Services
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","172");
                    view.getContext().startActivity(i);

                }
                if(myListData.getLeadid().equals("181")){

                    //Rajasthan Bus Services
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","173");
                    view.getContext().startActivity(i);

                }

                if(myListData.getLeadid().equals("182")){

                    //Tamil Nadu Bus Services
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","174");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("183")){

                    //Telangana Bus Services
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","175");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("184")){

                    //Uttar Pradesh Bus Services
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","176");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("185")){

                    //Uttarakhand Bus Services
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","177");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("186")){

                    //West Bengal Bus Services
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","178");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("187")){

                    //Axis Bank Net Banking
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","179");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("188")){

                    //Bank Of Baroda Net Banking
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","180");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("189")){

                    //Canara Net Banking
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","181");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("190")){

                    //HDFC Bank Net Banking
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","182");
                    view.getContext().startActivity(i);

                }
                if(myListData.getLeadid().equals("191")){

                    //ICICI Bank Net Banking
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","183");
                    view.getContext().startActivity(i);

                }

                if(myListData.getLeadid().equals("192")){

                    //Indusland Net Banking
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","184");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("193")){

                    //Kotak Net Banking
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","185");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("194")){

                    //PNB Net Banking
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","186");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("195")){

                    //SBI Net Banking
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","187");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("196")){

                    //YES Net Banking
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","188");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("197")){

                    //Pradhan Mantri Jan Dhan Yojna(PMJ...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","189");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("198")){

                    //Pradhan Mantri Sukanya Samriddhu...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","190");
                    view.getContext().startActivity(i);

                }

                if(myListData.getLeadid().equals("199")){

                    //Pradhan Mantri MUDRA Yojna(PM...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","191");
                    view.getContext().startActivity(i);

                }

                if(myListData.getLeadid().equals("200")){

                    //Pradhan Mantri Jeevan Jyoti Bima Y...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","192");
                    view.getContext().startActivity(i);

                }
                if(myListData.getLeadid().equals("201")){

                    //Pradhan Mantri Suraksha Bima Yoja...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","193");
                    view.getContext().startActivity(i);

                }

                if(myListData.getLeadid().equals("202")){

                    //Atal Pension Yojana(APY)
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","194");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("203")){

                    //Pradhan Mantri Awas Yojna(PMAY)
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","195");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("204")){

                    //Sansad Adarsh Gram Yojana(SAGY)
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","196");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("205")){

                    //Pradhan Mantri Fasal Bima Yojana(...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","197");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("206")){

                    //Pradhan Mantri Gram Sinchai Yojan...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","198");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("207")){

                    //Pradhan Mantri Garib Kalyan Yojan...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","199");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("208")){

                    //Make In India
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","200");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("209")){

                    //Swachh Bharat Abhiyan
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","201");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("210")){

                    //Kisan Vikash Patra
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","202");
                    view.getContext().startActivity(i);

                }
                if(myListData.getLeadid().equals("211")){

                    //Soil Health Card Scheme
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","203");
                    view.getContext().startActivity(i);

                }

                if(myListData.getLeadid().equals("212")){

                    //Digital India
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","204");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("213")){

                    //Skill India
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","205");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("214")){

                    //Beti Bachao, Baeti Padhao Yojana
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","206");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("215")){

                    //Mission Indradhanush
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","207");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("216")){

                    //Deen Dayal Upadhyaya Gram Jyoti...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","208");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("217")){

                    //Deen Dayal Upadhyaya Grameen K...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","209");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("218")){

                    //Pandit DeenDayal Upadhyaya Shram...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","210");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("219")){

                    //Atal Mission For Rejuvenation and...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","211");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("220")){

                    //Swadesh Darshan Yojana
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","212");
                    view.getContext().startActivity(i);

                }
                if(myListData.getLeadid().equals("221")){

                    //PRASAD (Pilgrimage Rejuvenation...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","213");
                    view.getContext().startActivity(i);

                }

                if(myListData.getLeadid().equals("222")){

                    //National Heritage City developme...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","214");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("223")){

                    //Udaan Scheme
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","215");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("224")){

                    //National Bal Swachhta Mission
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","216");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("225")){

                    //One Rank One Pension (OROP) Sch...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","217");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("226")){

                    //NSmart City Mission
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","218");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("227")){

                    //Gold Monetisation Schemes
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","219");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("228")){

                    //Startup India, Standup India
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","220");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("229")){

                    //DigiLocker
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","221");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("230")){

                    //Integrated Power Development Sch...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","222");
                    view.getContext().startActivity(i);

                }
                if(myListData.getLeadid().equals("231")){

                    //Shyama Prasad Mukherji Rurban M...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","223");
                    view.getContext().startActivity(i);

                }

                if(myListData.getLeadid().equals("232")){

                    //xSagarmala Project
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","224");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("233")){

                    //Prakash Path-Way To Light-The N...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","225");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("234")){

                    //UJWAL Discom Assurance Yojana(...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","226");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("235")){

                    //Vikalp Scheme
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","227");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("236")){

                    //National Sports Talent Search Sche...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","228");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("237")){

                    //Rashtriya Gokul Mission
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","229");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("238")){

                    //PAHAL-Direct Benefits Transfer For...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","230");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("239")){

                    //The National Institute For Transfer...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","231");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("240")){

                    //Pradhan Mantri Khanji Kshetra Kaly...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","232");
                    view.getContext().startActivity(i);

                }
                if(myListData.getLeadid().equals("241")){

                    //Pradhan Mantri Ujjwala Yojana
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","233");
                    view.getContext().startActivity(i);

                }

                if(myListData.getLeadid().equals("242")){

                    //Rashtriya Gram Swaraj Abhiyan
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","234");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("243")){

                    //Jan Sukraksha
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","235");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("244")){

                    //Stand Up India Scheme
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","236");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("245")){

                    //Pradhan Mantri Vaya Vandana Yojana
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","237");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("246")){

                    //Crop Insurance Calculator
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","238");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("247")){

                    //Commodity Arrival and Rates
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","239");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("248")){

                    //Andaman Nikobar and Island Agricul...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","240");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("249")){

                    //Andhra Pradesh Agri Culture Informa...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","241");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("250")){

                    //Arunachal Pradesh Agri Culture Informa...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","242");
                    view.getContext().startActivity(i);

                }

                if(myListData.getLeadid().equals("251")){

                    //Assam Agri Cultural Information
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","243");
                    view.getContext().startActivity(i);

                }

                if(myListData.getLeadid().equals("252")){

                    //Bihar Agri Cultural Information
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","244");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("253")){

                    //Chandigarh Agri Cultural Information
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","245");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("254")){

                    //Chhattisgarh Agri Cultural Information
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","246");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("255")){

                    //Dadra and Diu Agri Cultural informati...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","247");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("256")){

                    //Delhi Agri Cultural Information
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","248");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("257")){

                    //Goa Agri Cultural Information
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","249");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("258")){

                    //Gujarat Agri Cultural Information
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","250");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("259")){

                    //Haryana Agri Cultural Information
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","251");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("260")){

                    //Himachal Pradesh Agri Cultural Infor...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","252");
                    view.getContext().startActivity(i);

                }
                if(myListData.getLeadid().equals("261")){

                    //Jammu & Kashmir Agri Cultural Inform...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","253");
                    view.getContext().startActivity(i);

                }

                if(myListData.getLeadid().equals("262")){

                    //Jharkhand Agri Cultural Information
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","254");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("263")){

                    //Karnataka Agri Cultural Information
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","255");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("264")){

                    //Kerala Agri Cultural Information
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","256");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("265")){

                    //Lakshadweep Agri Cultural Information
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","257");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("266")){

                    //Madhya Pradesh Agri Cultural Informa...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","258");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("267")){

                    //Maharashtra  Agri Cultural Information
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","259");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("268")){

                    //Manipur Agri Cultural Information
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","260");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("269")){

                    //Meghalaya Agri Cultural Information
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","261");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("270")){

                    //Mizoram Agri Cultural Information
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","262");
                    view.getContext().startActivity(i);

                }
                if(myListData.getLeadid().equals("271")){

                    //Nagaland Agri Cultural Information
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","263");
                    view.getContext().startActivity(i);

                }

                if(myListData.getLeadid().equals("272")){

                    //Odhisha Agri Cultural Information
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","264");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("273")){

                    //Punducherry Agri Cultural Information
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","265");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("274")){

                    //Rajasthan Agri Cultural Information
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","266");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("275")){

                    //Sikkim Agri Cultural Information
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","267");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("276")){

                    //Tamilnadu Agri Cultural Information
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","268");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("277")){

                    //Telangana Agri Cultural Information
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","269");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("278")){

                    //Tripura Agri Cultural Information
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","270");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("279")){

                    //Uttar Pradesh Agri Cultural Information
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","271");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("280")){

                    //Uttarakhand Agri Cultural Information
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","272");
                    view.getContext().startActivity(i);

                }
                if(myListData.getLeadid().equals("281")){

                    //West Bengal Agri Cultural Information
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","273");
                    view.getContext().startActivity(i);

                }

                if(myListData.getLeadid().equals("282")){

                    //Naukri
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","274");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("283")){

                    //Monster India
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","275");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("284")){

                    //Shine
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","276");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("285")){

                    //Indeed India
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","277");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("286")){

                    //Times Jobs
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","278");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("287")){

                    //Careesma
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","279");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("288")){

                    //Freshersworld
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","280");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("289")){

                    //Jobrapido India
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","278");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("290")){

                    //Sarkari Naukri Blog
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","279");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("291")){

                    //Career Builder
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","280");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("292")){

                    //Digi Locker SignUp
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","280");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("293")){

                    //Digi Locker SignIn
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","280");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("294")){

                    //Indian Postal Services
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","286");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("295")){

                    //FedEx India
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","287");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("296")){

                    //First Flight Courier Limited
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","288");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("297")){

                    //DTDC Courier & Cargo Limited
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","289");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("298")){

                    //Aramex
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","290");
                    view.getContext().startActivity(i);

                }

                if(myListData.getLeadid().equals("299")){

                    //Go Javas
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","291");
                    view.getContext().startActivity(i);

                }

                if(myListData.getLeadid().equals("300")){

                    //DHL Express India Pvt Ltd
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","292");
                    view.getContext().startActivity(i);

                }
                if(myListData.getLeadid().equals("301")){

                    //eCOM EXpress
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","293");
                    view.getContext().startActivity(i);

                }

                if(myListData.getLeadid().equals("302")){

                    //Blue Dart Express Limited
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","294");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("303")){

                    //Kartrockets automated solution Shipro...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","295");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("304")){

                    //The Professional Courier Ltd
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","296");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("305")){

                    //Gati Limited
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","297");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("306")){

                    //Delhivery
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","298");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("307")){

                    //TNT Express
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","299");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("308")){

                    //Overnite Express Limited
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","300");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("309")){

                    //Palande Courier Services
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","301");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("310")){

                    //United Parcel Limited
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","302");
                    view.getContext().startActivity(i);

                }

                if(myListData.getLeadid().equals("311")){

                    //Emergency Help Line Number
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","303");
                    view.getContext().startActivity(i);

                }

                if(myListData.getLeadid().equals("312")){

                    //Indian Railways Help Line
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","304");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("313")){

                    //Blood Banks Help Line
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","305");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("314")){

                    //Ministery Of External Affairs
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","306");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("315")){

                    //Women Help Line
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","307");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("316")){

                    //Indian Banks
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","308");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("317")){

                    //Sucide Help Line
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","309");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("318")){

                    //Highway Numbers
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","310");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("319")){

                    //Air India
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","311");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("320")){

                    //Airports Authority Of India
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","312");
                    view.getContext().startActivity(i);

                }
                if(myListData.getLeadid().equals("321")){

                    //Bureau Of Indian Standards
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","313");
                    view.getContext().startActivity(i);

                }

                if(myListData.getLeadid().equals("322")){

                    //Departments Of Chemicals & Petroc...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","314");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("323")){

                    //Ministry Of Civil Aviation
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","315");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("324")){

                    //Department Of Commerce
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","316");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("325")){

                    //Ministry Of Coal
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","317");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("326")){

                    //Ministry Of Company Affairs
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","318");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("327")){

                    //Department Of Education
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","319");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("328")){

                    //Ministry Of Environment and Forests
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","320");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("329")){

                    //Ministry Of External Affairs
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","321");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("330")){

                    //Ministry Of Finance
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","322");
                    view.getContext().startActivity(i);

                }
                if(myListData.getLeadid().equals("331")){

                    //Directorate General Of Foreign Trade
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","323");
                    view.getContext().startActivity(i);

                }

                if(myListData.getLeadid().equals("332")){

                    //Department Of Heavy Industries
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","324");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("333")){

                    //Department Of Industrial Policy & P...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","325");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("334")){

                    //Ministry Of Information and Broadc
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","326");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("335")){

                    //Department Of Information Technol...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","327");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("336")){

                    //Ministry Of Labour
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","328");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("337")){

                    //Ministry Of Mines
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","329");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("338")){

                    //Ministry Of Non-Conventional Ener...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","330");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("339")){

                    //Office Of The Controller Deneral Of...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","331");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("340")){

                    //Ministry Of Petroleum And Natural...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","332");
                    view.getContext().startActivity(i);

                }
                if(myListData.getLeadid().equals("341")){

                    //Ministry Of Power
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","333");
                    view.getContext().startActivity(i);

                }

                if(myListData.getLeadid().equals("342")){

                    //Ministry Of Railways
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","334");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("343")){

                    //Reserve Bank Of India
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","335");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("344")){

                    //Department Of Road Transport & Hi...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","336");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("345")){

                    //Department Of Shipping
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","337");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("346")){

                    //Ministry Of Small Scale Industries
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","338");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("347")){

                    //Ministry Of Statistics and Programm...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","239");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("348")){

                    //Department Of Telecommunication
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","340");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("349")){

                    //Ministry Of Textile
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","241");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("350")){

                    //Ministry Of Tourism
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","342");
                    view.getContext().startActivity(i);

                }

                if(myListData.getLeadid().equals("351")){

                    //Ministry Of Urban Development
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","343");
                    view.getContext().startActivity(i);

                }

                if(myListData.getLeadid().equals("352")){

                    //Ministry Of Water Resource
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","344");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("353")){

                    //Andaman & Nicobar(UT)
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","345");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("354")){

                    //Andra Pradesh
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","346");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("355")){

                    //Assam
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","347");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("356")){

                    //Bihar
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","348");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("357")){

                    //Chandigarh(UT)
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","349");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("358")){

                    //Chhattisgarh
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","250");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("359")){

                    //Dadra & Nagar Haveli
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","251");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("360")){

                    //Daman & Diu
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","252");
                    view.getContext().startActivity(i);

                }
                if(myListData.getLeadid().equals("361")){

                    //Delhi
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","253");
                    view.getContext().startActivity(i);

                }

                if(myListData.getLeadid().equals("362")){

                    //Goa
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","354");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("363")){

                    //Gujrat
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","355");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("364")){

                    //Haryana
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","356");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("365")){

                    //Himachal Pradesh
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","357");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("366")){

                    //Jammu & Kashmir
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","358");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("367")){

                    //Jharkhand
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","359");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("368")){

                    //Karnataka
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","360");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("369")){

                    //Kerala
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","361");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("370")){

                    //Lakshdweep(UT)
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","362");
                    view.getContext().startActivity(i);

                }
                if(myListData.getLeadid().equals("371")){

                    //Madhya Pradesh
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","363");
                    view.getContext().startActivity(i);

                }

                if(myListData.getLeadid().equals("372")){

                    //Maharashtra
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","364");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("373")){

                    //Manipur
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","365");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("374")){

                    //Meghalaya
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","366");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("375")){

                    //Mizoram
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","367");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("376")){

                    //Nagaland
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","368");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("377")){

                    //Orissa
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","369");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("378")){

                    //Pondicherry(UT)
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","370");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("379")){

                    //Punjab
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","271");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("380")){

                    //Rajasthan
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","272");
                    view.getContext().startActivity(i);

                }
                if(myListData.getLeadid().equals("381")){

                    //Tripura
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","373");
                    view.getContext().startActivity(i);

                }

                if(myListData.getLeadid().equals("382")){

                    //Uttar Pradesh
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","374");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("383")){

                    //Uttranchal
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","375");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("384")){

                    //West Bengal
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","376");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("385")){

                    //Sikkim
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","377");
                    view.getContext().startActivity(i);
                }

                if(myListData.getLeadid().equals("386")){

                    //Tamil Nadu
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","378");
                    view.getContext().startActivity(i);
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
