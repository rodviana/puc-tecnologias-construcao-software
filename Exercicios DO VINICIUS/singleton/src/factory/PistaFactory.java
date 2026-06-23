package factory;

import model.Pista;

public class PistaFactory {
    private static PistaFactory factory;

    private PistaFactory() {
    }

    public Pista create(String nome) {
        Pista pista = Pista.get();
        pista.setNome(nome);
        return pista;
    }

    public static PistaFactory get() {
        if (factory == null)
            factory = new PistaFactory();
        return factory;
    }
}
