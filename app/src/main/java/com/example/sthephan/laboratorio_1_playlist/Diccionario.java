package com.example.sthephan.laboratorio_1_playlist;

import java.util.HashMap;

public class Diccionario {
    public HashMap<String, Cancion> diccionario = new HashMap<String, Cancion>();

    public void llenarDiccionario(){
        Cancion c1 = new Cancion();
        c1.setNombre("AllStar");
        c1.setAutor("SmashMouth");
        c1.setTiempo(2);
        c1.setAnno(2000);
        Cancion c2 = new Cancion();
        c2.setNombre("Faint");
        c2.setAutor("Linkin Park");
        c2.setTiempo(3);
        c2.setAnno(2000);
        Cancion c3 = new Cancion();
        c3.setNombre("Darude");
        c3.setAutor("SandStorm");
        c3.setTiempo(2);
        c3.setAnno(1999);
        diccionario.put("AllStar", c1);
        diccionario.put("Faint", c2);
        diccionario.put("Darude", c3);

    }

    public void agregarDiccionario(String nombre, String autor, int anno, int tiempo){
        Cancion c = new Cancion();
        c.setNombre(nombre);
        c.setAutor(autor);
        c.setTiempo(tiempo);
        c.setAnno(anno);

        diccionario.put(nombre, c);
    }
}
