package com.example.edwin.grupo1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class tarea_1 extends Activity {
    RatingBar rtbar;
    TextView txtCont;
    Button btnContar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tarea1);
        btnContar = (Button)findViewById(R.id.btnContar);
        btnContar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contarEstrellas();
            }
        });

        contarEstrellas();
    }

    public void contarEstrellas(){
        rtbar = (RatingBar)findViewById(R.id.rtbar);
        txtCont = (TextView)findViewById(R.id.txtEstrellas);

        txtCont.setText("Num: de estrellas " + rtbar.getRating());
    }
}
