/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aeroportomediator;

import Mediator.MediatorControleImpl;
import Models.MediatorControle;
import Models.PistaPouso;
import Models.Voo;

/**
 *
 * @author anibal.jukemura
 */
public class AeroportoMediator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MediatorControle mediador = new MediatorControleImpl();
        Voo AirForceOne = new Voo(mediador);
        PistaPouso pista1 = new PistaPouso(mediador);
        
        
        System.out.println("Air Force One: ");
        mediador.registroVoo(AirForceOne);
        mediador.registroPistaPouso(pista1);
        AirForceOne.prontoPousar();
        pista1.pousar();
        AirForceOne.pousar();
        
        System.out.println("\nAir Force Two: ");
        Voo AirForceTwo = new Voo(mediador);
        mediador.registroVoo(AirForceTwo);
        mediador.registroPistaPouso(pista1);
        AirForceTwo.prontoPousar();
        pista1.pousar();
        AirForceOne.pousar();
        mediador.setPousandoStatus(true);
        pista1.pousar();
        AirForceOne.pousar();
        

    }
    
}
