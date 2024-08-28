package ejemplo_3_relacion_de_dependencia_creacion;

public class Main {
    public static void main(String[] args) {
        Fabrica f1 = new Fabrica();
        Auto a1 = f1.fabricarAuto();
        System.out.println("El auto fabricado tiene motor ");
    }
}
