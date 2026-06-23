/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.Carros;

/**
 *
 * @author ejmcc
 */
public class Palio extends Carro{

    public Palio(String modelo, String marca, String acessorios, float valorVenda) {
        super(modelo, marca, acessorios, valorVenda);
    }

    @Override
    public String descricao() {
        return ("Preco.");
    }
    
   
}
