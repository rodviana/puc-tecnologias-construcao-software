package factory;

import model.Piloto;
import model.Pista;

public  class AbstractFactory {
    private static AbstractFactory abstractFactory;
    private static PistaFactory pistaFactory;
    private static PilotoFactory pilotoFactory;

    public static AbstractFactory get() {
        if (abstractFactory == null)
            abstractFactory = new AbstractFactory();
        return abstractFactory;
    }
}
