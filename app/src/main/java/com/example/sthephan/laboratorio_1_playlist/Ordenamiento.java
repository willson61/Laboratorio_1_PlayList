package com.example.sthephan.laboratorio_1_playlist;

import android.widget.ListView;

import java.util.ArrayList;

public class Ordenamiento {

    public static void ordenamientoAscT(ArrayList<Integer> lista){
        int n = lista.size();
        int i = 1;
        boolean ordenado = false;
        while (i < n && !ordenado){
            i++;
            ordenado = true;
            for(int j = 0; j <= n-1; j++){
                if (lista.get(j) > lista.get(j+1)) {
                    ordenado = false;
                    int aux = lista.get(j);
                    lista.set(j, lista.get(j+1));
                    lista.set(j+1, aux);
                }
            }
        }
    }

    public static void ordenamientoDescT(ArrayList<Integer> lista) {
        int n = lista.size();
        int i = 1;
        boolean ordenado = false;
        while (i < n && !ordenado){
            i++;
            ordenado = true;
            for(int j = 0; j <= n-1; j++){
                if (lista.get(j) < lista.get(j+1)) {
                    ordenado = false;
                    Integer aux = lista.get(j);
                    lista.set(j, lista.get(j+1));
                    lista.set(j+1, aux);
                }
            }
        }
    }

    public static void ordenamientoAscC(ArrayList<String> lista){
        int n = lista.size();
        int i = 1;
        boolean ordenado = false;
        while (i < n && !ordenado){
            i++;
            ordenado = true;
            for(int j = 0; j <= n-1; j++){
                if (lista.get(j).compareTo(lista.get(j+1)) > 0) {
                    ordenado = false;
                    String aux = lista.get(j);
                    lista.set(j, lista.get(j+1));
                    lista.set(j+1, aux);
                }
            }
        }
    }

    public static void ordenamientoDesc(ArrayList<String> lista){
        int n = lista.size();
        int i = 1;
        boolean ordenado = false;
        while (i < n && !ordenado){
            i++;
            ordenado = true;
            for(int j = 0; j <= n-1; j++){
                if (lista.get(j).compareTo(lista.get(j+1)) < 0) {
                    ordenado = false;
                    String aux = lista.get(j);
                    lista.set(j, lista.get(j+1));
                    lista.set(j+1, aux);
                }
            }
        }
    }
}
