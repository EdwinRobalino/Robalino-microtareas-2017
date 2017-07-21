package com.example.edwin.grupo2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class tarea_2 extends Activity {
    EditText txtLista;
    Button btnLista;
    ListView ltLista;

    //private String[] actividades = {"Despertar", "Ducha", "Comer"};
    ArrayList<String> actividades = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tarea_2);

        actividades.add("Despertar");
        actividades.add("Ducha");
        actividades.add("Dormir");

        txtLista = (EditText)findViewById(R.id.txtLista);

        final ArrayAdapter<String> lista = new ArrayAdapter<String>(this, R.layout.texto_l, actividades);
        ltLista = (ListView)findViewById(R.id.lvLista);
        ltLista.setAdapter(lista);

        btnLista = (Button)findViewById(R.id.btnLista);
        btnLista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                actividades.add(txtLista.getText().toString());
                lista.notifyDataSetChanged();
            }
        });
    }


}
