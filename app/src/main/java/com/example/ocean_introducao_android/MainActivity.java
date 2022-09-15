package com.example.ocean_introducao_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.concurrent.atomic.AtomicReference;

public class MainActivity extends AppCompatActivity {

    Button btEnviar;
    Button btAbrirNovaTela;
    TextView tvResultado;
    EditText etInput;
    String nomeDigitado = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btEnviar = findViewById(R.id.btEnviar);
        tvResultado = findViewById(R.id.tvResultado);
        etInput = findViewById(R.id.etInput);
        btAbrirNovaTela = findViewById(R.id.btAbrirNovaTela);

        btEnviar.setOnClickListener(view -> {
            nomeDigitado = etInput.getText().toString();

            if(!nomeDigitado.isEmpty()){
                tvResultado.setText(nomeDigitado);
            }else{
                etInput.setError("Entrada vazia");
            }
                }
        );

        btAbrirNovaTela.setOnClickListener(view -> {
            Intent intentNovaTela = new Intent(this, ResultadoActivity.class);
            intentNovaTela.putExtra("NOME_DIGITADO", nomeDigitado);
            startActivity(intentNovaTela);
        });
    }
}