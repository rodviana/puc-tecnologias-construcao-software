package com.company;

import com.company.imovel.Imovel;
import com.company.imovel.Novo;
import com.company.imovel.Velho;

import java.util.ArrayList;

public class Main {
    private static Util util;
    public static void main(String[] args) {
        final int len = 10;
        ArrayList<Imovel> imoveis = new ArrayList<>();
        init(imoveis, len);
    }

    public static void init(ArrayList<Imovel> imoveis, int len) {
        String endereco;
        double preco, adicional;

        for (int i=0; i<10;++i) {
            endereco = util.randomString(len);
            preco = util.randomDouble();
            adicional = util.randomDouble();
            if (i % 2 == 0) {
                imoveis.add(new Novo(endereco, preco, adicional));
            }
            else {
                imoveis.add(new Velho(endereco, preco, adicional));
            }
        }
    }

    public static void print(ArrayList<Imovel> imoveis) {
        for ( Imovel imovel : imoveis) {
            util.display(new String[]{ imovel.getEndereco(), Double.toString(imovel.getPreco()) });
            if (imovel instanceof Novo)
                util.display(new String[] {  });
        }
    }

}
