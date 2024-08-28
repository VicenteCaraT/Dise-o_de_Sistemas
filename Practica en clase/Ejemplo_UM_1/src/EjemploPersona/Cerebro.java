package EjemploPersona;

public class Cerebro {
    private  String membrana;
    private Integer iq;

    public Cerebro() {
    }

    public Cerebro(String membrana, Integer iq) {
        this.membrana = membrana;
        this.iq = iq;
    }

    public String getMembrana() {
        return membrana;
    }

    public void setMembrana(String membrana) {
        this.membrana = membrana;
    }

    public Integer getIq() {
        return iq;
    }

    public void setIq(Integer iq) {
        this.iq = iq;
    }
}
