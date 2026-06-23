/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fabrica;

import FabricaAbstrata.ImpostosAbstractFactory;
import FabricaAbstrata.ImpostosGoiasAbstractFactory;
import FabricaAbstrata.ImpostosParaAbstractFactory;
import Modelos.Carros.Captiva;
import Modelos.Carros.Carro;
import Modelos.Carros.Onix;
import Modelos.Carros.Palio;

/**
 *
 * @author japa
 */
public class FabricaCarros {
    
    ImpostosAbstractFactory impostos;

   // public FabricaCarros(ImpostosAbstractFactory impostos) {
   //     this.impostos = impostos;
   // }
        
    public enum Carros{
        CAPTIVA, PALIO, ONIX;
    }
    
    public Carro getCarro(String tipoCarro, String estado)
    {
        Carros tipo = Carros.valueOf(tipoCarro);
        this.impostos=getImpostos(estado);
        switch (tipo)
        {
            case CAPTIVA:
                    
                    return new Captiva("Captiva SUV", "GM", "Direcao Eletrica", (float) 120000.00);
            case PALIO:
                    
                    return new Palio("Palio 1.0", "FIAT", "Direcao Hidraulica", (float) 90000.00);
            case ONIX:
                    
                    return new Onix("Onix 1.6", "GM", "Ar Condicionado", (float) 70000.00);
            default: return null;
        }    
    }

   
    public ImpostosAbstractFactory getImpostos(String estado)
    {
        if (estado.equals("Goias"))
            return new ImpostosGoiasAbstractFactory();
        else if (estado.equals("Para"))
            return new ImpostosParaAbstractFactory();
        return null;
    }
    
    public String imprimeImposto()
    {
        return impostos.getICMS().imposto();
    }
}
