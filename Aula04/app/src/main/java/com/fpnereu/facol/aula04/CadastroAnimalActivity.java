package com.fpnereu.facol.aula04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CadastroAnimalActivity extends AppCompatActivity {

    private EditText txtNome;
    private EditText txtAnimal;
    private EditText txtRaca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_animal);

        txtNome = findViewById(R.id.txtNome);
        txtAnimal = findViewById(R.id.txtAnimal);
        txtRaca = findViewById(R.id.txtRaca);

        setTitle ("Cadastro de Animais");
    }

    public void salvar(View v) {
        String nome = txtNome.getText().toString();
        String animal = txtAnimal.getText().toString();
        String raca = txtRaca.getText().toString();
        String mensagem;

        if (nome.length()<3){
            txtNome.setError("Digite ao menos 3 caracteres!");
            return;
        }
        if (animal.length()<3){
            txtAnimal.setError("Digite ao menos 3 caracteres!");
            return;
        }
        if (raca.length()<3){
            txtRaca.setError("Digite ao menos 3 caracteres!");
            return;
        }

        if (animal.equals("Veado") && nome.equals("Luiz")) {
            mensagem = "Luiz é um veadinho de raça" + raca;
        }else{
            mensagem = nome + " é um " + animal + " da raça " + raca;
        }
        Toast.makeText(CadastroAnimalActivity.this, mensagem, Toast.LENGTH_LONG).show();
    }

}
