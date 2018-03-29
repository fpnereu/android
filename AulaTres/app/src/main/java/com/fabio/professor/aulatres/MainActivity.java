package com.fabio.professor.aulatres;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Bem Vindo!");
    }

    public void cadastroPessoa(View v){
        Intent i = new Intent(MainActivity.this,
                CadastroPessoaActivity.class);
        startActivity(i);
    }

    public void cadastroAnimal(View v){
        Intent i = new Intent(MainActivity.this,
                CadastroAnimalActivity.class);
        i.putExtra("teste", "Fábio");
        startActivity(i);
    }

    public void cadastroFuncionario(View v){

    }

}
