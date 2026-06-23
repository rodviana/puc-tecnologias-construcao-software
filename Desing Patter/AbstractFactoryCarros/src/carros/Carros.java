/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carros;

import Fabrica.FabricaCarros;
import javax.swing.JOptionPane;
import Modelos.Carros.Carro;


/**
 *
 * @author anibal.jukemura
 */
public class Carros {

    /**
     * @param args the command line arguments
     */
    public static void imprime(Carro obj, String imposto)
    {
        String dados = "Modelo: " + obj.getModelo() +"\n";
        dados+="Marca: " + obj.getMarca() + "\n";
        dados+="Acessorios: " + obj.getAcessorios() + "\n";
        dados+="Valor R$ " + obj.getValorVenda() + "\n";
        dados+="Descricao: " + obj.descricao() + "\n";
        dados+="Imposto: " + imposto + "\n";
        JOptionPane.showMessageDialog(null, dados);
    }
    
    public static void main(String[] args) {

        boolean controle = true;
        Object[] opcoes = { "ONIX", "PALIO", "CAPTIVA"};
        Object tipoDoCarro;
        Carro objCarro = null;
        FabricaCarros fabrica = new FabricaCarros();
        do{
            tipoDoCarro = JOptionPane.showInputDialog(null,
                                "Selecione o modelo?",
                                "App Carros",
                                JOptionPane.PLAIN_MESSAGE,
                                null,opcoes,"ONIX");
        objCarro=fabrica.getCarro(tipoDoCarro.toString(),"Para");
       
        imprime(objCarro,fabrica.imprimeImposto());
        }while(controle);
    }
        
      
}
