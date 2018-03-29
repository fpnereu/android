package com.fpnereu.facol.avaliacao01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editUser;
    private RadioGroup radio;
    private Button btnEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editUser = findViewById(R.id.editUser);
        radio = findViewById(R.id.radio);
        btnEntrar = findViewById(R.id.btnEntrar);

        setTitle("Bem Vindo - Avaliação 01");

    }

    public void entradaUser(View v) {
        String result = "";
        result += "Usuário: " + (editUser.getText().toString());
        switch (radio.getCheckedRadioButtonId()){
            case R.id.radioAdm:
                result +="\nNível de Usuário: Administrador";
                break;
            case R.id.radioUser:
                result +="\nNível de Usuário: Usuário";
                break;
        }
        Toast.makeText(this, result, Toast.LENGTH_LONG).show();

        Intent i = new Intent(MainActivity.this, entradaUserActivity.class);
        startActivity (i);
    }
}
