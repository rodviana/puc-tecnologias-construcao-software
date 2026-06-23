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

    @Override
    public Autobot summonAutobot(String robot) {
        Autobot roboAutobot = null;
        roboAutobot=createAutobot(robot);
        roboAutobot.assembleAutobot();
        return roboAutobot;
    }

    @Override
    public Autobot createAutobot(String robot) 
    {
		if(robot.equals("Optimus")) 
                   return new Leader("Optimus");
		if(robot.equals("Nemesis")) 
                   return new Leader("Nemesis");                
		else return null;
    }
    
}
