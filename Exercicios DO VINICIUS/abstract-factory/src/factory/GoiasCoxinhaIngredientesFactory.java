package factory;

import enums.EnumMassa;
import enums.EnumMolho;
import enums.EnumRecheio;

public class GoiasCoxinhaIngredientesFactory extends SalgadoIngredientesFactory{
    @Override
    public String criarMassa() {
        return EnumMassa.FINA.name();
    }

    @Override
    public String criarMolho() {
        return EnumMolho.PEQUI.name();
    }

    @Override
    public String criarRecheio() {
        return EnumRecheio.FRANGO.name();
    }

}
