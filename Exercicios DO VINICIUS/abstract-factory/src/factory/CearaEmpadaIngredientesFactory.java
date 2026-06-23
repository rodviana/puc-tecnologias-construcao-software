package factory;

import enums.EnumMassa;
import enums.EnumMolho;
import enums.EnumRecheio;

public class CearaEmpadaIngredientesFactory extends SalgadoIngredientesFactory{
    @Override
    public String criarMassa() {
        return EnumMassa.CREPIOCA.name();
    }

    @Override
    public String criarMolho() {
        return EnumMolho.CAMARAO.name();
    }
    @Override
    public String criarRecheio() {
        return EnumRecheio.PEIXE.name();
    }
}
