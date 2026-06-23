package models.veiculos;

import models.pneus.Pneu;

public class Carro extends Veiculo {
    private static int qdeRodas = 4;

    public Carro() {
        super(qdeRodas);
    }

}
