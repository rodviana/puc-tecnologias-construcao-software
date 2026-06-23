/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio3;

import java.text.MessageFormat;
import java.util.Scanner;

/**
 *
 * @author Vinicius E. da Silva
 */
public class Main {

    public static Scanner input;
    public static ContaBancaria[] agencia1;
    public static ContaBancaria[] agencia2;
    public static final int MAX=5;
    
    public static void main(String[] args) {
        inicializa();
        run();
    }
    
    public static void inicializa() {
        input = new Scanner(System.in);
        agencia1 = new ContaBancaria[MAX];
        agencia2 = new ContaBancaria[MAX];
        for (int i=0; i < MAX;++i ) {
            agencia1[i]=new ContaBancaria();
            agencia2[i]=new ContaBancaria();
        }
    }
    
    public static void run() {
        double valor;
        int agencia, operacao, sair, conta;
        do {
            System.out.println("Informe a conta ( 1 - " + MAX + "):");
            conta=input.nextInt();
            System.out.println("[0] Depósito [1] Saque");
            operacao=input.nextInt();
            System.out.println("Informe o valor R$: ");
            valor=input.nextDouble();
            System.out.println("[1] Agencia 1 [2] Agencia 2");
            agencia=input.nextInt();
            transacao(valor, agencia, conta, operacao);
            System.out.println("[0] Continuar [1] Sair");
            sair=input.nextInt();
        } while (sair != 1);
        balanco();
    }
    
    public static void transacao(double valor, int agencia, int conta,int operacao) {
        switch(operacao) {
            case 0 -> deposita(valor, agencia, conta);
            case 1 -> retira(valor, agencia, conta);
            default -> System.out.println("Operação invalida!");
        }
    }
    
    public static void deposita(double valor, int agencia, int conta) {
        switch(agencia) {
            case 1 -> agencia1[conta-1].setSaldo(agencia1[conta-1].getSaldo() + valor );
            case 2 -> agencia1[conta-1].setSaldo(agencia2[conta-1].getSaldo() + valor );
            default -> System.out.println("Agencia inválida!");
        }
    }
    
    public static void retira(double valor, int agencia, int conta) {
         deposita(-valor, agencia, conta);
    }
    
    public static void balanco() {
        System.out.println("************** Agencia 1 **************");
        contabiliza(agencia1);
        System.out.println("************** Agencia 2 **************");
        contabiliza(agencia2);
        System.out.println("***************************************");
    }
    
    public static void contabiliza(ContaBancaria[] agencia) {
        double saldo=0; int i=1;
        for (ContaBancaria conta : agencia) {
            saldo += conta.getSaldo();
            System.out.println(MessageFormat.format(
                    "Conta {0}: \nSaldo = R$ {1}", i++, conta.getSaldo()
            ));
        }
        System.out.println(MessageFormat.format("Total R$ {0}", saldo));
    }
}
