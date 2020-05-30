package com.solution.idealz.Dashbord.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
