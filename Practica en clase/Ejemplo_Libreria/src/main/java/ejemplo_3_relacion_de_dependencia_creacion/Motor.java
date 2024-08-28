package ejemplo_3_relacion_de_dependencia_creacion;

public class Motor {
    private String tipo;

    public Motor() {
    }

    public Motor(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
