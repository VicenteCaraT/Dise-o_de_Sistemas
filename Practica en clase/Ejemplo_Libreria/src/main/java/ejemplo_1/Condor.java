package ejemplo_1;

public class Condor extends Animal implements Ave{

    public Condor() {
    }

    public Condor(String especie, String categoria) {
        super(especie, categoria);
    }

    @Override
    public void comer() {
        System.out.println("Soy un condor y como carronia");
    }

    @Override
    public void volar() {
        System.out.println("Soy un condor y vuelo en los andes");
    }
}
