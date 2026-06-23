package exercicio6;

public class Aluno {
    public double getNotas() {
        return notas;
    }

    public String getNome() {
        return nome;
    }

    private final double notas;
    private final String nome;

    public Aluno(double notas, String nome) {
        this.notas = notas;
        this.nome = nome;
    }
}
