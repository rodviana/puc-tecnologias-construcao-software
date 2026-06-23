package factory;

import enums.EnumRegiao;
import enums.EnumSalgado;
import models.Coxinha;
import models.Empada;
import models.Salgado;

public class SalgadosFactory {
    private SalgadoIngredientesFactory ingredientes;
    private Salgado salgado;

    public void assarSalgado(String tipo, String regiao) {
        if (tipo.equals(EnumSalgado.COXINHA.name())) {
            ingredientes = getIngredientesCoxinha(regiao);
            salgado = new Coxinha(ingredientes.criarMassa(),ingredientes.criarMolho(),ingredientes.criarRecheio(), ingredientes);
        } else {
            ingredientes = getIngredientesEmpada(regiao);
            salgado = new Empada(ingredientes.criarMassa(),ingredientes.criarMolho(),ingredientes.criarRecheio(), ingredientes);
        }
    }

    public SalgadoIngredientesFactory getIngredientesCoxinha(String regiao) {
            return regiao.equals(EnumRegiao.CEARA.name()) ? new CearaCoxinhaIngredientesFactory()
                    : new GoiasCoxinhaIngredientesFactory();
    }

    public SalgadoIngredientesFactory getIngredientesEmpada(String regiao) {
        return regiao.equals(EnumRegiao.CEARA) ? new CearaEmpadaIngredientesFactory()
        : new GoiasEmpadaIngredientesFactory();

    }

    public Salgado getSalgadinho(){
        return this.salgado;
    }
}
