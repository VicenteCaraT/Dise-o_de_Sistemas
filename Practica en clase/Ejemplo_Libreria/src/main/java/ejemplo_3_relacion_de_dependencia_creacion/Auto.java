package ejemplo_3_relacion_de_dependencia_creacion;

public class Auto {
    private Motor motor;

    public Auto(Motor motor) {
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
}
