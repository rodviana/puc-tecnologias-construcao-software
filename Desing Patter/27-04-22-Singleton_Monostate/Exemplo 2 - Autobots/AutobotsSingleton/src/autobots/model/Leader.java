/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autobots.model;

/**
 *
 * @author japa
 */
public class Leader extends Autobot{
 
    private String nome;
    public Leader (String nome)
    {
        this.nome=nome;
    }
    
    @Override
     public void printCardAutobot()
     {
         System.out.print(nome);
         if (nome.equals("Optimus") )
                 System.out.println(" >> LIDER AUTOBOT: ");
         else
                 System.out.println(" >> Rebelde AUTOBOT/DECEPTICON: ");
         System.out.println("\tAtaque: 3\n" + "\tVida: 10\n" + "\tDefesa: 2\n" + 
                            "\tEspecialidade: Estrategista em Combates."); 
                

     }
    
}
