package factories;

import interfaces.FabricaAbstrata;
import models.Produto;
import models.doces.Bolo;
import models.doces.Brigadeiro;
import models.doces.Sorvete;

public class FabricaDeDoce implements FabricaAbstrata {
    @Override
    public Produto crieProduto(String tipo) {
        return switch (tipo) {
            case "Brigadeiro" -> new Brigadeiro();
            case "Bolo" -> new Bolo();
            case "Sorvete" -> new Sorvete();
            default -> null;
        };
    }
}
