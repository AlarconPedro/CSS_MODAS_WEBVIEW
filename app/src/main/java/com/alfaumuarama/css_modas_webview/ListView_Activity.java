package com.alfaumuarama.css_modas_webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ListView_Activity extends AppCompatActivity {

    Button btnMasculino, btnFeminino, btnPraia, btnInverno, btnAdulto;
    ImageButton btnVoltar;
    public int opcao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

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
                opcao = 0;
            }
        });

        btnFeminino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mudaTela();
                startActivity(mudaTela());
                opcao = 1;
            }
        });

        btnAdulto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mudaTela();
                startActivity(mudaTela());
                opcao = 2;
            }
        });

        btnInverno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mudaTela();
                startActivity(mudaTela());
                opcao = 3;
            }
        });

        btnPraia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mudaTela();
                startActivity(mudaTela());
                opcao = 4;
            }
        });

    }

    public Intent mudaTela () {

        Intent detalhes = new Intent(ListView_Activity.this, VitrineActivity.class);

        return detalhes;
    }
}