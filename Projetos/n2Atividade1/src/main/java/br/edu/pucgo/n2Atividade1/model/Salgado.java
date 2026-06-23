package br.edu.pucgo.n2Atividade1.model;

import br.edu.pucgo.n2Atividade1.factory.SalgadoIngredientesFactory;
import lombok.Getter;
import lombok.Setter;

public class Salgado {
    private SalgadoIngredientesFactory ingredientes;
    @Getter @Setter
    private String massa;
    @Getter @Setter
    private String molho;
    @Getter @Setter
    private String recheio;

    @Override
    public String toString()
    {
        String retorno =  "Massa: "+ this.getMassa() + "\n" +
                "Molho: "+ this.getMolho() + "\n"+
                "Recheio: "+ this.getRecheio() + "\n";

        return retorno;
    }
}
