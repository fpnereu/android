package com.fabio.professor.androidciclodevida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txtResultado;
    private TextView txtKm;
    private TextView txtLitros
    private Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtResultado = findViewById(R.id.txtResultado);
        txtKm = findViewById(R.id.txtKm);
        txtLitros = findViewById(R.id.txtLitros);
        btnCalcular = findViewById(R.id.btnCalcular);
    }

    public void setBtnCalcular(View v){
        String km = txtKm.getText().tofloat();
        Strings lts = txtLitros.getText().toString();
        exibir.setText(t);
    }
}
