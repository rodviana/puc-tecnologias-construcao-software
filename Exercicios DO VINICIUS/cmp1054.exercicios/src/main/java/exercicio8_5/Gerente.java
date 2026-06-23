package exercicio8_5;

public class Gerente extends Empregado {
  private String nomeGerente;
  public Gerente(String nome, int idade, String sexo, double salario, String matricula, String nomeGerente) {
    super(nome, idade, sexo, salario, matricula);
    setNomeGerente(nomeGerente);
  }
  public String getNomeGerente() {
    return this.nomeGerente;
  }
  public void setNomeGerente(String nomeGerente) {
    this.nomeGerente = nomeGerente;
  }
  @Override
  public String toString() {
    return super.toString()
      .concat("\nNome Gerente: ")
      .concat(nomeGerente)
      .concat("\nValor INSS: ").concat(String.valueOf(valorInss()));
  }

}