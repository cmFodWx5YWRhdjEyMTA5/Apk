package com.solution.idealz.Dashbord.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.solution.idealz.R;

public class DetailsActivity extends AppCompatActivity {

    TextView des,details;
    String position="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        position=getIntent().getStringExtra("position");
        des=findViewById(R.id.des);
        details=findViewById(R.id.details);


        String[] jkj= getResources().getStringArray(R.array.Details);
        details.setText(""+jkj[Integer.parseInt(position)]);

        des.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(position.equals("0")){

                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Enrollment & Update Centres");
                    i.putExtra("url","https://appointments.uidai.gov.in/centersearch.aspx");
                    startActivity(i);
                }
                if(position.equals("1")){

                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Locate Enrollment & Update Centers");
                    i.putExtra("url","https://appointments.uidai.gov.in/centersearch.aspx");
                    startActivity(i);
                }
                if(position.equals("2")){

                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Check Aadhaar Status");
                    i.putExtra("url","https://resident.uidai.gov.in/check-aadhaar-status");
                    startActivity(i);
                }
                if(position.equals("3")){

                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Download Aadhaar");
                    i.putExtra("url","https://eaadhaar.uidai.gov.in/#/");
                    startActivity(i);
                }
                if(position.equals("4")){

                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Get Adhaar Number On Mobile");
                    i.putExtra("url","https://resident.uidai.gov.in/web/resident/get-aadhaar-no");
                    startActivity(i);
                }
                if(position.equals("5")){

                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Retrieve Lost UID/EID");
                    i.putExtra("url","https://resident.uidai.gov.in/find-uid-eid");
                    startActivity(i);
                }
                if(position.equals("6")){

                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Update at Enrollment Centre");
                    i.putExtra("url","https://ssup.uidai.gov.in/web/guest/update");
                    startActivity(i);
                }
                if(position.equals("7")){

                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Check Status: Update done at Center");
                    i.putExtra("url","https://ssup.uidai.gov.in/web/guest/check-status");
                    startActivity(i);
                }
                if(position.equals("8")){

                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Address update request(Online)");
                    i.putExtra("url","https://resident.uidai.gov.in/check-aadhaar-status");
                    startActivity(i);
                }
                if(position.equals("9")){

                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Check Status: Update done Online");
                    i.putExtra("url","https://resident.uidai.gov.in/aadhaarverification");
                    startActivity(i);
                }
                if(position.equals("10")){

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
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Telangana Bus Services");
                    i.putExtra("url","https://www.axisbank.com/");
                    startActivity(i);
                }

                if(position.equals("137")){

                    //Rate Your Distributor
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Telangana Bus Services");
                    i.putExtra("url","https://www.axisbank.com/");
                    startActivity(i);
                }

                if(position.equals("138")){

                    //Search Train
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Telangana Bus Services");
                    i.putExtra("url","https://www.axisbank.com/");
                    startActivity(i);
                }

                if(position.equals("139")){

                    //Book Train Ticket
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Telangana Bus Services");
                    i.putExtra("url","https://www.axisbank.com/");
                    startActivity(i);
                }

                if(position.equals("140")){

                    //Seat/Berth Availability
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Telangana Bus Services");
                    i.putExtra("url","https://www.axisbank.com/");
                    startActivity(i);

                }
                if(position.equals("141")){

                    //Seat/Berth Booking
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Telangana Bus Services");
                    i.putExtra("url","https://www.axisbank.com/");
                    startActivity(i);

                }

                if(position.equals("142")){

                    //Fare Enquiry
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Telangana Bus Services");
                    i.putExtra("url","https://www.axisbank.com/");
                    startActivity(i);
                }

                if(position.equals("143")){

                    //PNR Status
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Telangana Bus Services");
                    i.putExtra("url","https://www.axisbank.com/");
                    startActivity(i);
                }

                if(position.equals("144")){

                    //Cancel e-Ticket
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Telangana Bus Services");
                    i.putExtra("url","https://www.axisbank.com/");
                    startActivity(i);
                }

                if(position.equals("145")){

                    //Cancel Counter Ticket
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Telangana Bus Services");
                    i.putExtra("url","https://www.axisbank.com/");
                    startActivity(i);
                }

                if(position.equals("146")){

                    //Live Station
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Telangana Bus Services");
                    i.putExtra("url","https://www.axisbank.com/");
                    startActivity(i);
                }

                if(position.equals("147")){

                    //Average Delay
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Telangana Bus Services");
                    i.putExtra("url","https://www.axisbank.com/");
                    startActivity(i);
                }

                if(position.equals("148")){

                    //Train Between Station
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Telangana Bus Services");
                    i.putExtra("url","https://www.axisbank.com/");
                    startActivity(i);
                }

                if(position.equals("149")){

                    //Train Schedule
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Telangana Bus Services");
                    i.putExtra("url","https://www.axisbank.com/");
                    startActivity(i);
                }

                if(position.equals("150")){

                    //Trains Cancelled
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Telangana Bus Services");
                    i.putExtra("url","https://www.axisbank.com/");
                    startActivity(i);

                }
                if(position.equals("151")){

                    //Partially Cancelled
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Telangana Bus Services");
                    i.putExtra("url","https://www.axisbank.com/");
                    startActivity(i);

                }

                if(position.equals("152")){

                    //Trains Reschedule
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Telangana Bus Services");
                    i.putExtra("url","https://www.axisbank.com/");
                    startActivity(i);
                }

                if(position.equals("153")){

                    //Trains Diverted
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Telangana Bus Services");
                    i.putExtra("url","https://www.axisbank.com/");
                    startActivity(i);
                }

                if(position.equals("154")){

                    //IR Train Ticket
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Telangana Bus Services");
                    i.putExtra("url","https://www.axisbank.com/");
                    startActivity(i);
                }

                if(position.equals("155")){

                    //Specials Trains
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Telangana Bus Services");
                    i.putExtra("url","https://www.axisbank.com/");
                    startActivity(i);
                }

                if(position.equals("156")){

                    //Heritage Trains
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Telangana Bus Services");
                    i.putExtra("url","https://www.axisbank.com/");
                    startActivity(i);
                }

                if(position.equals("157")){

                    //SMS Services
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Telangana Bus Services");
                    i.putExtra("url","https://www.axisbank.com/");
                    startActivity(i);
                }

                if(position.equals("158")){

                    //Andhra Pradesh Bus Service
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Telangana Bus Services");
                    i.putExtra("url","https://www.axisbank.com/");
                    startActivity(i);
                }

                if(position.equals("159")){

                    //Arunachal Pradesh Bus Service
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Telangana Bus Services");
                    i.putExtra("url","https://www.axisbank.com/");
                    startActivity(i);
                }

                if(position.equals("160")){

                    //Assam Bus Services
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Telangana Bus Services");
                    i.putExtra("url","https://www.axisbank.com/");
                    startActivity(i);

                }
                if(position.equals("161")){

                    //Banglore Bus Services
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Telangana Bus Services");
                    i.putExtra("url","https://www.axisbank.com/");
                    startActivity(i);

                }

                if(position.equals("162")){

                    //Bihar Bus Services
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Telangana Bus Services");
                    i.putExtra("url","https://www.axisbank.com/");
                    startActivity(i);
                }

                if(position.equals("163")){

                    //Calcutta Bus Services
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Telangana Bus Services");
                    i.putExtra("url","https://www.axisbank.com/");
                    startActivity(i);
                }

                if(position.equals("164")){

                    //Chandigarh Bus Services
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Telangana Bus Services");
                    i.putExtra("url","https://www.axisbank.com/");
                    startActivity(i);
                }

                if(position.equals("165")){

                    //Chennai Bus Services
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Telangana Bus Services");
                    i.putExtra("url","https://www.axisbank.com/");
                    startActivity(i);
                }

                if(position.equals("166")){

                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Telangana Bus Services");
                    i.putExtra("url","https://www.axisbank.com/");
                    startActivity(i);
                }

                if(position.equals("167")){

                    //Gujarat Bus Services
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Telangana Bus Services");
                    i.putExtra("url","https://www.axisbank.com/");
                    startActivity(i);
                }

                if(position.equals("168")){

                    //Goa(Kadamba) Bus Services
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Telangana Bus Services");
                    i.putExtra("url","https://www.axisbank.com/");
                    startActivity(i);
                }

                if(position.equals("169")){

                    //Haryana Bus Services
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Telangana Bus Services");
                    i.putExtra("url","https://www.axisbank.com/");
                    startActivity(i);
                }

                if(position.equals("170")){

                    //Himachal Bus Services
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Telangana Bus Services");
                    i.putExtra("url","https://www.axisbank.com/");
                    startActivity(i);

                }
                if(position.equals("171")){

                    //Hyderabad Bus Services
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Telangana Bus Services");
                    i.putExtra("url","https://www.axisbank.com/");
                    startActivity(i);

                }

                if(position.equals("172")){

                    //Jammu and Kashmir Bus Services
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Telangana Bus Services");
                    i.putExtra("url","https://www.axisbank.com/");
                    startActivity(i);
                }

                if(position.equals("173")){

                    //Kanpur Lucknow Bus Services
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Telangana Bus Services");
                    i.putExtra("url","https://www.axisbank.com/");
                    startActivity(i);
                }

                if(position.equals("174")){

                    //Karnataka Bus Services
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Telangana Bus Services");
                    i.putExtra("url","https://www.axisbank.com/");
                    startActivity(i);
                }

                if(position.equals("175")){

                    //Kerala Bus Services
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Telangana Bus Services");
                    i.putExtra("url","https://www.axisbank.com/");
                    startActivity(i);
                }

                if(position.equals("176")){

                    //Lucknow Bus Services
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Telangana Bus Services");
                    i.putExtra("url","https://www.axisbank.com/");
                    startActivity(i);
                }

                if(position.equals("177")){

                    //Maharashtra Bus Services
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Telangana Bus Services");
                    i.putExtra("url","https://www.axisbank.com/");
                    startActivity(i);
                }

                if(position.equals("178")){

                    //Odisha Bus Services
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Telangana Bus Services");
                    i.putExtra("url","https://www.axisbank.com/");
                    startActivity(i);
                }

                if(position.equals("179")){

                    //Punjab Bus Services
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Telangana Bus Services");
                    i.putExtra("url","https://www.axisbank.com/");
                    startActivity(i);
                }

                if(position.equals("180")){

                    //Puducherry Bus Services
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Telangana Bus Services");
                    i.putExtra("url","https://www.axisbank.com/");
                    startActivity(i);

                }
                if(position.equals("181")){

                    //Rajasthan Bus Services
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Telangana Bus Services");
                    i.putExtra("url","https://www.axisbank.com/");
                    startActivity(i);

                }

                if(position.equals("182")){

                    //Tamil Nadu Bus Services
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Telangana Bus Services");
                    i.putExtra("url","https://www.axisbank.com/");
                    startActivity(i);
                }

                if(position.equals("183")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Telangana Bus Services");
                    i.putExtra("url","https://www.axisbank.com/");
                    startActivity(i);
                }

                if(position.equals("184")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Uttar Pradesh Bus Services");
                    i.putExtra("url","https://www.axisbank.com/");
                    startActivity(i);
                }

                if(position.equals("185")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Uttarakhand Bus Services");
                    i.putExtra("url","https://www.axisbank.com/");
                    startActivity(i);
                }

                if(position.equals("186")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","West Bengal Bus Services");
                    i.putExtra("url","https://www.axisbank.com/");
                    startActivity(i);
                }



                if(position.equals("187")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Axis Bank Net Banking");
                    i.putExtra("url","https://www.axisbank.com/");
                    startActivity(i);
                }

                if(position.equals("188")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Bank Of Baroda Net Banking");
                    i.putExtra("url","https://www.bobibanking.com/");
                    startActivity(i);
                }

                if(position.equals("189")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Canara Net Banking");
                    i.putExtra("url","https://www.canarabank.in/");
                    startActivity(i);
                }

                if(position.equals("190")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","HDFC Bank Net Banking");
                    i.putExtra("url","https://www.hdfcbank.com/");
                    startActivity(i);

                }
                if(position.equals("191")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","ICICI Bank Net Banking");
                    i.putExtra("url","https://www.icicibank.com/");
                    startActivity(i);

                }

                if(position.equals("192")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Indusland Net Banking");
                    i.putExtra("url","https://www.indusind.com/");
                    startActivity(i);
                }

                if(position.equals("193")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Kotak Net Banking");
                    i.putExtra("url","https://www.kotak.com/en/digital-banking/ways-to-bank/net-banking.html");
                    startActivity(i);
                }

                if(position.equals("194")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","PNB Net Banking");
                    i.putExtra("url","https://netpnb.com/");
                    startActivity(i);
                }

                if(position.equals("195")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","SBI Net Banking");
                    i.putExtra("url","https://pmjdy.gov.in/");
                    startActivity(i);
                }

                if(position.equals("196")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","YES Net Banking");
                    i.putExtra("url","https://www.onlinesbi.com/");
                    startActivity(i);
                }

                if(position.equals("197")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Pradhan Mantri Jan Dhan Yojna(PMJ...");
                    i.putExtra("url","https://www.yesbank.in/");
                    startActivity(i);
                }

                if(position.equals("198")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Pradhan Mantri Sukanya Samriddhu...");
                    i.putExtra("url","http://www.nsiindia.gov.in/");
                    startActivity(i);

                }

                if(position.equals("199")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Pradhan Mantri MUDRA Yojna(PM...");
                    i.putExtra("url","http://www.mudra.org.in");
                    startActivity(i);

                }

                if(position.equals("200")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Pradhan Mantri Jeevan Jyoti Bima Y...");
                    i.putExtra("url","http://www.jansuraksha.gov.in");
                    startActivity(i);

                }
                if(position.equals("201")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Pradhan Mantri Suraksha Bima Yoja...");
                    i.putExtra("url","http://www.jansuraksha.gov.in");
                    startActivity(i);

                }

                if(position.equals("202")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Atal Pension Yojana(APY)");
                    i.putExtra("url","http://www.jansuraksha.gov.in");
                    startActivity(i);
                }

                if(position.equals("203")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Pradhan Mantri Awas Yojna(PMAY)");
                    i.putExtra("url","https://rural.nic.in/");
                    startActivity(i);
                }

                if(position.equals("204")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Sansad Adarsh Gram Yojana(SAGY)");
                    i.putExtra("url","http://agricoop.nic.in/");
                    startActivity(i);
                }

                if(position.equals("205")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Pradhan Mantri Fasal Bima Yojana(...");
                    i.putExtra("url","http://agricoop.nic.in/");
                    startActivity(i);
                }

                if(position.equals("206")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Pradhan Mantri Gram Sinchai Yojan...");
                    i.putExtra("url","http://niti.gov.in/");
                    startActivity(i);
                }

                if(position.equals("207")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Pradhan Mantri Garib Kalyan Yojan...");
                    i.putExtra("url","http://janaushadhi.gov.in/index.aspx");
                    startActivity(i);
                }

                if(position.equals("208")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Make In India");
                    i.putExtra("url","http://www.makeinindia.com");
                    startActivity(i);
                }

                if(position.equals("209")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Swachh Bharat Abhiyan");
                    i.putExtra("url","https://swachhbharat.mygov.in/");
                    startActivity(i);
                }

                if(position.equals("210")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Skill India");
                    i.putExtra("url","http://www.nsiindia.gov.in/");
                    startActivity(i);

                }
                if(position.equals("211")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Soil Health Card Scheme");
                    i.putExtra("url","https://soilhealth.dac.gov.in/");
                    startActivity(i);

                }

                if(position.equals("212")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Digital India");
                    i.putExtra("url","http://www.digitalindia.gov.in/");
                    startActivity(i);
                }

                if(position.equals("213")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Skill India");
                    i.putExtra("url","https://www.skillindia.gov.in/");
                    startActivity(i);
                }

                if(position.equals("214")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Beti Bachao, Baeti Padhao Yojana");
                    i.putExtra("url","http://wcd.nic.in");
                    startActivity(i);
                }

                if(position.equals("215")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Mission Indradhanush");
                    i.putExtra("url","http://vikaspedia.in/health/nrhm/national-health-programmes-1/mission-indhradhanush<");
                    startActivity(i);
                }

                if(position.equals("216")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Deen Dayal Upadhyaya Gram Jyoti...");
                    i.putExtra("url","http://powermin.nic.in");
                    startActivity(i);
                }

                if(position.equals("217")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Deen Dayal Upadhyaya Grameen K...");
                    i.putExtra("url","http://ddugky.gov.in/");
                    startActivity(i);
                }

                if(position.equals("218")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Pandit DeenDayal Upadhyaya Shram...");
                    i.putExtra("url","https://shramsuvidha.gov.in/home");
                    startActivity(i);
                }

                if(position.equals("219")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Atal Mission For Rejuvenation and...");
                    i.putExtra("url","http://amrut.gov.in/");
                    startActivity(i);
                }

                if(position.equals("220")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Swadesh Darshan Yojana");
                    i.putExtra("url","http://tourism.gov.in/");
                    startActivity(i);

                }
                if(position.equals("221")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","PRASAD (Pilgrimage Rejuvenation...");
                    i.putExtra("url","http://tourism.gov.in/");
                    startActivity(i);

                }

                if(position.equals("222")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","National Heritage City developme...");
                    i.putExtra("url","http://hridayindia.in/");
                    startActivity(i);
                }

                if(position.equals("223")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Udaan Scheme");
                    i.putExtra("url","http://mhrd.gov.in/");
                    startActivity(i);
                }

                if(position.equals("224")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","National Bal Swachhta Mission");
                    i.putExtra("url","http://wcd.nic.in/");
                    startActivity(i);
                }

                if(position.equals("225")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","One Rank One Pension (OROP) Sch...");
                    i.putExtra("url","http://wcd.nic.in/");
                    startActivity(i);
                }

                if(position.equals("226")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","NSmart City Mission");
                    i.putExtra("url","http://smartcities.gov.in/content/");
                    startActivity(i);
                }

                if(position.equals("227")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Gold Monetisation Schemes");
                    i.putExtra("url","https://finmin.nic.in/");
                    startActivity(i);
                }

                if(position.equals("228")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Startup India, Standup India");
                    i.putExtra("url","https://www.startupindia.gov.in/");
                    startActivity(i);
                }

                if(position.equals("229")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","DigiLocker");
                    i.putExtra("url","https://digilocker.gov.in/");
                    startActivity(i);
                }

                if(position.equals("230")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Integrated Power Develpoment Sch...");
                    i.putExtra("url","http://www.ipds.gov.in/");
                    startActivity(i);

                }
                if(position.equals("231")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Shyama Prasad Mukherji Rurban M...");
                    i.putExtra("url","http://rurban.gov.in/");
                    startActivity(i);

                }

                if(position.equals("232")){

                    //xSagarmala Project
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Prakash Path-Way To Light-The N...");
                    i.putExtra("url","http://sagarmala.gov.in/");
                    startActivity(i);
                }

                if(position.equals("233")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Prakash Path-Way To Light-The N...");
                    i.putExtra("url","https://powermin.nic.in/#");
                    startActivity(i);
                }

                if(position.equals("234")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","UJWAL Discom Assurance Yojana(...");
                    i.putExtra("url","https://powermin.nic.in/");
                    startActivity(i);
                }

                if(position.equals("235")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Vikalp Scheme");
                    i.putExtra("url","http://contents.irctc.co.in/en/vikalpTerms.html");
                    startActivity(i);
                }

                if(position.equals("236")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","National Sports Talent Search Sche...");
                    i.putExtra("url","http://www.sportsauthorityofindia.nic.in/");
                    startActivity(i);
                }

                if(position.equals("237")){

                    //Rashtriya Gokul Mission
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","PAHAL-Direct Benefits Transfer For...");
                    i.putExtra("url","http://dahd.nic.in/");
                    startActivity(i);
                }

                if(position.equals("238")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","PAHAL-Direct Benefits Transfer For...");
                    i.putExtra("url","http://petroleum.nic.in/dbt/index.php");
                    startActivity(i);
                }

                if(position.equals("239")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","The National Institute For Transfer...");
                    i.putExtra("url","http://niti.gov.in/");
                    startActivity(i);
                }

                if(position.equals("240")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Pradhan Mantri Khanji Kshetra Kaly...");
                    i.putExtra("url","http://pib.nic.in/newsite/PrintRelease.aspx?relid=126983");
                    startActivity(i);

                }
                if(position.equals("241")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Pradhan Mantri Ujjwala Yojana");
                    i.putExtra("url","http://www.pmujjwalayojana.com/");
                    startActivity(i);

                }

                if(position.equals("242")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Rashtriya Gram Swaraj Abhiyan");
                    i.putExtra("url","http://rgsa.nic.in/");
                    startActivity(i);
                }

                if(position.equals("243")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Jan Sukraksha");
                    i.putExtra("url","http://www.jansuraksha.gov.in");
                    startActivity(i);
                }

                if(position.equals("244")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Stand Up India Scheme");
                    i.putExtra("url","https://www.standupmitra.in/");
                    startActivity(i);
                }

                if(position.equals("245")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Pradhan Mantri Vaya Vandana Yojana");
                    i.putExtra("url","https://www.licindia.in/Bottom-Links/Pradhan-Mantri-Vaya-vandana-Yojana_05052018-(2)");
                    startActivity(i);
                }

                if(position.equals("246")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Crop Insurance Calculator");
                    i.putExtra("url","http://agri.and.nic.in/");
                    startActivity(i);
                }

                if(position.equals("247")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Commodity Arrival and Rates");
                    i.putExtra("url","http://agmarknet.gov.in/#");
                    startActivity(i);
                }

                if(position.equals("248")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Andaman Nikobar and Island Agricul...");
                    i.putExtra("url","http://www.apagrisnet.gov.in/");
                    startActivity(i);
                }

                if(position.equals("249")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Andhra Pradesh Agri Culture Informa...");
                    i.putExtra("url","http://www.apagrisnet.gov.in/");
                    startActivity(i);
                }

                if(position.equals("250")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Arunachal Pradesh Agri Culture Informa...");
                    i.putExtra("url","http://arunachalpradesh.nic.in/");
                    startActivity(i);

                }

                if(position.equals("251")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Assam Agri Cultural Information");
                    i.putExtra("url","https://agri-horti.assam.gov.in/");
                    startActivity(i);

                }

                if(position.equals("252")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Bihar Agri Cultural Information");
                    i.putExtra("url","http://krishi.bih.nic.in/");
                    startActivity(i);
                }

                if(position.equals("253")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Chandigarh Agri Cultural Information");
                    i.putExtra("url","http://agriportal.cg.nic.in/PortHi/");
                    startActivity(i);
                }

                if(position.equals("254")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Chhattisgarh Agri Cultural Information");
                    i.putExtra("url","http://agricoop.nic.in/agriculturecontingency/dadra-and-nagar-haveli");
                    startActivity(i);
                }

                if(position.equals("255")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Dadra and Diu Agri Cultural informati...");
                    i.putExtra("url","https://daman.nic.in/agriculture.aspx");
                    startActivity(i);
                }

                if(position.equals("256")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Delhi Agri Cultural Information");
                    i.putExtra("url","http://agricoop.nic.in/");
                    startActivity(i);
                }

                if(position.equals("257")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Goa Agri Cultural Information");
                    i.putExtra("url","http://agri.goa.gov.in/");
                    startActivity(i);
                }

                if(position.equals("258")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Gujarat Agri Cultural Information");
                    i.putExtra("url","https://agri.gujarat.gov.in/");
                    startActivity(i);
                }

                if(position.equals("259")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Haryana Agri Cultural Information");
                    i.putExtra("url","http://agriharyana.gov.in/");
                    startActivity(i);
                }

                if(position.equals("260")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Himachal Pradesh Agri Cultural Infor...");
                    i.putExtra("url","http://www.hpagriculture.com/");
                    startActivity(i);

                }
                if(position.equals("261")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Jammu & Kashmir Agri Cultural Inform...");
                    i.putExtra("url","http://www.jkapd.nic.in/");
                    startActivity(i);

                }

                if(position.equals("262")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Jharkhand Agri Cultural Information");
                    i.putExtra("url","http://www.jharkhand.gov.in/agri");
                    startActivity(i);
                }

                if(position.equals("263")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Karnataka Agri Cultural Information");
                    i.putExtra("url","http://raitamitra.kar.nic.in/KAN/index.asp");
                    startActivity(i);
                }

                if(position.equals("264")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Kerala Agri Cultural Information");
                    i.putExtra("url","http://www.keralaagriculture.gov.in/");
                    startActivity(i);
                }

                if(position.equals("265")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Lakshadweep Agri Cultural Information");
                    i.putExtra("url","http://agricoop.nic.in/agriculturecontingency/lakshadweep");
                    startActivity(i);
                }

                if(position.equals("266")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Madhya Pradesh Agri Cultural Informa...");
                    i.putExtra("url","http://mpkrishi.mp.gov.in/hindisite/indexhindi.aspx");
                    startActivity(i);
                }

                if(position.equals("267")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Maharashtra  Agri Cultural Information");
                    i.putExtra("url","http://krishi.maharashtra.gov.in/1001/Home");
                    startActivity(i);
                }

                if(position.equals("268")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Manipur Agri Cultural Information");
                    i.putExtra("url","https://mastec.nic.in/index.php");
                    startActivity(i);
                }

                if(position.equals("269")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Meghalaya Agri Cultural Information");
                    i.putExtra("url","http://www.megagriculture.gov.in/");
                    startActivity(i);
                }

                if(position.equals("270")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Mizoram Agri Cultural Information");
                    i.putExtra("url","http://agriculturemizoram.nic.in/");
                    startActivity(i);

                }
                if(position.equals("271")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Nagaland Agri Cultural Information");
                    i.putExtra("url","http://agringl.nic.in/");
                    startActivity(i);

                }

                if(position.equals("272")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Odhisha Agri Cultural Information");
                    i.putExtra("url","http://agriodisha.nic.in/");
                    startActivity(i);
                }

                if(position.equals("273")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Punducherry Agri Cultural Information");
                    i.putExtra("url","http://agri.puducherry.gov.in/");
                    startActivity(i);
                }

                if(position.equals("274")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Rajasthan Agri Cultural Information");
                    i.putExtra("url","http://www.agriculture.rajasthan.gov.in/content/agriculture/hi.html");
                    startActivity(i);
                }

                if(position.equals("275")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Sikkim Agri Cultural Information");
                    i.putExtra("url","http://www.sikkimagrisnet.org/");
                    startActivity(i);
                }

                if(position.equals("276")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Tamilnadu Agri Cultural Information");
                    i.putExtra("url","http://www.tn.gov.in/department/2");
                    startActivity(i);
                }

                if(position.equals("277")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Telangana Agri Cultural Information");
                    i.putExtra("url","http://agri.telangana.gov.in/");
                    startActivity(i);
                }

                if(position.equals("278")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Tripura Agri Cultural Information");
                    i.putExtra("url","https://agri.tripura.gov.in/");
                    startActivity(i);
                }

                if(position.equals("279")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Uttar Pradesh Agri Cultural Information");
                    i.putExtra("url","http://upagripardarshi.gov.in/StaticPages/StateSponsored-CropBreeding.aspx");
                    startActivity(i);
                }

                if(position.equals("280")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Uttarakhand Agri Cultural Information");
                    i.putExtra("url","http://agriculture.uk.gov.in/");
                    startActivity(i);

                }
                if(position.equals("281")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","West Bengal Agri Cultural Information");
                    i.putExtra("url","https://wb.gov.in/portal/web/guest/agriculture");
                    startActivity(i);

                }

                if(position.equals("282")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Naukri");
                    i.putExtra("url","https://www.naukri.com/");
                    startActivity(i);
                }

                if(position.equals("283")){

                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Monster India");
                    i.putExtra("url","https://www.monsterindia.com/");
                    startActivity(i);
                }

                if(position.equals("284")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Shine");
                    i.putExtra("url","https://www.shine.com/");
                    startActivity(i);
                }

                if(position.equals("285")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Indeed India");
                    i.putExtra("url","https://www.indeed.co.in/");
                    startActivity(i);
                }

                if(position.equals("286")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Times Jobs");
                    i.putExtra("url","http://timesjobs.com/");
                    startActivity(i);
                }

                if(position.equals("287")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Careesma");
                    i.putExtra("url","https://www.careesma.in/");
                    startActivity(i);
                }

                if(position.equals("288")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Freshersworld");
                    i.putExtra("url","https://www.freshersworld.com/");
                    startActivity(i);
                }

                if(position.equals("289")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Jobrapido India");
                    i.putExtra("url","https://in.jobrapido.com/");
                    startActivity(i);
                }

                if(position.equals("290")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Sarkari Naukri Blog");
                    i.putExtra("url","https://www.sarkarinaukriblog.com/");
                    startActivity(i);
                }

                if(position.equals("291")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Career Builder");
                    i.putExtra("url","https://www.careerbuilder.co.in/?cbRecursionCnt=1");
                    startActivity(i);
                }

                if(position.equals("292")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Digi Locker SignUp");
                    i.putExtra("url","https://digilocker.gov.in/public/register");
                    startActivity(i);
                }

                if(position.equals("293")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Digi Locker SignIn");
                    i.putExtra("url","https://digilocker.gov.in/index.php#no-back");
                    startActivity(i);
                }

                if(position.equals("294")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Indian Postal Services");
                    i.putExtra("url","https://www.indiapost.gov.in/vas/Pages/IndiaPostHome.aspx");
                    startActivity(i);
                }

                if(position.equals("295")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","FedEx India");
                    i.putExtra("url","https://www.fedex.com/in/");
                    startActivity(i);
                }

                if(position.equals("296")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","First Flight Courier Limited");
                    i.putExtra("url","http://www.firstflight.net/");
                    startActivity(i);
                }

                if(position.equals("297")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","DTDC Courier & Cargo Limited");
                    i.putExtra("url","http://www.dtdc.in/");
                    startActivity(i);
                }

                if(position.equals("298")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Aramex");
                    i.putExtra("url","https://www.aramex.com/track/shipments");
                    startActivity(i);

                }

                if(position.equals("299")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Go Javas");
                    i.putExtra("url","http://gojavas.com/");
                    startActivity(i);

                }

                if(position.equals("300")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","KDHL Express India Pvt Ltd");
                    i.putExtra("url","https://www.logistics.dhl/in-en/home/tracking.html");
                    startActivity(i);

                }
                if(position.equals("301")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","eCOM EXpress");
                    i.putExtra("url","https://ecomexpress.in/");
                    startActivity(i);

                }

                if(position.equals("302")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Blue Dart Express Limited");
                    i.putExtra("url","https://alpha.bluedart.com/");
                    startActivity(i);
                }

                if(position.equals("303")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Kartrockets automated solution Shipro...");
                    i.putExtra("url","https://www.kartrocket.com/order-processing/");
                    startActivity(i);
                }

                if(position.equals("304")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","The Professional Courier Ltd");
                    i.putExtra("url","http://www.tpcindia.com/");
                    startActivity(i);
                }

                if(position.equals("305")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Gati Limited");
                    i.putExtra("url","https://www.gati.com/");
                    startActivity(i);
                }

                if(position.equals("306")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Delhivery");
                    i.putExtra("url","https://www.delhivery.com/");
                    startActivity(i);
                }

                if(position.equals("307")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","TNT Express");
                    i.putExtra("url","https://www.tnt.com/express/en_in/site/home.html");
                    startActivity(i);
                }

                if(position.equals("308")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Overnite Express Limited");
                    i.putExtra("url","http://www.overnitenet.com/");
                    startActivity(i);
                }

                if(position.equals("309")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Palande Courier Services");
                    i.putExtra("url","https://shipway.in/palande_courier");
                    startActivity(i);
                }

                if(position.equals("310")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","United Parcel Limited");
                    i.putExtra("url","https://www.ups.com/us/en/Home.page");
                    startActivity(i);

                }

                if(position.equals("311")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Emergency Help Line Number");
                    i.putExtra("url","http://www.newincept.com/helpline-numbers-all-over-in-india.html");
                    startActivity(i);

                }

                if(position.equals("312")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Indian Railways Help Line");
                    i.putExtra("url","https://indianhelpline.com/INDIAN-RAILWAYS/");
                    startActivity(i);
                }

                if(position.equals("313")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Blood Banks Help Line");
                    i.putExtra("url","https://indianhelpline.com/BLOOD-BANKS/");
                    startActivity(i);
                }

                if(position.equals("314")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Ministery Of External Affairs");
                    i.putExtra("url","https://indianhelpline.com/EXTERNAL-AFFAIRS/");
                    startActivity(i);
                }

                if(position.equals("315")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Women Help Line");
                    i.putExtra("url","https://indianhelpline.com/WOMEN-HELPLINE/");
                    startActivity(i);
                }

                if(position.equals("316")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Indian Banks");
                    i.putExtra("url","https://indianhelpline.com/INDIAN-BANKS/");
                    startActivity(i);
                }

                if(position.equals("317")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Sucide Help Line");
                    i.putExtra("url","https://indianhelpline.com/SUICIDE-HELPLINE/");
                    startActivity(i);
                }

                if(position.equals("318")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Highway Numbers");
                    i.putExtra("url","https://indianhelpline.com/HIGHWAY-NUMBERS/");
                    startActivity(i);
                }

                if(position.equals("319")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Air India");
                    i.putExtra("url","http://www.airindia.com/");
                    startActivity(i);
                }

                if(position.equals("320")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Airports Authority Of India");
                    i.putExtra("url","http://www.airportsindia.org.in/");
                    startActivity(i);

                }
                if(position.equals("321")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Bureau Of Indian Standards");
                    i.putExtra("url","http://www.bis.org.in/");
                    startActivity(i);

                }

                if(position.equals("322")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Departments Of Chemicals & Petroc...");
                    i.putExtra("url","http://chemicals.nic.in/");
                    startActivity(i);
                }

                if(position.equals("323")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Ministry Of Civil Aviation");
                    i.putExtra("url","http://civilaviation.gov.in/");
                    startActivity(i);
                }

                if(position.equals("324")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Department Of Commerce");
                    i.putExtra("url","http://commerce.gov.in/");
                    startActivity(i);
                }

                if(position.equals("325")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Ministry Of Coal");
                    i.putExtra("url","https://coal.nic.in/");
                    startActivity(i);
                }

                if(position.equals("326")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Ministry Of Company Affairs");
                    i.putExtra("url","https://consumeraffairs.nic.in/Home.aspx");
                    startActivity(i);
                }

                if(position.equals("327")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Department Of Education");
                    i.putExtra("url","http://mhrd.gov.in/");
                    startActivity(i);
                }

                if(position.equals("328")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Ministry Of Environment and Forests");
                    i.putExtra("url","http://envfor.nic.in/");
                    startActivity(i);
                }

                if(position.equals("329")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Ministry Of External Affairs");
                    i.putExtra("url","https://www.mea.gov.in/");
                    startActivity(i);
                }

                if(position.equals("330")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Ministry Of Finance");
                    i.putExtra("url","https://finmin.nic.in/");
                    startActivity(i);

                }
                if(position.equals("331")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Directorate General Of Foreign Trade");
                    i.putExtra("url","https://dgft.gov.in/");
                    startActivity(i);

                }

                if(position.equals("332")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Department Of Heavy Industries");
                    i.putExtra("url","https://dhi.nic.in/");
                    startActivity(i);
                }

                if(position.equals("333")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Department Of Industrial Policy & P...");
                    i.putExtra("url","http://dipp.nic.in/");
                    startActivity(i);
                }

                if(position.equals("334")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Ministry Of Information and Broadc");
                    i.putExtra("url","https://www.mib.gov.in/");
                    startActivity(i);
                }

                if(position.equals("335")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Ministry Of Non-Conventional Ener...");
                    i.putExtra("url","http://meity.gov.in/");
                    startActivity(i);
                }

                if(position.equals("336")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Ministry Of Labour");
                    i.putExtra("url","https://labour.gov.in/");
                    startActivity(i);
                }

                if(position.equals("337")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Ministry Of Mines");
                    i.putExtra("url","https://mines.gov.in/");
                    startActivity(i);
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
