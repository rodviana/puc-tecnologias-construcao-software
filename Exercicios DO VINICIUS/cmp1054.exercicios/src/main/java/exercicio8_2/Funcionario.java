package exercicio8_2;

import java.text.MessageFormat;

public class Funcionario {
    private String nome;

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return MessageFormat.format("Funcionario'{'nome=''{0}'', cpf=''{1}'''}'", nome, cpf);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    private String cpf;

    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
}
