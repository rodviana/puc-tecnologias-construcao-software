package br.edu.pucgo.n2Atividade1.factory;

public class CearaEmpadaIngredientesFactory extends SalgadoIngredientesFactory{

    @Override
    public String criarMassa() {
        return "Crepioca";
    }

    @Override
    public String criarMolho() {
        return "Camarao";
    }

    @Override
    public String criarRecheio() {
        return "Peixe";
    }
}
