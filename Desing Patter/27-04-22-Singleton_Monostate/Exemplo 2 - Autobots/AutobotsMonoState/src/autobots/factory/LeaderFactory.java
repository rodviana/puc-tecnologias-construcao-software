/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autobots.factory;

import autobots.model.Autobot;
import autobots.model.Leader;

/**
 *
 * @author japa
 */
public class LeaderFactory implements AutobotFactory{
    
    private Autobot roboAutobot;
    private static final int QUANTIDADE=2;
    private static int lideres=QUANTIDADE; 
    public LeaderFactory(String robot) {
        if (lideres!=0)
        {
         roboAutobot = null;
         roboAutobot=createAutobot(robot);
         roboAutobot.assembleAutobot();
         roboAutobot.printCardAutobot();
        }
    }

    @Override
    public Autobot createAutobot(String robot) 
    {
        if (lideres!=0)
        {
                lideres--;
		if(robot.equals("Optimus")) 
                   return new Leader("Optimus");
		if(robot.equals("Nemesis")) 
                   return new Leader("Nemesis");                
		else return null;
        }
        return null;
    }
    
}
