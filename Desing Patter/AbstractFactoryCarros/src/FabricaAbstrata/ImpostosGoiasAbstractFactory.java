/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package FabricaAbstrata;

import Modelos.Impostos.ICMS;
import Modelos.Impostos.IcmsGoias;

/**
 *
 * @author japa
 */
public class ImpostosGoiasAbstractFactory implements ImpostosAbstractFactory {
    public ICMS getICMS()
    {
        return new IcmsGoias();
    }
}
