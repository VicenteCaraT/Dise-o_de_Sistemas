package ejemplo_2_relacion_de_dependencia_uso;

public class Curso {
    private String nombre;

    //constructores

    public Curso() {
    }

    public Curso(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
