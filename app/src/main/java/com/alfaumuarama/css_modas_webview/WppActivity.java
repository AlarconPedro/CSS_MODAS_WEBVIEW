package com.alfaumuarama.css_modas_webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WppActivity extends AppCompatActivity {

    WebView wppView;

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && wppView.canGoBack()) {
            wppView.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wpp);

        wppView = findViewById(R.id.wppView);
        wppView.loadUrl("https://api.whatsapp.com/send?phone=%27+item.whatsapp+%27&text=%27");

        wppView.getSettings().setJavaScriptEnabled(true);
        wppView.setWebViewClient(new WebViewClient());
    }
}