/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;
import modelos.Matematica;
/**
 *
 * @author ejmcc
 */
public class AdapterMath implements Matematica{

    @Override
    public int potencia(int base, int expoente) {
        return (int) Math.pow(base, expoente);
    }

    @Override
    public int raizQuadrada(int valor) {
        return (int) Math.sqrt(valor);
    }
    
    
}
