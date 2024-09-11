package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Ciudad ciudadArgentina1 = new Ciudad("CABA", Boolean.TRUE);
        Ciudad ciudadArgentina2 = new Ciudad("Posadas", Boolean.TRUE);
        Ciudad ciudadBrasil1 = new Ciudad("Brasilia", Boolean.TRUE);
        Ciudad ciudadBrasil2 = new Ciudad("Curitiba", Boolean.TRUE);

        ArrayList<Ciudad> ciudadesCABA = new ArrayList<>();
        ciudadesCABA.add(ciudadArgentina1);

        ArrayList<String> provinciasLimitrofesCABA = new ArrayList<>();
        provinciasLimitrofesCABA.add("Buenos Aires");

        ArrayList<String> paisesLimitrofesCABA = new ArrayList<>();

        Provincia provinciaArgentina1 = new Provincia("CABA", "Argentina", ciudadArgentina1, ciudadesCABA, provinciasLimitrofesCABA, paisesLimitrofesCABA);

        ArrayList<Ciudad> ciudadesMisiones = new ArrayList<>();
        ciudadesCABA.add(ciudadArgentina2);

        ArrayList<String> provinciasLimitrofesMisiones = new ArrayList<>();
        provinciasLimitrofesMisiones.add("Corrientes");

        ArrayList<String> paisesLimitrofesMisiones = new ArrayList<>();
        paisesLimitrofesMisiones.add("Brasil");

        Provincia provinciaArgentina2 = new Provincia("Misiones", "Argentina", ciudadArgentina2, ciudadesMisiones, provinciasLimitrofesMisiones, paisesLimitrofesMisiones);

        ArrayList<Ciudad> ciudadesDF = new ArrayList<>();
        ciudadesDF.add(ciudadBrasil1);

        ArrayList<String> provinciasLimitrofesDF = new ArrayList<>();
        provinciasLimitrofesDF.add("Goias");
        provinciasLimitrofesDF.add("Minas Gerais");

        ArrayList<String> paisesLimitrofesDF = new ArrayList<>();

        Provincia provinciaBrasil1 = new Provincia("Distrito Federal", "Brasil", ciudadBrasil1, ciudadesDF, provinciasLimitrofesDF, paisesLimitrofesDF);

        ArrayList<Ciudad> ciudadesParana = new ArrayList<>();
        ciudadesParana.add(ciudadBrasil2);

        ArrayList<String> provinciasLimitrofesParana = new ArrayList<>();
        provinciasLimitrofesParana.add("Mato Grosso del Sur");
        provinciasLimitrofesParana.add("Sao Paulo");
        provinciasLimitrofesParana.add("Santa Catarina");

        ArrayList<String> paisesLimitrofesParana = new ArrayList<>();
        paisesLimitrofesParana.add("Paraguay");
        paisesLimitrofesParana.add("Argentina");

        Provincia provinciaBrasil2 = new Provincia("Parana", "Brasil", ciudadBrasil2, ciudadesParana, provinciasLimitrofesParana, paisesLimitrofesParana);

        ArrayList<Provincia> provinciasArgentina = new ArrayList<>();
        provinciasArgentina.add(provinciaArgentina1);
        provinciasArgentina.add(provinciaArgentina2);

        ArrayList<String> paisesLimitrofesArgentina = new ArrayList<>();
        paisesLimitrofesArgentina.add("Chile");
        paisesLimitrofesArgentina.add("Bolivia");
        paisesLimitrofesArgentina.add("Brasil");
        paisesLimitrofesArgentina.add("Paraguay");
        paisesLimitrofesArgentina.add("Uruguay");

        Pais Argentina = new Pais("Argentina", ciudadArgentina1, "America", provinciasArgentina, paisesLimitrofesArgentina);

        ArrayList<Provincia> provinciasBrasil = new ArrayList<>();
        provinciasBrasil.add(provinciaBrasil1);
        provinciasBrasil.add(provinciaBrasil2);

        ArrayList<String> paisesLimitrofesBrasil = new ArrayList<>();
        paisesLimitrofesBrasil.add("Venezuela");
        paisesLimitrofesBrasil.add("Colombia");
        paisesLimitrofesBrasil.add("Guyana");
        paisesLimitrofesBrasil.add("Surinam");
        paisesLimitrofesBrasil.add("Guyana Francesa");
        paisesLimitrofesBrasil.add("Peru");
        paisesLimitrofesBrasil.add("Bolivia");
        paisesLimitrofesBrasil.add("Paraguay");
        paisesLimitrofesBrasil.add("Argentina");
        paisesLimitrofesBrasil.add("Uruguay");

        Pais Brasil = new Pais("Brasil", ciudadBrasil1, "America", provinciasBrasil, paisesLimitrofesBrasil);

        ArrayList<Pais> paisesAmerica = new ArrayList<>();
        paisesAmerica.add(Argentina);
        paisesAmerica.add(Brasil);

        Continente America = new Continente("America", paisesAmerica);

        System.out.println("El continente " + America.getNombre() + " contiene a los paises " + America.getPais(0).getNombre() + " y " + America.getPais(1).getNombre() + ".");
        System.out.println(Argentina.getNombre() + " tiene como capital a " + Argentina.getCapital().getNombre() + ". Contiene a las provincias " + Argentina.getProvincia(0).getNombre() + " y " + Argentina.getProvincia(1).getNombre() + ". Limita con " + Argentina.getPaisLimitrofe(0) + " y " + Argentina.getPaisLimitrofe(1) + ".");
        System.out.println(Brasil.getNombre() + " tiene como capital a " + Brasil.getCapital().getNombre() + ". Contiene a las provincias " + Brasil.getProvincia(0).getNombre() + " y " + Brasil.getProvincia(1).getNombre() + ". Limita con " + Brasil.getPaisLimitrofe(0) + " y " + Brasil.getPaisLimitrofe(1) + ".");
        System.out.println(provinciaArgentina1.getNombre() + " tiene como capital a " + provinciaArgentina1.getCapital().getNombre() + ". Limita con " + provinciaArgentina1.getProvinciaLimitrofe(0) + ".");
        System.out.println(provinciaArgentina2.getNombre() + " tiene como capital a " + provinciaArgentina2.getCapital().getNombre() + ". Limita con " + provinciaArgentina2.getProvinciaLimitrofe(0) + " y " + provinciaArgentina2.getPaisLimitrofe(0) + ".");
        System.out.println(provinciaBrasil1.getNombre() + " tiene como capital a " + provinciaBrasil1.getCapital().getNombre() + ". Limita con " + provinciaBrasil1.getProvinciaLimitrofe(0) + " y " + provinciaBrasil1.getProvinciaLimitrofe(1) + ".");
        System.out.println(provinciaBrasil2.getNombre() + " tiene como capital a " + provinciaBrasil2.getCapital().getNombre() + ". Limita con " + provinciaBrasil2.getProvinciaLimitrofe(0) + ", " + provinciaBrasil2.getProvinciaLimitrofe(1) + ", " + provinciaBrasil2.getPaisLimitrofe(0) + " y " + provinciaBrasil2.getPaisLimitrofe(1) + ".");
    }
}
