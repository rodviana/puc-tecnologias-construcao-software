/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista1.resposta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Vinicius E. da silva
 * Pontifícia Universidade Católica de Goiás
 * Disciplina: cmp1054 Tecnologia de construção de software
 * Goiânia 18 de fevereiro de 2022
 * Professor: ANIBAL SANTOS JUKEMURA
 * 
 * Lista de exercícios 1 - N1
 */
public class Main {
    public static int finish;
    public static Scanner input;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        input = new Scanner(System.in);
        Ex9();
    }
    
    public static void Ex1() {
        Scanner input = new Scanner(System.in);
        String nome;
        double salario;
        do {
            System.out.println("Nome: ");
            nome = input.nextLine();
            System.out.println("Salário: ");
            salario = input.nextDouble();
            
            Funcionario func = new Funcionario(nome, salario);
            
            System.out.println("O funcionário "
                    .concat(func.getNome())
                    .concat(" teve um aumento de R$ ")
                    .concat(Double.toString(func.reajuste()))
                    .concat(" e passará a receber R$ ")
                    .concat(Double.toString(func.salarioComReajuste()))
            );
            
            System.out.println("0 - Continuar");
            System.out.println("1 - Finalizar");
            finish = input.nextInt();
            
            
        } while (finish == 0);
    }
    
    public static void Ex2() {
         Scanner sc = new Scanner(System.in);
         do {
            System.out.println("Nome do aluno: ");
            String nome = sc.nextLine();
            System.out.println("Nota 1: ");
            double n1 = sc.nextDouble();
            System.out.println("Nota 2: ");
            double n2 = sc.nextDouble();
            Aluno aluno = new Aluno(nome, n1, n2);
            System.out.println(
                    "O aluno".concat(aluno.getNome())
                    .concat(" obteve média ")
                    .concat(Double.toString(aluno.mediaPonderada()))
             );
            
            System.out.println("0 - Continuar");
            System.out.println("1 - Finalizar");
            finish = sc.nextInt();
            
         } while (finish == 0);
         
     }
     
    public static void Ex3() {
        Scanner input = new Scanner(System.in);
        double a,b,c,d,e,f;
        System.out.println("Informe os coeficientes da equação.");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        d = input.nextDouble();
        e = input.nextDouble();
        f = input.nextDouble();
        
        
        double x = (c*e-b*f)/(a*e-b*d);
        double y = (a*f-c*d)/(a*e-b*d);

        
        System.out.println("x = "
                           .concat(Double.toString(x)
                           .concat(" y = ")
                           .concat(Double.toString(y)
                           )));
        
    } 
    
    public static void Ex4() {
        Scanner input = new Scanner(System.in);
        List<String> culturas = List.of("milho", "feijão", "café");
        ArrayList<Double> coberturaDesejada = new ArrayList<>();
        ArrayList<Integer> numeroDeAcres = new ArrayList<>();
        double custoTotal = 0;
        
        for (String cultura : culturas) {
            System.out.println("*********" + cultura + "***********");
            System.out.println("Cobertura desejada:    ");
            coberturaDesejada.add(input.nextDouble());
            System.out.println("N° de acres plantados: ");
            numeroDeAcres.add(input.nextInt());
        }
        
        for (int i = 0; i < culturas.size(); i++) {
            custoTotal +=  Math.pow(coberturaDesejada.get(i), .035)
                    * (double)numeroDeAcres.get(i);
        }
        
        System.out.println("Custo total: R$"
                .concat(Double.toString(custoTotal)));
        
    }
    
    public static void Ex5() {
         Scanner input = new Scanner(System.in);
         System.out.println("A: ");
         int a = input.nextInt();
         System.out.println("B: ");
         int b = input.nextInt();
         a = a + b; // 10 + 5 = 15
         b = a - b; // 15 - 5 = 10
         a = a - b; // 15 - 10
         
         
         System.out.println("A: ".concat(Integer.toString(a)));
         System.out.println("B: ".concat(Integer.toString(b)));
     }
    
    public static void Ex6() {
        Scanner input=new Scanner(System.in);
        System.out.println("Valor da conta: ");
        double valorConta = input.nextDouble();  // C

        System.out.println("Dias em atraso: ");
        int diasEmAtraso = input.nextInt();   // n

        System.out.println("Valor da multa: ");
        double multa = input.nextDouble();

        System.out.println("taxa de juros diária(%): ");
        double jurosDiario = input.nextDouble(); // i

        double totalAPagar = multa + valorConta * 
                Math.pow(1.0 + jurosDiario, diasEmAtraso) ; // M

        double totalJuros = totalAPagar - valorConta;

        System.out.println("Valor da conta: "
                           .concat(Double.toString(valorConta))
                           .concat("Dias em atraso: ")
                           .concat(Double.toString(diasEmAtraso))
                           .concat("Total da multa: ")
                           .concat(Double.toString(multa))
                           .concat("Total de juros: ")
                           .concat(Double.toString(totalJuros))
                           .concat("Total a pagar: ")
                           .concat(Double.toString(totalAPagar))
        );
    }
    
    public static void Ex7() {
        System.out.println("Nome do aluno: ");
        String nome = input.nextLine();
        
        System.out.println("Nota exame intermediário: ");
        double nota1 = input.nextDouble() * .3;
        
        System.out.println("Nota trabalho prático: ");
        double nota2 = input.nextDouble() * .2;
        
        System.out.println("Nota exame final: ");
        double nota3 = input.nextDouble() * .5;
        double notaFinal = (nota1+nota2+nota3);
        System.out.println("O Aluno"
                .concat(nome)
                .concat(" teve a nota final ")
                .concat(Double.toString(notaFinal))
        );
    }
    
    public static void Ex8() {
        double comprimento = input.nextDouble();
        double largura = input.nextDouble();
        double area = comprimento*largura;
        double potenciaIluminacao = area / 18.0;
        
        System.out.println("Area: "
                .concat(Double.toString(area))
                .concat("\nPotência de iluminação: ")
                .concat(Double.toString(potenciaIluminacao))
                .concat(" m²")
        );
    }
    
    public static void Ex9() {
        double p,r,n;
        p = input.nextDouble();
        r = input.nextDouble();
        n = input.nextDouble();
        double i = r/100.0;
        double f = p*Math.pow(1.0+i, n);
        
        System.out.println("F: "+Double.toString(f));
    }
}