/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package FabricaAbstrata;

import Modelos.Impostos.ICMS;

/**
 *
 * @author japa
 */
public interface ImpostosAbstractFactory {
    public abstract ICMS getICMS();
}
