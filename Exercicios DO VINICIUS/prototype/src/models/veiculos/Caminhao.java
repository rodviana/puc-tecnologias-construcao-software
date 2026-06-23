package models.veiculos;

import models.pneus.Pneu;

public class Caminhao extends Veiculo {
    private static int qdeRodas = 5;

    public Caminhao() {
        super(qdeRodas);
    }
}
