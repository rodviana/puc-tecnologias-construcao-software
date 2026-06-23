package exercicio8_2;

import java.text.MessageFormat;

public class Assistente extends Funcionario{
    private int matricula;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Assistente(String nome, String cpf, int matricula) {
        super(nome, cpf);
        setMatricula(matricula);
    }

    @Override
    public String toString() {
        return MessageFormat.format("{0}Assistente'{'matricula={1}'}'", super.toString(), matricula);
    }

    public void imprima() {
        System.out.println(this.toString());
    }
}
