package com.fpnereu.facol.aula05;

import android.app.ActivityManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkUm;
    private CheckBox checkDois;
    private Spinner spinner;
    private SeekBar seekBar;
    private RadioGroup radios;
    private DatePicker datePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkUm = findViewById(R.id.checkUm);
        checkDois = findViewById(R.id.checkDois);
        spinner = findViewById(R.id.spinner);
        seekBar = findViewById(R.id.seekBar);
        radios = findViewById(R.id.radios);
        datePicker = findViewById(R.id.datePicker);

        inicializaSpinner();
        inicializaSeekbar();

        datePicker.setCalendarViewShown(false);
    }

    private void inicializaSeekbar() {
        seekBar.setMax(100);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){

                                               @Override
                                               public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                                                   Toast.makeText(MainActivity.this, "SeekBar modificada para " + i, Toast.LENGTH_SHORT).show();
                                               }

                                               @Override
                                               public void onStartTrackingTouch(SeekBar seekBar) {
                                               }

                                               @Override
                                               public void onStopTrackingTouch(SeekBar seekBar) {
                                               }
                                           }

        );
    }

    private void inicializaSpinner() {
        List<String> lista = new ArrayList<>();
        lista.add("Item 01");
        lista.add("Item 02");
        lista.add("Item 03");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, lista);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);
    }

    public void salvar (View v){
        String result = "";
        result += "checkUm: " + (checkUm.isChecked() ? "Selecionado" : "Não Selecionado");
        result += "\ncheckDois: " + (checkDois.isChecked() ? "Selecionado" : "Não Selecionado");
        result += "\nspinner: " + spinner.getSelectedItem().toString();
        result += "\nseekBar: " + seekBar.getProgress();

        RadioButton radioSelecionado = findViewById(radios.getCheckedRadioButtonId());
        result += "\nradioButton: " + radioSelecionado.getText().toString();

        switch (radios.getCheckedRadioButtonId()){
            case R.id.radioUm:
                result += "\nradio: radio Um";
                break;
            case R.id.radioDois:
                result += "\nradio: radio Dois";
                break;
        }

        int dia = datePicker.getDayOfMonth();
        int mes = datePicker.getMonth() + 1;
        int ano = datePicker.getYear();

        result += "\ndataPicker: " + dia +"/" + mes + "/" + ano;

        Toast.makeText(this, result, Toast.LENGTH_LONG).show();

    }
}
