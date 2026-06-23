/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package feiracomposite;

import Models.Fruta;
import Models.Produto;
import Models.Verdura;
import Models.Xepa;

/**
 *
 * @author japa
 */
public class FeiraComposite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Produto fruta1 = new Fruta("Pera", 5.55);
        Produto fruta2 = new Fruta("Banana", 6.70);

        Xepa vendas1 = new Xepa("Caixa de Frutas: ", fruta1.getValor()+fruta2.getValor());

        vendas1.addProduto(fruta1);
        vendas1.addProduto(fruta2);
        System.out.println("Composicao 1: " + vendas1.getNome() + "[Valor: R$ " + vendas1.getValor() + "]" );
        vendas1.print();
        
        Produto verdura1 = new Verdura("Alface", 7.00);
        Produto verdura2 = new Verdura("Cenoura", 9.00);

        Xepa vendas2 = new Xepa("Caixa de Verduras: ", verdura1.getValor()+verdura2.getValor());

        vendas2.addProduto(verdura1);
        vendas2.addProduto(verdura2);
        System.out.println("Composicao 2: " + vendas2.getNome() + "[Valor: R$ " + vendas2.getValor() + "]" );
        vendas2.print();
        Produto verdura3 = new Verdura("Quiabo", 11.00);
        Xepa vendas3 = new Xepa("Caixa Mista: ", (vendas1.getValor()+vendas2.getValor()+verdura3.getValor())+fruta2.getValor());
        vendas3.addProduto(vendas1);
        vendas3.addProduto(vendas2);
        vendas3.addProduto(verdura3);
        vendas3.addProduto(fruta2);
        System.out.println("Composicao 3: " + vendas3.getNome() + "[Valor: R$ " + vendas3.getValor() + "]" );
        vendas3.print();
    }
    
}