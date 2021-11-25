package com.alfaumuarama.css_modas_webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnMasculino, btnFeminino, btnPraia, btnInverno, btnAdulto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMasculino  = findViewById(R.id.btnMasculino);
        btnFeminino   = findViewById(R.id.btnFeminina);
        btnAdulto     = findViewById(R.id.btnAdulto);
        btnInverno    = findViewById(R.id.btnInverno);
        btnPraia      = findViewById(R.id.btnPraia);

        btnMasculino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               mudaTela();
               startActivity(mudaTela());
            }
        });

        btnFeminino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mudaTela();
                startActivity(mudaTela());
            }
        });

        btnAdulto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mudaTela();
                startActivity(mudaTela());
            }
        });

        btnInverno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mudaTela();
                startActivity(mudaTela());
            }
        });

        btnPraia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mudaTela();
                startActivity(mudaTela());
            }
        });
    }

    public Intent mudaTela () {
        Intent detalhes = new Intent(MainActivity.this, ListView_Activity.class);

//        Bundle params = detalhes.getExtras();
//        params.putString("link", "http://cssmodas.herokuapp.com");

//        detalhes.putExtras(params);

        return detalhes;
    }
}