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
       	
        System.out.println("AUTOBOT 1:");
        LeaderFactory fab1 = new LeaderFactory("Optimus");
        System.out.println("Codigo da fab: " + fab1.hashCode());
	
        System.out.println("AUTOBOT 2:");
        LeaderFactory fab2 = new LeaderFactory("Optimus");
        System.out.println("Codigo da fab: " + fab2.hashCode());
       
        System.out.println("AUTOBOT 3:");
        LeaderFactory fab3 = new LeaderFactory("Optimus");
        System.out.println("Codigo da fab: " + fab3.hashCode());
        
        System.out.println("AUTOBOT 4:");
        Autobot robo4 = fab2.createAutobot("Nemesis");
        if (robo4!=null) robo4.printCardAutobot();
        System.out.println("Codigo da fab: " + fab2.hashCode());
    }
    
}
