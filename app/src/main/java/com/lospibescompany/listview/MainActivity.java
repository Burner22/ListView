package com.lospibescompany.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Consola> lista = new ArrayList<Consola>();

    public void generarListView(){
        ArrayAdapter<Consola> adapter = new ListaAdapter(this,R.layout.item,lista,getLayoutInflater());
        ListView lv = findViewById(R.id.lista);
        lv.setAdapter(adapter);
    }
    public void cargarDatos(){
        lista.add(new Consola(R.drawable.snes,"Super Nintendo", 1992));
        lista.add(new Consola(R.drawable.play1,"Playstation", 1994));
        lista.add(new Consola(R.drawable.segasat,"Sega Saturn", 1994));
        lista.add(new Consola(R.drawable.n64,"Nintendo 64", 1996));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cargarDatos();
        generarListView();

    }



}