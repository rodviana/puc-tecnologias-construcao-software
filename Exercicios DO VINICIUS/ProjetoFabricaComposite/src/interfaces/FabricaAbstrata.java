package interfaces;

import models.Produto;

public interface FabricaAbstrata {
    Produto crieProduto(String tipo);
}
