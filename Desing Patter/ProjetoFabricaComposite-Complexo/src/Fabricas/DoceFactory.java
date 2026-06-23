/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fabricas;

import Models.Bolo;
import Models.Brigadeiro;
import Models.Sorvete;

/**
 *
 * @author japa
 */
public class DoceFactory {
    public static Doce fabricaDoce(String tipo) {
      Doce docinho = null;
      if (tipo.equals("Bolo")) 
	docinho = new Bolo();
      else if (tipo.equals("Brigadeiro")) 
	docinho = new Brigadeiro();	
      else if (tipo.equals("Sorvete")) 
	docinho = new Sorvete();
      return docinho;
   }
}
