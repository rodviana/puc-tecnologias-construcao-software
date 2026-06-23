import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio {
    /*
Um número pertence à sequência de Threebonacci caso pertença à sequência de Fibonacci (assuma que o primeiro termo da série é o 1) e atenda pelo menos um dos últimos critérios abaixo:

1 – A representação do número possui pelo menos um dígito 3.

2 – O número é múltiplo de 3.

Entrada
Cada caso de teste contém um inteiro N (1 ≤ N ≤ 60 ). A entrada termina com o fim de arquivo (EOF).

Saída
Para cada caso de teste imprima uma linha contendo o N-ésimo termo da série de Threebonacci.
*/


    static Scanner sc = new Scanner(System.in);

     public static void main(String[] args)
     {
         while(sc.hasNext())
         {
            Util.getValueTribonnaci(sc.nextInt());
         }
     }




}
