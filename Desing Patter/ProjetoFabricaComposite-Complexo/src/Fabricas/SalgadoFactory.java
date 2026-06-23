/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fabricas;


import Models.Coxinha;
import Models.Esfirra;
import Models.Quibe;

/**
 *
 * @author japa
 */
public class SalgadoFactory {
    public static Salgado fabricaSalgado(String tipo) {
      Salgado salgadinho = null;
      if (tipo.equals("Coxinha")) 
	salgadinho = new Coxinha();
      else if (tipo.equals("Esfirra")) 
	salgadinho = new Esfirra();	
      else if (tipo.equals("Quibe")) 
	salgadinho = new Quibe();
      return salgadinho;
   }
}
