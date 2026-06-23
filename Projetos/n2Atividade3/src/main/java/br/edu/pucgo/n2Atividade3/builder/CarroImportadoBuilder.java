package br.edu.pucgo.n2Atividade3.builder;

public class CarroImportadoBuilder extends CarroBuilder{
    @Override
    public String buildTipo() {
        return "Importado";
    }

    @Override
    public String buildTransmissao() {
        return "Automática";
    }

    @Override
    public String buildBanco() {
        return "Couro";
    }

    @Override
    public String buildAcessorio() {
        return "Insulfilm e Friso Lateral";
    }

    @Override
    public String buildSensor() {
        return "Estacionamento";
    }
}
