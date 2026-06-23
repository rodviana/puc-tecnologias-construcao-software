package factory;

import enums.EnumMassa;
import enums.EnumMolho;
import enums.EnumRecheio;

public class GoiasEmpadaIngredientesFactory extends SalgadoIngredientesFactory{
    @Override
    public String criarMassa() {
        return EnumMassa.PODRE.name();
    }

    @Override
    public String criarMolho() {
        return EnumMolho.TOMATE.name();
    }

    @Override
    public String criarRecheio() {
        return EnumRecheio.CALABRESA.name();
    }
}
