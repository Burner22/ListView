package com.lospibescompany.listview;

import android.animation.LayoutTransition;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ListaAdapter extends ArrayAdapter<Consola> {

    private Context context;
    private List<Consola> lista;
    private LayoutInflater li;

    public ListaAdapter(@NonNull Context context, int resource, @NonNull List<Consola> objects, LayoutInflater li) {
        super(context, resource, objects);
        this.context = context;
        this.lista = objects;
        this.li = li;
    }

    @Override
    @NonNull
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){

        View itemView=convertView;

        if(itemView == null){
            itemView=li.inflate(R.layout.item,parent,false);
        }
        Consola consolaActual = lista.get(position);

        ImageView foto = itemView.findViewById(R.id.foto) ;
        foto.setImageResource(consolaActual.getFoto());

        TextView conso = itemView.findViewById(R.id.consola);
        conso.setText(consolaActual.getConsola());

        TextView anio = itemView.findViewById(R.id.año);
        anio.setText(consolaActual.getAño()+"");

        return itemView;
    }



}
