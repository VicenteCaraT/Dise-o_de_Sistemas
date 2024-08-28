import EjemploPersona.Domicilio;
import EjemploPersona.Persona;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Javier", "mem1", 100);
        System.out.println("Soy:"+ p1.getNombre());
        p1.caminar();
        Domicilio dom = new Domicilio("Urquiza", 717);
        p1.setVive(dom);
        System.out.println("vivo en " + p1.getVive().getCalle() + " "+ p1.getVive().getNumero()+ " con membrana " + p1.getTiene().getMembrana() + " y  tengo un iq de: " + p1.getTiene().getIq());
    }
}