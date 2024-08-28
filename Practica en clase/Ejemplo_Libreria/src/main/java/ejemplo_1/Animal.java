package ejemplo_1;

public abstract class Animal {
    private String especie;
    private String categoria;

    //Constructores
    public Animal() {
    }

    public Animal(String especie, String categoria) {
        this.especie = especie;
        this.categoria = categoria;
    }

    //Getter y Setter
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public abstract void  comer();
}
