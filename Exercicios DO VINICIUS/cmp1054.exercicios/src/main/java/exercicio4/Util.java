/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio4;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author puc
 */
public class Util {
    private  ArrayList<Integer> arrInt ;
    private  ArrayList<Double> arrDouble ;
    
    public void inicializa(int size)
    {
        Random random = new Random();
        setArrInt(new ArrayList<>());
        for (int i = 0; i < size; i++) 
            getArrInt().add(random.nextInt());
        
        
        setArrDouble(new ArrayList<>());
        for (int i = 0; i < size; i++) 
            getArrDouble().add(random.nextDouble());
   
    }
    
    public void getPares() {
        int val = 0;
        for (int i=0; i< getArrInt().size();++i) {
            val = getArrInt().get(i).intValue();
            if (val % 2 == 0)
                System.out.println(val);
        }
        System.out.println("\n");
    }
    
    public void getImpar() {
        int val = 0;
        for (int i=0; i< getArrInt().size();++i) {
            val = getArrInt().get(i).intValue();
            if (val % 2 != 0)
                System.out.println(val);
        }
        System.out.println("\n");
    }

    /**
     * @return the arrInt
     */
    public ArrayList<Integer> getArrInt() {
        return arrInt;
    }

    /**
     * @param arrInt the arrInt to set
     */
    public void setArrInt(ArrayList<Integer> arrInt) {
        this.arrInt = arrInt;
    }

    /**
     * @return the arrDouble
     */
    public ArrayList<Double> getArrDouble() {
        return arrDouble;
    }

    /**
     * @param arrDouble the arrDouble to set
     */
    public void setArrDouble(ArrayList<Double> arrDouble) {
        this.arrDouble = arrDouble;
    }
    
    
}
