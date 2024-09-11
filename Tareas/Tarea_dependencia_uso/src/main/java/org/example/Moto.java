package org.example;

public class Moto extends Vehiculo{
    private boolean tieneSidecar;

    // Constructores
    public Moto(String marca, String modelo) {
        super(marca, modelo);
    }

    public Moto(String marca, String modelo, boolean tieneSidecar) {
        super(marca, modelo);
        this.tieneSidecar = tieneSidecar;
    }

    // Getter y Setter
    public boolean getTieneSidecar() {
        return tieneSidecar;
    }

    public void hacerCaballito() {
        System.out.println("La moto " + getMarca() + " " + getModelo() + " está haciendo un caballito.");
    }
}
