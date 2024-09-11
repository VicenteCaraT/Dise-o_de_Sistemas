package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Lado {
    private Punto[] puntos = new Punto[2];

    public Lado() {
    }

    public Lado(Punto[] puntos) {
        this.puntos = puntos;
    }

    public Punto getPuntos(int i) {
        return puntos[i];
    }

    public void setPuntos(int i, Punto puntos) {
        this.puntos[i] = puntos;
    }
}
