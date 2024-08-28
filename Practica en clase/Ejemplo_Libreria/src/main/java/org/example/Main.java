package org.example;
public class Main {
    public static void main(String[] args) {
        Libreria libreria = new Libreria("Everland Library");
        Libro libro1 = new Libro("Don Quijote y la Mancha", "Miguel de Cervantes");
        Libro libro2 = new Libro("Harry Potter y El Principe de Azkaban", "JK. Rowling");
        Libro libro3 = new Libro("Cien Años de Soldad" , "Gabriel Garcia Marquez");
        //libreria.setLibros(0, libro1);
        //libreria.setLibros(1, libro2);
        //libreria.setLibros(2, libro3);
        //for (int i = 0; i < 3; i++) {
            //System.out.println(libreria.getLibros(i));
        //}
    }
}