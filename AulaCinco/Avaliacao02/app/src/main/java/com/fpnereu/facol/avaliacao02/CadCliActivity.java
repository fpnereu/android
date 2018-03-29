package com.fpnereu.facol.avaliacao02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class CadCliActivity extends AppCompatActivity {

    private Spinner spinner;
    private DatePicker datePicker;
    private Button btnCadCli;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cad_cli);

        spinner = findViewById(R.id.spinner);
        datePicker = findViewById(R.id.datePicker);
        btnCadCli = findViewById(R.id.btnCadCli);

        setTitle("Cadastro de Consulta");
        inicializaSpinner();
        datePicker.setCalendarViewShown(false);
    }


    private void inicializaSpinner() {
        List<String> lista = new ArrayList<>();
        lista.add("Cachorro - PIMPO");
        lista.add("Gato - Sebastião");
        lista.add("Bode - Zé");
        lista.add("Boi - Cara Preta");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, lista);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);
    }

    public void CadCli (View v){
        String result = "";

        int dia = datePicker.getDayOfMonth();
        int mes = datePicker.getMonth() + 1;
        int ano = datePicker.getYear();

        result += "\nCliente Cadastro na data: " + dia +"/" + mes + "/" + ano;
        result += "\nCliente Cadastrado: " + spinner.getSelectedItem().toString();

        Toast.makeText(this, result, Toast.LENGTH_LONG).show();

    }
}
