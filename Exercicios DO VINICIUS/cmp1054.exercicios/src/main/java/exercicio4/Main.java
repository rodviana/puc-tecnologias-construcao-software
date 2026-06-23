/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio4;

import java.util.Iterator;


/**
 *
 * @author puc
 * media, maior menor remover tudo 
 */
public class Main {
    public static void main(String[] args) {
        Util util = new Util();
        util.inicializa(10);
        util.getPares();
        util.getImpar();
        print(util);
        util.getArrDouble().set(5, 9.7);
        System.out.println(maior(util)+"\n");
        System.out.println(media(util)+"\n");
        print(util);
        remove(util);
        print(util);
    }
    
    public static void print(Util util) {
        if (util.getArrDouble().isEmpty()) {
            System.out.println("Empty");
            return;
        }
        Iterator<Double> it = util.getArrDouble().iterator();
        while (it.hasNext())
            System.out.println(it.next());
        System.out.println("\n");
    }
    
    public static double media(Util util) {
        double sum = 0;
        Iterator<Double> it = util.getArrDouble().iterator();
        while(it.hasNext() )
            sum += it.next();

        return sum / util.getArrDouble().size(); 
    }
    
    public static double maior(Util util) {
        Iterator<Double> it = util.getArrDouble().iterator();
        double maior = it.next(), curr;
        while(it.hasNext() ) {
            curr = it.next();
            if (maior < curr) 
                maior = curr;
        }
        return maior;
    }
    
    public static void remove(Util util) {
        Iterator<Double> it = util.getArrDouble().iterator();
        while(it.hasNext()) {
            it.next();
            it.remove();
        }
    }
    
}


