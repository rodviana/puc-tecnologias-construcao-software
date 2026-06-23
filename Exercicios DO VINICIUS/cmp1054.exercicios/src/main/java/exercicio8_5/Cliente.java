package exercicio8_5;

import exercicio8_5.Pessoa;

public class Cliente extends Pessoa {
  private double valorDivida;
  private int anoNascimento;

    public Cliente(String nome, int idade, String sexo, 
                  double valorDivida, int anoNascimento) {
    super(nome, idade, sexo);
    setValorDivida(valorDivida);
    setAnoNascimento(anoNascimento);
  }
  public void setValorDivida(double valorDivida) {
    this.valorDivida = valorDivida;
  }
  public void setAnoNascimento(int anoNascimento) {
    this.anoNascimento = anoNascimento;
  }
  @Override
  public String toString() {
    return super.toString()
      .concat("\nValor divida: ")
      .concat(Double.toString(valorDivida))
            .concat("\nAno de nascimento: ")
      .concat(Integer.toString(anoNascimento));
  }
}