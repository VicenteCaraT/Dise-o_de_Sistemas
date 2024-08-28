package ejemplo_2_relacion_de_dependencia_uso;

public class Profesor {
    private String nombre;

    //Constructores

    public Profesor() {
    }

    public Profesor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void ensenar(Curso curso){
        System.out.println("El profesor " + this.nombre + " esta enseñando el curso de " + curso.getNombre());
    }
}
