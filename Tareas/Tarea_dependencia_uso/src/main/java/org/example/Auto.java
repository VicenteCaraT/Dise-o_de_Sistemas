package org.example;

public class Auto extends Vehiculo {
    private int numeroPuertas;

    // Constructores
    public Auto() {
    }

    public Auto(String marca, String modelo) {
        super(marca, modelo);
    }

    public Auto(String marca, String modelo, int numeroPuertas) {
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    // Getter y Setters

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void abrirMaletero() {
        System.out.println("El maletero del auto " + getMarca() + " " + getModelo() + " se ha abierto.");
    }
}
