package org.example;

public class Mecanico {
    private String nombre;

    // Constructores
    public Mecanico() {
    }

    public Mecanico(String nombre) {
        this.nombre = nombre;
    }

    public void repararVehiculo(Vehiculo vehiculo) {
        System.out.println("El mecánico " + nombre + " está reparando el vehículo " + vehiculo.getMarca() + " " + vehiculo.getModelo() + ".");
        vehiculo.arrancar();
        vehiculo.detener();
    }
}
