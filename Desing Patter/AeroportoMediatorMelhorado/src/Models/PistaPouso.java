/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author anibal.jukemura
 */
public class PistaPouso implements Torre{

    private MediatorControle controlador;

    
    public PistaPouso(MediatorControle controlador) {
        this.controlador = controlador;
        controlador.setPousandoStatus(true);
    }

    @Override
    public void pousar() {
        if (controlador.pousando())
        {
            System.out.println("Liberado para pouso.");
            controlador.setPousandoStatus(true);
        }
        else
            System.out.println("Aguarde liberacao da pista.");
    }           
}
