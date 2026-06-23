/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Fabricas.Doce;

/**
 *
 * @author japa
 */
public class Brigadeiro extends Doce{

    public Brigadeiro() {
        super("Brigadeiro");
    }

      @Override
    public void listar() {
        System.out.println("   |---Produto= " + super.getTipo());
    }
    
}
