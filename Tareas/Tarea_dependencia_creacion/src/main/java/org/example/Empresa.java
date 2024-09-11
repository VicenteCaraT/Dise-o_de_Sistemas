package org.example;

public class Empresa {
    private String nombreEmpresa;

    // Constructores
    public Empresa() {
    }

    public Empresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public Empleado contratarEmpleado(String nombre, int edad, String puesto, double salario) {
        System.out.println("Contratando a " + nombre + " como " + puesto + " en " + nombreEmpresa + ".");
        return new Empleado(nombre, edad, puesto, salario);
    }
}
