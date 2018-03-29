package com.fpnereu.facol.avaliacao02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class cadastroAnimalActivity extends AppCompatActivity {

        private ListView listView;
        private EditText txtUser;
        private EditText txtNome;
        private EditText txtIdade;
        private EditText txtSintoma;
        private Button btnCadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_animal);

        txtUser = findViewById(R.id.txtUser);
        txtNome = findViewById(R.id.txtNome);
        txtIdade = findViewById(R.id.txtIdade);
        txtSintoma = findViewById(R.id.txtSintoma);
        listView = findViewById(R.id.listView);
        btnCadastro = findViewById(R.id.btnCadastro);
        loadListView();

        setTitle("Cadastro do Pet");

    }

    private void loadListView() {
        final String[] values = new String[]{
                "Cachorro",
                "Gato",
                "Equínos",
                "Caprinos",
                "Bovinos"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<>(cadastroAnimalActivity.this, android.R.layout.simple_list_item_1, android.R.id.text1, values);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView,
                                    View view, int position, long id) {
                String texto = listView.getItemAtPosition(position).toString();

                Toast.makeText(cadastroAnimalActivity.this, "Tipo de Paciente: " + texto, Toast.LENGTH_LONG).show();
            }
        });

    }

    public void cadastro(View v) {
        String result = "";
        result += "Sr. " + (txtUser.getText().toString());
        result += "\nSeu Pet: " + (txtNome.getText().toString());
        result += "\nQue está com " + (txtIdade.getText().toString()) + "anos de idade";
        result += "\nEstá se sentindo com " + (txtSintoma.getText().toString());
        Toast.makeText(this, result, Toast.LENGTH_LONG).show();

    }
}
