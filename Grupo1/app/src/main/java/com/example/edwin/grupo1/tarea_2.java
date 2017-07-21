package com.example.edwin.grupo1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class tarea_2 extends Activity {

    private String[] estudiantes = {"Jonathan", "Josty", "Ronny"};
    AutoCompleteTextView actvEstudiantes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.area_2);

        ArrayAdapter<String> lista = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, estudiantes);
        actvEstudiantes = (AutoCompleteTextView)findViewById(R.id.autoView);

        actvEstudiantes.setThreshold(3);
        actvEstudiantes.setAdapter(lista);

    }
}
