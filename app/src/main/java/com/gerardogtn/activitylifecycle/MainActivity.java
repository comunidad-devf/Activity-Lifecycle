package com.gerardogtn.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String TAG = "Main Activity";
    public static final String KEY_TEXTO_BOTON = "Texto Boton";

    private String mTextoBoton = "Hola!!!";
    private Button mBoton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.wtf(TAG, "Creando Actividad. ");
        if (savedInstanceState != null){
            mTextoBoton = savedInstanceState.getString(KEY_TEXTO_BOTON);
        }
        setUpButton();
    }

    private void setUpButton() {
        mBoton = (Button) findViewById(R.id.btn_hola);
        mBoton.setOnClickListener(this);
        mBoton.setText(mTextoBoton);
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.wtf(TAG, "Ejecutando onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.wtf(TAG, "Ejecutando onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.wtf(TAG, "Ejecutando onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.wtf(TAG, "Ejecutando onStop");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.wtf(TAG, "Ejectuando onDestroy");
    }

    @Override
    public void onClick(View view) {
        mTextoBoton = "Adios!";
        mBoton.setText("Adios!");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(KEY_TEXTO_BOTON, mTextoBoton);
    }
}
