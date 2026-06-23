package factory;

import model.Piloto;
import model.Pista;

public class PilotoFactory {
    private static PilotoFactory factory;

    private PilotoFactory() { }

    public Piloto create(String nome, Pista pista) {
        Piloto piloto = new Piloto(nome, pista);
        Pista.increase();
        return piloto;
    }

    public static PilotoFactory get() {
        if (factory == null)
            factory = new PilotoFactory();
        return factory;
    }
}
