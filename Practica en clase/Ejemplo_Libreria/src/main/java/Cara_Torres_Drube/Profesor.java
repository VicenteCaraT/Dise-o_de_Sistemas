package Cara_Torres_Drube;

import java.util.ArrayList;

public class Profesor extends Persona{
    private int sueldo;
    private ArrayList<String> materias_dadas =new ArrayList<>();
    private int codigo_empleado;

    //Constructores
    public Profesor() {
    }

    public Profesor(String nombre, String apellido, int edad, int sueldo, int codigo_empleado) {
        super(nombre, apellido, edad);
        this.sueldo = sueldo;
        this.codigo_empleado = codigo_empleado;
    }

    //Getter y Setter

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getMaterias_dadas(int i) {
        return materias_dadas.get(i);
    }

    public void setMaterias_dadas(String materia) {
        this.materias_dadas.add(materia);
    }

    public int getCodigo_empleado() {
        return codigo_empleado;
    }

    public void setCodigo_empleado(int codigo_empleado) {
        this.codigo_empleado = codigo_empleado;
    }
    @Override
    public String identificarse() {
        return "Mi codigo de empleado es: " + this.codigo_empleado;
    }

    public String toString(){
        return "Profesor: [nombre:"+ this.getNombre() + " ,apellido:" + this.getApellido() + " ,edad:" + this.getEdad() +" ,sueldo:" + this.sueldo +  " ,codigo empleado:" + this.codigo_empleado + " ,materias_dadas:" + this.materias_dadas + "]";
    }
}


