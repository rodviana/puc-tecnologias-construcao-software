package model;

import factory.PistaFactory;

public class Piloto {
    private String nome;
    private Pista pistaCorrida;

    public Piloto() { }

    public Piloto(String nome, Pista pista) {
        this.nome = nome;
        pistaCorrida = pista;
    }

    @Override
    public String toString() {
        return "Nome: "                       + nome                     +
               "\nNome da Pista = "           + pistaCorrida.getNome()   +
               "\nID Pista: "                 + pistaCorrida.hashCode()  +
               "\nQuantidade de Corredores: " + Pista.getQdePilotos();
    }
}
