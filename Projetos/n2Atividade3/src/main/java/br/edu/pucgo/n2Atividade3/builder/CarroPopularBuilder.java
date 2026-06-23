package br.edu.pucgo.n2Atividade3.builder;

public class CarroPopularBuilder extends CarroBuilder{
    @Override
    public String buildTipo() {
        return "Popular";
    }

    @Override
    public String buildTransmissao() {
        return "Manual";
    }

    @Override
    public String buildBanco() {
        return "Tecido";
    }

    @Override
    public String buildAcessorio() {
        return null;
    }

    @Override
    public String buildSensor() {
        return null;
    }
}
