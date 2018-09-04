package com.example.sthephan.laboratorio_1_playlist;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class AdapterCancion extends BaseAdapter{
    protected Activity activity;
    protected ArrayList<Cancion> items;

    public AdapterCancion (Activity activity, ArrayList<Cancion> items) {
        this.activity = activity;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    public void clear() {
        items.clear();
    }

    public void addAll(ArrayList<Cancion> canciones) {
        for (int i = 0; i < canciones.size(); i++) {
            items.add(canciones.get(i));
        }
    }

    @Override
    public Object getItem(int arg0) {
        return items.get(arg0);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        if (convertView == null) {
            LayoutInflater inf = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.item_cancion, null);

            Cancion c = items.get(position);

            TextView nom = (TextView)v.findViewById(R.id.nomCancion);
            nom.setText(c.getNombre());
            TextView autor = (TextView)v.findViewById(R.id.auCancion);
            autor.setText(c.getAutor());
            TextView duracion = (TextView)v.findViewById(R.id.durCancion);
            duracion.setText(Double.toString(c.getTiempo()) + "m");
            TextView anno = (TextView)v.findViewById(R.id.annoCancion);
            anno.setText("Año: " + Integer.toString(c.getAnno()));
        }

        return v;
    }
}
