package br.edu.puc.trabalhoN1.autobots.model;

public enum EnumEspecialidadeAutobot {
    Optimus("estrategista em combates."),
    Ratchet("engenharia cybertroniana."),
    Sylverbolt("emboscadas aéreas."),
    Skydive("táticas aéreas de guerra."),
    Bumblebee ("ataque corpo-a-corpo."),
    Ironhide("armas pesadas.");
    private final String tipo;

    EnumEspecialidadeAutobot(String tipo) {
        this.tipo = tipo;
    }

    public String getValor() {
        return this.tipo;
    }
}
