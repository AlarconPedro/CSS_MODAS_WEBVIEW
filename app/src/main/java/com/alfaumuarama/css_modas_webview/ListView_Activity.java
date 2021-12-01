package com.alfaumuarama.css_modas_webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ListView_Activity extends AppCompatActivity {

    Button btnMasculino, btnFeminino, btnPraia, btnInverno, btnAdulto;
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

        VitrineActivity vitrine = new VitrineActivity();

        btnMasculino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opcao = 0;
                mudaTela();
                startActivity(mudaTela());
            }
        });

        btnFeminino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opcao = 1;
                mudaTela();
                startActivity(mudaTela());
            }
        });

        btnAdulto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opcao = 2;
                mudaTela();
                startActivity(mudaTela());
            }
        });

        btnInverno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opcao = 3;
                mudaTela();
                startActivity(mudaTela());
            }
        });

        btnPraia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opcao = 4;
                mudaTela();
                startActivity(mudaTela());
            }
        });

    }

    public Intent mudaTela () {

        Intent detalhes = new Intent(ListView_Activity.this, VitrineActivity.class);
        detalhes.putExtra("codigo", opcao);

        return detalhes;
    }
}