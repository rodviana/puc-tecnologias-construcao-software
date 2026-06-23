package br.edu.pucgo.n2Atividade1.factory;

public class GoiasEmpadaIngredientesFactory extends SalgadoIngredientesFactory{
    @Override
    public String criarMassa() {
        return "Podre";
    }

    @Override
    public String criarMolho() {
        return "Tomate";
    }

    @Override
    public String criarRecheio() {
        return "Calabresa";
    }
}
