package br.edu.pucgo.n2Atividade4.modal;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class Pneu implements Cloneable {
    @Getter @Setter
    String tipo;
    @Getter @Setter
    Integer aro;

    public Pneu(String tipo, Integer aro) {
        this.tipo = tipo;
        this.aro = aro;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString()
    {
        return "Tipo de Pneu: " + tipo + " - Aro " + aro + "\n";
    }
}
