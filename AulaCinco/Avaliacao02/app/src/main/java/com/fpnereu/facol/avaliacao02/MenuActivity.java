package com.fpnereu.facol.avaliacao02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        setTitle("Aplicação de Clinica Veterinária");
    }
    public void cadAnimal(View v) {
        Intent i = new Intent(MenuActivity.this, cadastroAnimalActivity.class);
        startActivity (i);
    }

    public void cadCli(View v) {
    Intent i = new Intent(MenuActivity.this, CadCliActivity.class);
    startActivity (i);
    }
}
