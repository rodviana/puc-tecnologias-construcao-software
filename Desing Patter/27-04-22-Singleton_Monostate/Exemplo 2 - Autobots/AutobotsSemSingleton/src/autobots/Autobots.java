/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package autobots;

import autobots.factory.LeaderFactory;
import autobots.model.Autobot;

/**
 *
 * @author japa
 */
public class Autobots {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       	LeaderFactory fab1 = new LeaderFactory();
      	LeaderFactory fab2 = new LeaderFactory();

	
	Autobot autobot1 = fab1.summonAutobot("Optimus");
        System.out.println("AUTOBOT 1:");
        autobot1.printCardAutobot();
        
	Autobot autobot2 = fab2.summonAutobot("Nemesis");
        System.out.println("\nAUTOBOT 2:");
        autobot2.printCardAutobot();
        

    }
    
}
