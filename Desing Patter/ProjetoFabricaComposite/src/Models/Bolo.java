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
public class Bolo extends Doce{

    public Bolo() {
        super("Bolo");
    }

    @Override
    public void listar() {
        System.out.println("   |---Produto= " + super.getTipo());
    }
    
}
