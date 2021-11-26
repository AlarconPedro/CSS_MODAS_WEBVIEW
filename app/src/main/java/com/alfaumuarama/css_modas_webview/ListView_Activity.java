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

public class ListView_Activity extends AppCompatActivity {

    WebView webView;
    public int opcao;
    public String url;

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && webView.canGoBack()) {
            webView.goBack();
        webView.loadUrl("");
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        webView = findViewById(R.id.webView);
        webView.loadUrl(link());

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

    public String link () {

        MainActivity main = new MainActivity();
        this.opcao = main.opcao;


        if (this.opcao == main.opcao) {

            switch (opcao) {
                case 0:
                    url = "http://cssmodas.herokuapp.com";
                    break;
                case 1:
                    url = "https://trello.com/b/MJOWiJvJ/hackaton";
                    break;
                case 2:
                    url = "https://www.google.com.br";
                    break;
                case 3:
                    url = "https://stackoverflow.com/questions/4227539/android-how-to-create-switch-case-from-this/4227815";
                    break;
                case 4:
                    url = "http://cssmodas.herokuapp.com";
                    break;

                default:
                    url = "https://www.google.com.br";
                    break;
            }
        } else {
            url = " ";
        }

        return url;
    }

}