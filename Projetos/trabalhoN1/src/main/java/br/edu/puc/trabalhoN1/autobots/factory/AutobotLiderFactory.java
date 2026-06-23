package br.edu.puc.trabalhoN1.autobots.factory;

import br.edu.puc.trabalhoN1.autobots.model.Autobot;
import br.edu.puc.trabalhoN1.autobots.model.AutobotLider;
import br.edu.puc.trabalhoN1.autobots.model.EnumEspecialidadeAutobot;
import br.edu.puc.trabalhoN1.autobots.model.EnumNomeTipoAutobot;
public class AutobotLiderFactory implements AutobotFactory{

    @Override
    public Autobot summonAutobot(String robot) {
        Autobot autobot = this.createAutobot(robot);
        return autobot;
    }

    @Override
    public Autobot createAutobot( String robot) {
        AutobotLider autobotLider=null;
        if(robot.equals(EnumNomeTipoAutobot.Optimus.toString()))
            autobotLider = new AutobotLider(robot, 3,10, 2, EnumEspecialidadeAutobot.valueOf(robot).getValor());
        return autobotLider;
    }


}
