package com.fabio.professor.aulatres;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CadastroPessoaActivity extends AppCompatActivity {

    private EditText txtNome;
    private EditText txtTelefone;
    private EditText txtIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_pessoa);

        txtNome = findViewById(R.id.txtNome);
        txtTelefone = findViewById(R.id.txtTelefone);
        txtIdade = findViewById(R.id.txtIdade);

        setTitle("Cadastro de Pessoa");
    }

    public void salvar(View v) {
        String nome = txtNome.getText().toString();
        String telefone = txtTelefone.getText().toString();
        int idade = Integer.parseInt(txtIdade.getText().toString());

        Toast.makeText(this, "Nome: " + nome
                + "\nTelefone: " + telefone
                + "\nIdade: " + idade + " anos", Toast.LENGTH_LONG).show();
    }
}
