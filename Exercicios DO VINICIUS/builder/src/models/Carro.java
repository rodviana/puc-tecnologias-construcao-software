package models;

public abstract class Carro {
    protected String tipo;
    protected String transmissao;
    protected String bancos;
    protected String acessorios;
    protected String sensor;

    public Carro() { }

    public Carro(String tipo, String transmissao, String bancos, String acessorios, String sensor) {
        this.tipo = tipo;
        this.transmissao = transmissao;
        this.bancos = bancos;
        this.acessorios = acessorios;
        this.sensor = sensor;
    }

    @Override
    public String toString() {
        return  "Tipo: " + tipo +
                "\nTransmissao: " + transmissao +
                "\nAncos: " + bancos +
                "\nAcessorios: " + acessorios +
                "\nSensor: " + sensor;
    }
}
