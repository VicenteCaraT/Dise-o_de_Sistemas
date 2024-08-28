package ejemplo_1;

public class Oso extends Animal{
    private String alimento;

    //Constructores

    public Oso() {
    }

    public Oso(String especie, String categoria, String alimento) {
        super(especie, categoria);
        this.alimento = alimento;
    }

    //Getter y Setter
    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public void comer() {
        System.out.println("Yo como "+ alimento);
    }
}
