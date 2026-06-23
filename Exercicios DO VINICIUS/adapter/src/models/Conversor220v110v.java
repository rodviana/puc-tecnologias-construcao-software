package models;

public class Conversor220v110v extends Voltagem110 {
    
    public Conversor220v110v(Voltagem220 energia) {
        this.ligacao = energia;
    }

    public String getEnergia220() {
        return ligacao.getEnergia220();
    }

    private Voltagem220 ligacao;
}
