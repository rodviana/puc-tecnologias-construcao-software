package factories;

import interfaces.FabricaAbstrata;
import models.Produto;
import models.salgados.Coxinha;
import models.salgados.Esfirra;
import models.salgados.Quibe;

public class FabricaDeSalgado  implements FabricaAbstrata  {

    @Override
    public Produto crieProduto(String tipo) {
        return switch (tipo) {
            case "Coxinha" -> new Coxinha();
            case "Quibe" -> new Quibe();
            case "Esfirra" -> new Esfirra();
            default -> null;
        };
    }
}
