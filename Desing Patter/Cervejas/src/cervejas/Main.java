/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cervejas;

import Facade.Ales;
import Facade.Lagers;
import Models.Cerveja;

/**
 *
 * @author japa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ales cervejaAle = new Ales();
        
        cervejaAle.fabricarAle();
        cervejaAle.fabricarPorter();
        cervejaAle.fabricarStout();
        cervejaAle.fabricarTrigo();
        
        Lagers cervejaLager = new Lagers();
        cervejaLager.fabricarLager();
        cervejaLager.fabricarMunich();
        cervejaLager.fabricarVienna();
    }
    
}
