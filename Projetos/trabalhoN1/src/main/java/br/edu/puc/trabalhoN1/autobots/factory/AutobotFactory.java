package br.edu.puc.trabalhoN1.autobots.factory;

import br.edu.puc.trabalhoN1.autobots.model.Autobot;


public interface AutobotFactory {
    public abstract Autobot summonAutobot( String robot);
    public abstract Autobot createAutobot( String robot);

}
