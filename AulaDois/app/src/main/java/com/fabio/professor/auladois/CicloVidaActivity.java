package com.fabio.professor.auladois;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class CicloVidaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ciclo_vida);
        Log.i("ciclo", "onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("ciclo", "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("ciclo", "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("ciclo", "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("ciclo", "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("ciclo", "onDestroy()");
    }
}
