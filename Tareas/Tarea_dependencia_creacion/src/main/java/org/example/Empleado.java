package org.example;

public class Empleado  extends Persona {
    private String puesto;
    private double salario;

    // Constructores
    public Empleado(String nombre, int edad) {
        super(nombre, edad);
    }

    public Empleado(String nombre, int edad, String puesto, double salario) {
        super(nombre, edad);
        this.puesto = puesto;
        this.salario = salario;
    }

    // Getter y Setter
    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void trabajar() {
        System.out.println(getNombre() + " está trabajando como " + puesto + ".");
    }
}
