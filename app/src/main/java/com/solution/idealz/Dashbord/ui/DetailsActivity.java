package com.solution.idealz.Dashbord.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.solution.idealz.R;

public class DetailsActivity extends AppCompatActivity {

    TextView des;
    String position="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);



        position=getIntent().getStringExtra("position");
        des=findViewById(R.id.des);

        String[] jkj= getResources().getStringArray(R.array.Details);
        des.setText(""+jkj[Integer.parseInt(position)]);

        des.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(position.equals("3")){

                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Enrollment & Update Centres");
                    i.putExtra("url","https://appointments.uidai.gov.in/centersearch.aspx");
                    startActivity(i);
                }
                if(position.equals("4")){

                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Locate Enrollment & Update Centers");
                    i.putExtra("url","https://appointments.uidai.gov.in/centersearch.aspx");
                    startActivity(i);
                }
                if(position.equals("5")){

                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Check Aadhaar Status");
                    i.putExtra("url","https://resident.uidai.gov.in/check-aadhaar-status");
                    startActivity(i);
                }
                if(position.equals("6")){

                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Download Aadhaar");
                    i.putExtra("url","https://eaadhaar.uidai.gov.in/#/");
                    startActivity(i);
                }
                if(position.equals("7")){

                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Get Adhaar Number On Mobile");
                    i.putExtra("url","https://resident.uidai.gov.in/web/resident/get-aadhaar-no");
                    startActivity(i);
                }
                if(position.equals("8")){

                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Retrieve Lost UID/EID");
                    i.putExtra("url","https://resident.uidai.gov.in/find-uid-eid");
                    startActivity(i);
                }
                if(position.equals("9")){

                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Update at Enrollment Centre");
                    i.putExtra("url","https://ssup.uidai.gov.in/web/guest/update");
                    startActivity(i);
                }
                if(position.equals("10")){

                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Check Status: Update done at Center");
                    i.putExtra("url","https://ssup.uidai.gov.in/web/guest/check-status");
                    startActivity(i);
                }
                if(position.equals("11")){

                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Address update request(Online)");
                    i.putExtra("url","https://resident.uidai.gov.in/check-aadhaar-status");
                    startActivity(i);
                }
                if(position.equals("12")){

                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Check Status: Update done Online");
                    i.putExtra("url","https://resident.uidai.gov.in/aadhaarverification");
                    startActivity(i);
                }
                if(position.equals("13")){

                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Aadhar Update Online");
                    i.putExtra("url","https://resident.uidai.gov.in/aadhaar-update-history");
                    startActivity(i);
                }
                if(position.equals("14")){

                    //Verify Adhaar Number
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","11");
                    view.getContext().startActivity(i);
                }
                if(position.equals("15")){

                    //Verify Email/Mobile Number
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","12");
                    view.getContext().startActivity(i);
                }
                if(position.equals("16")){

                    //Lock/Unlock Biometrics
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","13");
                    view.getContext().startActivity(i);
                }
                if(position.equals("17")){

                    //Check Adhaar & Bank Account Link
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","14");
                    view.getContext().startActivity(i);
                }
                if(position.equals("18")){

                    //Adhaar Aunthentication History
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","15");
                    view.getContext().startActivity(i);
                }
                if(position.equals("19")){

                    //Virtual ID(VID) Generator
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","16");
                    view.getContext().startActivity(i);
                }
                if(position.equals("20")){

                    //Search Your Name In Electroral Roll
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","17");
                    view.getContext().startActivity(i);
                }
                if(position.equals("21")){

                    //Voter ID Card Status
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","18");
                    view.getContext().startActivity(i);
                }
                if(position.equals("22")){

                    //Apply Online For Registration of Ne...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","19");
                    view.getContext().startActivity(i);
                }
                if(position.equals("23")){

                    //Apply Online For Registration of Ov...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","20");
                    view.getContext().startActivity(i);
                }
                if(position.equals("24")){

                    //Correction Of Enteries In Electrol Roll
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","21");
                    view.getContext().startActivity(i);
                }
                if(position.equals("25")){

                    //Transportation Within Assembly
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","22");
                    view.getContext().startActivity(i);
                }
                if(position.equals("26")){

                    //Track Application Status
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","23");
                    view.getContext().startActivity(i);
                }
                if(position.equals("27")){

                    //Know Your Booth, AC and PC
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","24");
                    view.getContext().startActivity(i);
                }
                if(position.equals("28")){

                    //Know Your BLO, ERO amd DEO
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","25");
                    view.getContext().startActivity(i);
                }

                if(position.equals("29")){

                    //Link TO State/UT CEOs
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","26");
                    view.getContext().startActivity(i);
                }

                if(position.equals("30")){

                    //Voter List
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","27");
                    view.getContext().startActivity(i);
                }

                if(position.equals("31")){

                    //Voter Educational Channel
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","28");
                    view.getContext().startActivity(i);
                }

                if(position.equals("32")){

                    //Pooling Process
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","29");
                    view.getContext().startActivity(i);
                }
                if(position.equals("33")){

                    //EVM Machine
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","30");
                    view.getContext().startActivity(i);
                }
                if(position.equals("34")){

                    //Complaint/Suggestions
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","31");
                    view.getContext().startActivity(i);
                }
                if(position.equals("35")){

                    //Help
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","32");
                    view.getContext().startActivity(i);
                }

                if(position.equals("36")){

                    //Guidline For Submission Pan Appl...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","33");
                    view.getContext().startActivity(i);
                }
                if(position.equals("37")){

                    //Apply For New Pan Card
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","34");
                    view.getContext().startActivity(i);
                }
                if(position.equals("38")){

                    //Track PAN/TAN Application Status
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","35");
                    view.getContext().startActivity(i);
                }
                if(position.equals("39")){

                    //Apply For New Pan Car(Physically...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","36");
                    view.getContext().startActivity(i);
                }
                if(position.equals("40")){

                    //Pan Card Correction Online
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","37");
                    view.getContext().startActivity(i);
                }
                if(position.equals("41")){

                    //Steps For Online Correction
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","38");
                    view.getContext().startActivity(i);
                }
                if(position.equals("42")){

                    //Changes to White Ration Card From...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","39");
                    view.getContext().startActivity(i);
                }
                if(position.equals("43")){

                    //Apply for Corrections In Ration Card
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","40");
                    view.getContext().startActivity(i);
                }
                if(position.equals("44")){

                    //Change address in Ration Card
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","41");
                    view.getContext().startActivity(i);
                }
                if(position.equals("45")){

                    //Delete a Member From Ration Card
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","42");
                    view.getContext().startActivity(i);
                }
                if(position.equals("46")){

                    //Add a New Member in Ration Card
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","43");
                    view.getContext().startActivity(i);
                }
                if(position.equals("47")){

                    //Apply For Duplicate Ration card Online
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","44");
                    view.getContext().startActivity(i);
                }
                if(position.equals("48")){

                    //Smart Ration Card
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","45");
                    view.getContext().startActivity(i);
                }
                if(position.equals("49")){

                    //State Wise Ration Card
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","46");
                    view.getContext().startActivity(i);
                }

                if(position.equals("50")){

                    //Apply for New Learner Licence
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","47");
                    view.getContext().startActivity(i);
                }

                if(position.equals("51")){

                    //Apply for new driving licence
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","48");
                    view.getContext().startActivity(i);
                }

                if(position.equals("52")){

                    //Track Application Status
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","49");
                    view.getContext().startActivity(i);
                }

                if(position.equals("53")){


                    //Renewal/Duplicate Licence
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","50");
                    view.getContext().startActivity(i);
                }

                if(position.equals("54")){

                    //Smart Card Driving Licence
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","51");
                    view.getContext().startActivity(i);
                }

                if(position.equals("55")){

                    //Know your RC Status
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","52");
                    view.getContext().startActivity(i);
                }

                if(position.equals("56")){

                    //Driving Licence Test
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","53");
                    view.getContext().startActivity(i);
                }

                if(position.equals("57")){

                    //Quick Guides
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","54");
                    view.getContext().startActivity(i);
                }

                if(position.equals("58")){

                    //New User Registration
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","55");
                    view.getContext().startActivity(i);
                }

                if(position.equals("59")){

                    //Existing User Login
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","56");
                    view.getContext().startActivity(i);
                }

                if(position.equals("60")){

                    //Track Application Status
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","57");
                    view.getContext().startActivity(i);
                }

                if(position.equals("61")){

                    //Check Appointment Availability Sta...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","58");
                    view.getContext().startActivity(i);
                }

                if(position.equals("62")){

                    //Tatkaal Appointment Opening Time
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","59");
                    view.getContext().startActivity(i);
                }

                if(position.equals("63")){

                    //List Of Document For Fresh Passport
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","60");
                    view.getContext().startActivity(i);
                }

                if(position.equals("64")){

                    //List Of Document For Re-issue of Pa..
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","61");
                    view.getContext().startActivity(i);
                }

                if(position.equals("65")){

                    //Passport Fee Calculator
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","62");
                    view.getContext().startActivity(i);
                }

                if(position.equals("66")){

                    //Know Your Police Station
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","63");
                    view.getContext().startActivity(i);
                }

                if(position.equals("67")){

                    //Locate Passport Sewa Kendra
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","64");
                    view.getContext().startActivity(i);
                }

                if(position.equals("68")){

                    //Locate Common Services Centers
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","65");
                    view.getContext().startActivity(i);
                }

                if(position.equals("69")){

                    //Madad Student Registration
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","66");
                    view.getContext().startActivity(i);
                }

                if(position.equals("70")){

                    //Help
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","67");
                    view.getContext().startActivity(i);
                }

                if(position.equals("71")){

                    //Establishment Registration
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","68");
                    view.getContext().startActivity(i);
                }

                if(position.equals("72")){

                    //KYC Updation
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","69");
                    view.getContext().startActivity(i);
                }

                if(position.equals("73")){

                    //UMANG
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","70");
                    view.getContext().startActivity(i);
                }

                if(position.equals("74")){

                    //ECR/Returns And Payments
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","71");
                    view.getContext().startActivity(i);
                }

                if(position.equals("75")){

                    //Online Claims Member Account Tra...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","72");
                    view.getContext().startActivity(i);
                }

                if(position.equals("76")){

                    //e-passbook
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","73");
                    view.getContext().startActivity(i);
                }

                if(position.equals("77")){

                    //Shram suvidha Common ecr(EPFO/...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","74");
                    view.getContext().startActivity(i);
                }

                if(position.equals("78")){

                    //Pensioners Portal
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","75");
                    view.getContext().startActivity(i);
                }

                if(position.equals("79")){

                    //Passport Fee Calculator
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","76");
                    view.getContext().startActivity(i);
                }

                if(position.equals("80")){

                    //International Workers Portal
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","77");
                    view.getContext().startActivity(i);
                }

                if(position.equals("83")){

                    //Track Your Consignment and Trace
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","78");
                    view.getContext().startActivity(i);
                }

                if(position.equals("84")){

                    //Locate Your Postal Office
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","79");
                    view.getContext().startActivity(i);
                }

                if(position.equals("85")){

                    //Find Your Pincode
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","80");
                    view.getContext().startActivity(i);
                }

                if(position.equals("86")){

                    //Calculate Your Postage
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","81");
                    view.getContext().startActivity(i);
                }

                if(position.equals("87")){

                    //Speed Post Track
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","82");
                    view.getContext().startActivity(i);
                }

                if(position.equals("88")){

                    //Compare Services
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","83");
                    view.getContext().startActivity(i);
                }

                if(position.equals("89")){

                    //Click and Book
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","84");
                    view.getContext().startActivity(i);
                }

                if(position.equals("90")){

                    //Post Office Saving Scheme
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","85");
                    view.getContext().startActivity(i);
                }

                if(position.equals("91")){

                    //Money Order(MO)
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","86");
                    view.getContext().startActivity(i);
                }

                if(position.equals("92")){

                    //International Money Transfer
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","87");
                    view.getContext().startActivity(i);
                }

                if(position.equals("93")){

                    //Jansuraksha Scheme
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","88");
                    view.getContext().startActivity(i);
                }

                if(position.equals("94")){

                    //Mutual Funds
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","89");
                    view.getContext().startActivity(i);
                }

                if(position.equals("95")){

                    //National Pension System
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","90");
                    view.getContext().startActivity(i);
                }

                if(position.equals("96")){

                    //India Post Payment Bank
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","91");
                    view.getContext().startActivity(i);
                }

                if(position.equals("100")){

                    //Book Cylinder Online
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","92");
                    view.getContext().startActivity(i);

                }
                if(position.equals("101")){

                    //Track Your Cylinder
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","93");
                    view.getContext().startActivity(i);

                }

                if(position.equals("102")){

                    //Register New Connection
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","94");
                    view.getContext().startActivity(i);
                }

                if(position.equals("103")){

                    //Double Bottle Connection
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","95");
                    view.getContext().startActivity(i);
                }

                if(position.equals("104")){

                    //Change Your Distributor
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","96");
                    view.getContext().startActivity(i);
                }

                if(position.equals("105")){

                    //Rate Your Distributor
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","97");
                    view.getContext().startActivity(i);
                }

                if(position.equals("106")){

                    //Surrender Your Connection
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","98");
                    view.getContext().startActivity(i);
                }

                if(position.equals("107")){

                    //Preferred Time Delivery
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","99");
                    view.getContext().startActivity(i);
                }

                if(position.equals("108")){

                    //Buy 5 KG Cylinder
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","100");
                    view.getContext().startActivity(i);
                }

                if(position.equals("109")){

                    //Customer Care
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","101");
                    view.getContext().startActivity(i);
                }

                if(position.equals("110")){

                    //Book Cylinder Online
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","102");
                    view.getContext().startActivity(i);

                }
                if(position.equals("111")){

                    //Track Your Cylinder
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","103");
                    view.getContext().startActivity(i);

                }

                if(position.equals("112")){

                    //Register New Connection
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","104");
                    view.getContext().startActivity(i);
                }

                if(position.equals("113")){

                    //Double Bottle Connection
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","105");
                    view.getContext().startActivity(i);
                }

                if(position.equals("114")){

                    //Change Your Distributor
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","106");
                    view.getContext().startActivity(i);
                }

                if(position.equals("115")){

                    //Rate Your Distributor
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","107");
                    view.getContext().startActivity(i);
                }

                if(position.equals("116")){

                    //Surrender Your Connection
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","108");
                    view.getContext().startActivity(i);
                }

                if(position.equals("117")){

                    //Preferred Time Delivery
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","109");
                    view.getContext().startActivity(i);
                }

                if(position.equals("118")){

                    //Buy 5 KG Cylinder
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","110");
                    view.getContext().startActivity(i);
                }

                if(position.equals("119")){

                    //Customer Care
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","111");
                    view.getContext().startActivity(i);
                }

                if(position.equals("120")){

                    //Find Your 17 Digit LPG ID
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","112");
                    view.getContext().startActivity(i);

                }
                if(position.equals("121")){

                    //Know Your PAHAL
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","113");
                    view.getContext().startActivity(i);

                }

                if(position.equals("122")){

                    //Surrender Multiple Connection
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","114");
                    view.getContext().startActivity(i);
                }

                if(position.equals("123")){

                    //Rate Your Distributor
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","115");
                    view.getContext().startActivity(i);
                }

                if(position.equals("124")){

                    //Book Cylinder Online
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","116");
                    view.getContext().startActivity(i);
                }

                if(position.equals("125")){

                    //Track Your Cylinder
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","117");
                    view.getContext().startActivity(i);
                }

                if(position.equals("126")){

                    //Portability Of Distributor
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","118");
                    view.getContext().startActivity(i);
                }

                if(position.equals("127")){

                    //Apply For New Connection Online
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","119");
                    view.getContext().startActivity(i);
                }

                if(position.equals("128")){

                    //Register Second Connection
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","120");
                    view.getContext().startActivity(i);
                }

                if(position.equals("129")){

                    //Check If You Need KYC
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","121");
                    view.getContext().startActivity(i);
                }

                if(position.equals("130")){

                    //Know Your Distributor
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","122");
                    view.getContext().startActivity(i);

                }
                if(position.equals("131")){

                    //Find Your Nearer Distributor
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","123");
                    view.getContext().startActivity(i);

                }

                if(position.equals("132")){

                    //Give Up Subsidy Voluntarily
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","124");
                    view.getContext().startActivity(i);
                }

                if(position.equals("133")){

                    //Buy 5 KG Cylinder
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","125");
                    view.getContext().startActivity(i);
                }

                if(position.equals("134")){

                    //Find Your 17 Digit LPG ID
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","126");
                    view.getContext().startActivity(i);
                }

                if(position.equals("135")){

                    //Know Your PAHAL
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","127");
                    view.getContext().startActivity(i);
                }

                if(position.equals("136")){

                    //Surrender Multiple Connection
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","128");
                    view.getContext().startActivity(i);
                }

                if(position.equals("137")){

                    //Rate Your Distributor
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","129");
                    view.getContext().startActivity(i);
                }

                if(position.equals("138")){

                    //Search Train
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","130");
                    view.getContext().startActivity(i);
                }

                if(position.equals("139")){

                    //Book Train Ticket
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","131");
                    view.getContext().startActivity(i);
                }

                if(position.equals("140")){

                    //Seat/Berth Availability
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","132");
                    view.getContext().startActivity(i);

                }
                if(position.equals("141")){

                    //Seat/Berth Booking
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","133");
                    view.getContext().startActivity(i);

                }

                if(position.equals("142")){

                    //Fare Enquiry
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","134");
                    view.getContext().startActivity(i);
                }

                if(position.equals("143")){

                    //PNR Status
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","135");
                    view.getContext().startActivity(i);
                }

                if(position.equals("144")){

                    //Cancel e-Ticket
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","136");
                    view.getContext().startActivity(i);
                }

                if(position.equals("145")){

                    //Cancel Counter Ticket
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","137");
                    view.getContext().startActivity(i);
                }

                if(position.equals("146")){

                    //Live Station
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","138");
                    view.getContext().startActivity(i);
                }

                if(position.equals("147")){

                    //Average Delay
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","139");
                    view.getContext().startActivity(i);
                }

                if(position.equals("148")){

                    //Train Between Station
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","140");
                    view.getContext().startActivity(i);
                }

                if(position.equals("149")){

                    //Train Schedule
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","141");
                    view.getContext().startActivity(i);
                }

                if(position.equals("150")){

                    //Trains Cancelled
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","142");
                    view.getContext().startActivity(i);

                }
                if(position.equals("151")){

                    //Partially Cancelled
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","143");
                    view.getContext().startActivity(i);

                }

                if(position.equals("152")){

                    //Trains Reschedule
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","144");
                    view.getContext().startActivity(i);
                }

                if(position.equals("153")){

                    //Trains Diverted
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","145");
                    view.getContext().startActivity(i);
                }

                if(position.equals("154")){

                    //IR Train Ticket
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","146");
                    view.getContext().startActivity(i);
                }

                if(position.equals("155")){

                    //Specials Trains
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","147");
                    view.getContext().startActivity(i);
                }

                if(position.equals("156")){

                    //Heritage Trains
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","148");
                    view.getContext().startActivity(i);
                }

                if(position.equals("157")){

                    //SMS Services
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","149");
                    view.getContext().startActivity(i);
                }

                if(position.equals("158")){

                    //Andhra Pradesh Bus Service
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","150");
                    view.getContext().startActivity(i);
                }

                if(position.equals("159")){

                    //Arunachal Pradesh Bus Service
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","151");
                    view.getContext().startActivity(i);
                }

                if(position.equals("160")){

                    //Assam Bus Services
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","152");
                    view.getContext().startActivity(i);

                }
                if(position.equals("161")){

                    //Banglore Bus Services
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","153");
                    view.getContext().startActivity(i);

                }

                if(position.equals("162")){

                    //Bihar Bus Services
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","154");
                    view.getContext().startActivity(i);
                }

                if(position.equals("163")){

                    //Calcutta Bus Services
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","155");
                    view.getContext().startActivity(i);
                }

                if(position.equals("164")){

                    //Chandigarh Bus Services
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","156");
                    view.getContext().startActivity(i);
                }

                if(position.equals("165")){

                    //Chennai Bus Services
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","157");
                    view.getContext().startActivity(i);
                }

                if(position.equals("166")){

                    //Delhi Bus Services
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","158");
                    view.getContext().startActivity(i);
                }

                if(position.equals("167")){

                    //Gujarat Bus Services
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","159");
                    view.getContext().startActivity(i);
                }

                if(position.equals("168")){

                    //Goa(Kadamba) Bus Services
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","160");
                    view.getContext().startActivity(i);
                }

                if(position.equals("169")){

                    //Haryana Bus Services
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","161");
                    view.getContext().startActivity(i);
                }

                if(position.equals("170")){

                    //Himachal Bus Services
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","162");
                    view.getContext().startActivity(i);

                }
                if(position.equals("171")){

                    //Hyderabad Bus Services
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","163");
                    view.getContext().startActivity(i);

                }

                if(position.equals("172")){

                    //Jammu and Kashmir Bus Services
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","164");
                    view.getContext().startActivity(i);
                }

                if(position.equals("173")){

                    //Kanpur Lucknow Bus Services
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","165");
                    view.getContext().startActivity(i);
                }

                if(position.equals("174")){

                    //Karnataka Bus Services
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","166");
                    view.getContext().startActivity(i);
                }

                if(position.equals("175")){

                    //Kerala Bus Services
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","167");
                    view.getContext().startActivity(i);
                }

                if(position.equals("176")){

                    //Lucknow Bus Services
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","168");
                    view.getContext().startActivity(i);
                }

                if(position.equals("177")){

                    //Maharashtra Bus Services
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","169");
                    view.getContext().startActivity(i);
                }

                if(position.equals("178")){

                    //Odisha Bus Services
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","170");
                    view.getContext().startActivity(i);
                }

                if(position.equals("179")){

                    //Punjab Bus Services
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","171");
                    view.getContext().startActivity(i);
                }

                if(position.equals("180")){

                    //Puducherry Bus Services
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","172");
                    view.getContext().startActivity(i);

                }
                if(position.equals("181")){

                    //Rajasthan Bus Services
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","173");
                    view.getContext().startActivity(i);

                }

                if(position.equals("182")){

                    //Tamil Nadu Bus Services
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","174");
                    view.getContext().startActivity(i);
                }

                if(position.equals("183")){

                    //Telangana Bus Services
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","175");
                    view.getContext().startActivity(i);
                }

                if(position.equals("184")){

                    //Uttar Pradesh Bus Services
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","176");
                    view.getContext().startActivity(i);
                }

                if(position.equals("185")){

                    //Uttarakhand Bus Services
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","177");
                    view.getContext().startActivity(i);
                }

                if(position.equals("186")){

                    //West Bengal Bus Services
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","178");
                    view.getContext().startActivity(i);
                }

                if(position.equals("187")){

                    //Axis Bank Net Banking
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","179");
                    view.getContext().startActivity(i);
                }

                if(position.equals("188")){

                    //Bank Of Baroda Net Banking
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","180");
                    view.getContext().startActivity(i);
                }

                if(position.equals("189")){

                    //Canara Net Banking
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","181");
                    view.getContext().startActivity(i);
                }

                if(position.equals("190")){

                    //HDFC Bank Net Banking
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","182");
                    view.getContext().startActivity(i);

                }
                if(position.equals("191")){

                    //ICICI Bank Net Banking
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","183");
                    view.getContext().startActivity(i);

                }

                if(position.equals("192")){

                    //Indusland Net Banking
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","184");
                    view.getContext().startActivity(i);
                }

                if(position.equals("193")){

                    //Kotak Net Banking
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","185");
                    view.getContext().startActivity(i);
                }

                if(position.equals("194")){

                    //PNB Net Banking
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","186");
                    view.getContext().startActivity(i);
                }

                if(position.equals("195")){

                    //SBI Net Banking
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","187");
                    view.getContext().startActivity(i);
                }

                if(position.equals("196")){

                    //YES Net Banking
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","188");
                    view.getContext().startActivity(i);
                }

                if(position.equals("197")){

                    //Pradhan Mantri Jan Dhan Yojna(PMJ...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","189");
                    view.getContext().startActivity(i);
                }

                if(position.equals("198")){

                    //Pradhan Mantri Sukanya Samriddhu...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","190");
                    view.getContext().startActivity(i);

                }

                if(position.equals("199")){

                    //Pradhan Mantri MUDRA Yojna(PM...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","191");
                    view.getContext().startActivity(i);

                }

                if(position.equals("200")){

                    //Pradhan Mantri Jeevan Jyoti Bima Y...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","192");
                    view.getContext().startActivity(i);

                }
                if(position.equals("201")){

                    //Pradhan Mantri Suraksha Bima Yoja...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","193");
                    view.getContext().startActivity(i);

                }

                if(position.equals("202")){

                    //Atal Pension Yojana(APY)
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","194");
                    view.getContext().startActivity(i);
                }

                if(position.equals("203")){

                    //Pradhan Mantri Awas Yojna(PMAY)
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","195");
                    view.getContext().startActivity(i);
                }

                if(position.equals("204")){

                    //Sansad Adarsh Gram Yojana(SAGY)
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","196");
                    view.getContext().startActivity(i);
                }

                if(position.equals("205")){

                    //Pradhan Mantri Fasal Bima Yojana(...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","197");
                    view.getContext().startActivity(i);
                }

                if(position.equals("206")){

                    //Pradhan Mantri Gram Sinchai Yojan...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","198");
                    view.getContext().startActivity(i);
                }

                if(position.equals("207")){

                    //Pradhan Mantri Garib Kalyan Yojan...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","199");
                    view.getContext().startActivity(i);
                }

                if(position.equals("208")){

                    //Make In India
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","200");
                    view.getContext().startActivity(i);
                }

                if(position.equals("209")){

                    //Swachh Bharat Abhiyan
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","201");
                    view.getContext().startActivity(i);
                }

                if(position.equals("210")){

                    //Kisan Vikash Patra
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","202");
                    view.getContext().startActivity(i);

                }
                if(position.equals("211")){

                    //Soil Health Card Scheme
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","203");
                    view.getContext().startActivity(i);

                }

                if(position.equals("212")){

                    //Digital India
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","204");
                    view.getContext().startActivity(i);
                }

                if(position.equals("213")){

                    //Skill India
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","205");
                    view.getContext().startActivity(i);
                }

                if(position.equals("214")){

                    //Beti Bachao, Baeti Padhao Yojana
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","206");
                    view.getContext().startActivity(i);
                }

                if(position.equals("215")){

                    //Mission Indradhanush
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","207");
                    view.getContext().startActivity(i);
                }

                if(position.equals("216")){

                    //Deen Dayal Upadhyaya Gram Jyoti...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","208");
                    view.getContext().startActivity(i);
                }

                if(position.equals("217")){

                    //Deen Dayal Upadhyaya Grameen K...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","209");
                    view.getContext().startActivity(i);
                }

                if(position.equals("218")){

                    //Pandit DeenDayal Upadhyaya Shram...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","210");
                    view.getContext().startActivity(i);
                }

                if(position.equals("219")){

                    //Atal Mission For Rejuvenation and...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","211");
                    view.getContext().startActivity(i);
                }

                if(position.equals("220")){

                    //Swadesh Darshan Yojana
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","212");
                    view.getContext().startActivity(i);

                }
                if(position.equals("221")){

                    //PRASAD (Pilgrimage Rejuvenation...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","213");
                    view.getContext().startActivity(i);

                }

                if(position.equals("222")){

                    //National Heritage City developme...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","214");
                    view.getContext().startActivity(i);
                }

                if(position.equals("223")){

                    //Udaan Scheme
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","215");
                    view.getContext().startActivity(i);
                }

                if(position.equals("224")){

                    //National Bal Swachhta Mission
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","216");
                    view.getContext().startActivity(i);
                }

                if(position.equals("225")){

                    //One Rank One Pension (OROP) Sch...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","217");
                    view.getContext().startActivity(i);
                }

                if(position.equals("226")){

                    //NSmart City Mission
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","218");
                    view.getContext().startActivity(i);
                }

                if(position.equals("227")){

                    //Gold Monetisation Schemes
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","219");
                    view.getContext().startActivity(i);
                }

                if(position.equals("228")){

                    //Startup India, Standup India
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","220");
                    view.getContext().startActivity(i);
                }

                if(position.equals("229")){

                    //DigiLocker
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","221");
                    view.getContext().startActivity(i);
                }

                if(position.equals("230")){

                    //Integrated Power Development Sch...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","222");
                    view.getContext().startActivity(i);

                }
                if(position.equals("231")){

                    //Shyama Prasad Mukherji Rurban M...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","223");
                    view.getContext().startActivity(i);

                }

                if(position.equals("232")){

                    //xSagarmala Project
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","224");
                    view.getContext().startActivity(i);
                }

                if(position.equals("233")){

                    //Prakash Path-Way To Light-The N...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","225");
                    view.getContext().startActivity(i);
                }

                if(position.equals("234")){

                    //UJWAL Discom Assurance Yojana(...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","226");
                    view.getContext().startActivity(i);
                }

                if(position.equals("235")){

                    //Vikalp Scheme
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","227");
                    view.getContext().startActivity(i);
                }

                if(position.equals("236")){

                    //National Sports Talent Search Sche...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","228");
                    view.getContext().startActivity(i);
                }

                if(position.equals("237")){

                    //Rashtriya Gokul Mission
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","229");
                    view.getContext().startActivity(i);
                }

                if(position.equals("238")){

                    //PAHAL-Direct Benefits Transfer For...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","230");
                    view.getContext().startActivity(i);
                }

                if(position.equals("239")){

                    //The National Institute For Transfer...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","231");
                    view.getContext().startActivity(i);
                }

                if(position.equals("240")){

                    //Pradhan Mantri Khanji Kshetra Kaly...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","232");
                    view.getContext().startActivity(i);

                }
                if(position.equals("241")){

                    //Pradhan Mantri Ujjwala Yojana
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","233");
                    view.getContext().startActivity(i);

                }

                if(position.equals("242")){

                    //Rashtriya Gram Swaraj Abhiyan
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","234");
                    view.getContext().startActivity(i);
                }

                if(position.equals("243")){

                    //Jan Sukraksha
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","235");
                    view.getContext().startActivity(i);
                }

                if(position.equals("244")){

                    //Stand Up India Scheme
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","236");
                    view.getContext().startActivity(i);
                }

                if(position.equals("245")){

                    //Pradhan Mantri Vaya Vandana Yojana
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","237");
                    view.getContext().startActivity(i);
                }

                if(position.equals("246")){

                    //Crop Insurance Calculator
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","238");
                    view.getContext().startActivity(i);
                }

                if(position.equals("247")){

                    //Commodity Arrival and Rates
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","239");
                    view.getContext().startActivity(i);
                }

                if(position.equals("248")){

                    //Andaman Nikobar and Island Agricul...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","240");
                    view.getContext().startActivity(i);
                }

                if(position.equals("249")){

                    //Andhra Pradesh Agri Culture Informa...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","241");
                    view.getContext().startActivity(i);
                }

                if(position.equals("250")){

                    //Arunachal Pradesh Agri Culture Informa...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","242");
                    view.getContext().startActivity(i);

                }

                if(position.equals("251")){

                    //Assam Agri Cultural Information
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","243");
                    view.getContext().startActivity(i);

                }

                if(position.equals("252")){

                    //Bihar Agri Cultural Information
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","244");
                    view.getContext().startActivity(i);
                }

                if(position.equals("253")){

                    //Chandigarh Agri Cultural Information
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","245");
                    view.getContext().startActivity(i);
                }

                if(position.equals("254")){

                    //Chhattisgarh Agri Cultural Information
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","246");
                    view.getContext().startActivity(i);
                }

                if(position.equals("255")){

                    //Dadra and Diu Agri Cultural informati...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","247");
                    view.getContext().startActivity(i);
                }

                if(position.equals("256")){

                    //Delhi Agri Cultural Information
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","248");
                    view.getContext().startActivity(i);
                }

                if(position.equals("257")){

                    //Goa Agri Cultural Information
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","249");
                    view.getContext().startActivity(i);
                }

                if(position.equals("258")){

                    //Gujarat Agri Cultural Information
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","250");
                    view.getContext().startActivity(i);
                }

                if(position.equals("259")){

                    //Haryana Agri Cultural Information
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","251");
                    view.getContext().startActivity(i);
                }

                if(position.equals("260")){

                    //Himachal Pradesh Agri Cultural Infor...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","252");
                    view.getContext().startActivity(i);

                }
                if(position.equals("261")){

                    //Jammu & Kashmir Agri Cultural Inform...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","253");
                    view.getContext().startActivity(i);

                }

                if(position.equals("262")){

                    //Jharkhand Agri Cultural Information
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","254");
                    view.getContext().startActivity(i);
                }

                if(position.equals("263")){

                    //Karnataka Agri Cultural Information
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","255");
                    view.getContext().startActivity(i);
                }

                if(position.equals("264")){

                    //Kerala Agri Cultural Information
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","256");
                    view.getContext().startActivity(i);
                }

                if(position.equals("265")){

                    //Lakshadweep Agri Cultural Information
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","257");
                    view.getContext().startActivity(i);
                }

                if(position.equals("266")){

                    //Madhya Pradesh Agri Cultural Informa...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","258");
                    view.getContext().startActivity(i);
                }

                if(position.equals("267")){

                    //Maharashtra  Agri Cultural Information
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","259");
                    view.getContext().startActivity(i);
                }

                if(position.equals("268")){

                    //Manipur Agri Cultural Information
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","260");
                    view.getContext().startActivity(i);
                }

                if(position.equals("269")){

                    //Meghalaya Agri Cultural Information
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","261");
                    view.getContext().startActivity(i);
                }

                if(p.equals("270")){

                    //Mizoram Agri Cultural Information
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","262");
                    view.getContext().startActivity(i);

                }
                if(position.equals("271")){

                    //Nagaland Agri Cultural Information
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","263");
                    view.getContext().startActivity(i);

                }

                if(position.equals("272")){

                    //Odhisha Agri Cultural Information
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","264");
                    view.getContext().startActivity(i);
                }

                if(position.equals("273")){

                    //Punducherry Agri Cultural Information
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","265");
                    view.getContext().startActivity(i);
                }

                if(position.equals("274")){

                    //Rajasthan Agri Cultural Information
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","266");
                    view.getContext().startActivity(i);
                }

                if(position.equals("275")){

                    //Sikkim Agri Cultural Information
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","267");
                    view.getContext().startActivity(i);
                }

                if(position.equals("276")){

                    //Tamilnadu Agri Cultural Information
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","268");
                    view.getContext().startActivity(i);
                }

                if(position.equals("277")){

                    //Telangana Agri Cultural Information
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","269");
                    view.getContext().startActivity(i);
                }

                if(position.equals("278")){

                    //Tripura Agri Cultural Information
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","270");
                    view.getContext().startActivity(i);
                }

                if(position.equals("279")){

                    //Uttar Pradesh Agri Cultural Information
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","271");
                    view.getContext().startActivity(i);
                }

                if(position.equals("280")){

                    //Uttarakhand Agri Cultural Information
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","272");
                    view.getContext().startActivity(i);

                }
                if(position.equals("281")){

                    //West Bengal Agri Cultural Information
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","273");
                    view.getContext().startActivity(i);

                }

                if(position.equals("282")){

                    //Naukri
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","274");
                    view.getContext().startActivity(i);
                }

                if(position.equals("283")){

                    //Monster India
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","275");
                    view.getContext().startActivity(i);
                }

                if(position.equals("284")){

                    //Shine
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","276");
                    view.getContext().startActivity(i);
                }

                if(position.equals("285")){

                    //Indeed India
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","277");
                    view.getContext().startActivity(i);
                }

                if(position.equals("286")){

                    //Times Jobs
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","278");
                    view.getContext().startActivity(i);
                }

                if(position.equals("287")){

                    //Careesma
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","279");
                    view.getContext().startActivity(i);
                }

                if(position.equals("288")){

                    //Freshersworld
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","280");
                    view.getContext().startActivity(i);
                }

                if(position.equals("289")){

                    //Jobrapido India
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","278");
                    view.getContext().startActivity(i);
                }

                if(position.equals("290")){

                    //Sarkari Naukri Blog
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","279");
                    view.getContext().startActivity(i);
                }

                if(position.equals("291")){

                    //Career Builder
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","280");
                    view.getContext().startActivity(i);
                }

                if(position.equals("292")){

                    //Digi Locker SignUp
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","280");
                    view.getContext().startActivity(i);
                }

                if(position.equals("293")){

                    //Digi Locker SignIn
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","280");
                    view.getContext().startActivity(i);
                }

                if(position.equals("294")){

                    //Indian Postal Services
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","286");
                    view.getContext().startActivity(i);
                }

                if(position.equals("295")){

                    //FedEx India
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","287");
                    view.getContext().startActivity(i);
                }

                if(position.equals("296")){

                    //First Flight Courier Limited
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","288");
                    view.getContext().startActivity(i);
                }

                if(position.equals("297")){

                    //DTDC Courier & Cargo Limited
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","289");
                    view.getContext().startActivity(i);
                }

                if(position.equals("298")){

                    //Aramex
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","290");
                    view.getContext().startActivity(i);

                }

                if(position.equals("299")){

                    //Go Javas
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","291");
                    view.getContext().startActivity(i);

                }

                if(position.equals("300")){

                    //DHL Express India Pvt Ltd
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","292");
                    view.getContext().startActivity(i);

                }
                if(position.equals("301")){

                    //eCOM EXpress
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","293");
                    view.getContext().startActivity(i);

                }

                if(position.equals("302")){

                    //Blue Dart Express Limited
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","294");
                    view.getContext().startActivity(i);
                }

                if(position.equals("303")){

                    //Kartrockets automated solution Shipro...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","295");
                    view.getContext().startActivity(i);
                }

                if(position.equals("304")){

                    //The Professional Courier Ltd
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","296");
                    view.getContext().startActivity(i);
                }

                if(position.equals("305")){

                    //Gati Limited
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","297");
                    view.getContext().startActivity(i);
                }

                if(position.equals("306")){

                    //Delhivery
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","298");
                    view.getContext().startActivity(i);
                }

                if(position.equals("307")){

                    //TNT Express
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","299");
                    view.getContext().startActivity(i);
                }

                if(position.equals("308")){

                    //Overnite Express Limited
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","300");
                    view.getContext().startActivity(i);
                }

                if(position.equals("309")){

                    //Palande Courier Services
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","301");
                    view.getContext().startActivity(i);
                }

                if(position.equals("310")){

                    //United Parcel Limited
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","302");
                    view.getContext().startActivity(i);

                }

                if(position.equals("311")){

                    //Emergency Help Line Number
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","303");
                    view.getContext().startActivity(i);

                }

                if(position.equals("312")){

                    //Indian Railways Help Line
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","304");
                    view.getContext().startActivity(i);
                }

                if(position.equals("313")){

                    //Blood Banks Help Line
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","305");
                    view.getContext().startActivity(i);
                }

                if(position.equals("314")){

                    //Ministery Of External Affairs
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","306");
                    view.getContext().startActivity(i);
                }

                if(position.equals("315")){

                    //Women Help Line
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","307");
                    view.getContext().startActivity(i);
                }

                if(position.equals("316")){

                    //Indian Banks
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","308");
                    view.getContext().startActivity(i);
                }

                if(position.equals("317")){

                    //Sucide Help Line
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","309");
                    view.getContext().startActivity(i);
                }

                if(position.equals("318")){

                    //Highway Numbers
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","310");
                    view.getContext().startActivity(i);
                }

                if(position.equals("319")){

                    //Air India
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","311");
                    view.getContext().startActivity(i);
                }

                if(position.equals("320")){

                    //Airports Authority Of India
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","312");
                    view.getContext().startActivity(i);

                }
                if(position.equals("321")){

                    //Bureau Of Indian Standards
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","313");
                    view.getContext().startActivity(i);

                }

                if(position.equals("322")){

                    //Departments Of Chemicals & Petroc...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","314");
                    view.getContext().startActivity(i);
                }

                if(position.equals("323")){

                    //Ministry Of Civil Aviation
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","315");
                    view.getContext().startActivity(i);
                }

                if(position.equals("324")){

                    //Department Of Commerce
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","316");
                    view.getContext().startActivity(i);
                }

                if(position.equals("325")){

                    //Ministry Of Coal
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","317");
                    view.getContext().startActivity(i);
                }

                if(position.equals("326")){

                    //Ministry Of Company Affairs
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","318");
                    view.getContext().startActivity(i);
                }

                if(position.equals("327")){

                    //Department Of Education
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","319");
                    view.getContext().startActivity(i);
                }

                if(position.equals("328")){

                    //Ministry Of Environment and Forests
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","320");
                    view.getContext().startActivity(i);
                }

                if(position.equals("329")){

                    //Ministry Of External Affairs
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","321");
                    view.getContext().startActivity(i);
                }

                if(position.equals("330")){

                    //Ministry Of Finance
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","322");
                    view.getContext().startActivity(i);

                }
                if(position.equals("331")){

                    //Directorate General Of Foreign Trade
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","323");
                    view.getContext().startActivity(i);

                }

                if(position.equals("332")){

                    //Department Of Heavy Industries
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","324");
                    view.getContext().startActivity(i);
                }

                if(position.equals("333")){

                    //Department Of Industrial Policy & P...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","325");
                    view.getContext().startActivity(i);
                }

                if(position.equals("334")){

                    //Ministry Of Information and Broadc
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","326");
                    view.getContext().startActivity(i);
                }

                if(position.equals("335")){

                    //Department Of Information Technol...
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","327");
                    view.getContext().startActivity(i);
                }

                if(position.equals("336")){

                    //Ministry Of Labour
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","328");
                    view.getContext().startActivity(i);
                }

                if(position.equals("337")){

                    //Ministry Of Mines
                    Intent i=new Intent(view.getContext(), DetailsActivity.class);
                    i.putExtra("position","329");
                    view.getContext().startActivity(i);
                }

                if(position.equals("338")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Ministry Of Non-Conventional Ener...");
                    i.putExtra("url","https://mnre.gov.in/");
                    startActivity(i);
                }

                if(position.equals("339")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Office Of The Controller General Of...");
                    i.putExtra("url","http://www.ipindia.nic.in/");
                    startActivity(i);
                }

                if(position.equals("340")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Ministry Of Petroleum And Natural...");
                    i.putExtra("url","http://petroleum.nic.in/");
                    startActivity(i);

                }
                if(position.equals("341")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Ministry Of Power");
                    i.putExtra("url","https://powermin.nic.in/");
                    startActivity(i);

                }

                if(position.equals("342")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Ministry Of Railways");
                    i.putExtra("url","http://www.indianrailways.gov.in/");
                    startActivity(i);
                }

                if(position.equals("343")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Reserve Bank Of India");
                    i.putExtra("url","https://www.rbi.org.in/");
                    startActivity(i);
                }

                if(position.equals("344")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Department Of Road Transport & Hi...");
                    i.putExtra("url","http://morth.nic.in/");
                    startActivity(i);
                }

                if(position.equals("345")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Department Of Shipping");
                    i.putExtra("url","http://onlinevacancy.shipmin.nic.in/");
                    startActivity(i);
                }

                if(position.equals("346")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Ministry Of Small Scale Industries");
                    i.putExtra("url","http://www.dcmsme.gov.in/howtosetup/grgxx01x.htm");
                    startActivity(i);
                }

                if(position.equals("347")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Ministry Of Statistics and Programm...");
                    i.putExtra("url","http://mospi.nic.in/");
                    startActivity(i);
                }

                if(position.equals("348")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Department Of Telecommunication");
                    i.putExtra("url","http://www.dot.gov.in/");
                    startActivity(i);
                }

                if(position.equals("349")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Ministry Of Textile");
                    i.putExtra("url","http://texmin.nic.in/");
                    startActivity(i);
                }

                if(position.equals("350")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Ministry Of Tourism");
                    i.putExtra("url","http://www.tourismofindia.com/");
                    startActivity(i);

                }

                if(position.equals("351")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Ministry Of Urban Development");
                    i.putExtra("url","http://mohua.gov.in/");
                    startActivity(i);

                }

                if(position.equals("352")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Ministry Of Water Resource");
                    i.putExtra("url","http://mowr.gov.in/");
                    startActivity(i);
                }

                if(position.equals("353")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Andaman & Nicobar(UT)");
                    i.putExtra("url","http://andaman.nic.in");
                    startActivity(i);
                }

                if(position.equals("354")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Andra Pradesh");
                    i.putExtra("url","http://www.aponline.gov.in");
                    startActivity(i);
                }

                if(position.equals("355")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Assam");
                    i.putExtra("url","https://assam.gov.in/");
                    startActivity(i);
                }

                if(position.equals("356")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Bihar");
                    i.putExtra("url","http://www.bihar.gov.in/");
                    startActivity(i);
                }

                if(position.equals("357")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Chandigarh(UT)");
                    i.putExtra("url","http://chandigarh.gov.in/");
                    startActivity(i);
                }

                if(position.equals("358")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Chhattisgarh");
                    i.putExtra("url","https://www.cgstate.gov.in/");
                    startActivity(i);
                }

                if(position.equals("359")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Dadra & Nagar Haveli");
                    i.putExtra("url","http://dnh.nic.in/");
                    startActivity(i);
                }

                if(position.equals("360")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Daman & Diu");
                    i.putExtra("url","http://daman.nic.in");
                    startActivity(i);

                }
                if(position.equals("361")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Delhi");
                    i.putExtra("url","http://delhigovt.nic.in");
                    startActivity(i);

                }

                if(position.equals("362")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Goa");
                    i.putExtra("url","https://www.goa.gov.in/");
                    startActivity(i);
                }

                if(position.equals("363")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Gujrat");
                    i.putExtra("url","http://gujaratindia.com/");
                    startActivity(i);
                }

                if(position.equals("364")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Haryana");
                    i.putExtra("url","http://haryana.gov.in/");
                    startActivity(i);
                }

                if(position.equals("365")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Himachal Pradesh");
                    i.putExtra("url","http://himachal.nic.in");
                    startActivity(i);
                }

                if(position.equals("366")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Jammu & Kashmir");
                    i.putExtra("url","http://jammukashmir.nic.in");
                    startActivity(i);
                }

                if(position.equals("367")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Jharkhand");
                    i.putExtra("url","http://jharkhand.gov.in/");
                    startActivity(i);
                }

                if(position.equals("368")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Karnataka");
                    i.putExtra("url","http://www.karnataka.nic.in");
                    startActivity(i);
                }

                if(position.equals("369")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Kerala");
                    i.putExtra("url","http://www.kerala.gov.in");
                    startActivity(i);
                }

                if(position.equals("370")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Lakshdweep(UT)");
                    i.putExtra("url","http://lakshadweep.nic.in");
                    startActivity(i);

                }
                if(position.equals("371")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Madhya Pradesh");
                    i.putExtra("url","http://www.mp.nic.in");
                    startActivity(i);

                }

                if(position.equals("372")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Maharashtra");
                    i.putExtra("url","http://maharashtra.gov.in");
                    startActivity(i);
                }

                if(position.equals("373")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Manipur");
                    i.putExtra("url","https://manipur.gov.in/");
                    startActivity(i);
                }

                if(position.equals("374")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Meghalaya");
                    i.putExtra("url","http://meghalaya.gov.in/megportal/");
                    startActivity(i);
                }

                if(position.equals("375")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Mizoram");
                    i.putExtra("url","http://mizoram.nic.in");
                    startActivity(i);
                }

                if(position.equals("376")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Nagaland");
                    i.putExtra("url","http://nagaland.nic.in");
                    startActivity(i);
                }

                if(position.equals("377")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Orissa");
                    i.putExtra("url","http://odisha.gov.in/");
                    startActivity(i);
                }

                if(position.equals("378")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Pondicherry(UT)");
                    i.putExtra("url","http://pondicherry.net.in/");
                    startActivity(i);
                }

                if(position.equals("379")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Punjab");
                    i.putExtra("url","http://www.punjab.gov.in/");
                    startActivity(i);
                }

                if(position.equals("380")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Rajasthan");
                    i.putExtra("url","http://www.rajasthan.gov.in");
                    startActivity(i);

                }
                if(position.equals("381")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Tripura");
                    i.putExtra("url","http://tripura.nic.in");
                    startActivity(i);

                }

                if(position.equals("382")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Uttar Pradesh");
                    i.putExtra("url","http://up.gov.in/");
                    startActivity(i);
                }

                if(position.equals("383")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Uttranchal");
                    i.putExtra("url","https://en.wikipedia.org/wiki/Uttarakhand");
                    startActivity(i);
                }

                if(position.equals("384")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","West Bengal");
                    i.putExtra("url","https://wb.gov.in/portal/web/guest/home");
                    startActivity(i);
                }

                if(position.equals("385")){


                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Sikkim");
                    i.putExtra("url","https://www.sikkim.gov.in/portal");
                    startActivity(i);
                }

                if(position.equals("386")){

                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Tamil Nadu");
                    i.putExtra("url","http://www.tn.gov.in");
                    startActivity(i);
                }

            }
        });

    }
}
