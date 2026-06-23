package br.edu.puc.trabalhoN1.autobots.model;

public class AutobotAerial extends Autobot {
    public AutobotAerial(String nome, Integer ataque, Integer vida, Integer defesa,String especialidade) {
        super(nome, EnumTipoAutobot.AERIALBOTS.toString(), ataque, vida,defesa, especialidade);
    }

}
