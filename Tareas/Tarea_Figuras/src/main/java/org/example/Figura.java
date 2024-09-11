package org.example;

import java.util.ArrayList;

public class Figura {
    private ArrayList<Poligono> poligonos = new ArrayList<>();
    private ArrayList<Elipse> elipses = new ArrayList<>();

    public Figura() {
    }

    public Figura(ArrayList<Poligono> poligonos, ArrayList<Elipse> elipses) {
        this.poligonos = poligonos;
        this.elipses = elipses;
    }

    public Poligono getPoligonos(int i) {
        return poligonos.get(i);
    }

    public void setPoligonos(int i, Poligono poligonos) {
        this.poligonos.add(poligonos);
    }

    public Elipse getElipsess(int i) {
        return elipses.get(i);
    }

    public void setElipsess(int i, Elipse elipses) {
        this.elipses.add(elipses);
    }
}
