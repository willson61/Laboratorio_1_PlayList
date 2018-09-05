package com.example.sthephan.laboratorio_1_playlist;


public class Cancion {
    public String nombre;
    public String autor;
    public int anno;
    public double tiempo;

    public Cancion(String nombre, String autor, int anno, double tiempo) {
        this.nombre = nombre;
        this.autor = autor;
        this.anno = anno;
        this.tiempo = tiempo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }
}
