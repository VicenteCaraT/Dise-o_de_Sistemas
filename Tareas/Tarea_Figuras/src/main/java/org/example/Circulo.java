package org.example;

public class Circulo extends Elipse {
    private double radio;

    public Circulo() {
    }

    public Circulo(double semiejeMayor, double semiejeMenor, double radio) {
        super(semiejeMayor, semiejeMenor);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(this.radio, 2);
    }
}
