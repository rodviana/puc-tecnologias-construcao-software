/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

import Models.Brinde;

/**
 *
 * @author anibal.jukemura
 */
public abstract class Personalizacao implements Brinde{
      protected Brinde brinde;

    public Personalizacao(Brinde brinde) {
        this.brinde = brinde;
    }

    
}
