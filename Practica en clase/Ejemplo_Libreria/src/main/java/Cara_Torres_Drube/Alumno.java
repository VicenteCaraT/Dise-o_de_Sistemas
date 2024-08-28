package Cara_Torres_Drube;

import java.util.ArrayList;

public class Alumno extends Persona {
    private int legajo;
    private ArrayList<String> materias_cursadas = new ArrayList<>();

    //Constructores
    public Alumno() {
    }

    public Alumno(String nombre, String apellido, int edad, int legajo) {
        super(nombre, apellido, edad);
        this.legajo = legajo;
    }

    //Getter y Setter

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getMaterias_cursadas(int i) {
        return materias_cursadas.get(i);
    }

    public void setMaterias_cursadas(String materia) {
        this.materias_cursadas.add(materia);
    }

    @Override
    public String identificarse() {
        return "Soy el alumno de legajo: " + this.legajo;
    }

    @Override
    public String toString() {
        return "Alumno: [nombre:"+ this.getNombre() + " ,apellido:" + this.getApellido() + " ,edad:" + this.getEdad() + " ,legajo:" + this.legajo + " ,materias_cursadas:" + this.materias_cursadas + "]";
    }
}
