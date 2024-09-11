package org.example;

public class Main {
    public static void main(String[] args) {
        // Crear instancia de Empresa
        Empresa empresa = new Empresa("Tech Solutions");

        // Empresa crea (contrata) empleados
        Empleado empleado1 = empresa.contratarEmpleado("Laura", 28, "Desarrolladora de Software", 50000);
        Empleado empleado2 = empresa.contratarEmpleado("Pedro", 35, "Analista de Datos", 55000);

        // Empleados realizan su trabajo
        empleado1.trabajar();
        empleado2.trabajar();
    }
}