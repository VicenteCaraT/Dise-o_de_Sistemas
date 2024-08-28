package EjemploPersona;

public class Persona {
    private String nombre;

    private Domicilio vive;

    private  Domicilio recide;

    private  Cerebro tiene;

    public Persona(String nombre, String membrana, Integer iq) {
        this.nombre = nombre;
        this.tiene = new Cerebro(membrana, iq);
    }

    public String getNombre() {
        return nombre;
    }

    public Domicilio getVive() {
        return vive;
    }

    public void setVive(Domicilio vive) {
        this.vive = vive;
    }

    public Domicilio getRecide() {
        return recide;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cerebro getTiene() {
        return tiene;
    }

    public void setTiene(Cerebro tiene) {
        this.tiene = tiene;
    }

    public void agregarDomicilio(Domicilio d) {
        this.recide = d;
    }

    public void caminar() {
        System.out.println("estoy caminando...");
    }

}


