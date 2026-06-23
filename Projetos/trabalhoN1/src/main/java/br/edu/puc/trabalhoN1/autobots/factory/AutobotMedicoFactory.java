package br.edu.puc.trabalhoN1.autobots.factory;
import br.edu.puc.trabalhoN1.autobots.model.*;

public class AutobotMedicoFactory implements AutobotFactory{

    @Override
    public Autobot summonAutobot(String robot) {
        Autobot autobot = this.createAutobot(robot);
        return autobot;
    }

    @Override
    public Autobot createAutobot(String robot) {
        AutobotMedico autoboMedico=null;
        if(robot.equals(EnumNomeTipoAutobot.Ratchet.toString()))
            autoboMedico = new AutobotMedico(robot,3,14,0, EnumEspecialidadeAutobot.valueOf(robot).getValor());
        return autoboMedico;
    }
}
