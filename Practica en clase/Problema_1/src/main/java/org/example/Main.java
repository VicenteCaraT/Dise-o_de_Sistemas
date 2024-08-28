package org.example;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Vicente", 21);
        Domicilio domicilio = new Domicilio("San Martín 777", "Neuquén", persona);
        persona.setDomicilio(domicilio);
        System.out.println(domicilio.toString());
        System.out.println(persona.toString());
    }
}