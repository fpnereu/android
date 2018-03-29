package com.fpnereu.facol.avaliacao01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class entradaUserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrada_user);

        setTitle("Menu de Opções");

    }
    public void cadastroGeral(View v) {
        Intent i = new Intent(entradaUserActivity.this, CadastroGeralActivity.class);
        startActivity (i);
    }

    public void calculo(View v) {
        Intent i = new Intent(entradaUserActivity.this, CalculoActivity.class);
        startActivity (i);
    }
}
