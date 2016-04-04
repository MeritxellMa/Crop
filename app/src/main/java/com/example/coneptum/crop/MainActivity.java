package com.example.coneptum.crop;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity{

    private final int IMG_PICK = 1;
    private WebView picView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        picView = (WebView) findViewById(R.id.web_view);

        picView.setVerticalScrollBarEnabled(true);
        picView.setHorizontalScrollBarEnabled(true);
        picView.getSettings().setBuiltInZoomControls(true);
        picView.getSettings().setUseWideViewPort(true);

        picView.loadUrl("file:///android_res/drawable/descarga.html");
       
    }

}
