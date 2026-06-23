/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figurasprototype;

import Models.Figura;
import Models.Losango;
import Models.Quadrado;
import Models.Retangulo;
import Models.Triangulo;
import java.util.HashMap;

/**
 *
 * @author anibal.jukemura
 */
public class FigurasPrototype {

    /**
     * @param args the command line arguments
     */
    
     public static HashMap <String, Figura> geometria = new HashMap<String, Figura>();
    
    public static Figura getFigura(String id)
    {
        Figura fig =  geometria.get(id);
        fig.desenhar();
        return (Figura) fig.clone();
    }
    
    public static void carregaFiguras()
    {
        Quadrado quad = new Quadrado();
        quad.setId("1");
        geometria.put(quad.getId(),quad);
        
        Retangulo ret = new Retangulo();
        ret.setId("2");
        geometria.put(ret.getId(),ret);
        
        Losango los = new Losango();
        los.setId("3");
        geometria.put(los.getId(),los);
        
        Triangulo tri = new Triangulo();
        tri.setId("4");
        geometria.put(tri.getId(),tri);
    }
    
    public static void main(String[] args) {
       carregaFiguras();
       
       Figura clone1 = getFigura("1");
       System.out.println("Clone 1: " + clone1.getTipo());
       clone1.setArea(clone1.getArea()+5);
       geometria.put("5", clone1);
       System.out.println("Area clonada: " + clone1.getArea());
       Figura clone2 = getFigura("2");
       System.out.println("Clone 2: " + clone2.getTipo());
       Figura clone3 = getFigura("3");
       System.out.println("Clone 3: " + clone3.getTipo());
       Figura clone4 = getFigura("4");
       System.out.println("Clone 4: " + clone4.getTipo());      
       Figura clone5 = getFigura("5");
       System.out.println("Clone 5: " + clone5.getTipo());
       clone5.setArea(clone5.getArea()+5);
       System.out.println("Area clonada: " + clone5.getArea());
        
    }
    
}
