package com.example.edwin.grupo1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startClase1(View view){
        Intent intClase1 = new Intent(this, tarea_1.class);
        startActivity(intClase1);
    }

    public void startClase2(View view){
        Intent intClase2 = new Intent(this, tarea_2.class);
        startActivity(intClase2);
    }
}
