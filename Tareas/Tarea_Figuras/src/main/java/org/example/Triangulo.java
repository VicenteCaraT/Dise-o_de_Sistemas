package org.example;

import java.util.ArrayList;

public class Triangulo extends Poligono {
    private double altura;
    private double base;

    public Triangulo() {
    }

    public Triangulo(ArrayList<Lado> lados, double altura, double base) {
        super(lados);
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double calcularArea() {
        return (this.base * this.altura) / 2;
    }


}
