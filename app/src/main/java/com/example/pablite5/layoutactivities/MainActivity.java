package com.example.pablite5.layoutactivities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
//Clase Principal para llamar al primer activity main
public class MainActivity extends AppCompatActivity implements MainACtivityFragment.Comunicar{
//método para llamar cuando se crea una actividad y llamamos al content view
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
    @Override
    //MÉTODO para mostrar un mensaje, se podría mostrar con un Toast
    public void mensaje(String texto){
        MainActivityFragment2 fragment2=(MainActivityFragment2) getSupportFragmentManager().findFragmentById(R.id.fragment2);
        if(fragment2 != null){
            fragment2.recibirTexto(texto);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//Instanciar el xml del menu
        getMenuInflater().inflate(R.menu.menu_main_activity1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

// cargamos el archivo action_settings
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
