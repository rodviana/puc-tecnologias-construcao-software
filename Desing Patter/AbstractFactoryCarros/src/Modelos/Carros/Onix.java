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
public class Onix extends Carro {
    
    //Metodos

    public Onix(String modelo, String marca, String acessorios, float valorVenda) {
        super(modelo, marca, acessorios, valorVenda);
    }

    @Override
    public String descricao() {
        return ("Economico. 1.0"); 
    }

   
}
