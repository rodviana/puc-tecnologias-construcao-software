/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Decorator.Personalizacao;

/**
 *
 * @author anibal.jukemura
 */
public class Foto extends Personalizacao {

    public Foto(Brinde brinde) {
        super(brinde);
    }

    @Override
    public void descricao() {
        brinde.descricao();
        System.out.println("         |-> Com a Foto.");
    }
    
}
