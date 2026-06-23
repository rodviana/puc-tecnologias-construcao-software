package br.edu.pucgo.n2Atividade2.model;

import lombok.Getter;
import lombok.Setter;

import java.util.concurrent.atomic.AtomicInteger;

public class Pista {
    @Getter @Setter
    private String nome;
    @Getter @Setter
    private static int quantidadeCorredores;
    private static Pista pista = null;

    public static Pista getInstanciaPista(String nome)
    {
        if (pista==null)
            pista = new Pista(nome);
        return pista;
    }

    public static Pista getInstanciaPista()
    {
        if (pista==null)
            System.out.println("O nome da pista ainda não foi informado" + "\n");
        return pista;
    }

    private Pista(String nome)
    {
        this.nome=nome;
    }

    
}
