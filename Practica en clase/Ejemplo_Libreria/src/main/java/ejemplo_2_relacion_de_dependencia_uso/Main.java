package ejemplo_2_relacion_de_dependencia_uso;

public class Main {
    public static void main(String[] args) {
        Profesor p1 = new Profesor("Ricardo Fort");
        Curso c1 = new Curso("Economía");
        p1.ensenar(c1);
    }
}
