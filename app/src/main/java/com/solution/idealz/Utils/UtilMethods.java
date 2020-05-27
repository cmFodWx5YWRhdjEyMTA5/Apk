package com.solution.idealz.Utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
 import android.telephony.TelephonyManager;


import androidx.appcompat.content.res.AppCompatResources;

import com.solution.idealz.R;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import cn.pedant.SweetAlert.SweetAlertDialog;

import static android.content.Context.MODE_PRIVATE;

public enum UtilMethods {

    INSTANCE;

    public String getRecentLogin(Context context) {
        SharedPreferences myPrefs = context.getSharedPreferences(ApplicationConstant.INSTANCE.prefNamePref, MODE_PRIVATE);
        String key = myPrefs.getString(ApplicationConstant.INSTANCE.regRecentLoginPref, null);
        return key;
    }

    public void setRecentLogin(Context context, String key) {
        SharedPreferences prefs = context.getSharedPreferences(ApplicationConstant.INSTANCE.prefNamePref, MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(ApplicationConstant.INSTANCE.regRecentLoginPref,key);
        editor.commit();
    }



    public void Processing(final Context context, final String message) {
        new SweetAlertDialog(context, SweetAlertDialog.CUSTOM_IMAGE_TYPE)
                .setTitleText("Processing")
                .setContentText(message)
                .setCustomImage(R.drawable.processing)
                .show();
    }

    public void Failed(final Context context, final String message) {
        new SweetAlertDialog(context, SweetAlertDialog.CUSTOM_IMAGE_TYPE)
                .setTitleText(context.getResources().getString(R.string.attention_error_title))
                .setContentText(message)
                .setCustomImage(AppCompatResources.getDrawable(context,R.drawable.ic_cancel_black_24dp))
                .show();
    }

    public void Successful(final Context context, final String message, final int i) {

        SweetAlertDialog pDialog = new SweetAlertDialog(context, SweetAlertDialog.CUSTOM_IMAGE_TYPE);
        pDialog.setTitleText(context.getResources().getString(R.string.successful_title));
        pDialog.setContentText(message);
        pDialog.setCustomImage(AppCompatResources.getDrawable(context,R.drawable.ic_check_circle_black_24dp));
        pDialog.setCancelable(false);
        pDialog.setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
            @Override
            public void onClick(SweetAlertDialog sweetAlertDialog) {
                if (i==1){
                    ActivityActivityMessage fragmentActivityMessage =
                            new ActivityActivityMessage("Registration","");
                    GlobalBus.getBus().post(fragmentActivityMessage);
                    sweetAlertDialog.dismiss();
                }if(i==2){
                    ActivityActivityMessage fragmentActivityMessage =
                            new ActivityActivityMessage("EPinGen","");
                    GlobalBus.getBus().post(fragmentActivityMessage);
                    sweetAlertDialog.dismiss();
                }if(i==3){
                    ActivityActivityMessage fragmentActivityMessage =
                            new ActivityActivityMessage("PaymentRequest","");
                    GlobalBus.getBus().post(fragmentActivityMessage);
                    sweetAlertDialog.dismiss();
                }if(i==4){
                    ActivityActivityMessage fragmentActivityMessage =
                            new ActivityActivityMessage("","DeleteSuccess");
                    GlobalBus.getBus().post(fragmentActivityMessage);
                    sweetAlertDialog.dismiss();
                }if(i==5){
                    ActivityActivityMessage activityActivityMessage =
                            new ActivityActivityMessage("" , "SendMoney");
                    GlobalBus.getBus().post(activityActivityMessage);
                    sweetAlertDialog.dismiss();
                }if(i==6){
                    ActivityActivityMessage activityActivityMessage =
                            new ActivityActivityMessage("","beneVerified");
                    GlobalBus.getBus().post(activityActivityMessage);
                    sweetAlertDialog.dismiss();
                }if(i==7){
                    ActivityActivityMessage activityActivityMessage =
                            new ActivityActivityMessage("","bene_Verified");
                    GlobalBus.getBus().post(activityActivityMessage);
                    sweetAlertDialog.dismiss();
                }if(i==8){
                    ActivityActivityMessage activityActivityMessage =
                            new ActivityActivityMessage("","recharge_done");
                    GlobalBus.getBus().post(activityActivityMessage);
                    sweetAlertDialog.dismiss();
                }if(i==9){
                    ActivityActivityMessage activityActivityMessage =
                            new ActivityActivityMessage("", "beneDeleted");
                    GlobalBus.getBus().post(activityActivityMessage);
                    sweetAlertDialog.dismiss();
                }if(i==10){
                    ActivityActivityMessage activityActivityMessage =
                            new ActivityActivityMessage("" , "SendMoney");
                    GlobalBus.getBus().post(activityActivityMessage);
                    sweetAlertDialog.dismiss();
                }
                else {
                    sweetAlertDialog.dismiss();
                }
            }
        });
        pDialog.show();
    }


    public void Error(final Context context, final String message, final  int i) {

        SweetAlertDialog pDialog = new SweetAlertDialog(context, SweetAlertDialog.CUSTOM_IMAGE_TYPE);
        pDialog.setTitleText(context.getResources().getString(R.string.attention_error_title));
        pDialog.setContentText(message);
        pDialog.setCustomImage(AppCompatResources.getDrawable(context,R.drawable.ic_error_red_24dp) );
        pDialog.setCancelable(false);
        pDialog.setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
            @Override
            public void onClick(SweetAlertDialog sweetAlertDialog) {
                if (i==1){
                    FragmentActivityMessage fragmentActivityMessage = new FragmentActivityMessage("PanStatus","");
                    GlobalBus.getBus().post(fragmentActivityMessage);
                    sweetAlertDialog.dismiss();
                }if(i==2){
//                            UtilMethods.INSTANCE.logout(context);
                    sweetAlertDialog.dismiss();
                }else {
                    sweetAlertDialog.dismiss();
                }
            }});
        pDialog.show();

    }




    public void NetworkError(final Context context, String title, final String message) {
        new SweetAlertDialog(context, SweetAlertDialog.CUSTOM_IMAGE_TYPE)
                .setTitleText(title)
                .setContentText(message)
                .setCustomImage(AppCompatResources.getDrawable(context,R.drawable.ic_connection_lost_24dp))
                .show();
    }

    public static final String md5Convertor(final String s) {
        final String MD5 = "MD5";
        try {
            // Create MD5 Hash
            MessageDigest digest = MessageDigest
                    .getInstance(MD5);
            digest.update(s.getBytes());
            byte messageDigest[] = digest.digest();

            // Create Hex String
            StringBuilder hexString = new StringBuilder();
            for (byte aMessageDigest : messageDigest) {
                String h = Integer.toHexString(0xFF & aMessageDigest);
                while (h.length() < 2)
                    h = "0" + h;
                hexString.append(h);
            }
            return hexString.toString();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }

    public boolean isNetworkAvialable(Context context) {
        ConnectivityManager cm =
                (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();
        return netInfo != null && netInfo.isConnectedOrConnecting();
    }

    public String getDeviceId(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
        @SuppressLint("MissingPermission") String deviceId = telephonyManager.getDeviceId();
        return deviceId;
    }

    public String getIMEI(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
        @SuppressLint("MissingPermission") String IMEI = "IMEI:"+telephonyManager.getDeviceId();
        return IMEI;
    }

    public boolean isValidMobile(String mobile) {

        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
        String mobilePattern = "^(?:0091|\\\\+91|0)[7-9][0-9]{9}$";
        String mobileSecPattern = "[7-9][0-9]{9}$";

        if (mobile.matches(mobilePattern) || mobile.matches(mobileSecPattern)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isValidEmail(String email) {

        boolean isValid = false;

        String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        CharSequence inputStr = email;

        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(inputStr);
        if (matcher.matches()) {
            isValid = true;
        }
        return isValid;
    }




}