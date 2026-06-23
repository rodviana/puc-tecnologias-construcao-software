/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author anibal.jukemura
 */
public class Losango extends Figura {
    public Losango()
    {
        tipo="Losango";
        area=30;
    }
    
   
    @Override
    public void desenhar()
    {
         System.out.println("DESENHANDO LOSANGO");   
    }
}
