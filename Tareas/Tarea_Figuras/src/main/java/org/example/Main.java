package org.example;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /*Cuadrados*/
        Punto p1 = new Punto(0, 0);
        Punto p2 = new Punto(0, 4);
        Punto p3 = new Punto(4,4);
        Punto p4 = new Punto(4, 0);

        Lado lado1 = new Lado();
        lado1.setPuntos(0, p1);
        lado1.setPuntos(1, p2);

        Lado lado2 = new Lado();
        lado2.setPuntos(0, p2);
        lado2.setPuntos(1, p3);

        Lado lado3 = new Lado();
        lado3.setPuntos(0, p3);
        lado3.setPuntos(1, p4);

        Lado lado4 = new Lado();
        lado4.setPuntos(0, p4);
        lado4.setPuntos(1, p1);

        ArrayList<Lado> ladosCuadrado = new ArrayList<>();
        ladosCuadrado.add(lado1);
        ladosCuadrado.add(lado2);
        ladosCuadrado.add(lado3);
        ladosCuadrado.add(lado4);

        Cuadrado cuadrado = new Cuadrado(ladosCuadrado, 4, 4);

        Punto p5 = new Punto(0, 0);
        Punto p6 = new Punto(0, 4);
        Punto p7 = new Punto(4,4);

        /*Triangulo*/
        Lado lado5 = new Lado();
        lado1.setPuntos(0, p5);
        lado1.setPuntos(1, p6);

        Lado lado6 = new Lado();
        lado2.setPuntos(0, p6);
        lado2.setPuntos(1, p7);

        Lado lado7 = new Lado();
        lado3.setPuntos(0, p7);
        lado3.setPuntos(1, p5);

        ArrayList<Lado> ladosTriangulo = new ArrayList<>();
        ladosTriangulo.add(lado5);
        ladosTriangulo.add(lado6);
        ladosTriangulo.add(lado7);

        Triangulo triangulo = new Triangulo(ladosTriangulo, 4, 4);

        /*Resctangulos*/
        Punto p8 = new Punto(0, 0);
        Punto p9 = new Punto(0, 4);
        Punto p10 = new Punto(8,4);
        Punto p11 = new Punto(0, 8);

        Lado lado8 = new Lado();
        lado1.setPuntos(0, p8);
        lado1.setPuntos(1, p9);

        Lado lado9 = new Lado();
        lado2.setPuntos(0, p9);
        lado2.setPuntos(1, p10);

        Lado lado10 = new Lado();
        lado3.setPuntos(0, p10);
        lado3.setPuntos(1, p11);

        Lado lado11 = new Lado();
        lado4.setPuntos(0, p11);
        lado4.setPuntos(1, p8);

        ArrayList<Lado> ladosRecangulo = new ArrayList<>();
        ladosRecangulo.add(lado8);
        ladosRecangulo.add(lado9);
        ladosRecangulo.add(lado10);
        ladosRecangulo.add(lado11);

        Rectangulo rectangulo = new Rectangulo(ladosRecangulo, 8, 4);


        ArrayList<Poligono> poligonos= new ArrayList<>();
        poligonos.add(cuadrado);
        poligonos.add(triangulo);
        poligonos.add(rectangulo);


        /*Elipses*/
        Circulo circulo = new Circulo(5,5,5);
        Circulo circulo2 = new Circulo(7,7,7);

        ArrayList<Elipse> elipses = new ArrayList<>();
        elipses.add(circulo);
        elipses.add(circulo2);

        Figura figura = new Figura(poligonos, elipses);

        System.out.println("Figura creada con " + poligonos.size() + " poligonos y " + elipses.size() + " elipses.");
        System.out.println("Area del circulo1: " + figura.getElipsess(0).calcularArea() + " ,area del circulo2: " + figura.getElipsess(1).calcularArea() + " ,area del cuadrado: " + figura.getPoligonos(0).calcularArea() + " ,area del triangulo: " + figura.getPoligonos(1).calcularArea() + " , area del rectangulo: " + figura.getPoligonos(2).calcularArea()) ;
    }
}