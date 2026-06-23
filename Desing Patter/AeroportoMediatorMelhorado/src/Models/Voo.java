/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author anibal.jukemura
 */
public class Voo implements Torre {
    
    private MediatorControle controlador;

    public Voo(MediatorControle controlador) {
        this.controlador = controlador;
    }
    
    public void prontoPousar() 
    {
        System.out.println("Pronto para iniciar procedimento de pouso.");
    }
    

    @Override
    public void pousar() {
         if (controlador.pousando()) 
        {
            System.out.println("Pouso realizado com sucesso.");
            controlador.setPousandoStatus(false);
        }
        else
            System.out.println("Aguardando liberacao para pouso.");
    }
}
