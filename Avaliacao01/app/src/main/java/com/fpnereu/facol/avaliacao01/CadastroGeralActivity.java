package com.fpnereu.facol.avaliacao01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

public class CadastroGeralActivity extends AppCompatActivity {

    private EditText editNome;
    private EditText editEndereco;
    private EditText editTelefone;
    private EditText editCidade;
    private EditText editUf;
    private DatePicker datePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_geral);
        setTitle("Cadastro Básica - Geral");

        editNome = findViewById(R.id.editNome);
        editEndereco = findViewById(R.id.editEndereco);
        editTelefone = findViewById(R.id.editTelefone);
        editCidade = findViewById(R.id.editCidade);
        editUf = findViewById(R.id.editUf);
        datePicker = findViewById(R.id.datePicker);
    }

    public void salvar (View v) {
        String nome = editNome.getText().toString();
        String endereco = editEndereco.getText().toString();
        String telefone = editTelefone.getText().toString();
        String cidade = editCidade.getText().toString();
        String uf = editUf.getText().toString();

        if (nome.length()<3) {
            editNome.setError("Digite ao menos 3 caracteres!");
            return;
        }
        if (nome.length()<3) {
            editEndereco.setError("Digite ao menos 3 caracteres!");
            return;
        }
        if (telefone.length()<8){
            editTelefone.setError("Digite ao menos 8 Números !");
            return;
        }
        if (nome.length()<3) {
            editCidade.setError("Digite ao menos 3 caracteres!");
            return;
        }
        if (nome.length()<2) {
            editUf.setError("Digite ao menos 3 caracteres!");
            return;
        }

        String result = "";
        int dia = datePicker.getDayOfMonth();
        int mes = datePicker.getMonth() + 1;
        int ano = datePicker.getYear();
        result += "\nData: " + dia + "/" + mes + "/" + ano;

        Toast.makeText(this, "Nome " + nome + "\n Endereço: " + endereco + "\n Telefone " + telefone + "\n Cidade: " + cidade + " - " + uf + result, Toast.LENGTH_LONG).show();

    }
}
