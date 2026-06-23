package br.edu.puc.trabalhoN1.autobots.model;

public class AutobotLider extends Autobot {


    public AutobotLider(String nome,  Integer ataque, Integer vida, Integer defesa ,String especialidade) {
        super(nome, EnumTipoAutobot.LIDER.toString(), ataque, vida, defesa,especialidade);
    }

}
