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
       	//LeaderFactory fab1 = new LeaderFactory();
        
        System.out.println("AUTOBOT 1:");
        LeaderFactory fab1 = LeaderFactory.getInstance("Optimus");
        System.out.println("Codigo da fab: " + fab1.hashCode());
	
	System.out.println("\nAUTOBOT 2:");
        LeaderFactory fab2 = LeaderFactory.getInstance("Nemesis");
        System.out.println("Codigo da fab: " + fab1.hashCode());

       System.out.println("\nAUTOBOT 3:");
        
       /* Observar que a fabrica eh a mesma. Pode-se modificar a 
        fabrica para usar um construtor sem parametros. 
        Isso foi somente um exemplo. */
        Autobot robo2 = fab1.createAutobot("Nemesis");
        robo2.assembleAutobot();
        robo2.printCardAutobot(); 
        System.out.println("Codigo da fab: " + fab1.hashCode());
      
    }
    
}
