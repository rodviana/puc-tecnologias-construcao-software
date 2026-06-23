/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetowar;
import classes.*;

public class ProjetoWar02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Jogador jog1 = new Jogador("Jogador 1",Tabuleiro.getInstanciaDoTabuleiro());
        
        System.out.println(jog1.descricao());

        Jogador jog2 = new Jogador("Jogador 2", Tabuleiro.getInstanciaDoTabuleiro());
        
        System.out.println(jog2.descricao());
        
        Jogador jog3 = new Jogador("Jogador 3 ",Tabuleiro.getInstanciaDoTabuleiro());
        
        System.out.println(jog3.descricao());
        
        
    }
    
}
