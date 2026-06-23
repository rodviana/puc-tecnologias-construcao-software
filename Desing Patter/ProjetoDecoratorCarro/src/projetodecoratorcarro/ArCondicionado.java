/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package projetodecoratorcarro;

/**
 *
 * @author eugenio
 */
public class ArCondicionado extends Acessorio {

    private Carro veiculo;
    public ArCondicionado(Carro veiculo){
        this.veiculo = veiculo;
    }
    public String getDescricao(){
        return veiculo.getDescricao() + ", Ar Condicionado";
    }
    public double preco(){
        return 2000 + veiculo.preco();
    }
}
