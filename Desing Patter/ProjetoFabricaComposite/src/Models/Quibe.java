/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Fabricas.Salgado;

/**
 *
 * @author japa
 */
public class Quibe extends Salgado{

    public Quibe() {
        super("Quibe");
    }

     @Override
    public void listar() {
        System.out.println("   |---Produto= " + super.getTipo());
    } 
    
}
