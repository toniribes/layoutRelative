package com.example.layoutrelative;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public double dbNumeroUno = 0;
    public double dbNumeroDos = 0;
    public double dbNumeroTres = 0;
    public double resultado;

    public EditText ctr_numero_uno;
    public EditText ctr_numero_dos;
    public EditText ctr_numero_tres;
    public EditText ctr_Resultado;

    public CheckBox vrfSumatorio ;
    public CheckBox vrfRestador;
    public CheckBox vrfMultiplicador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ctr_numero_uno = (EditText) findViewById(R.id.ctrNumero_uno);
        ctr_numero_dos = (EditText) findViewById(R.id.ctrNumero_dos);
        ctr_numero_tres = (EditText) findViewById(R.id.ctrnumero_tres);
        ctr_Resultado = (EditText) findViewById(R.id.ctrResultado);

        vrfSumatorio = (CheckBox)findViewById(R.id.vrfSumatorio);
        vrfRestador = (CheckBox)findViewById(R.id.vrfRestador);
        vrfMultiplicador=(CheckBox)findViewById(R.id.vrfMultiplicador);

    }

        public void sumatorio (View vista){
            if (ctr_numero_uno.getText().toString().isEmpty()) {
                dbNumeroUno = 0;
            }else{ dbNumeroUno =  Double.parseDouble(ctr_numero_uno.getText().toString());}
            ;
            if (ctr_numero_dos.getText().toString().isEmpty()) {
                dbNumeroDos = 0;
            }else{dbNumeroDos=Double.parseDouble(ctr_numero_dos.getText().toString());}
            ;
            if (ctr_numero_tres.getText().toString().isEmpty()) {
                dbNumeroTres = 0;
            }else{dbNumeroTres=Double.parseDouble(ctr_numero_tres.getText().toString());}
            ;


        if(vrfSumatorio.isChecked()){
            resultado = dbNumeroUno + dbNumeroDos + dbNumeroTres;
        }

        if(vrfRestador.isChecked()){
            resultado = dbNumeroUno - dbNumeroDos - dbNumeroTres;
        }

        if(vrfMultiplicador.isChecked()){
            resultado = dbNumeroUno * dbNumeroDos * dbNumeroTres;
        }

        ctr_Resultado.setText(Double.toString(resultado));

/*          ctr_Resultado.setText("La casa ñalksdf es bonita");
            ctr_Resultado.requestFocus();
            ctr_Resultado.setSelection(5,10);
            ctr_Resultado.setText("xxxxxxxxxx");*/
    }

}
