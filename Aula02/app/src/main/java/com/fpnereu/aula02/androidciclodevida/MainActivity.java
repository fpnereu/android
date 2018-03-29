package com.fpnereu.aula02.androidciclodevida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText texto;
    private TextView exibir;
    private Button acao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = (EditText) findViewById(R.id.texto);
        exibir = (TextView) findViewById(R.id.exibir);
        acao = (Button) findViewById(R.id.acao);

        }




    }
}
