/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mediator;

import Models.MediatorControle;
import Models.PistaPouso;
import Models.Voo;

/**
 *
 * @author anibal.jukemura
 */
public class MediatorControleImpl implements MediatorControle{
    private Voo voo;
    private PistaPouso pista;
    public  boolean pouso;

    @Override
    public void registroPistaPouso(PistaPouso pista) {
        this.pista = pista;
    }
    
    @Override
     public void registroVoo(Voo voo)
     {
         this.voo=voo;
     }
     
    @Override 
    public boolean pousando() 
    {
        return pouso;
    }
    
    @Override
    public void setPousandoStatus(boolean status) 
    {
        pouso = status;
    }
}
