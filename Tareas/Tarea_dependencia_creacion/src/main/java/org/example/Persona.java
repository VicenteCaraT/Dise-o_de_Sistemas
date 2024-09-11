package org.example;

public class Persona {
    private String nombre;
    private int edad;

    // Constructores
    public Persona() {
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}
