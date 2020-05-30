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

                if(position.equals("11")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Verify Adhaar Number");
                    i.putExtra("url","https://resident.uidai.gov.in/aadhaarverification");
                    startActivity(i);
                }
                if(position.equals("12")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Verify Email/Mobile Number");
                    i.putExtra("url","https://resident.uidai.gov.in/verify-email-mobile");
                    startActivity(i);
                }
                if(position.equals("13")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Lock/Unlock Biometrics");
                    i.putExtra("url","https://resident.uidai.gov.in/biometric-lock");
                    startActivity(i);
                }
                if(position.equals("14")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Check Adhaar & Bank Account Link");
                    i.putExtra("url","https://resident.uidai.gov.in/bank-mapper");
                    startActivity(i);
                }
                if(position.equals("15")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Adhaar Aunthentication History");
                    i.putExtra("url","https://resident.uidai.gov.in/notification-aadhaar");
                    startActivity(i);
                }
                if(position.equals("16")){

                    //Virtual ID(VID) Generator
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Adhaar Aunthentication History");
                    i.putExtra("url","https://resident.uidai.gov.in/web/resident/vidgeneration");
                    startActivity(i);

                }
                if(position.equals("17")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Search Your Name In Electroral Roll");
                    i.putExtra("url","http://electoralsearch.in/");
                    startActivity(i);
                }
                if(position.equals("18")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Voter ID Card Status");
                    i.putExtra("url","http://www.nvsp.in/forms/forms/trackstatus");
                    startActivity(i);
                }
                if(position.equals("19")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Apply Online For Registration of Ne...");
                    i.putExtra("url","http://www.nvsp.in/Forms/Forms/form6");
                    startActivity(i);
                }
                if(position.equals("20")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Apply Online For Registration of Ov...");
                    i.putExtra("url","http://www.nvsp.in/Forms/Forms/form6A");
                    startActivity(i);
                }
                if(position.equals("21")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Correction Of Enteries In Electrol Roll");
                    i.putExtra("url","http://www.nvsp.in/forms/Forms/Form8");
                    startActivity(i);
                }
                if(position.equals("22")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Transportation Within Assembly");
                    i.putExtra("url","http://www.nvsp.in/Forms/Forms/form8A");
                    startActivity(i);
                }
                if(position.equals("23")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Track Application Status");
                    i.putExtra("url","http://www.nvsp.in/Forms/Forms/trackstatus");
                    startActivity(i);
                }
                if(position.equals("24")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Know Your Booth, AC and PC");
                    i.putExtra("url","http://electoralsearch.in/");
                    startActivity(i);
                }
                if(position.equals("25")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Know Your BLO, ERO amd DEO");
                    i.putExtra("url","http://electoralsearch.in/");
                    startActivity(i);
                }

                if(position.equals("26")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Link TO State/UT CEOs");
                    i.putExtra("url","http://eci.nic.in/eci_main1/Links.aspx");
                    startActivity(i);
                }

                if(position.equals("27")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Voter List");
                    i.putExtra("url","http://eci.nic.in/eci_main1/Linkto_erollpdf.aspx");
                    startActivity(i);
                }

                if(position.equals("28")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Voter Educational Channel");
                    i.putExtra("url","http://eci.nic.in/eci_main1/sveep.aspx");
                    startActivity(i);
                }

                if(position.equals("29")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Pooling Process");
                    i.putExtra("url","http://eci.nic.in/eci_main1/tm.aspx");
                    startActivity(i);
                }
                if(position.equals("30")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","EVM Machine");
                    i.putExtra("url","http://eci.nic.in/eci_main1/evm1.aspx");
                    startActivity(i);
                }
                if(position.equals("31")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Complaint/Suggestions");
                    i.putExtra("url","http://eci-citizenservices.nic.in/");
                    startActivity(i);
                }
                if(position.equals("32")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Help");
                    i.putExtra("url","http://electoralsearch.in/instructions.html");
                    startActivity(i);
                }

                if(position.equals("33")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Guidline For Submission Pan Appl...");
                    i.putExtra("url","https://tin.tin.nsdl.com/pan/form49Adsc.html");
                    startActivity(i);
                }
                if(position.equals("34")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Apply For New Pan Card");
                    i.putExtra("url","https://www.onlineservices.nsdl.com/paam/endUserRegisterContact.html");
                    startActivity(i);
                }
                if(position.equals("35")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Track PAN/TAN Application Status");
                    i.putExtra("url","https://tin.tin.nsdl.com/pantan/StatusTrack.html/");
                    startActivity(i);
                }
                if(position.equals("36")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Apply For New Pan Car(Physically...");
                    i.putExtra("url","https://www.tin-nsdl.com/services/pan/form49A.html");
                    startActivity(i);
                }
                if(position.equals("37")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Pan Card Correction Online");
                    i.putExtra("url","https://tin.tin.nsdl.com/pan/form49Adsc.html");
                    startActivity(i);
                }
                if(position.equals("38")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Steps For Online Correction");
                    i.putExtra("url","https://tin.tin.nsdl.com/pan/form49Adsc.html");
                    startActivity(i);
                }
                if(position.equals("39")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Changes to White Ration Card From...");
                    i.putExtra("url","https://pdsportal.nic.in/Default.aspx?lid=2");
                    startActivity(i);
                }
                if(position.equals("40")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Apply for Corrections In Ration Card");
                    i.putExtra("url","hhttps://pdsportal.nic.in/Default.aspx?lid=2");
                    startActivity(i);
                }
                if(position.equals("41")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Change address in Ration Card");
                    i.putExtra("url","https://pdsportal.nic.in/Default.aspx?lid=2");
                    startActivity(i);
                }
                if(position.equals("42")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Delete a Member From Ration Card");
                    i.putExtra("url","https://pdsportal.nic.in/Default.aspx?lid=2");
                    startActivity(i);
                }
                if(position.equals("43")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Add a New Member in Ration Card");
                    i.putExtra("url","https://pdsportal.nic.in/Default.aspx?lid=2");
                    startActivity(i);
                }
                if(position.equals("44")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Apply For Duplicate Ration card Online");
                    i.putExtra("url","https://pdsportal.nic.in/Default.aspx?lid=2");
                    startActivity(i);
                }
                if(position.equals("45")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Smart Ration Card");
                    i.putExtra("url","https://pdsportal.nic.in/Default.aspx?lid=2");
                    startActivity(i);
                }
                if(position.equals("46")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","State Wise Ration Card");
                    i.putExtra("url","https://pdsportal.nic.in/Default.aspx?lid=2");
                    startActivity(i);
                }

                if(position.equals("47")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Apply for New Learner Licence");
                    i.putExtra("url","https://parivahan.gov.in/sarathiservice10/newLL_displayNewLL.do");
                    startActivity(i);
                }

                if(position.equals("48")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Apply for new driving licence");
                    i.putExtra("url","https://parivahan.gov.in/sarathiservice10/newDL_display.do");
                    startActivity(i);
                }

                if(position.equals("49")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Track Application Status");
                    i.putExtra("url","https://parivahan.gov.in/sarathiservice10/applViewStatus.do");
                    startActivity(i);
                }

                if(position.equals("50")){


                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Renewal/Duplicate Licence");
                    i.putExtra("url","https://parivahan.gov.in/sarathiservice10/dlServicesDet.do");
                    startActivity(i);
                }

                if(position.equals("51")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Smart Card Driving Licence");
                    i.putExtra("url","https://parivahan.gov.in/sarathiservice10/newDLDet.do");
                    startActivity(i);
                }

                if(position.equals("52")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Know your RC Status");
                    i.putExtra("url","https://parivahan.gov.in/rcdlstatus/?pur_cd=102");
                    startActivity(i);
                }

                if(position.equals("53")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Driving Licence Test");
                    i.putExtra("url","https://parivahan.gov.in/slots10/dlslotbook.do");
                    startActivity(i);
                }

                if(position.equals("54")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Quick Guides");
                    i.putExtra("url","https://portal1.passportindia.gov.in/AppOnlineProject/online/QuickGuide");
                    startActivity(i);
                }

                if(position.equals("55")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","New User Registration");
                    i.putExtra("url","https://portal2.passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction?request_locale=en");
                    startActivity(i);
                }

                if(position.equals("56")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Existing User Login");
                    i.putExtra("url","https://portal1.passportindia.gov.in/AppOnlineProject/user/userLogin");
                    startActivity(i);
                }

                if(position.equals("57")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Track Application Status");
                    i.putExtra("url","https://portal1.passportindia.gov.in/AppOnlineProject/statusTracker/trackStatusInpNew");
                    startActivity(i);
                }

                if(position.equals("58")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Check Appointment Availability Sta...");
                    i.putExtra("url","https://portal1.passportindia.gov.in/AppOnlineProject/online/apptAvailStatus");
                    startActivity(i);
                }

                if(position.equals("59")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Tatkaal Appointment Opening Time");
                    i.putExtra("url","https://portal1.passportindia.gov.in/AppOnlineProject/online/appointment");
                    startActivity(i);
                }

                if(position.equals("60")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","List Of Document For Fresh Passport");
                    i.putExtra("url","https://portal1.passportindia.gov.in/AppOnlineProject/docAdvisor/attachmentAdvFresh");
                    startActivity(i);
                }

                if(position.equals("61")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","List Of Document For Re-issue of Pa..");
                    i.putExtra("url","https://portal1.passportindia.gov.in/AppOnlineProject/docAdvisor/reissuePassport");
                    startActivity(i);
                }

                if(position.equals("62")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Passport Fee Calculator");
                    i.putExtra("url","https://portal1.passportindia.gov.in/AppOnlineProject/fee/feeInput");
                    startActivity(i);
                }

                if(position.equals("63")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Know Your Police Station");
                    i.putExtra("url","https://portal1.passportindia.gov.in/AppOnlineProject/online/LocatePoliceStation");
                    startActivity(i);
                }

                if(position.equals("64")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Locate Passport Sewa Kendra");
                    i.putExtra("url","https://portal1.passportindia.gov.in/AppOnlineProject/locatePSK/locatePFCInp");
                    startActivity(i);
                }

                if(position.equals("65")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Locate Common Services Centers");
                    i.putExtra("url","http://locator.csccloud.in/");
                    startActivity(i);
                }

                if(position.equals("66")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Madad Student Registration");
                    i.putExtra("url","http://madad.gov.in/AppConsular/welcomeLink");
                    startActivity(i);
                }

                if(position.equals("67")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Help");
                    i.putExtra("url","https://portal1.passportindia.gov.in/AppOnlineProject/online/callCenter");
                    startActivity(i);
                }

                if(position.equals("68")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Establishment Registration");
                    i.putExtra("url","https://registration.shramsuvidha.gov.in/user/login");
                    startActivity(i);
                }

                if(position.equals("69")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","KYC Updation");
                    i.putExtra("url","https://unifiedportal-mem.epfindia.gov.in/memberinterface/");
                    startActivity(i);
                }

                if(position.equals("70")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","UMANG");
                    i.putExtra("url","https://unifiedportal-mem.epfindia.gov.in/memberinterface");
                    startActivity(i);
                }

                if(position.equals("71")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","ECR/Returns And Payments");
                    i.putExtra("url","https://unifiedportal-emp.epfindia.gov.in/epfo/");
                    startActivity(i);
                }

                if(position.equals("72")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Online Claims Member Account Tra...");
                    i.putExtra("url","https://epfindia.gov.in/site_en/index.php");
                    startActivity(i);
                }

                if(position.equals("73")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","e-passbook");
                    i.putExtra("url","https://passbook.epfindia.gov.in/MemberPassBook/Login.jsp");
                    startActivity(i);
                }

                if(position.equals("74")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Shram suvidha Common ecr(EPFO/...");
                    i.putExtra("url","https://return.shramsuvidha.gov.in/user/login");
                    startActivity(i);
                }

                if(position.equals("75")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Pensioners Portal");
                    i.putExtra("url","https://mis.epfindia.gov.in/PensionPaymentEnquiry/enquiry.jsp");
                    startActivity(i);
                }

                if(position.equals("76")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Passport Fee Calculator");
                    i.putExtra("url","https://iwu.epfindia.gov.in/iwu/");
                    startActivity(i);
                }

                if(position.equals("77")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","International Workers Portal");
                    i.putExtra("url","https://iwu.epfindia.gov.in/eKYC/");
                    startActivity(i);
                }

                if(position.equals("78")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Track Your Consignment and Trace");
                    i.putExtra("url","https://www.indiapost.gov.in/_layouts/15/DOP.Portal.Tracking/TrackConsignment.aspx");
                    startActivity(i);
                }

                if(position.equals("79")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Locate Your Postal Office");
                    i.putExtra("url","https://www.indiapost.gov.in/vas/pages/LocatePostOffices.aspx");
                    startActivity(i);
                }

                if(position.equals("80")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Find Your Pincode");
                    i.putExtra("url","https://www.indiapost.gov.in/vas/pages/findpincode.aspx");
                    startActivity(i);
                }

                if(position.equals("81")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Calculate Your Postage");
                    i.putExtra("url","https://www.indiapost.gov.in/VAS/Pages/CalculatePostage.aspx");
                    startActivity(i);
                }

                if(position.equals("82")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Speed Post Track");
                    i.putExtra("url","https://www.indiapost.gov.in/MBE/Pages/Content/Speed-Post.aspx");
                    startActivity(i);
                }

                if(position.equals("83")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Compare Services");
                    i.putExtra("url","https://www.indiapost.gov.in/VAS/Pages/CompareServices.aspx");
                    startActivity(i);
                }

                if(position.equals("84")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Click and Book");
                    i.putExtra("url","https://www.indiapost.gov.in:8080/siteminderagent/forms/login.fcc?SMQUERYDATA=-SM-YrWiP89c7%2bbZZvL3fRj%2bNyaU1bKmS2m2QINF1L6qY7oOGWnYaEd0p4V1mzvAR0Gu%2b3sBrsULBzrPOKxS7Rk202USr7x1Ld69Bv9llhpigDQvKcks2MMNZatFLOoQq6kX1X%2f4WqPkS8BgzEpid3fPyYdWMfThHZJRZ63h3Sb7M15A2PKPX%2fc%2b6sIROwyUgWBeUULi8hEs7qFwaInbA2VV%2fqBzLPj5lWEX683N4XKDhETVy7mogIZjlxpNUrEHqDdT9puDRoVQqjNr7SVtZc%2bu1tAjodwJpt2aMnVXP833D91FuQQz2V13ufGLPbh3Y9ZA8ZCeGNnudoUugKLJgCFuRKE%2f7rZr%2fah34NnHMJLllDWE%2f87P4LMsSnsN0O9hdzJj47oqN61n2YhGy9T111sIJCt6kVjtBjzUykBoMfj2jgG%2fk6rlsE5cW2ZKalpUHshrCQpxVRDm6M6x3f6uZEfxf2F%2bo2hONiP9IgkuedmdMIZESgWtIlQvl13T1jBdY%2fZL%2fg7V%2fAe6cpMg%2bdQ7mY8szqdbXl4tUSEhZW%2fSuj8%2fgZDbVNct2E%2fF3XDZ83NjI5bYz3e0%2fJ15uJEBGe4XB7wADi6GWwxMoa2QQIXdzqWvLR6ViORpg7yykppu%2f6zggiNg22lj3l7WC%2bGVvUzOm5Y1JtdGkQGA9zsbKOFWcOdFvu0qihkm6PmXZ9dV13N4bz%2fNnHs%2bMJ0C2ZCfDxkE%2b4jK9u1GATmJXDZrEtczk1snVIdqr3%2b38pD7PJ0aabP6NYlp");
                    startActivity(i);
                }

                if(position.equals("85")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Post Office Saving Scheme");
                    i.putExtra("url","https://www.indiapost.gov.in/Financial/Pages/Content/Post-Office-Saving-Schemes.aspx");
                    startActivity(i);
                }

                if(position.equals("86")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Money Order(MO)");
                    i.putExtra("url","https://www.indiapost.gov.in/Financial/Pages/Content/Money-Order.aspx");
                    startActivity(i);
                }

                if(position.equals("87")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","International Money Transfer");
                    i.putExtra("url","https://www.indiapost.gov.in/Financial/Pages/Content/IMT.aspx");
                    startActivity(i);
                }

                if(position.equals("88")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Jansuraksha Scheme");
                    i.putExtra("url","https://www.indiapost.gov.in/Financial/Pages/content/JansurakshaScheme.aspx");
                    startActivity(i);
                }

                if(position.equals("89")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Mutual Funds");
                    i.putExtra("url","https://www.indiapost.gov.in/Financial/Pages/Content/Mutual-Funds.aspx");
                    startActivity(i);
                }

                if(position.equals("90")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","National Pension System");
                    i.putExtra("url","https://www.indiapost.gov.in/Financial/Pages/Content/NPS.aspx");
                    startActivity(i);
                }

                if(position.equals("91")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","India Post Payment Bank");
                    i.putExtra("url","https://www.ippbonline.com/");
                    startActivity(i);
                }

                if(position.equals("92")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Book Cylinder Online");
                    i.putExtra("url","https://indane.co.in/invalidlog.php");
                    startActivity(i);

                }
                if(position.equals("93")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Track Your Cylinder");
                    i.putExtra("url","https://indane.co.in/invalidlog.php");
                    startActivity(i);
                }

                if(position.equals("94")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Register New Connection");
                    i.putExtra("url","https://indane.co.in/new_connection.php");
                    startActivity(i);
                }

                if(position.equals("95")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Double Bottle Connection");
                    i.putExtra("url","https://indane.co.in/invalidlog.php");
                    startActivity(i);
                }

                if(position.equals("96")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Change Your Distributor");
                    i.putExtra("url","https://indane.co.in/change_distributor_info.php");
                    startActivity(i);
                }

                if(position.equals("97")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Rate Your Distributor");
                    i.putExtra("url","https://indane.co.in/rate_distributor_info.php<");
                    startActivity(i);
                }

                if(position.equals("98")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Surrender Your Connection");
                    i.putExtra("url","https://indane.co.in/optout_inf.php");
                    startActivity(i);
                }

                if(position.equals("99")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Preferred Time Delivery");
                    i.putExtra("url","https://indane.co.in/invalidlog.php");
                    startActivity(i);
                }

                if(position.equals("100")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Buy 5 KG Cylinder");
                    i.putExtra("url","https://indane.co.in/5Kg-FTL-cylinders.php");
                    startActivity(i);
                }

                if(position.equals("101")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Customer Care");
                    i.putExtra("url","https://indane.co.in/customer-care.php");
                    startActivity(i);
                }

                if(position.equals("102")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Book Cylinder Online");
                    i.putExtra("url","https://my.ebharatgas.com/bharatgas/User/Login?ReturnUrl=%2fbharatgas%2fBookCylinder%2fCreateOrder");
                    startActivity(i);

                }
                if(position.equals("103")){
                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Track Your Cylinder");
                    i.putExtra("url","https://my.ebharatgas.com/bharatgas/LPGServices/Index");
                    startActivity(i);

                }

                if(position.equals("104")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Portability Of Distributor");
                    i.putExtra("url","https://my.ebharatgas.com/bharatgas/LPGServices/OptForPortability");
                    startActivity(i);
                }

                if(position.equals("105")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Apply For New Connection Online");
                    i.putExtra("url","https://my.ebharatgas.com/bharatgas/LPGServices/ApplyNewConnection");
                    startActivity(i);
                }

                if(position.equals("106")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Register Second Connection");
                    i.putExtra("url","https://my.ebharatgas.com/bharatgas/User/Login?ReturnUrl=%2fbharatgas%2fCustomerConsole%2fSecondCylinder");
                    startActivity(i);
                }

                if(position.equals("107")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Check If You Need KYC");
                    i.putExtra("url","https://my.ebharatgas.com/bharatgas/LPGServices/NeedKYC");
                    startActivity(i);
                }

                if(position.equals("108")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Know Your Distributor");
                    i.putExtra("url","https://my.ebharatgas.com/bharatgas/LPGServices/LocateDistributor");
                    startActivity(i);
                }

                if(position.equals("109")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Find Your Nearest Distributor");
                    i.putExtra("url","https://my.ebharatgas.com/bharatgas/LPGServices/LocateDistributor");
                    startActivity(i);
                }

                if(position.equals("110")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Give Up Subsidy Voluntarily");
                    i.putExtra("url","https://my.ebharatgas.com/bharatgas/GiveUpSubsidy/Index");
                    startActivity(i);
                }

                if(position.equals("111")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","By 5 Kg Cylinder");
                    i.putExtra("url","https://my.ebharatgas.com/bharatgas/LPGServices/BuyCylinder");
                    startActivity(i);
                }

                if(position.equals("112")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Find Your 17 Digit LPG ID");
                    i.putExtra("url","https://my.ebharatgas.com/bharatgas/LPGServices/FindLPGID");
                    startActivity(i);

                }
                if(position.equals("113")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Know Your PAHAL");
                    i.putExtra("url","https://my.ebharatgas.com/bharatgas/JoinPahal/Index");
                    startActivity(i);

                }

                if(position.equals("114")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Surrender Multiple Connection");
                    i.putExtra("url","https://my.ebharatgas.com/bharatgas/User/Login?ReturnUrl=%2fbharatgas%2fCustomerConsole%2fSurrenderConnection");
                    startActivity(i);
                }

                if(position.equals("115")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Rate Your Distributor");
                    i.putExtra("url","https://my.ebharatgas.com/bharatgas/CustomerConsole/RateYourDistributor");
                    startActivity(i);
                }

                if(position.equals("116")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Book Cylinder Online");
                    i.putExtra("url","https://myhpgas.in/myHPGas/QuickPay.aspx");
                    startActivity(i);
                }

                if(position.equals("117")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Track Your Cylinder");
                    i.putExtra("url","hhttps://myhpgas.in/myHPGas/Login.aspx?ReturnUrl=%2fmyHPGas%2fHPGas%2fUser%2fBookRefill.aspx");
                    startActivity(i);
                }

                if(position.equals("118")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Portability Of Distributor");
                    i.putExtra("url","https://myhpgas.in/myHPGas/HPGas/OptPortability.aspx");
                    startActivity(i);
                }

                if(position.equals("119")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Apply For New Connection Online");
                    i.putExtra("url","https://myhpgas.in/myHPGas/NewConsumerRegistration.aspx");
                    startActivity(i);
                }

                if(position.equals("120")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Register Second Connection");
                    i.putExtra("url","https://myhpgas.in/myHPGas/NewConsumerRegistration.aspx");
                    startActivity(i);
                }

                if(position.equals("121")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Check If You Need KYC");
                    i.putExtra("url","https://myhpgas.in/myHPGas/HPGas/KYCNeeded.aspx");
                    startActivity(i);
                }

                if(position.equals("122")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Know Your Distributor");
                    i.putExtra("url","https://myhpgas.in/myHPGas/HPGas/LocateDistributor.aspx");
                    startActivity(i);

                }
                if(position.equals("123")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Find Your Nearer Distributor");
                    i.putExtra("url","hhttps://myhpgas.in/myHPGas/HPGas/LocateDistributor.aspx");
                    startActivity(i);

                }

                if(position.equals("124")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Give Up Subsidy Voluntarily");
                    i.putExtra("url","https://myhpgas.in/myHPGas/HPGas/OptOutSubsidy.aspx");
                    startActivity(i);
                }

                if(position.equals("125")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Buy 5 KG Cylinder");
                    i.putExtra("url","https://myhpgas.in/myHPGas/HPGas/Buy5KG.aspx");
                    startActivity(i);
                }

                if(position.equals("126")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Find Your 17 Digit LPG ID");
                    i.putExtra("url","https://myhpgas.in/myHPGas/HPGas/FindYourLPGID.aspx");
                    startActivity(i);
                }

                if(position.equals("127")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Know Your PAHAL");
                    i.putExtra("url","https://myhpgas.in/myHPGas/HPGas/JoinPAHAL.aspx");
                    startActivity(i);
                }


                if(position.equals("128")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Surrender Multiple Connection");
                    i.putExtra("url","https://myhpgas.in/myHPGas/HPGas/SurrenderConnection.aspx");
                    startActivity(i);
                }

                if(position.equals("129")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Rate Your Distributor");
                    i.putExtra("url","https://myhpgas.in/myHPGas/HPGas/RateDistributor.aspx");
                    startActivity(i);
                }

                if(position.equals("130")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Search Train");
                    i.putExtra("url","https://www.irctc.co.in/nget/train-search");
                    startActivity(i);
                }

                if(position.equals("131")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Book Train Ticket");
                    i.putExtra("url","https://www.irctc.co.in/nget/train-search");
                    startActivity(i);
                }

                if(position.equals("132")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Seat/Berth Availability");
                    i.putExtra("url","http://www.indianrail.gov.in/enquiry/SEAT/SeatAvailability.html?locale=en");
                    startActivity(i);

                }
                if(position.equals("133")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Seat/Berth Booking");
                    i.putExtra("url","https://www.axisbank.com/https://www.irctc.co.in/nget/train-search");

                }

                if(position.equals("134")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Fare Enquiry");
                    i.putExtra("url","http://www.indianrail.gov.in/enquiry/FARE/FareEnquiry.html?locale=en");
                    startActivity(i);
                }

                if(position.equals("135")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","PNR Status");
                    i.putExtra("url","http://www.indianrail.gov.in/enquiry/PNR/PnrEnquiry.html?locale=en");
                    startActivity(i);
                }

                if(position.equals("136")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Cancel e-Ticket");
                    i.putExtra("url","https://www.irctc.co.in/nget/user-registration");
                    startActivity(i);
                }

                if(position.equals("137")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Cancel Counter Ticket");
                    i.putExtra("url","https://www.operations.irctc.co.in/ctcan/SystemTktCanLogin.jsf");
                    startActivity(i);
                }

                if(position.equals("138")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Live Station");
                    i.putExtra("url","https://enquiry.indianrail.gov.in/xyzabc/e_liveStation.jsp");
                    startActivity(i);
                }

                if(position.equals("139")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Average Delay");
                    i.putExtra("url","https://enquiry.indianrail.gov.in/xyzabc/e_trainAvgDelay.jsp");
                    startActivity(i);
                }

                if(position.equals("140")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Train Between Station");
                    i.putExtra("url","https://enquiry.indianrail.gov.in/xyzabc/e_trainsBwStns.jsp");
                    startActivity(i);
                }

                if(position.equals("141")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Train Schedule");
                    i.putExtra("url","https://enquiry.indianrail.gov.in/xyzabc/e_trainSchedule.jsp");
                    startActivity(i);
                }

                if(position.equals("142")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Trains Cancelled");
                    i.putExtra("url","https://enquiry.indianrail.gov.in/xyzabc/CancelledTrains?scrnSize=&amp;langFile=props.hi-in");
                    startActivity(i);

                }
                if(position.equals("143")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Partially Cancelled");
                    i.putExtra("url","https://enquiry.indianrail.gov.in/xyzabc/PartCancelledTrains?scrnSize=&amp;langFile=props.hi-in");
                    startActivity(i);

                }

                if(position.equals("144")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Trains Reschedule");
                    i.putExtra("url","https://enquiry.indianrail.gov.in/xyzabc/RescheduledTrains?scrnSize=&amp;langFile=props.hi-in");
                    startActivity(i);
                }

                if(position.equals("145")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Trains Diverted");
                    i.putExtra("url","https://enquiry.indianrail.gov.in/xyzabc/DivertedTrains?scrnSize=&amp;langFile=props.hi-in");
                    startActivity(i);
                }

                if(position.equals("146")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","IR Train Ticket");
                    i.putExtra("url","https://enquiry.indianrail.gov.in/xyzabc/e_trainsOnMap.jsp");
                    startActivity(i);
                }

                if(position.equals("147")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Specials Trains");
                    i.putExtra("url","https://enquiry.indianrail.gov.in/xyzabc/SplTrains?scrnSize=&amp;langFile=props.hi-in");
                    startActivity(i);
                }

                if(position.equals("148")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Heritage Trains");
                    i.putExtra("url","https://enquiry.indianrail.gov.in/xyzabc/HeritageTrains?scrnSize=&amp;langFile=props.hi-in&amp;selHrtgStns=ALL");
                    startActivity(i);
                }

                if(position.equals("149")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","SMS Services");
                    i.putExtra("url","http://www.indianrail.gov.in/enquiry/StaticPages/StaticEnquiry.jsp?StaticPage=sms_Service.html&amp;locale=en");
                    startActivity(i);
                }

                if(position.equals("150")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Andhra Pradesh Bus Service");
                    i.putExtra("url","http://www.apsrtc.gov.in/");
                    startActivity(i);
                }

                if(position.equals("151")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Arunachal Pradesh Bus Service");
                    i.putExtra("url","http://www.arunachalipr.gov.in/?p=447");
                    startActivity(i);
                }

                if(position.equals("152")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Assam Bus Services");
                    i.putExtra("url","https://astc.assam.gov.in/");
                    startActivity(i);

                }
                if(position.equals("153")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Banglore Bus Services");
                    i.putExtra("url","http://mybmtc.com/");
                    startActivity(i);

                }

                if(position.equals("154")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Bihar Bus Services");
                    i.putExtra("url","https://www.redbus.in/travels/bihar-state-tourism-development-corporation.aspx");
                    startActivity(i);
                }

                if(position.equals("155")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Calcutta Bus Services");
                    i.putExtra("url","http://www.ctconlinebooking.in/home");
                    startActivity(i);
                }

                if(position.equals("156")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Chandigarh Bus Services");
                    i.putExtra("url","http://chdctu.gov.in/");
                    startActivity(i);
                }

                if(position.equals("157")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Chennai Bus Services");
                    i.putExtra("url","https://www.redbus.in/buses/chennai-bus-tickets.aspx");
                    startActivity(i);
                }

                if(position.equals("158")){

                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Delhi Bus Services");
                    i.putExtra("url","http://www.dtcbooking.in/DTCOnline/");
                    startActivity(i);
                }

                if(position.equals("159")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Gujarat Bus Services");
                    i.putExtra("url","https://gsrtc.in/site/");
                    startActivity(i);
                }

                if(position.equals("160")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Goa(Kadamba) Bus Services");
                    i.putExtra("url","http://goakadamba.com/");
                    startActivity(i);
                }

                if(position.equals("161")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Haryana Bus Services");
                    i.putExtra("url","http://hartrans.gov.in/ors/");
                    startActivity(i);
                }

                if(position.equals("162")){

                    //x
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Himachal Bus Services");
                    i.putExtra("url","http://online.hrtchp.com/oprs-web/");
                    startActivity(i);

                }
                if(position.equals("163")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Hyderabad Bus Services");
                    i.putExtra("url","http://www.tsrtconline.in/oprs-web/");
                    startActivity(i);

                }

                if(position.equals("164")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Jammu and Kashmir Bus Services");
                    i.putExtra("url","http://www.busindia.com/JKSRTC-Jammu-Kashmir-Online-Booking.jsp");
                    startActivity(i);
                }

                if(position.equals("165")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Kanpur Lucknow Bus Services");
                    i.putExtra("url","https://www.upsrtconline.co.in/");
                    startActivity(i);
                }

                if(position.equals("166")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Karnataka Bus Services");
                    i.putExtra("url","http://www.ksrtc.in/oprs-web/guest/home.do?h=1");
                    startActivity(i);
                }

                if(position.equals("167")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Kerala Bus Services");
                    i.putExtra("url","https://www.keralartc.in/KSRTCOnline/");
                    startActivity(i);
                }

                if(position.equals("168")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Lucknow Bus Services");
                    i.putExtra("url","https://www.upsrtconline.co.in/");
                    startActivity(i);
                }

                if(position.equals("169")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Maharashtra Bus Services");
                    i.putExtra("url","https://msrtc.mahaonline.gov.in/");
                    startActivity(i);
                }

                if(position.equals("170")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Odisha Bus Services");
                    i.putExtra("url","https://www.redbus.in/online-booking/osrtc.aspx");
                    startActivity(i);
                }

                if(position.equals("171")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Punjab Bus Services");
                    i.putExtra("url","http://www.pepsuonline.com/");
                    startActivity(i);
                }

                if(position.equals("172")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Puducherry Bus Services");
                    i.putExtra("url","http://www.busindia.com/PRTC-Pondicherry-Online-Booking.jsp");
                    startActivity(i);

                }
                if(position.equals("173")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Rajasthan Bus Services");
                    i.putExtra("url","https://www.redbus.in/online-booking/rsrtc.aspx");
                    startActivity(i);

                }

                if(position.equals("174")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Tamil Nadu Bus Services");
                    i.putExtra("url","http://www.tnstc.in/TNSTCOnline/");
                    startActivity(i);
                }

                if(position.equals("175")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Telangana Bus Services");
                    i.putExtra("url","http://www.tsrtconline.in/oprs-web/");
                    startActivity(i);
                }

                if(position.equals("176")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Uttar Pradesh Bus Services");
                    i.putExtra("url","https://www.upsrtconline.co.in/");
                    startActivity(i);
                }

                if(position.equals("177")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Uttarakhand Bus Services");
                    i.putExtra("url","https://utconline.uk.gov.in/");
                    startActivity(i);
                }

                if(position.equals("178")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","West Bengal Bus Services");
                    i.putExtra("url","http://online.sbstcbooking.co.in");
                    startActivity(i);
                }



                if(position.equals("179")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Axis Bank Net Banking");
                    i.putExtra("url","https://www.axisbank.com/");
                    startActivity(i);
                }

                if(position.equals("180")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Bank Of Baroda Net Banking");
                    i.putExtra("url","https://www.bobibanking.com/");
                    startActivity(i);
                }

                if(position.equals("181")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Canara Net Banking");
                    i.putExtra("url","https://www.canarabank.in/");
                    startActivity(i);
                }

                if(position.equals("182")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","HDFC Bank Net Banking");
                    i.putExtra("url","https://www.hdfcbank.com/");
                    startActivity(i);

                }
                if(position.equals("183")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","ICICI Bank Net Banking");
                    i.putExtra("url","https://www.icicibank.com/");
                    startActivity(i);

                }

                if(position.equals("184")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Indusland Net Banking");
                    i.putExtra("url","https://www.indusind.com/");
                    startActivity(i);
                }

                if(position.equals("185")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Kotak Net Banking");
                    i.putExtra("url","https://www.kotak.com/en/digital-banking/ways-to-bank/net-banking.html");
                    startActivity(i);
                }

                if(position.equals("186")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","PNB Net Banking");
                    i.putExtra("url","https://netpnb.com/");
                    startActivity(i);
                }

                if(position.equals("187")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","SBI Net Banking");
                    i.putExtra("url","https://pmjdy.gov.in/");
                    startActivity(i);
                }

                if(position.equals("188")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","YES Net Banking");
                    i.putExtra("url","https://www.onlinesbi.com/");
                    startActivity(i);
                }

                if(position.equals("189")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Pradhan Mantri Jan Dhan Yojna(PMJ...");
                    i.putExtra("url","https://www.yesbank.in/");
                    startActivity(i);
                }

                if(position.equals("190")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Pradhan Mantri Sukanya Samriddhu...");
                    i.putExtra("url","http://www.nsiindia.gov.in/");
                    startActivity(i);

                }

                if(position.equals("191")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Pradhan Mantri MUDRA Yojna(PM...");
                    i.putExtra("url","http://www.mudra.org.in");
                    startActivity(i);

                }

                if(position.equals("192")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Pradhan Mantri Jeevan Jyoti Bima Y...");
                    i.putExtra("url","http://www.jansuraksha.gov.in");
                    startActivity(i);

                }
                if(position.equals("193")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Pradhan Mantri Suraksha Bima Yoja...");
                    i.putExtra("url","http://www.jansuraksha.gov.in");
                    startActivity(i);

                }

                if(position.equals("194")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Atal Pension Yojana(APY)");
                    i.putExtra("url","http://www.jansuraksha.gov.in");
                    startActivity(i);
                }

                if(position.equals("195")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Pradhan Mantri Awas Yojna(PMAY)");
                    i.putExtra("url","https://rural.nic.in/");
                    startActivity(i);
                }

                if(position.equals("196")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Sansad Adarsh Gram Yojana(SAGY)");
                    i.putExtra("url","http://agricoop.nic.in/");
                    startActivity(i);
                }

                if(position.equals("197")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Pradhan Mantri Fasal Bima Yojana(...");
                    i.putExtra("url","http://agricoop.nic.in/");
                    startActivity(i);
                }

                if(position.equals("198")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Pradhan Mantri Gram Sinchai Yojan...");
                    i.putExtra("url","http://niti.gov.in/");
                    startActivity(i);
                }

                if(position.equals("199")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Pradhan Mantri Garib Kalyan Yojan...");
                    i.putExtra("url","http://janaushadhi.gov.in/index.aspx");
                    startActivity(i);
                }

                if(position.equals("200")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Make In India");
                    i.putExtra("url","http://www.makeinindia.com");
                    startActivity(i);
                }

                if(position.equals("201")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Swachh Bharat Abhiyan");
                    i.putExtra("url","https://swachhbharat.mygov.in/");
                    startActivity(i);
                }

                if(position.equals("202")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Skill India");
                    i.putExtra("url","http://www.nsiindia.gov.in/");
                    startActivity(i);

                }
                if(position.equals("203")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Soil Health Card Scheme");
                    i.putExtra("url","https://soilhealth.dac.gov.in/");
                    startActivity(i);

                }

                if(position.equals("204")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Digital India");
                    i.putExtra("url","http://www.digitalindia.gov.in/");
                    startActivity(i);
                }

                if(position.equals("205")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Skill India");
                    i.putExtra("url","https://www.skillindia.gov.in/");
                    startActivity(i);
                }

                if(position.equals("206")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Beti Bachao, Baeti Padhao Yojana");
                    i.putExtra("url","http://wcd.nic.in");
                    startActivity(i);
                }

                if(position.equals("207")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Mission Indradhanush");
                    i.putExtra("url","http://vikaspedia.in/health/nrhm/national-health-programmes-1/mission-indhradhanush<");
                    startActivity(i);
                }

                if(position.equals("208")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Deen Dayal Upadhyaya Gram Jyoti...");
                    i.putExtra("url","http://powermin.nic.in");
                    startActivity(i);
                }

                if(position.equals("209")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Deen Dayal Upadhyaya Grameen K...");
                    i.putExtra("url","http://ddugky.gov.in/");
                    startActivity(i);
                }

                if(position.equals("210")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Pandit DeenDayal Upadhyaya Shram...");
                    i.putExtra("url","https://shramsuvidha.gov.in/home");
                    startActivity(i);
                }

                if(position.equals("211")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Atal Mission For Rejuvenation and...");
                    i.putExtra("url","http://amrut.gov.in/");
                    startActivity(i);
                }

                if(position.equals("212")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Swadesh Darshan Yojana");
                    i.putExtra("url","http://tourism.gov.in/");
                    startActivity(i);

                }
                if(position.equals("213")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","PRASAD (Pilgrimage Rejuvenation...");
                    i.putExtra("url","http://tourism.gov.in/");
                    startActivity(i);

                }

                if(position.equals("214")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","National Heritage City developme...");
                    i.putExtra("url","http://hridayindia.in/");
                    startActivity(i);
                }

                if(position.equals("215")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Udaan Scheme");
                    i.putExtra("url","http://mhrd.gov.in/");
                    startActivity(i);
                }

                if(position.equals("216")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","National Bal Swachhta Mission");
                    i.putExtra("url","http://wcd.nic.in/");
                    startActivity(i);
                }

                if(position.equals("217")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","One Rank One Pension (OROP) Sch...");
                    i.putExtra("url","http://wcd.nic.in/");
                    startActivity(i);
                }

                if(position.equals("218")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","NSmart City Mission");
                    i.putExtra("url","http://smartcities.gov.in/content/");
                    startActivity(i);
                }

                if(position.equals("219")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Gold Monetisation Schemes");
                    i.putExtra("url","https://finmin.nic.in/");
                    startActivity(i);
                }

                if(position.equals("220")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Startup India, Standup India");
                    i.putExtra("url","https://www.startupindia.gov.in/");
                    startActivity(i);
                }

                if(position.equals("221")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","DigiLocker");
                    i.putExtra("url","https://digilocker.gov.in/");
                    startActivity(i);
                }

                if(position.equals("222")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Integrated Power Develpoment Sch...");
                    i.putExtra("url","http://www.ipds.gov.in/");
                    startActivity(i);

                }
                if(position.equals("223")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Shyama Prasad Mukherji Rurban M...");
                    i.putExtra("url","http://rurban.gov.in/");
                    startActivity(i);

                }

                if(position.equals("224")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","xSagarmala Project");
                    i.putExtra("url","http://sagarmala.gov.in/");
                    startActivity(i);
                }

                if(position.equals("225")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Prakash Path-Way To Light-The N...");
                    i.putExtra("url","https://powermin.nic.in/#");
                    startActivity(i);
                }

                if(position.equals("226")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","UJWAL Discom Assurance Yojana(...");
                    i.putExtra("url","https://powermin.nic.in/");
                    startActivity(i);
                }

                if(position.equals("227")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Vikalp Scheme");
                    i.putExtra("url","http://contents.irctc.co.in/en/vikalpTerms.html");
                    startActivity(i);
                }

                if(position.equals("228")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","National Sports Talent Search Sche...");
                    i.putExtra("url","http://www.sportsauthorityofindia.nic.in/");
                    startActivity(i);
                }

                if(position.equals("229")){

                    //Rashtriya Gokul Mission
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","PAHAL-Direct Benefits Transfer For...");
                    i.putExtra("url","http://dahd.nic.in/");
                    startActivity(i);
                }

                if(position.equals("230")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","PAHAL-Direct Benefits Transfer For...");
                    i.putExtra("url","http://petroleum.nic.in/dbt/index.php");
                    startActivity(i);
                }

                if(position.equals("231")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","The National Institute For Transfer...");
                    i.putExtra("url","http://niti.gov.in/");
                    startActivity(i);
                }

                if(position.equals("232")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Pradhan Mantri Khanji Kshetra Kaly...");
                    i.putExtra("url","http://pib.nic.in/newsite/PrintRelease.aspx?relid=126983");
                    startActivity(i);

                }
                if(position.equals("233")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Pradhan Mantri Ujjwala Yojana");
                    i.putExtra("url","http://www.pmujjwalayojana.com/");
                    startActivity(i);

                }

                if(position.equals("234")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Rashtriya Gram Swaraj Abhiyan");
                    i.putExtra("url","http://rgsa.nic.in/");
                    startActivity(i);
                }

                if(position.equals("235")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Jan Sukraksha");
                    i.putExtra("url","http://www.jansuraksha.gov.in");
                    startActivity(i);
                }

                if(position.equals("236")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Stand Up India Scheme");
                    i.putExtra("url","https://www.standupmitra.in/");
                    startActivity(i);
                }

                if(position.equals("237")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Pradhan Mantri Vaya Vandana Yojana");
                    i.putExtra("url","https://www.licindia.in/Bottom-Links/Pradhan-Mantri-Vaya-vandana-Yojana_05052018-(2)");
                    startActivity(i);
                }

                if(position.equals("238")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Crop Insurance Calculator");
                    i.putExtra("url","http://agri.and.nic.in/");
                    startActivity(i);
                }

                if(position.equals("239")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Commodity Arrival and Rates");
                    i.putExtra("url","http://agmarknet.gov.in/#");
                    startActivity(i);
                }

                if(position.equals("240")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Andaman Nikobar and Island Agricul...");
                    i.putExtra("url","http://www.apagrisnet.gov.in/");
                    startActivity(i);
                }

                if(position.equals("241")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Andhra Pradesh Agri Culture Informa...");
                    i.putExtra("url","http://www.apagrisnet.gov.in/");
                    startActivity(i);
                }

                if(position.equals("242")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Arunachal Pradesh Agri Culture Informa...");
                    i.putExtra("url","http://arunachalpradesh.nic.in/");
                    startActivity(i);

                }

                if(position.equals("243")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Assam Agri Cultural Information");
                    i.putExtra("url","https://agri-horti.assam.gov.in/");
                    startActivity(i);

                }

                if(position.equals("244")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Bihar Agri Cultural Information");
                    i.putExtra("url","http://krishi.bih.nic.in/");
                    startActivity(i);
                }

                if(position.equals("245")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Chandigarh Agri Cultural Information");
                    i.putExtra("url","http://agriportal.cg.nic.in/PortHi/");
                    startActivity(i);
                }

                if(position.equals("246")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Chhattisgarh Agri Cultural Information");
                    i.putExtra("url","http://agricoop.nic.in/agriculturecontingency/dadra-and-nagar-haveli");
                    startActivity(i);
                }

                if(position.equals("247")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Dadra and Diu Agri Cultural informati...");
                    i.putExtra("url","https://daman.nic.in/agriculture.aspx");
                    startActivity(i);
                }

                if(position.equals("248")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Delhi Agri Cultural Information");
                    i.putExtra("url","http://agricoop.nic.in/");
                    startActivity(i);
                }

                if(position.equals("249")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Goa Agri Cultural Information");
                    i.putExtra("url","http://agri.goa.gov.in/");
                    startActivity(i);
                }

                if(position.equals("250")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Gujarat Agri Cultural Information");
                    i.putExtra("url","https://agri.gujarat.gov.in/");
                    startActivity(i);
                }

                if(position.equals("251")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Haryana Agri Cultural Information");
                    i.putExtra("url","http://agriharyana.gov.in/");
                    startActivity(i);
                }

                if(position.equals("252")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Himachal Pradesh Agri Cultural Infor...");
                    i.putExtra("url","http://www.hpagriculture.com/");
                    startActivity(i);

                }
                if(position.equals("253")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Jammu & Kashmir Agri Cultural Inform...");
                    i.putExtra("url","http://www.jkapd.nic.in/");
                    startActivity(i);

                }

                if(position.equals("254")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Jharkhand Agri Cultural Information");
                    i.putExtra("url","http://www.jharkhand.gov.in/agri");
                    startActivity(i);
                }

                if(position.equals("255")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Karnataka Agri Cultural Information");
                    i.putExtra("url","http://raitamitra.kar.nic.in/KAN/index.asp");
                    startActivity(i);
                }

                if(position.equals("256")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Kerala Agri Cultural Information");
                    i.putExtra("url","http://www.keralaagriculture.gov.in/");
                    startActivity(i);
                }

                if(position.equals("257")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Lakshadweep Agri Cultural Information");
                    i.putExtra("url","http://agricoop.nic.in/agriculturecontingency/lakshadweep");
                    startActivity(i);
                }

                if(position.equals("258")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Madhya Pradesh Agri Cultural Informa...");
                    i.putExtra("url","http://mpkrishi.mp.gov.in/hindisite/indexhindi.aspx");
                    startActivity(i);
                }

                if(position.equals("259")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Maharashtra  Agri Cultural Information");
                    i.putExtra("url","http://krishi.maharashtra.gov.in/1001/Home");
                    startActivity(i);
                }

                if(position.equals("260")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Manipur Agri Cultural Information");
                    i.putExtra("url","https://mastec.nic.in/index.php");
                    startActivity(i);
                }

                if(position.equals("261")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Meghalaya Agri Cultural Information");
                    i.putExtra("url","http://www.megagriculture.gov.in/");
                    startActivity(i);
                }

                if(position.equals("262")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Mizoram Agri Cultural Information");
                    i.putExtra("url","http://agriculturemizoram.nic.in/");
                    startActivity(i);

                }
                if(position.equals("263")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Nagaland Agri Cultural Information");
                    i.putExtra("url","http://agringl.nic.in/");
                    startActivity(i);

                }

                if(position.equals("264")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Odhisha Agri Cultural Information");
                    i.putExtra("url","http://agriodisha.nic.in/");
                    startActivity(i);
                }

                if(position.equals("265")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Punducherry Agri Cultural Information");
                    i.putExtra("url","http://agri.puducherry.gov.in/");
                    startActivity(i);
                }

                if(position.equals("266")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Rajasthan Agri Cultural Information");
                    i.putExtra("url","http://www.agriculture.rajasthan.gov.in/content/agriculture/hi.html");
                    startActivity(i);
                }

                if(position.equals("267")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Sikkim Agri Cultural Information");
                    i.putExtra("url","http://www.sikkimagrisnet.org/");
                    startActivity(i);
                }

                if(position.equals("268")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Tamilnadu Agri Cultural Information");
                    i.putExtra("url","http://www.tn.gov.in/department/2");
                    startActivity(i);
                }

                if(position.equals("269")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Telangana Agri Cultural Information");
                    i.putExtra("url","http://agri.telangana.gov.in/");
                    startActivity(i);
                }

                if(position.equals("270")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Tripura Agri Cultural Information");
                    i.putExtra("url","https://agri.tripura.gov.in/");
                    startActivity(i);
                }

                if(position.equals("271")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Uttar Pradesh Agri Cultural Information");
                    i.putExtra("url","http://upagripardarshi.gov.in/StaticPages/StateSponsored-CropBreeding.aspx");
                    startActivity(i);
                }

                if(position.equals("272")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Uttarakhand Agri Cultural Information");
                    i.putExtra("url","http://agriculture.uk.gov.in/");
                    startActivity(i);

                }
                if(position.equals("273")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","West Bengal Agri Cultural Information");
                    i.putExtra("url","https://wb.gov.in/portal/web/guest/agriculture");
                    startActivity(i);

                }

                if(position.equals("274")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Naukri");
                    i.putExtra("url","https://www.naukri.com/");
                    startActivity(i);
                }

                if(position.equals("275")){

                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Monster India");
                    i.putExtra("url","https://www.monsterindia.com/");
                    startActivity(i);
                }

                if(position.equals("276")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Shine");
                    i.putExtra("url","https://www.shine.com/");
                    startActivity(i);
                }

                if(position.equals("277")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Indeed India");
                    i.putExtra("url","https://www.indeed.co.in/");
                    startActivity(i);
                }

                if(position.equals("278")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Times Jobs");
                    i.putExtra("url","http://timesjobs.com/");
                    startActivity(i);
                }

                if(position.equals("279")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Careesma");
                    i.putExtra("url","https://www.careesma.in/");
                    startActivity(i);
                }

                if(position.equals("280")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Freshersworld");
                    i.putExtra("url","https://www.freshersworld.com/");
                    startActivity(i);
                }

                if(position.equals("281")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Jobrapido India");
                    i.putExtra("url","https://in.jobrapido.com/");
                    startActivity(i);
                }

                if(position.equals("282")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Sarkari Naukri Blog");
                    i.putExtra("url","https://www.sarkarinaukriblog.com/");
                    startActivity(i);
                }

                if(position.equals("283")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Career Builder");
                    i.putExtra("url","https://www.careerbuilder.co.in/?cbRecursionCnt=1");
                    startActivity(i);
                }

                if(position.equals("284")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Digi Locker SignUp");
                    i.putExtra("url","https://digilocker.gov.in/public/register");
                    startActivity(i);
                }

                if(position.equals("285")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Digi Locker SignIn");
                    i.putExtra("url","https://digilocker.gov.in/index.php#no-back");
                    startActivity(i);
                }

                if(position.equals("286")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Indian Postal Services");
                    i.putExtra("url","https://www.indiapost.gov.in/vas/Pages/IndiaPostHome.aspx");
                    startActivity(i);
                }

                if(position.equals("287")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","FedEx India");
                    i.putExtra("url","https://www.fedex.com/in/");
                    startActivity(i);
                }

                if(position.equals("288")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","First Flight Courier Limited");
                    i.putExtra("url","http://www.firstflight.net/");
                    startActivity(i);
                }

                if(position.equals("289")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","DTDC Courier & Cargo Limited");
                    i.putExtra("url","http://www.dtdc.in/");
                    startActivity(i);
                }

                if(position.equals("290")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Aramex");
                    i.putExtra("url","https://www.aramex.com/track/shipments");
                    startActivity(i);

                }

                if(position.equals("291")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Go Javas");
                    i.putExtra("url","http://gojavas.com/");
                    startActivity(i);

                }

                if(position.equals("292")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","KDHL Express India Pvt Ltd");
                    i.putExtra("url","https://www.logistics.dhl/in-en/home/tracking.html");
                    startActivity(i);

                }
                if(position.equals("293")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","eCOM EXpress");
                    i.putExtra("url","https://ecomexpress.in/");
                    startActivity(i);

                }

                if(position.equals("294")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Blue Dart Express Limited");
                    i.putExtra("url","https://alpha.bluedart.com/");
                    startActivity(i);
                }

                if(position.equals("295")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Kartrockets automated solution Shipro...");
                    i.putExtra("url","https://www.kartrocket.com/order-processing/");
                    startActivity(i);
                }

                if(position.equals("296")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","The Professional Courier Ltd");
                    i.putExtra("url","http://www.tpcindia.com/");
                    startActivity(i);
                }

                if(position.equals("297")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Gati Limited");
                    i.putExtra("url","https://www.gati.com/");
                    startActivity(i);
                }

                if(position.equals("298")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Delhivery");
                    i.putExtra("url","https://www.delhivery.com/");
                    startActivity(i);
                }

                if(position.equals("299")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","TNT Express");
                    i.putExtra("url","https://www.tnt.com/express/en_in/site/home.html");
                    startActivity(i);
                }

                if(position.equals("300")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Overnite Express Limited");
                    i.putExtra("url","http://www.overnitenet.com/");
                    startActivity(i);
                }

                if(position.equals("301")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Palande Courier Services");
                    i.putExtra("url","https://shipway.in/palande_courier");
                    startActivity(i);
                }

                if(position.equals("302")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","United Parcel Limited");
                    i.putExtra("url","https://www.ups.com/us/en/Home.page");
                    startActivity(i);

                }

                if(position.equals("303")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Emergency Help Line Number");
                    i.putExtra("url","http://www.newincept.com/helpline-numbers-all-over-in-india.html");
                    startActivity(i);

                }

                if(position.equals("304")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Indian Railways Help Line");
                    i.putExtra("url","https://indianhelpline.com/INDIAN-RAILWAYS/");
                    startActivity(i);
                }

                if(position.equals("305")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Blood Banks Help Line");
                    i.putExtra("url","https://indianhelpline.com/BLOOD-BANKS/");
                    startActivity(i);
                }

                if(position.equals("306")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Ministery Of External Affairs");
                    i.putExtra("url","https://indianhelpline.com/EXTERNAL-AFFAIRS/");
                    startActivity(i);
                }

                if(position.equals("307")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Women Help Line");
                    i.putExtra("url","https://indianhelpline.com/WOMEN-HELPLINE/");
                    startActivity(i);
                }

                if(position.equals("308")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Indian Banks");
                    i.putExtra("url","https://indianhelpline.com/INDIAN-BANKS/");
                    startActivity(i);
                }

                if(position.equals("309")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Sucide Help Line");
                    i.putExtra("url","https://indianhelpline.com/SUICIDE-HELPLINE/");
                    startActivity(i);
                }

                if(position.equals("310")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Highway Numbers");
                    i.putExtra("url","https://indianhelpline.com/HIGHWAY-NUMBERS/");
                    startActivity(i);
                }

                if(position.equals("311")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Air India");
                    i.putExtra("url","http://www.airindia.com/");
                    startActivity(i);
                }

                if(position.equals("312")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Airports Authority Of India");
                    i.putExtra("url","http://www.airportsindia.org.in/");
                    startActivity(i);

                }
                if(position.equals("313")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Bureau Of Indian Standards");
                    i.putExtra("url","http://www.bis.org.in/");
                    startActivity(i);

                }

                if(position.equals("314")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Departments Of Chemicals & Petroc...");
                    i.putExtra("url","http://chemicals.nic.in/");
                    startActivity(i);
                }

                if(position.equals("315")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Ministry Of Civil Aviation");
                    i.putExtra("url","http://civilaviation.gov.in/");
                    startActivity(i);
                }

                if(position.equals("316")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Department Of Commerce");
                    i.putExtra("url","http://commerce.gov.in/");
                    startActivity(i);
                }

                if(position.equals("317")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Ministry Of Coal");
                    i.putExtra("url","https://coal.nic.in/");
                    startActivity(i);
                }

                if(position.equals("318")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Ministry Of Company Affairs");
                    i.putExtra("url","https://consumeraffairs.nic.in/Home.aspx");
                    startActivity(i);
                }

                if(position.equals("319")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Department Of Education");
                    i.putExtra("url","http://mhrd.gov.in/");
                    startActivity(i);
                }

                if(position.equals("320")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Ministry Of Environment and Forests");
                    i.putExtra("url","http://envfor.nic.in/");
                    startActivity(i);
                }

                if(position.equals("321")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Ministry Of External Affairs");
                    i.putExtra("url","https://www.mea.gov.in/");
                    startActivity(i);
                }

                if(position.equals("322")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Ministry Of Finance");
                    i.putExtra("url","https://finmin.nic.in/");
                    startActivity(i);

                }
                if(position.equals("323")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Directorate General Of Foreign Trade");
                    i.putExtra("url","https://dgft.gov.in/");
                    startActivity(i);

                }

                if(position.equals("324")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Department Of Heavy Industries");
                    i.putExtra("url","https://dhi.nic.in/");
                    startActivity(i);
                }

                if(position.equals("325")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Department Of Industrial Policy & P...");
                    i.putExtra("url","http://dipp.nic.in/");
                    startActivity(i);
                }

                if(position.equals("326")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Ministry Of Information and Broadc");
                    i.putExtra("url","https://www.mib.gov.in/");
                    startActivity(i);
                }

                if(position.equals("327")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Ministry Of Non-Conventional Ener...");
                    i.putExtra("url","http://meity.gov.in/");
                    startActivity(i);
                }

                if(position.equals("328")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Ministry Of Labour");
                    i.putExtra("url","https://labour.gov.in/");
                    startActivity(i);
                }

                if(position.equals("329")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Ministry Of Mines");
                    i.putExtra("url","https://mines.gov.in/");
                    startActivity(i);
                }

                if(position.equals("330")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Ministry Of Non-Conventional Ener...");
                    i.putExtra("url","https://mnre.gov.in/");
                    startActivity(i);
                }

                if(position.equals("331")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Office Of The Controller General Of...");
                    i.putExtra("url","http://www.ipindia.nic.in/");
                    startActivity(i);
                }

                if(position.equals("332")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Ministry Of Petroleum And Natural...");
                    i.putExtra("url","http://petroleum.nic.in/");
                    startActivity(i);

                }
                if(position.equals("333")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Ministry Of Power");
                    i.putExtra("url","https://powermin.nic.in/");
                    startActivity(i);

                }

                if(position.equals("334")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Ministry Of Railways");
                    i.putExtra("url","http://www.indianrailways.gov.in/");
                    startActivity(i);
                }

                if(position.equals("335")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Reserve Bank Of India");
                    i.putExtra("url","https://www.rbi.org.in/");
                    startActivity(i);
                }

                if(position.equals("336")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Department Of Road Transport & Hi...");
                    i.putExtra("url","http://morth.nic.in/");
                    startActivity(i);
                }

                if(position.equals("337")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Department Of Shipping");
                    i.putExtra("url","http://onlinevacancy.shipmin.nic.in/");
                    startActivity(i);
                }

                if(position.equals("338")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Ministry Of Small Scale Industries");
                    i.putExtra("url","http://www.dcmsme.gov.in/howtosetup/grgxx01x.htm");
                    startActivity(i);
                }

                if(position.equals("339")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Ministry Of Statistics and Programm...");
                    i.putExtra("url","http://mospi.nic.in/");
                    startActivity(i);
                }

                if(position.equals("340")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Department Of Telecommunication");
                    i.putExtra("url","http://www.dot.gov.in/");
                    startActivity(i);
                }

                if(position.equals("341")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Ministry Of Textile");
                    i.putExtra("url","http://texmin.nic.in/");
                    startActivity(i);
                }

                if(position.equals("342")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Ministry Of Tourism");
                    i.putExtra("url","http://www.tourismofindia.com/");
                    startActivity(i);

                }

                if(position.equals("343")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Ministry Of Urban Development");
                    i.putExtra("url","http://mohua.gov.in/");
                    startActivity(i);

                }

                if(position.equals("344")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Ministry Of Water Resource");
                    i.putExtra("url","http://mowr.gov.in/");
                    startActivity(i);
                }

                if(position.equals("345")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Andaman & Nicobar(UT)");
                    i.putExtra("url","http://andaman.nic.in");
                    startActivity(i);
                }

                if(position.equals("346")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Andra Pradesh");
                    i.putExtra("url","http://www.aponline.gov.in");
                    startActivity(i);
                }

                if(position.equals("347")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Assam");
                    i.putExtra("url","https://assam.gov.in/");
                    startActivity(i);
                }

                if(position.equals("348")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Bihar");
                    i.putExtra("url","http://www.bihar.gov.in/");
                    startActivity(i);
                }

                if(position.equals("349")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Chandigarh(UT)");
                    i.putExtra("url","http://chandigarh.gov.in/");
                    startActivity(i);
                }

                if(position.equals("350")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Chhattisgarh");
                    i.putExtra("url","https://www.cgstate.gov.in/");
                    startActivity(i);
                }

                if(position.equals("351")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Dadra & Nagar Haveli");
                    i.putExtra("url","http://dnh.nic.in/");
                    startActivity(i);
                }

                if(position.equals("352")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Daman & Diu");
                    i.putExtra("url","http://daman.nic.in");
                    startActivity(i);

                }
                if(position.equals("353")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Delhi");
                    i.putExtra("url","http://delhigovt.nic.in");
                    startActivity(i);

                }

                if(position.equals("354")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Goa");
                    i.putExtra("url","https://www.goa.gov.in/");
                    startActivity(i);
                }

                if(position.equals("355")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Gujrat");
                    i.putExtra("url","http://gujaratindia.com/");
                    startActivity(i);
                }

                if(position.equals("356")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Haryana");
                    i.putExtra("url","http://haryana.gov.in/");
                    startActivity(i);
                }

                if(position.equals("357")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Himachal Pradesh");
                    i.putExtra("url","http://himachal.nic.in");
                    startActivity(i);
                }

                if(position.equals("358")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Jammu & Kashmir");
                    i.putExtra("url","http://jammukashmir.nic.in");
                    startActivity(i);
                }

                if(position.equals("359")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Jharkhand");
                    i.putExtra("url","http://jharkhand.gov.in/");
                    startActivity(i);
                }

                if(position.equals("360")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Karnataka");
                    i.putExtra("url","http://www.karnataka.nic.in");
                    startActivity(i);
                }

                if(position.equals("361")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Kerala");
                    i.putExtra("url","http://www.kerala.gov.in");
                    startActivity(i);
                }

                if(position.equals("362")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Lakshdweep(UT)");
                    i.putExtra("url","http://lakshadweep.nic.in");
                    startActivity(i);

                }
                if(position.equals("363")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Madhya Pradesh");
                    i.putExtra("url","http://www.mp.nic.in");
                    startActivity(i);

                }

                if(position.equals("364")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Maharashtra");
                    i.putExtra("url","http://maharashtra.gov.in");
                    startActivity(i);
                }

                if(position.equals("365")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Manipur");
                    i.putExtra("url","https://manipur.gov.in/");
                    startActivity(i);
                }

                if(position.equals("366")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Meghalaya");
                    i.putExtra("url","http://meghalaya.gov.in/megportal/");
                    startActivity(i);
                }

                if(position.equals("367")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Mizoram");
                    i.putExtra("url","http://mizoram.nic.in");
                    startActivity(i);
                }

                if(position.equals("368")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Nagaland");
                    i.putExtra("url","http://nagaland.nic.in");
                    startActivity(i);
                }

                if(position.equals("369")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Orissa");
                    i.putExtra("url","http://odisha.gov.in/");
                    startActivity(i);
                }

                if(position.equals("370")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Pondicherry(UT)");
                    i.putExtra("url","http://pondicherry.net.in/");
                    startActivity(i);
                }

                if(position.equals("371")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Punjab");
                    i.putExtra("url","http://www.punjab.gov.in/");
                    startActivity(i);
                }

                if(position.equals("372")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Rajasthan");
                    i.putExtra("url","http://www.rajasthan.gov.in");
                    startActivity(i);

                }
                if(position.equals("373")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Tripura");
                    i.putExtra("url","http://tripura.nic.in");
                    startActivity(i);

                }

                if(position.equals("374")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Uttar Pradesh");
                    i.putExtra("url","http://up.gov.in/");
                    startActivity(i);
                }

                if(position.equals("375")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Uttranchal");
                    i.putExtra("url","https://en.wikipedia.org/wiki/Uttarakhand");
                    startActivity(i);
                }

                if(position.equals("376")){

                    //
                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","West Bengal");
                    i.putExtra("url","https://wb.gov.in/portal/web/guest/home");
                    startActivity(i);
                }

                if(position.equals("377")){


                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Sikkim");
                    i.putExtra("url","https://www.sikkim.gov.in/portal");
                    startActivity(i);
                }

                if(position.equals("378")){

                    Intent i=new Intent(DetailsActivity.this,WebViewActivity.class);
                    i.putExtra("name","Tamil Nadu");
                    i.putExtra("url","http://www.tn.gov.in");
                    startActivity(i);
                }

            }
        });

    }
}
