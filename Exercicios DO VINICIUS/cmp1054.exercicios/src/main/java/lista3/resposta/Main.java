/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista3.resposta;

import java.text.MessageFormat;
import java.util.Scanner;

/**
 *
 * @author Vinicius E. da silva
 * Pontifícia Universidade Católica de Goiás
 * Disciplina: cmp1054 Tecnologia de construção de software
 * Goiânia 19 de fevereiro de 2022
 * Professor: ANIBAL SANTOS JUKEMURA
 * 
 * Lista de exercícios 3 - N1
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    private static Scanner input;
    
    public static void main(String[] args) {
        // TODO code application logic here
        input=new Scanner(System.in);
        Ex14();
    }
    
    public static void Ex1() {
        int sum=0;
        for (int i=1;i<=100;++i) {
            sum+=i;
        }
        System.out.println(MessageFormat.format(
            "Sumation of 1 to 100 is {0}.", sum
        ));
    }
    
    public static void Ex2() {
        for (int i = 15; i <= 200; i++) {
            System.out.println(MessageFormat.format(
                    "{0}² = {1}", i*i
            ));
        }
    }
    
    public static void Ex3() {
        double sum=1.0;
        int n=input.nextInt();
        for (int i = 2; i <= n; i++) {
            sum+=1.0/(double)i;
        }
        System.out.println(MessageFormat.format("Sum = {0}", sum));
    }
    
    public static void Ex4() {
        int nth=30,a=1,b=1,c=0;
        for (int i = 1; i <= nth; i++) {
            a=b;
            b=c;
            c = a+b;
            System.out.print(Integer.toString(c)+", ");
        }
    }
    
    public static void Ex5() {
        int a = input.nextInt();
        int b = input.nextInt();
        
        int x = a, y = b, r;
        
        while (y != 0) {
            r = x % y;
            x = y;
            y = r;
        }
        System.out.println(MessageFormat.format(
                "mdc({0}, {1}) = {2}", a, b, x
        ));
    }
    
    public static void Ex6() {
        double inv=input.nextDouble();
        while (inv >= 0) {
            if (inv < 100.00) {
                System.out.println("Não há investimento disponíveis.");
            }
            if (inv >= 100.0) {
                System.out.println("Poupança: 0.5%");
            }
            if (inv >= 1000.0) {
                System.out.println("Fundos de Renda Fixa: 1%");
            }
            if (inv >= 2500.0) {
                System.out.println("CDBs: 1.5%");
            }
            inv=input.nextDouble();
        }
    }
    
    public static void Ex7() {
        int num=input.nextInt();
        int maior=0, menor=999999999;
        while (num != 0) {
            if (maior < num) {
                maior=num;
            }
            if (menor > num) {
                menor=num;
            }
            num=input.nextInt();
        }
        
        System.out.println(MessageFormat.format(
                "Maior: {0} Menor: {1}", maior, menor
        ));
    }
    
    public static void Ex8() {
        int sexo, alt, maiorSexo=0, menorSexo=0, qdeMasc=0, qdeFem=0;
        double maiorAltura=-1.0, menorAltura=100.0, mediaMasc=0, mediaFem=0;
        for (int i = 0; i < 50; i++) {
            sexo=input.nextInt();
            alt=input.nextInt();
            
            if (maiorAltura < alt) {
                maiorSexo=sexo;
                maiorAltura=alt;
            }
            
            if (menorAltura > alt) {
                menorSexo=sexo;
                menorAltura=alt;
            }
            
            if (sexo == 1) {
                qdeMasc++;
                mediaMasc += alt;
            } else {
                qdeFem++;
                mediaFem += alt;
            }
        }
        mediaFem /= qdeFem;
        mediaMasc /= qdeMasc;
        System.out.println(MessageFormat.format(
                "Altura média(mulher) = {0}"
                .concat("\nAltura média(homen) = {1}")
                .concat("Maior altura = {2} sexo = {3}")
                .concat("Menor altura = {4} sexo = {5}"),
                mediaFem, mediaMasc, maiorAltura, maiorSexo,
                menorAltura, menorSexo
        ));
    }
    
    public static void Ex9() {
        String nome=input.nextLine();
        double salario=input.nextDouble(), reajuste;
        while(salario > 0) {
            if (salario <= 900.00) {
                reajuste=.2;
            } else if (salario <= 1300.00) {
                reajuste=.15;
            } else if (salario <= 1800.00) {
                reajuste=.1;
            } else {
                reajuste=.05;
            }
            salario *= (1.0+reajuste);
            reajuste = (1.0-reajuste)*salario;
            System.out.println(MessageFormat.format(
                "O funcionário {0} terá um aumento de R$ {1} e passará a receber R$ {2}.",
                nome, reajuste, salario
            ));
        }
    }

    public static void Ex10() {
        int sexo, alt, maiorSexo=0;
        int qdeMasc=0, qdeFem=0;
        double maiorAltura=-1.0, menorAltura=100.0, mediaFem=0;
        for (int i = 0; i < 15; i++) {
            sexo=input.nextInt();
            alt=input.nextInt();
            
            if (maiorAltura < alt) {
                maiorSexo=sexo;
                maiorAltura=alt;
            }
            
            if (menorAltura > alt) {
                menorAltura=alt;
            }
            
            if (sexo == 1) {
                qdeMasc++;
            } else {
                qdeFem++;
                mediaFem += alt;
            }
        }
        System.out.println(MessageFormat.format(
                "Menor altura do grupo: {0}\n"
                .concat("Média altura das mulheres: {2}")
                .concat("N° de homens: {3}")
                .concat("O sexo da pessoa mais alta: {4}")
                , menorAltura, mediaFem, qdeMasc, maiorSexo
        ));
        
    }
    
    public static void Ex11() {
        double sum = 0;
        int base = 2;
        for (int i = 0; i < 50; i++) {
            sum += ((double)Math.pow(base, i+1))/(50.0-(double)i);
        }
        System.out.println(MessageFormat.format(
                "S = {0}", sum
        ));
    }
    
    public static void Ex12() {
        int fat=1;
        int n = input.nextInt();
        for (int i = 2; i < n; i++) {
            fat *= n;
        }
        System.out.println();
    }
    
    public static void Ex13() {
        int soma, n, numero;
        soma = 1;
        numero = input.nextInt();
        for (int j = 2; j <= (int)Math.sqrt(numero); j ++)
        {
            if (numero % j == 0)
            {
                soma += j + (numero / j);
            }
        }
        if( soma  != numero || soma == 1) {
            System.out.println("Não é perfeito");
        }
        else {
            System.out.println("É perfeito");
        }
    }
    
    public static void Ex14() {
        Eleicao eleicao = new Eleicao();
        Util.inicio(eleicao);
        Util.resultado();
    }
}
