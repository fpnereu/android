package com.fpnereu.facol.aula04;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Bem Vindo - App da Aula 04");
    }

    public void cadastroPessoa(View v) {
        Intent i = new Intent(MainActivity.this, CadastroPessoaActivity.class);
        startActivity (i);
    }

    public void cadastroAnimal(View v) {
        Intent i = new Intent(MainActivity.this, CadastroAnimalActivity.class);
        startActivity (i);
    }

    public void cadastroFuncionario(View v) {
        Intent i = new Intent(MainActivity.this, MainFuncionarioActivity.class);
        startActivity (i);
    }

}
