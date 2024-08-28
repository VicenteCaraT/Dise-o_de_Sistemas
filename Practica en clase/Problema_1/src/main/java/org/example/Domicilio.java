package org.example;

public class Domicilio {
    private String calle;
    private String ciudad;
    private Persona persona;

    //Constructores
    public Domicilio() {
    }

    public Domicilio(String calle, String ciudad) {
        this.calle = calle;
        this.ciudad = ciudad;
    }

    public Domicilio(String calle, String ciudad, Persona persona) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.persona = persona;
    }

    //Getters y Setters
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Domicilio[calle=" + calle + ", ciudad=" + ciudad + ", persona=" + persona +"]";
    }
}
