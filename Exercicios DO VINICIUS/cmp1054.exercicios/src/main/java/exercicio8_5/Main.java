package exercicio8_5;

import exercicio8_5.*;

public class Main {
  public static void main(String[] args) {
    Pessoa pessoa = new Pessoa("Joao", 33, "Masculino");
    Empregado empregado = new Empregado("Ana", 21, "Feminino", 5000, "132abc");

    Cliente cliente = new Cliente("Almir", 40, "Masculino", 2000, 1976);
    Gerente gerente = new Gerente("Tania", 30, "Feminino", 1500.00,"321cde","João");
    Vendedor vendedor = new Vendedor("Igor", 25, "Masculino", 30000, "147ofp",23560.99, 100);
    System.out.println(pessoa);
    System.out.println(empregado);
    System.out.println(cliente);
    System.out.println(gerente);
    System.out.println(vendedor);

  }
}