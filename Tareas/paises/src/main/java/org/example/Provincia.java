package org.example;

import java.util.ArrayList;

public class Provincia {
    private String nombre;
    private String pais;
    private Ciudad capital;
    private ArrayList<Ciudad> ciudades = new ArrayList<>();
    private ArrayList<String> provinciasLimitrofes = new ArrayList<>();
    private ArrayList<String> paisesLimitrofes = new ArrayList<>();

    public Provincia() {
    }

    public Provincia(String nombre, String pais, Ciudad capital, ArrayList<Ciudad> ciudades, ArrayList<String> provinciasLimitrofes, ArrayList<String> paisesLimitrofes) {
        this.nombre = nombre;
        this.pais = pais;
        this.capital = capital;
        this.ciudades = ciudades;
        this.provinciasLimitrofes = provinciasLimitrofes;
        this.paisesLimitrofes = paisesLimitrofes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Ciudad getCapital() {
        return capital;
    }

    public void setCapital(Ciudad capital) {
        this.capital = capital;
    }

    public Ciudad getCiudad(int i) {
        return ciudades.get(i);
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudades.add(ciudad);
    }

    public String getProvinciaLimitrofe(int i) {
        return provinciasLimitrofes.get(i);
    }

    public void setProvinciaLimitrofe(String provincia) {
        this.provinciasLimitrofes.add(provincia);
    }

    public String getPaisLimitrofe(int i) {
        return paisesLimitrofes.get(i);
    }

    public void setPaiseLimitrofe(String pais) {
        this.paisesLimitrofes.add(pais);
    }
}
