package com.solution.idealz.Dashbord.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.solution.idealz.R;
import com.solution.idealz.Utils.Loader;

public class WebViewActivity extends AppCompatActivity {

    WebView webview;
    String url="";
    String name="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        url=getIntent().getStringExtra("url");
        name=getIntent().getStringExtra("name");


        /*


           Intent i=new Intent(this,WebViewActivity.class);
            i.putExtra("name","About");
            i.putExtra("url","http://lucknowapi.org/about%20us.html");
            startActivity(i);


            * */


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_chevron_left_black_24dp);
        toolbar.setTitle(""+name);
        toolbar.setTitleTextColor(Color.WHITE);

        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });




        webview=(WebView)findViewById(R.id.webview);
        final Loader loader = new Loader(WebViewActivity.this, android.R.style.Theme_Translucent_NoTitleBar);

        loader.show();
        loader.setCancelable(false);
        loader.setCanceledOnTouchOutside(false);

        webview.setWebViewClient(new WebViewClient(){
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }

            public void onPageFinished(WebView view, String url) {

                if (loader.isShowing()) {
                    loader.dismiss();
                }
            }

            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {

            }
        });
        WebSettings webSettings=webview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webview.loadUrl(""+url);




    }
}
