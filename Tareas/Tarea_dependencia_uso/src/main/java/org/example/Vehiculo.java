package org.example;

public class Vehiculo {
    private String marca;
    private String modelo;

    // Constructores
    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Getter y Setter
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void arrancar() {
        System.out.println("El vehículo " + marca + " " + modelo + " está arrancando.");
    }

    public void detener() {
        System.out.println("El vehículo " + marca + " " + modelo + " se ha detenido.");
    }
}
