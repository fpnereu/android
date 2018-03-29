package com.fpnereu.facol.avaliacao02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txtUser;
    private RadioGroup radio;
    private Button btnEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUser = findViewById(R.id.txtUser);
        radio = findViewById(R.id.radio);
        btnEntrar = findViewById(R.id.btnEntrar);

        setTitle("Bem Vindo - Avaliação 01");

    }
    public void entradaUser(View v) {
        String result1 = "";
        result1 += "Bem Vindo(a) Usuário(a): " + (txtUser.getText().toString());
        switch (radio.getCheckedRadioButtonId()){
            case R.id.radioAdm:
                result1 +="\nSeus privilégios são de Administrador";
                break;
            case R.id.radioUsuario:
                result1 +="\nSeus privilégios são de Usuário";
                break;
        }
        Toast.makeText(this, result1, Toast.LENGTH_LONG).show();

        Intent i = new Intent(MainActivity.this, MenuActivity.class);
        startActivity (i);
    }
}
