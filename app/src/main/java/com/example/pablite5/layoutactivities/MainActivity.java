package com.example.pablite5.layoutactivities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
//Clase Principal para llamar al primer activity main
public class MainActivity extends AppCompatActivity implements MainACtivityFragment.Comunicar{

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
    public void mensaje(String texto){
        MainActivityFragment2 fragment2=(MainActivityFragment2) getSupportFragmentManager().findFragmentById(R.id.fragment2);
        if(fragment2 != null){
            fragment2.recibirTexto(texto);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main_activity1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();


        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
