/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Models;

/**
 *
 * @author anibal.jukemura
 */
public interface MediatorControle {
    
    public void requestVoo();
    
    public void requestPousar();
    
    public void autorizaPousar();
    
    public void registroPistaPouso(PistaPouso pista);
  
    public void registroVoo(Voo voo);
  
    public boolean pousando();
  
    public void setPousandoStatus(boolean status);
}
