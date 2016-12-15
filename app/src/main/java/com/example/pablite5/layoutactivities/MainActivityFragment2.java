package com.example.pablite5.layoutactivities;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by pablite5 on 15/12/2016.
 */
//desde aqui se llama al xml para añadirlo a la jerarquia de vistas
public class MainActivityFragment2 extends Fragment {

    TextView textView;
    public MainActivityFragment2() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View layFra2=inflater.inflate(R.layout.fragment2_main, container, false);

        textView=(TextView) layFra2.findViewById(R.id.textView);
        return layFra2;//}

    }
    public void recibirTexto(String texto){
        textView.setText(texto);
    }

}
