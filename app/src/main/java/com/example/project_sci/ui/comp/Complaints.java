package com.example.project_sci.ui.comp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.project_sci.R;

public class Complaints extends AppCompatActivity {
    WebView myWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complaints);
        //https://forms.office.com/r/HfejjtfynN
         myWebView = (WebView) findViewById(R.id.webview4);

        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.getSettings().setAllowContentAccess(true);
        myWebView.getSettings().setDomStorageEnabled(true);
        myWebView.getSettings().setLoadsImagesAutomatically(true);
        myWebView.getSettings().setLoadWithOverviewMode(true);
        myWebView.getSettings().setAppCacheEnabled(true);
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.loadUrl("https://forms.office.com/r/HfejjtfynN");
    }

    @Override
    public void onBackPressed() {
        if(myWebView.canGoBack())
        {
            myWebView.goBack();
        }
        else
           super.onBackPressed();
    }
}