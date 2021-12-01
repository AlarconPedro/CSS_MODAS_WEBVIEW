package com.alfaumuarama.css_modas_webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class VitrineActivity extends AppCompatActivity {

    WebView webView;
    public String url;
    public int opcao;

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && webView.canGoBack()) {
            webView.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vitrine);

        webView = findViewById(R.id.webView);
        link();
    }

    public String link () {

        ListView_Activity list = new ListView_Activity();
        Intent codigo = getIntent();
        opcao = codigo.getIntExtra("codigo", 5);

        switch (opcao) {
            case 0:
                url = "http://187.87.223.235:81/api/produtosCategoria/4";
                break;
            case 1:
                url = "http://187.87.223.235:81/api/produtosCategoria/3";
                break;
            case 2:
                url = "http://187.87.223.235:81/api/produtosCategoria/2";
                break;
            case 3:
                url = "http://187.87.223.235:81/api/produtosCategoria/5";
                break;
            case 4:
                url = "http://187.87.223.235:81/api/produtosCategoria/6";
                break;

            default:
                url = "http://187.87.223.235:81/";
                break;
        }
        webView.loadUrl(url);
        Vitrine();

        return url.toString();
    }

    public void Vitrine() {

        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());

        final ProgressBar progressBar = findViewById(R.id.progress);
        progressBar.setVisibility(View.INVISIBLE);

        webView.setWebViewClient(new WebViewClient(){

            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                progressBar.setVisibility(View.VISIBLE);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                progressBar.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                super.onReceivedSslError(view, handler, error);
            }
        });
    }
}