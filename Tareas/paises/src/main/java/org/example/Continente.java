package org.example;

import java.util.ArrayList;

public class Continente {
    private String nombre;
    private ArrayList<Pais> paises = new ArrayList<>();

    public Continente() {
    }

    public Continente(String nombre, ArrayList<Pais> paises) {
        this.nombre = nombre;
        this.paises = paises;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais(int i) {
        return paises.get(i);
    }

    public void setPais(Pais pais) {
        paises.add(pais);
    }
}
