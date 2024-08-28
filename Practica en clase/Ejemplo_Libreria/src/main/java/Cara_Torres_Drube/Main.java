package Cara_Torres_Drube;

public class Main {
    public static void main(String[] args) {
        Alumno a1 = new Alumno("Vicente", "Cara", 21, 69089);
        a1.setMaterias_cursadas("Fisica I");
        a1.setMaterias_cursadas("Sistemas Operativos");
        Profesor p1 = new Profesor("Daniel", "Lillo", 30, 25000, 42312);
        p1.setMaterias_dadas("Analisis de Sistemas I");
        p1.setMaterias_dadas("Analisis de Sistemas II");
        p1.setMaterias_dadas("Redes de Datos");
        System.out.println(a1);
        System.out.println(a1.identificarse());
        System.out.println(p1);
        System.out.println(p1.identificarse());
    }
}
