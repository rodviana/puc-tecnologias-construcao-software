/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos.Impostos;

import FabricaAbstrata.ImpostosAbstractFactory;

/**
 *
 * @author japa
 */
public class IcmsPara implements ICMS{

    @Override
    public String imposto() {
       return ("Para: 5%");
    }
    

}
