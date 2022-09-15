package com.example.ocean_introducao_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

    private Button btVoltar;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        String nomeDigitado = getIntent().getStringExtra("NOME_DIGITADO");

        tvResultado = findViewById(R.id.tvResultado);

        tvResultado.setText(nomeDigitado);

        btVoltar = findViewById(R.id.btVoltar);

        btVoltar.setOnClickListener(view -> finish());

    }
}