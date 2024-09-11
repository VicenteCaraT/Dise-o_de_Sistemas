package org.example;

import java.util.ArrayList;

public class Rectangulo extends Cuadrilatero{
    private double base;
    private double altura;

    public Rectangulo(){

    }

    public Rectangulo(ArrayList<Lado> lados, double base, double altura) {
        super(lados);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return this.base * this.altura;
    }
}
