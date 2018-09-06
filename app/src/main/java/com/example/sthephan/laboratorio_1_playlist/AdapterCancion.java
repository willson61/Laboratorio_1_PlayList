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
    public int getViewTypeCount() {

        return getCount();
    }

    @Override
    public int getItemViewType(int position) {

        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;
        ViewHolder holder;

        if (convertView == null) {
            holder = new ViewHolder();
            try{
                LayoutInflater inf = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                v = inf.inflate(R.layout.item_cancion, parent, false);
                holder.c = items.get(position);
                holder.nom = (TextView)v.findViewById(R.id.nomCancion);
                holder.autor = (TextView)v.findViewById(R.id.auCancion);
                holder.duracion = (TextView)v.findViewById(R.id.durCancion);
                holder.anno = (TextView)v.findViewById(R.id.annoCancion);
                v.setTag(holder);
            } catch(Exception e){
                e.printStackTrace();
            }
        }
        else{
            holder = (ViewHolder) v.getTag();
        }

        holder.nom.setText(holder.c.getNombre());
        holder.autor.setText(holder.c.getAutor());
        holder.duracion.setText(Double.toString(holder.c.getTiempo()) + "m");
        holder.anno.setText("Año: " + Integer.toString(holder.c.getAnno()));

        return v;
    }

    private class ViewHolder{
        private TextView nom;
        private TextView autor;
        private TextView duracion;
        private TextView anno;
        private Cancion c;
    }
}
