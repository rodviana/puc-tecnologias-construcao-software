/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salgadosfacade;

import Facade.Assado;
import Facade.Frito;

/**
 *
 * @author japa
 */
public class SalgadosFacade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Assado salgadosAssados = new Assado();
        
        salgadosAssados.fabricarEmpada();
        salgadosAssados.fabricarEsfirra();
        
        Frito salgadosFritos = new Frito();
        salgadosFritos.fabricarCoxinha();
        salgadosFritos.fabricarQuibe();        
    }
    
}
