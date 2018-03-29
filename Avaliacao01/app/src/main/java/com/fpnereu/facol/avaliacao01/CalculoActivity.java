package com.fpnereu.facol.avaliacao01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class CalculoActivity extends AppCompatActivity {

    private EditText txtN1;
    private EditText txtN2;
    private TextView txtResultado;
    private CheckBox checkSoma;
    private CheckBox checkSomaMedia;
    private Spinner spinner;
    private SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo);
        setTitle("Cálculo de Soma e Média Artimética");

        txtN1 = findViewById(R.id.txtN1);
        txtN2 = findViewById(R.id.txtN2);
        txtResultado = findViewById(R.id.txtResultado);
        checkSoma = findViewById(R.id.checkSoma);
        checkSomaMedia = findViewById(R.id.checkSomaMedia);
        spinner = findViewById(R.id.spinner);
        seekBar = findViewById(R.id.seekBar);

        inicializaSpinner();
        inicializaSeekbar();
    }
    private void inicializaSeekbar(){
        seekBar.setMax(100);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                Toast.makeText(CalculoActivity.this, "Seekbar modificada: " + i, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });
    }

    private void inicializaSpinner(){
        List<String> list = new ArrayList<String>();
        list.add("Soma");
        list.add("Soma + Média Aritmética");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);
    }

    public void calculo(View v) {
        Double n1 = Double.parseDouble(txtN1.getText().toString());
        Double n2 = Double.parseDouble(txtN2.getText().toString());
        Double soma = n1 + n2;
        Double media = soma / 2;
        String geral = "";
        geral += soma + media;
        if (checkSoma.isChecked() && checkSomaMedia.isChecked()) {
            txtResultado.setText(String.valueOf(geral));
            if (checkSoma.isChecked()) {
                txtResultado.setText(String.valueOf(soma));
                if (checkSomaMedia.isChecked()) {
                    txtResultado.setText(String.valueOf(media));
                }
            }
        }
    }
}
