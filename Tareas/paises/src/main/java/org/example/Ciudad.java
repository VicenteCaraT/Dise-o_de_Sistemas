package org.example;

public class Ciudad {
    private String nombre;
    private Boolean esCapital;

    public Ciudad() {
    }

    public Ciudad(String nombre, Boolean esCapital) {
        this.nombre = nombre;
        this.esCapital = esCapital;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getEsCapital() {
        return esCapital;
    }

    public void setEsCapital(Boolean esCapital) {
        this.esCapital = esCapital;
    }
}
