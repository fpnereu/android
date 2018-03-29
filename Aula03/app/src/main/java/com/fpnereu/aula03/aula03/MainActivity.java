package com.fpnereu.aula03.aula03;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txtResultado;
    private TextView txtKm;
    private TextView txtLitros;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtResultado = findViewById(R.id.txtResultado);
        txtKm = findViewById(R.id.txtKm);
        txtLitros = findViewById(R.id.txtLitros);
    }

    public void setBtnCalculo(View v) {
        Double km = Double.parseDouble(txtKm.getText().toString());
        Double lts = Double.parseDouble(txtLitros.getText().toString());
        Double media = km / lts;
        txtResultado.setText(String.valueOf(media));
    }

}
