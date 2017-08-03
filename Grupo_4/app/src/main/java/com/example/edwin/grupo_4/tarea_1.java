package com.example.edwin.grupo_4;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class tarea_1 extends AppCompatActivity {

    String [] aLista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tarea_1);

        aLista = getResources().getStringArray(R.array.opciones);
    }

    public void lista(View view){

        final AlertDialog.Builder alDiag = new AlertDialog.Builder(this);
        alDiag.setTitle("Choose a song");
        alDiag.setIcon(R.mipmap.ic_launcher);
        alDiag.setItems(aLista, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(tarea_1.this, "Seleccionaste: " + aLista[i], Toast.LENGTH_SHORT).show();
            }
        });

        AlertDialog alertDialog = alDiag.create();
        alertDialog.show();

    }
}
