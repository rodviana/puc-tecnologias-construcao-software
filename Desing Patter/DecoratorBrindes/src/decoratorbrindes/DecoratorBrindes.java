/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decoratorbrindes;

import Models.Adesivo;
import Models.Brinde;
import Models.Caneca;
import Models.Caneta;
import Models.CorAzul;
import Models.Foto;
import Models.Garrafa;

/**
 *
 * @author anibal.jukemura
 */
public class DecoratorBrindes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Brinde b1 = new Caneta();
        System.out.println("Brinde 1:");
        b1.descricao();
        
        Brinde b2 = new Caneca();
        System.out.println("Brinde 2:");
        b2.descricao();
        
        Brinde b3 = new Foto(new Caneca());
        System.out.println("Brinde 3:");
        b3.descricao();       
        
        Brinde b4 = new CorAzul(new Adesivo(new Garrafa()));
        System.out.println("Brinde 4:");
        b4.descricao(); 
        
        System.out.println("Brinde 5:");
        Brinde b5 = new Foto(new CorAzul(new Adesivo(new Garrafa())));
        b5.descricao();
       

    }
    
}
