package br.edu.pucgo.n2Atividade4.modal;

import lombok.ToString;

import java.util.ArrayList;
import java.util.TooManyListenersException;

public class Veiculo {

    ArrayList<Pneu> pneus;
    Integer quantidadePneus = 0;

    @Override
    public String toString()
    {
        if(pneus == null)
            pneus = new ArrayList<>();
        StringBuilder retorno = new StringBuilder();
        retorno.append("Esse veículo possui "+pneus.size()+" pneus: \n");
        pneus.forEach(pneu -> retorno.append(pneu.toString()));
        return retorno.toString();
    }

    Veiculo(String tipoPneu, Integer aro)
    {
        ArrayList<Pneu> pneus = new ArrayList<>();
        pneus.add(new Pneu(tipoPneu,aro));
        this.pneus = pneus;
        this.quantidadePneus++;
    }

    Veiculo(String tipoPneu, Integer aro, Integer quantidadePneus)
    {
        this.pneus = new ArrayList<>();
        clonePneu(new Pneu(tipoPneu,aro),quantidadePneus);
    }

    public void clonePneu(Pneu pneu,Integer howMuchTimes)
    {
        try
        {
            for(int i=0;i<howMuchTimes;i++)
            {
                this.pneus.add((Pneu) pneu.clone());
                this.quantidadePneus++;
            }
        }catch(CloneNotSupportedException e)
        {
            System.out.println(e.getCause());
        }
    }
}
