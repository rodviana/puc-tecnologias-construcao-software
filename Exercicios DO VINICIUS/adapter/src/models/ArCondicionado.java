package models;

public class ArCondicionado {

    public Voltagem110 getLigacao() {
        return ligacao;
    }

    public void setLigacao(Voltagem110 ligacao) {
        this.ligacao = ligacao;
    }

    public boolean testaLigacao(Voltagem110 energia) {
        return energia
                .getEnergia110()
                .equals(ligacao.getEnergia110());
    }

    private Voltagem110 ligacao = new Voltagem110();
}
