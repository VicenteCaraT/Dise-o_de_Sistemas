package org.example;

import java.util.ArrayList;

public class Pais {
    private String nombre;
    private Ciudad capital;
    private String continente;
    private ArrayList<Provincia> provincias = new ArrayList<>();
    private ArrayList<String> paisesLimitrofes = new ArrayList<>();

    public Pais() {
    }

    public Pais(String nombre, Ciudad capital, String continente, ArrayList<Provincia> provincias, ArrayList<String> paisesLimitrofes) {
        this.nombre = nombre;
        this.capital = capital;
        this.continente = continente;
        this.provincias = provincias;
        this.paisesLimitrofes = paisesLimitrofes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ciudad getCapital() {
        return capital;
    }

    public void setCapital(Ciudad capital) {
        this.capital = capital;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public Provincia getProvincia(int i) {
        return provincias.get(i);
    }

    public void setProvincia(Provincia provincia) {
        this.provincias.add(provincia);
    }

    public String getPaisLimitrofe(int i) {
        return paisesLimitrofes.get(i);
    }

    public void setPaisLimitrofe(String paisLimitrofe) {
        this.paisesLimitrofes.add(paisLimitrofe);
    }
}
