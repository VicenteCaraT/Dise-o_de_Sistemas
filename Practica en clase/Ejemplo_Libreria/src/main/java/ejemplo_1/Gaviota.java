package ejemplo_1;

public class Gaviota extends Animal implements Ave{

    public Gaviota() {
    }

    public Gaviota(String especie, String categoria) {
        super(especie, categoria);
    }

    @Override
    public void comer() {
        System.out.println("Suy una Gaviota y como peces");
    }

    @Override
    public void volar() {
        System.out.println("Soy una gaviota vuelo a las orillas del mar");
    }
}
