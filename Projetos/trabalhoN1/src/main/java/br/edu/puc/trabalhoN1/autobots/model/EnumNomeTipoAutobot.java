package br.edu.puc.trabalhoN1.autobots.model;

public enum EnumNomeTipoAutobot {
    Optimus(EnumTipoAutobot.LIDER.toString()),
    Ratchet(EnumTipoAutobot.MEDICO.toString()),
    Sylverbolt(EnumTipoAutobot.AERIALBOTS.toString()),
    Skydive(EnumTipoAutobot.AERIALBOTS.toString()),
    Bumblebee (EnumTipoAutobot.CARBOTS.toString()),
    Ironhide(EnumTipoAutobot.CARBOTS.toString());
    private final String tipo;

    EnumNomeTipoAutobot(String tipo) {
        this.tipo = tipo;
    }

    public String getValor() {
        return this.tipo;
    }
}
