package com.example.newsreader;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.io.File;

public class WebSiteActivity extends AppCompatActivity {
    WebView webView;

    @SuppressLint({"MissingInflatedId", "SetJavaScriptEnabled"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_site);
        webView=findViewById(R.id.webView);

        Intent intent=getIntent();
        if(null != intent)
        {
            String link="";
            link=(String) getIntent().getSerializableExtra("link");
            webView.setWebViewClient(new WebViewClient());
            webView.getSettings().setJavaScriptEnabled(true);
            webView.requestFocus();
            webView.loadUrl(link);
        }
    }

    @Override
    public void onBackPressed()
    {
        if(webView.canGoBack())
        {
            webView.goBack();
        }
        else
        {
            super.onBackPressed();
        }
    }

    @Override
    protected void onDestroy() {
        webView.clearHistory();
        webView.clearCache(true);
        webView.clearFormData();
        webView.clearMatches();
        webView.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        super.onDestroy();
    }
}