/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista2.resposta;

import java.security.MessageDigest;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Vinicius E. da silva
 * Pontifícia Universidade Católica de Goiás
 * Disciplina: cmp1054 Tecnologia de construção de software
 * Goiânia 18 de fevereiro de 2022
 * Professor: ANIBAL SANTOS JUKEMURA
 * 
 * Lista de exercícios 2 - N1
 */

public class Main {
    private static Scanner input;
    public static void main(String[] args) {
        input = new Scanner(System.in);
        Ex8();
    }
    
    public static void Ex1() {
        
        System.out.println("M: ");
        double m = input.nextDouble();
        System.out.println("N: ");
        double n = input.nextDouble();
        System.out.println(MessageFormat.format("{0} / {1} = {2}", m, n, m / n));
        
    }
    
    public static void Ex2() {
         final int MAX_NOTAS = 2;
         System.out.println("Nome do aluno: ");
         String nome = input.nextLine();
         ArrayList<Double> notas = new ArrayList<>();
         for(int i=1;i<= MAX_NOTAS;i++) {
             System.out.println(MessageFormat.format("Nota {0}: ", i));
             notas.add(input.nextDouble());
         }
         
         notas.add( (notas.get(0) * 2.0 + notas.get(1)) / 3.0 );
         String resultado = notas.get(2) < 3.0 ? "reprovado"
                 : notas.get(2) < 7.0 ? "em recuperação" : "aprovado";
         
         System.out.println(MessageFormat.format("O aluno {0} obteve média {1} e está {2}",
                 nome, notas.get(2), resultado));
     }
    
    public static void Ex3() {
        System.out.println("Nome: ");
        String nome = input.nextLine();
        System.out.println("Idade: ");
        int idade = input.nextInt();
        System.out.println(MessageFormat.format("{0} tem {1} anos e {2} de idade",
                nome, idade, idade >= 18 ? "é" : " não é"));
    }
    
    public static void Ex4() {
        final int QDE_COEFICIENTES = 3;
        ArrayList<Double> coef= new ArrayList<>();
        ArrayList<Double> raizes = new ArrayList<>();
        System.out.println("Coeficientes da equação (a, b, c): ");
        for (int i = 0; i < QDE_COEFICIENTES; i++) {
            coef.add(input.nextDouble());
        }
        double descriminante = coef.get(1) * coef.get(1) -
                               4*coef.get(0)*coef.get(2);
        
        if (descriminante < 0) {
            System.out.println("Não existe raizes reais.");
        } else if(descriminante == 0) {
            raizes.add(-coef.get(1) / coef.get(0));
            System.out.println(MessageFormat.format("x1 = {0} x2 = {1}",
                    raizes.get(0), raizes.get(0)));
        } else {
            raizes.add( 
                    (-coef.get(1)+Math.sqrt(descriminante)) /
                     (2* coef.get(0))
            );
            raizes.add( 
                    (-coef.get(1)-Math.sqrt(descriminante)) /
                     (2* coef.get(0))
            );
            System.out.println(MessageFormat.format("x1 = {0} x2 = {1}",
                    raizes.get(0), raizes.get(1)));
        }
    }
    
    public static void Ex5() {
        System.out.println("Nome do aluno");
        String nome = input.nextLine();
        System.out.println("Média do aluno: ");
        double media = input.nextDouble();
        String recomendacao = "Não";
        if (media < 8.0) {
            recomendacao = "Recomendado";
        } else if (media < 9.0) {
            System.out.println("Fortemente");
        } else {
            recomendacao = "Altamente";
        }
        System.out.println(MessageFormat.format(
                "O aluno {0} é {1} recomendado.", nome, recomendacao
        ));
    }
    
    public static void Ex6() {
        String nome=input.nextLine();
        double salario=input.nextDouble();
        double aumento;
        double reajuste=.2;
        if (salario > 900.0 && salario < 1300.0) {
            reajuste=.15;
        } else if(salario<1800.0) {
            reajuste=.1;
        } else {
            reajuste=.05;
        }
        aumento = salario * reajuste;
        salario *= (1+reajuste);
        System.out.println(MessageFormat.format(
                "O jogador {0} terá aumento de R$ {1} e passará a receber R$ {2}.",
                nome, aumento, salario
        ));
    }
    
    public static void Ex7() {
        int qdeNotas;
        int[] notas = {100,50,20,5,2,1};
        int valor = input.nextInt();
        for (int nota : notas) {
            qdeNotas = valor / nota;
            System.out.println(MessageFormat.format(
                    "R$ {0} = {1} notas", nota, qdeNotas
            ));
            valor %= nota;
        }
    }    
    
    public static void Ex8() {
        int a,b,c,maior, menor;
        
        System.out.println("Infome os valores(a, b, c)");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        
        maior= Math.max(a, b);
        maior= Math.max(maior, c);
        
        menor= Math.max(a, b);
        menor= Math.max(menor, c);
        System.out.println(MessageFormat.format(
                "Maior: {0}\nMenor: {1}", maior, menor
        ));
        
    }
    
    public static void Ex9() {
        int a,b,opc, resultado=0;
        System.out.println("Informe dois números inteiros(a, b):");
        a=input.nextInt();
        b=input.nextInt();
        opc=input.nextInt();
        
        switch (opc) {
            case 1: resultado = a/b; break;
            case 2: resultado = a*b; break;
            case 3:resultado = a+b; break;
            case 4: resultado = a-b; break;
        }
        if (resultado == 0) {
            System.out.println("Opção invalida");
        } else {
            System.out.println(MessageFormat.format("Resultado = ", resultado));
        }
    }
    
    public static void Ex10() {
        int a, pot=100, hmi, lmi;
        a=input.nextInt();
        hmi=a/pot;
        lmi=a%pot;
        if (hmi >= 100) {
            System.out.println("O número deve conter apenas 4 digitos.");
        } else if (lmi == hmi) {
            System.out.println("É palindromo");
        } else {
            System.out.println("Não é palindromo");    
        }
    }
    
    public static void Ex11() {
        String nome = input.nextLine();
        int tipo=input.nextInt();
        double area=input.nextDouble();
        double custo=0.0, custoPorArea, diff=0.0;
        
        custoPorArea = switch (tipo) {
            case 1 -> 5.0;
            case 2 -> 10.0;
            case 3 -> 15.0;
            default -> 25.0;
        };
        
        custo=area*custoPorArea;
        
        if (area > 300.0) {
            custo *=.95;
        }
        
        if (custo > 1750.0) {
            diff=custo-1750.0;
            custo += diff * .9;
        }
        
        System.out.println(MessageFormat.format(
                "O fazendeiro {0} pagará pelo serviço de pulverização de R$ {1}.",
                nome, custo
        ));
    }
}
