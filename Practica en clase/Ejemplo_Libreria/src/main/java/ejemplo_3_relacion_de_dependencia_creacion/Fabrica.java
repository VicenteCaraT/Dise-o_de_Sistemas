package ejemplo_3_relacion_de_dependencia_creacion;

public class Fabrica {

    public Fabrica() {
    }

    public Auto fabricarAuto(Motor motor){
        Auto a = new Auto(motor);
        System.out.println("Se fabrico el auto con motor "+ motor.getTipo());
        return a;
    }
}
