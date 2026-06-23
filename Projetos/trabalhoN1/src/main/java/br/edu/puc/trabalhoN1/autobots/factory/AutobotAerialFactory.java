package br.edu.puc.trabalhoN1.autobots.factory;

import br.edu.puc.trabalhoN1.autobots.model.*;

public class AutobotAerialFactory implements AutobotFactory {

    @Override
    public Autobot summonAutobot(String robot) {
        Autobot autobot = this.createAutobot(robot);
        return autobot;
    }

    @Override
    public Autobot createAutobot(String robot) {
        AutobotAerial autobotAerial=null;
        if(robot.equals(EnumNomeTipoAutobot.Sylverbolt.toString()))
            autobotAerial = new AutobotAerial(robot,4,12, 2, EnumEspecialidadeAutobot.valueOf(robot).getValor());
        else if(robot.equals(EnumNomeTipoAutobot.Skydive.toString()))
            autobotAerial = new AutobotAerial(robot,3,8, 2, EnumEspecialidadeAutobot.valueOf(robot).getValor());
        return autobotAerial;
    }
}
