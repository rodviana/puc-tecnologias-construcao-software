package br.edu.puc.trabalhoN1.autobots.factory;

import br.edu.puc.trabalhoN1.autobots.model.*;

public class AutobotCarFactory implements AutobotFactory{

    @Override
    public Autobot summonAutobot(String robot) {
        Autobot autobot = this.createAutobot(robot);
        return autobot;
    }

    @Override
    public Autobot createAutobot( String robot) {
        AutobotCar autobotCar=null;
        if(robot.equals(EnumNomeTipoAutobot.Bumblebee.toString()))
            autobotCar = new AutobotCar(robot, 4,9, 2,EnumEspecialidadeAutobot.valueOf(robot).getValor());
        else if(robot.equals(EnumNomeTipoAutobot.Ironhide.toString()))
            autobotCar = new AutobotCar(robot,5,12, 2, EnumEspecialidadeAutobot.valueOf(robot).getValor());
        return autobotCar;
    }
}
