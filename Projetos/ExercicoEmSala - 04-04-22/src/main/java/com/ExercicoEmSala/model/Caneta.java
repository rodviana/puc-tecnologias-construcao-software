package com.ExercicoEmSala.model;

import lombok.Getter;
import org.jetbrains.annotations.NotNull;


public interface Caneta {

    public void escrever(String texto);
    public String getCor();
    public static void escreverTexto(@NotNull Caneta caneta, String texto)
    {
        caneta.escrever(texto);
        System.out.println("Cor: "+caneta.getCor());
    }

}
