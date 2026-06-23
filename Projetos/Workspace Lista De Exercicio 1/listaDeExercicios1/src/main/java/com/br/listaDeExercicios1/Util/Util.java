package com.br.listaDeExercicios1.Util;

import java.util.ArrayList;

public class Util {

    public static ArrayList<Integer> swapInteger(ArrayList<Integer> numeros)
    {
        try
        {
            if(numeros != null && numeros.size() == 2)
            {
                //0==a && 1==b
                numeros.set(0,numeros.get(0) + numeros.get(1));// 0 <- a+b
                numeros.set(1,numeros.get(0) - numeros.get(1));// 1 <- a+b-b=a
                numeros.set(0,numeros.get(0) - numeros.get(1));// 0 <- a+b-a=b
                System.out.println("O swap foi realizado");
            }
            else
                System.out.println("Informe 2 e somente 2 números inteiros para o swap");

        }catch (Exception e)
        {
            System.out.println("Ocorreu um erro durante o swap");
        }
        return numeros;
    }
}
