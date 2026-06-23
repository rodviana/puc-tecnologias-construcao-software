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
public class LeaderFactory extends AutobotFactory{
    private static LeaderFactory singleton;
    private Autobot roboAutobot;
    
    public static LeaderFactory getInstance(String robot)
    {
      // if (singleton == null)
      singleton = new LeaderFactory(robot);
      return singleton;
    }
    
    private LeaderFactory(String robot) {
         roboAutobot = null;
         roboAutobot=createAutobot(robot);
         roboAutobot.assembleAutobot();
         roboAutobot.printCardAutobot();
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
