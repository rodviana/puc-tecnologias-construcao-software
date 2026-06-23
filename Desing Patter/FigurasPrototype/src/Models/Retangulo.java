/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author anibal.jukemura
 */
public class Retangulo extends Figura {
    public Retangulo()
    {
        tipo="Retangulo";
        area=40;
    }
    
   
    @Override
    public void desenhar()
    {
         System.out.println("DESENHANDO RETANGULO");   
    }
}
