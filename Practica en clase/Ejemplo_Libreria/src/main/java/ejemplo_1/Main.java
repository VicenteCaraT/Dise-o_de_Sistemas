package ejemplo_1;

public class Main {
    public static void main(String[] args) {
        Animal a = new Perro();
        Perro p = new Perro("perro", "mamifero", "yorkshire");
        Oso o = new Oso("oso", "mamifero", "peces");
        Gaviota g = new Gaviota("Gaviota", "Oviparo");
        Condor c = new Condor("Condor", "Oviparo");

        System.out.println("Soy una " + g.getEspecie() + " ,soy " + g.getCategoria());
        g.volar();
        c.comer();

        System.out.println("Soy un " + c.getEspecie()+ " ,soy " + c.getCategoria());
        c.volar();
        c.comer();

        System.out.println("Soy un "+ o.getEspecie() + ", soy un " + o.getCategoria() + " y como " + o.getAlimento());
        o.comer();
        System.out.println("Soy un " + p.getEspecie() + ", soy un " + p.getCategoria() + " y soy un " + p.getRaza());
        p.comer();
    }
}
