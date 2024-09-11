package org.example;

import java.util.ArrayList;

public abstract class Poligono {
    public ArrayList<Lado> lados = new ArrayList<Lado>(3);

    public Poligono() {
    }

    public Poligono(ArrayList<Lado> lados) {
        this.lados = lados;
    }

    public Lado getLados(int i) {
        return lados.get(i);
    }

    public void setLados(int i, Lado lados) {
        this.lados.add(lados);
    }

    public abstract double calcularArea();


}
