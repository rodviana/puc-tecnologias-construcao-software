
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;

import Models.Lager;
import Models.Munich;
import Models.Vienna;

/**
 *
 * @author japa
 */
public class Lagers {
    private Lager lager;
    private Vienna vienna;
    private Munich munich;


    public Lagers() {
        this.lager = new Lager();
        this.vienna = new Vienna();
        this.munich = new Munich();

    }
    
    public void fabricarLager()
    {
        lager.produzir();
    }
    public void fabricarVienna()
    {
        vienna.produzir();
    }
    public void fabricarMunich()
    {
        munich.produzir();
    }
  
}
