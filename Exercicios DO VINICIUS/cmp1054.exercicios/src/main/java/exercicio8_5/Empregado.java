package exercicio8_5;

public class Empregado extends Pessoa {
  private double salario;
  private String matricula;

  public Empregado(String nome, int idade, String sexo, double salario, String matricula) {
    super(nome, idade, sexo);
    setSalario(salario);
    setMatricula(matricula);
  }

  public double getSalario() {
    return this.salario;
  }
  public void setSalario(double salario) {
    this.salario = salario;
  }
  public String getMatricula() {
    return this.matricula;
  }
  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }
  public double valorInss() {
    return this.salario * .95f;
  }
  @Override
  public String toString() {
    String empregado =  super.toString().concat("\nSalário: ")
            .concat(Double.toString(salario))
            .concat("\nMatricula: ")
            .concat(matricula)
            .concat("\nValor INSS: ")
            .concat(Double.toString(valorInss()));

    return empregado;
  }
}