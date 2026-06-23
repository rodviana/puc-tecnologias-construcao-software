package br.edu.puc.trabalhoN1.autobots.model;

public class AutobotMedico extends Autobot {
    public AutobotMedico(String nome, Integer ataque, Integer vida,Integer defesa, String especialidade) {
        super(nome, EnumTipoAutobot.MEDICO.toString(), ataque, vida, defesa,especialidade);
    }


}
