package com.company;

import models.ArCondicionado;
import models.Conversor220v110v;
import models.Voltagem110;
import models.Voltagem220;

public class Main {

    public static void main(String[] args) {
        var voltagem110 = new Voltagem110();

        var arCondicionado = new ArCondicionado();
        arCondicionado.setLigacao(voltagem110);

        if (arCondicionado.testaLigacao(voltagem110))
            System.out.println("Pode ligar");
        else
            System.out.println("Não pode ligar");

        var conversor220v110v = new Conversor220v110v(
            new Voltagem220());

        arCondicionado.setLigacao(conversor220v110v);
        
        if (arCondicionado.testaLigacao(
            conversor220v110v))
            System.out.println("Pode ligar");
        else
            System.out.println("Não pode ligar");
    }
}
