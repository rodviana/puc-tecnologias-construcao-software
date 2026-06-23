/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Composite;

import Interface.Produto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author japa
 */
public class CaixaCafeManha implements Produto {
    private String tipo;

    private List<Produto> itens; // Estrutura "Arvore"

    public CaixaCafeManha(String tipo) {
        this.tipo = tipo;
        this.itens = new ArrayList<Produto>();
    }
    
    public void addItem(Produto item) {
        itens.add(item);
    }

    public void removeItem(Produto item) {
        itens.remove(item);
    }

    @Override
    public String getTipo() {
        return tipo;
    }
    
    @Override
    public void listar() {
        itens.forEach(Produto::listar);
    }

}
