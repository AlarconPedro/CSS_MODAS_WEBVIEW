package com.alfaumuarama.css_modas_webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    Button btnCategorias, btnVitrine;
    ImageButton btnWpp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCategorias = findViewById(R.id.btnCategorias);
        btnVitrine    = findViewById(R.id.btnVitrine);
        btnWpp        = findViewById(R.id.btnWpp);

        btnCategorias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent categorias = new Intent(MainActivity.this, ListView_Activity.class);
                startActivity(categorias);
            }
        });

        btnVitrine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vitrine = new Intent(MainActivity.this, VitrineActivity.class);
                startActivity(vitrine);
            }
        });

        btnWpp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent wpp = new Intent(MainActivity.this, WppActivity.class);
                startActivity(wpp);
            }
        });
    }
}