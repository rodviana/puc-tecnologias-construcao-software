package br.edu.pucgo.n2Atividade2.model;

import lombok.Getter;
import lombok.Setter;

public class Piloto {
    @Getter @Setter
    private String nome;
    @Getter @Setter
    private Pista pistaCorrida;

    @Override
    public String toString()
    {

        String retorno =
                "Nome: "+ this.nome + "\n";
        if(pistaCorrida==null)
               retorno+="não foi definida a pista desse corredor" + "\n" ;
        else
            retorno+=
                    "Nome pista: "+ this.pistaCorrida.getNome()+ "\n"+
                    "ID pista: " + this.pistaCorrida.hashCode()+ "\n"+
                    "Quantidade corredores: " + Pista.getQuantidadeCorredores() + "\n";
        return retorno;
    }

    public Piloto(String nomePiloto, String nomePista)
    {
        this.nome = nomePiloto;
        pistaCorrida = Pista.getInstanciaPista(nomePista);
        Pista.setQuantidadeCorredores(Pista.getQuantidadeCorredores()+1);
        System.out.println(this.toString());
    }

    public Piloto(String nomePiloto)
    {
        this.nome=nomePiloto;
        pistaCorrida = Pista.getInstanciaPista();
        if(pistaCorrida != null)
            Pista.setQuantidadeCorredores(Pista.getQuantidadeCorredores()+1);
        System.out.println(this.toString());
    }

}
