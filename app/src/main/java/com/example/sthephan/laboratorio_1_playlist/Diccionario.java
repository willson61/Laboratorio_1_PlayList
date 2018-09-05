package com.example.sthephan.laboratorio_1_playlist;

import java.util.HashMap;

public class Diccionario {
    //public HashMap<String, Cancion> diccionario = new HashMap<String, Cancion>();

    public static void llenarDiccionario(HashMap<String, Cancion> diccionario){
        diccionario.put("All Star", new Cancion("All Star", "SmashMouth", 1999, 3.23));
        diccionario.put("Faint", new Cancion("Faint", "Linkin Park", 2003, 2.42));
        diccionario.put("SandStorm", new Cancion("SandStorm", "Darude", 1999, 3.45));
        diccionario.put("500 miles", new Cancion("500 miles", "The Proclaimers", 1961, 3.33));
        diccionario.put("Always", new Cancion("Always", "Bon Jovi", 1994, 4.55));
        diccionario.put("Back In Time", new Cancion("Back In Time", "Huey Lewis & The News", 1985, 4.18));
        diccionario.put("Basket Case", new Cancion("Basket Case", "Green Day", 1994, 3.03));
        diccionario.put("Piano Man", new Cancion("Piano Man", "Billy Joel", 1973, 4.30));
        diccionario.put("Viva La Vida", new Cancion("Viva La Vida", "Coldplay", 2008, 4.01));
        diccionario.put("Coward of the County", new Cancion("Coward of the County", "Kenny Rogers", 1979, 4.20));
        diccionario.put("Here Comes the Sun", new Cancion("Here Comes the Sun", "The Beatles", 1969, 3.06));
        diccionario.put("You Might Think", new Cancion("You Might Think", "The Cars", 1984, 3.04));
        diccionario.put("Far Away", new Cancion("Far Away", "Nickelback", 2006, 3.58));
        diccionario.put("Here I Am", new Cancion("Here I Am", "Bryan Adams", 2002, 4.06));
    }

    public static void agregarDiccionario(String nombre, String autor, int anno, double tiempo, HashMap<String, Cancion> diccionario){
        Cancion c = new Cancion(nombre, autor, anno, tiempo);
        diccionario.put(nombre, c);
    }
}
