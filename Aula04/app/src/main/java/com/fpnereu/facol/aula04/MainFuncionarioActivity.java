package com.fpnereu.facol.aula04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainFuncionarioActivity extends AppCompatActivity {

    private EditText txtNomeFun;
    private EditText txtEnderecoFun;
    private EditText txtTelefoneFun;
    private EditText txtCargoFun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_funcionario);

        txtNomeFun = findViewById(R.id.txtNomeFun);
        txtEnderecoFun = findViewById(R.id.txtEnderecoFun);
        txtTelefoneFun = findViewById(R.id.txtTelefoneFun);
        txtCargoFun = findViewById(R.id.txtCargoFun);

        setTitle ("Cadastro Funcionário");
    }

    public void salvar(View v) {
        String nome = txtNomeFun.getText().toString();
        String endereco = txtEnderecoFun.getText().toString();
        String telefone = txtTelefoneFun.getText().toString();
        String cargo = txtCargoFun.getText().toString();
        String mensagem;

        if (nome.length()<3){
            txtNomeFun.setError("Digite ao menos 3 caracteres!");
            return;
        }
        if (endereco.length()<3){
            txtEnderecoFun.setError("Digite ao menos 3 caracteres!");
            return;
        }
        if (telefone.length()<8){
            txtTelefoneFun.setError("Digite ao menos 8 Números!");
            return;
        }
        if (cargo.length()<3){
            txtCargoFun.setError("Digite ao menos 3 caracteres!");
            return;
        }

        if (nome.equals("Luiz") && cargo.equals("Programador")) {
            mensagem = nome + " é um veadinho " + cargo;
        }else{
            mensagem = nome + " é um " + cargo + " tem o telefone de contato " + telefone + "e mora na " + endereco;
        }
        Toast.makeText(MainFuncionarioActivity.this, mensagem, Toast.LENGTH_LONG).show();
    }
}
