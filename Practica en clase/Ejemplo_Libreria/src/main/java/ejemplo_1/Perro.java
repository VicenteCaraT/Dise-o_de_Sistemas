package ejemplo_1;

public class Perro extends Animal{
    private  String raza;

    //Constructores
    public Perro() {
    }

    public Perro(String especie, String categoria, String raza) {
        super(especie, categoria);
        this.raza = raza;
    }

    //Getter y Setter
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }


    @Override
    public void comer() {
        System.out.println("Yo como alimento de perro, porque soy un perro");
    }
}
