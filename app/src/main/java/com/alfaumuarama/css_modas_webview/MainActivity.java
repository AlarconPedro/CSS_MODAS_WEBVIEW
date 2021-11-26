package com.alfaumuarama.css_modas_webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    Button btnMasculino, btnFeminino, btnPraia, btnInverno, btnAdulto;
    ImageButton btnWpp;
    public int opcao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView_Activity list = new ListView_Activity();

        btnMasculino  = findViewById(R.id.btnMasculino);
        btnFeminino   = findViewById(R.id.btnFeminina);
        btnAdulto     = findViewById(R.id.btnAdulto);
        btnInverno    = findViewById(R.id.btnInverno);
        btnPraia      = findViewById(R.id.btnPraia);
        btnWpp        = findViewById(R.id.btnWpp);

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
                opcao = 1;
                list.url += "/images/poloBranca.png";
            }
        });

        btnAdulto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mudaTela();
                startActivity(mudaTela());
                opcao = 2;
                list.url += "/produtos";
            }
        });

        btnInverno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mudaTela();
                startActivity(mudaTela());
                opcao = 3;
                list.url += "/api/produtos";
            }
        });

        btnPraia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mudaTela();
                startActivity(mudaTela());
                opcao = 4;
                list.url += "/images";
            }
        });

        btnWpp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

    public Intent mudaTela () {
        Intent detalhes = new Intent(MainActivity.this, ListView_Activity.class);

        return detalhes;
    }

}