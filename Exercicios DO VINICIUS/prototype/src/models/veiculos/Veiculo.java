package models.veiculos;

import models.pneus.Pneu;

import java.util.ArrayList;

public abstract class Veiculo implements Cloneable {
    private ArrayList<Pneu> pneus;
    private int qdeRodas;


    public Veiculo(int qdeRodas) {
        this.qdeRodas = qdeRodas;
        this.pneus = new ArrayList<>();
    }

    public ArrayList<Pneu> getPneus() {
        return pneus;
    }

    public void inserirPneus(Pneu pneu) throws CloneNotSupportedException {
        for(int i =0; i< qdeRodas; i++)
            pneus.add(pneu.clone());
    }

    @Override
    public Veiculo clone() throws CloneNotSupportedException {
        return (Veiculo) super.clone();
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "pneus=" + pneus +
                '}';
    }
}
