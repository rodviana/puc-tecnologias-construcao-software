/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoadapter02;
import modelos.AdapterMath;
import modelos.Matematica;
import modelos.CalculaEJMCC;
/**
 *
 * @author ejmcc
 */
public class ProjetoAdapter02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = 9;
        int base = 25;
        int expoente = 2;
        
        //Calcular usando a interface Matemática
        Matematica calculadora = null;
        calculadora = new AdapterMath();
        
        System.out.println("Raiz: " + calculadora.raizQuadrada(numero));
        System.out.println("Potencia: " + calculadora.potencia(base, expoente));
        
        
        //Imagina estas chamadas 2.000 vezes.
        numero = 16;
        base = 5;
        expoente = 3;
        System.out.println("Raiz: " + calculadora.raizQuadrada(numero));
        System.out.println("Potencia: " + calculadora.potencia(base, expoente));
       
        
    }
    
}
