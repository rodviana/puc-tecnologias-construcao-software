/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio3;

/**
 *
 * @author Vinicius E. da Silva
 */
public class ContaBancaria {
    private double saldo;
    
    public ContaBancaria() {
        this.saldo = 0;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo > 0 ? saldo : 0;
    }
}
