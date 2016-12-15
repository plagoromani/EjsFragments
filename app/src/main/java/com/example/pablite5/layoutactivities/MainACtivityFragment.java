package com.example.pablite5.layoutactivities;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by pablite5 on 15/12/2016.
 */

public class MainACtivityFragment extends Fragment {

    public MainACtivityFragment() {
    }

    Comunicar comunicar;

    public interface Comunicar {
        public void mensaje(String texto);
    }


    public void onAttach(Context contexto) {
        super.onAttach(contexto);
        comunicar = (Comunicar) contexto;
    }


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View layFra = inflater.inflate(R.layout.fragment1_main, container, false);
        Button boton = (Button) layFra.findViewById(R.id.button);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (getResources().getBoolean(R.bool.landScape)) {
                    // Toast.makeText(getActivity(),"Esto es un LandScape con dos fragments", Toast.LENGTH_LONG).show();
                    comunicar.mensaje("Mensaje enviado desde fragment1 landScape");
                } else {
                    Intent intent = new Intent(getActivity(), MainActivity2.class);
                    intent.putExtra("hola", "Mensaje desde la Activity1");
                    startActivity(intent);
                }
            }


        });
        return layFra;
    }



}
