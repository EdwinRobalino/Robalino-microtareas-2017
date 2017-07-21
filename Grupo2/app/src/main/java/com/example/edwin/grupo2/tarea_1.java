package com.example.edwin.grupo2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class tarea_1 extends Activity {

    WebView wvTarea;
    Button btnWeb;
    EditText txtWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tarea_1);



    }

    public void pagInit(View view){
        wvTarea = (WebView)findViewById(R.id.wbContenido);
        wvTarea.setWebViewClient(new WebViewClient());
        txtWeb = (EditText)findViewById(R.id.txtUrl);
        String laUrl = txtWeb.getText().toString();
        wvTarea.loadUrl(laUrl);
    }
}
