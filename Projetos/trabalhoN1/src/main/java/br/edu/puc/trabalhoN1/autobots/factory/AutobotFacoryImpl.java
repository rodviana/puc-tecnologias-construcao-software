package br.edu.puc.trabalhoN1.autobots.factory;

import br.edu.puc.trabalhoN1.autobots.model.*;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class AutobotFacoryImpl implements AutobotFactory{
    AutobotLiderFactory autobotLiderFactory = new AutobotLiderFactory();
    AutobotMedicoFactory autobotMedicoFactory = new AutobotMedicoFactory();
    AutobotAerialFactory autobotAerialFactory = new AutobotAerialFactory();
    AutobotCarFactory autobotCarFactory = new AutobotCarFactory();

    /*Utilizei o método assembleAutobot() da classe autobot de forma global para as factorys nessa calsse de implementação*/
    @Override
    public Autobot summonAutobot(String robot) {
        Autobot autobot = this.createAutobot(robot);
        autobot.assembleAutobot();
        return autobot;
    }

    @Override
    public Autobot createAutobot(String robot) {
        Autobot novoAutobot = null;
        try
        {
            String tipo = EnumNomeTipoAutobot.valueOf(robot).getValor();

            if(tipo==null || tipo.isEmpty())
                return null;

            if(tipo.equals(EnumTipoAutobot.LIDER.toString()))
                novoAutobot= autobotLiderFactory.summonAutobot(robot);
            else if (tipo.equals(EnumTipoAutobot.MEDICO.toString()))
                novoAutobot=autobotMedicoFactory.summonAutobot(robot);
            else if (tipo.equals(EnumTipoAutobot.AERIALBOTS.toString()))
                novoAutobot= autobotAerialFactory.summonAutobot(robot);
            else if (tipo.equals(EnumTipoAutobot.CARBOTS.toString()))
                novoAutobot=autobotCarFactory.summonAutobot(robot);
            else
                throw new ClassNotFoundException();

        }catch (ClassNotFoundException e)
        {
            System.out.println("Não foi encontrado o tipo do robot: "+ robot);
            novoAutobot=null;
        }
        catch (Exception e)
        {
            System.out.println("Ocorreu um erro ao criar o robot: "+robot);
            novoAutobot=null;
        }
        return novoAutobot;
    }
}
