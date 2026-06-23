package exercicio8_2;

import java.text.MessageFormat;

public class Administrativo extends Assistente {
    protected String turno;

    protected String getTurno() {
        return turno;
    }

    protected void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return MessageFormat.format("{0}Administrativo'{'turno=''{1}'''}'", super.toString(), turno);
    }

    public Administrativo(String nome, String cpf, int matricula, String turno) {
        super(nome, cpf, matricula);
        this.turno = turno;
    }

    @Override
    public void imprima() {
        System.out.println(toString());;
    }
}
