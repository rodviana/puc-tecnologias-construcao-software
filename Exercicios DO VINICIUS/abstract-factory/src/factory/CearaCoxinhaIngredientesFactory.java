package factory;

import enums.EnumMassa;
import enums.EnumMolho;
import enums.EnumRecheio;

public class CearaCoxinhaIngredientesFactory extends SalgadoIngredientesFactory{
    @Override
    public String criarMassa() {
        return EnumMassa.GROSSA.name();
    }

    @Override
    public String criarMolho() {
        return EnumMolho.PIMENTA.name();
    }

    @Override
    public String criarRecheio() {
        return EnumRecheio.CARNE_SECA.name();
    }
}
