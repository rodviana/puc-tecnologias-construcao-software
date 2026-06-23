package br.edu.pucgo.n2Atividade1.factory;

public class CearaCoxinhaIngredientesFactory extends SalgadoIngredientesFactory{
    @Override
    public String criarMassa() {
        return "Grossa";
    }

    @Override
    public String criarMolho() {
        return "Pimenta";
    }

    @Override
    public String criarRecheio() {
        return "Carne Seca";
    }
}
