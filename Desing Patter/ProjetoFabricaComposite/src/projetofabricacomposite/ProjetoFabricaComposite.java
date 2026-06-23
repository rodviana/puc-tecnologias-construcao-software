/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetofabricacomposite;

import Composite.CaixaCafeManha;
import Fabricas.Doce;
import Fabricas.Salgado;
import Models.Bolo;
import Models.Brigadeiro;
import Models.Coxinha;
import Models.Esfirra;
import Models.Quibe;
import Models.Sorvete;

/**
 *
 * @author japa
 */
public class ProjetoFabricaComposite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Salgado salgadinho1 = new Esfirra();
        Salgado salgadinho2 = new Quibe();
        Salgado salgadinho3 = new Coxinha();
        Doce docinho1 = new Brigadeiro();
        Doce docinho2 = new Bolo();
        Doce docinho3 = new Sorvete();
        
        CaixaCafeManha cx1 = new CaixaCafeManha("Salgados");
        cx1.addItem(salgadinho1);
        cx1.addItem(salgadinho2);
        cx1.addItem(salgadinho3);
        System.out.println("Caixa 1: " + cx1.getTipo());
        cx1.listar();
        System.out.println("");
        CaixaCafeManha cx2 = new CaixaCafeManha("Doces");
        cx2.addItem(docinho1);
        cx2.addItem(docinho2);
        cx2.addItem(docinho3);
        System.out.println("Caixa 2: " + cx2.getTipo());
        cx2.listar();
        System.out.println("");
        CaixaCafeManha cx3 = new CaixaCafeManha("Mista");
        cx3.addItem(salgadinho1);
        cx3.addItem(salgadinho3);
        cx3.addItem(docinho2);
        System.out.println("Caixa 3: " + cx3.getTipo());
        cx3.listar();   
        System.out.println("");
        CaixaCafeManha cx4 = new CaixaCafeManha("Mista");
        cx4.addItem(salgadinho1);
        cx4.addItem(docinho1);
        cx4.addItem(docinho3);
        System.out.println("Caixa 4: " + cx4.getTipo());
        cx4.listar();  
        System.out.println("");
        CaixaCafeManha cx5 = new CaixaCafeManha("Mista de Caixas");
        cx5.addItem(cx1);
        cx5.addItem(cx2);
        cx5.addItem(docinho3);
        System.out.println("Caixa 5: " + cx5.getTipo());
        cx5.listar();
        
    }
    
}
