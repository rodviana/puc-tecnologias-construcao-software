package exercicio7;
/***
 *    1 - Crie uma Classe Aluno com um atributo string Nome e outro int Matricula.
 *    Crie os gets/sets e construtores da classe
 */
public class Aluno {
    private String nome;
    private int matricula;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }
}
