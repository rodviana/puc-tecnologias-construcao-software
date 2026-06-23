package br.edu.puc.trabalhoN1.autobots.model;

public enum EnumTipoAutobot {
    LIDER("LIDER"),
    MEDICO("MEDICO"),
    AERIALBOTS("AERIALBOTS"),
    CARBOTS("CARBOTS");
    private final String tipo;

    EnumTipoAutobot(String tipo) {
        this.tipo = tipo;
    }

    public String getValor() {
        return this.tipo;
    }
}
