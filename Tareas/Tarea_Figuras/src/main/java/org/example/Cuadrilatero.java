package org.example;

import java.util.ArrayList;

public abstract class Cuadrilatero extends Poligono{

    public Cuadrilatero() {
    }

    public Cuadrilatero(ArrayList<Lado> lados) {
        super(lados);
    }

    @Override
    public double calcularArea() {
        return 0;
    }
}
