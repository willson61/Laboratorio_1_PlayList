package com.example.sthephan.laboratorio_1_playlist;

import android.widget.ListView;

import java.util.ArrayList;

public class Ordenamiento {

    public static void ordenamientoAscT(ArrayList<Cancion> lista){
        int n = lista.size();
        int i = 1;
        boolean ordenado = false;
        while (i < n && !ordenado){
            i++;
            ordenado = true;
            for(int j = 0; j < n-1; j++){
                if (lista.get(j).tiempo > lista.get(j+1).tiempo) {
                    ordenado = false;
                    Cancion aux = lista.get(j);
                    lista.set(j, lista.get(j+1));
                    lista.set(j+1, aux);
                }
            }
        }
    }

    public static void ordenamientoDescT(ArrayList<Cancion> lista) {
        int n = lista.size();
        int i = 1;
        boolean ordenado = false;
        while (i < n && !ordenado){
            i++;
            ordenado = true;
            for(int j = 0; j < n-1; j++){
                if (lista.get(j).tiempo < lista.get(j+1).tiempo) {
                    ordenado = false;
                    Cancion aux = lista.get(j);
                    lista.set(j, lista.get(j+1));
                    lista.set(j+1, aux);
                }
            }
        }
    }

    public static void ordenamientoAscC(ArrayList<Cancion> lista){
        int n = lista.size();
        int i = 1;
        boolean ordenado = false;
        while (i < n && !ordenado){
            i++;
            ordenado = true;
            for(int j = 0; j < n-1; j++){
                if (lista.get(j).nombre.compareTo(lista.get(j+1).nombre) > 0) {
                    ordenado = false;
                    Cancion aux = lista.get(j);
                    lista.set(j, lista.get(j+1));
                    lista.set(j+1, aux);
                }
            }
        }
    }

    public static void ordenamientoDesc(ArrayList<Cancion> lista){
        int n = lista.size();
        int i = 1;
        boolean ordenado = false;
        while (i < n && !ordenado){
            i++;
            ordenado = true;
            for(int j = 0; j < n-1; j++){
                if (lista.get(j).nombre.compareTo(lista.get(j+1).nombre) < 0) {
                    ordenado = false;
                    Cancion aux = lista.get(j);
                    lista.set(j, lista.get(j+1));
                    lista.set(j+1, aux);
                }
            }
        }
    }
}
