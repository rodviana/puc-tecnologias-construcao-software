package br.edu.pucgo.n2Atividade3.builder;

public class CarroEsportivoBuilder extends CarroBuilder{
    @Override
    public String buildTipo() {
        return "Esportivo";
    }

    @Override
    public String buildTransmissao() {
        return "Paddle Shift";
    }

    @Override
    public String buildBanco() {
        return "Couro";
    }

    @Override
    public String buildAcessorio() {
        return "Aerofólio";
    }

    @Override
    public String buildSensor() {
        return null;
    }
}
