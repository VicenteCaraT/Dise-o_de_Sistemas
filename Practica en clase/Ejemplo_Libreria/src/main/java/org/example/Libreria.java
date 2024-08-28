package org.example;

import java.util.ArrayList;

public class Libreria {
    private String nombre;
    //public  Libro[] libros = new Libro[3];
    private ArrayList<Libro> libros= new ArrayList<>();

    public Libreria() {
    }

    public Libreria(String nombre) {
        this.nombre = nombre;
    }

    //public Libreria(String nombre, Libro[] libros) {
        //this.nombre = nombre;
        //this.libros = libros;
    //}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //public Libro getLibros(int i) {
        //return libros[i];
    //}

    //public void setLibros(int i, Libro libro) {
        //this.libros[i] = libro;
    //}



    @Override
    public String toString() {
        return "Librería [nombre: " + nombre + "]";
    }
}
