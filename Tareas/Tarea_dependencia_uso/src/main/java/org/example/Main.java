package org.example;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de vehículos
        Auto auto = new Auto("Toyota", "Corolla", 4);
        Moto moto = new Moto("Harley-Davidson", "Street 750", false);

        // Crear instancia de mecánico
        Mecanico mecanico = new Mecanico("Juan");

        // Reparar vehículos
        mecanico.repararVehiculo(auto);
        mecanico.repararVehiculo(moto);

        // Uso de métodos específicos
        auto.abrirMaletero();
        moto.hacerCaballito();
    }
}