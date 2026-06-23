package br.edu.puc.trabalhoN1.autobots.model;

public class AutobotCar extends Autobot {
    public AutobotCar(String nome, Integer ataque, Integer vida,Integer defesa, String especialidade) {
        super(nome, EnumTipoAutobot.CARBOTS.toString(), ataque, vida, defesa,especialidade);
    }

}
