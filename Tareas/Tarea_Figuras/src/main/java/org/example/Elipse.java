package org.example;

public abstract class Elipse {
    private double semiejeMayor;
    private double semiejeMenor;

    public Elipse() {
    }


    public Elipse(double semiejeMayor, double semiejeMenor) {
        this.semiejeMayor = semiejeMayor;
        this.semiejeMenor = semiejeMenor;
    }

    public double getSemiejeMayor() {
        return semiejeMayor;
    }

    public void setSemiejeMayor(double semiejeMayor) {
        this.semiejeMayor = semiejeMayor;
    }

    public double getSemiejeMenor() {
        return semiejeMenor;
    }

    public void setSemiejeMenor(double semiejeMenor) {
        this.semiejeMenor = semiejeMenor;
    }

    public abstract double calcularArea();

}
