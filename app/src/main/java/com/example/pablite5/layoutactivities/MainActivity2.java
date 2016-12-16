package com.example.pablite5.layoutactivities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

/**
 * Created by pablite5 on 15/12/2016.
 */
//clase para llamar al segundo activity
public class MainActivity2 extends AppCompatActivity {
//llamos al layout del activity2 y utilizamos los metodos floatin y snackbar
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Nueva accion", Snackbar.LENGTH_LONG)
                        .setAction("Accion", null).show();
            }
        });
    }

}
