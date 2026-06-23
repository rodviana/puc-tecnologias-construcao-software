package com.br.listaDeExercicios1.exercicio5;

import com.br.listaDeExercicios1.Util.Util;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.Scanner;

@Controller
public class SwapController {

    Scanner sc = new Scanner(System.in);

    public void executaExercicio5()
    {
        ArrayList<Integer> numeros = new ArrayList<>();
        try
        {
            System.out.println("Informe dois números inteiros: ");
            numeros.add(sc.nextInt());
            numeros.add(sc.nextInt());
            Util.swapInteger(numeros);
        }catch(Exception e)
        {
            System.out.println("Ocorreu um erro no exercício 5 "+ e.getMessage());
        }
    }
}
