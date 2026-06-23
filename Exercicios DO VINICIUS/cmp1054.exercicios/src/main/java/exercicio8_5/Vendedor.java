package exercicio8_5;

public class Vendedor extends Empregado{
    private double valorVenda;
    private int qtdVendas;

    public Vendedor(String nome, int idade, String sexo, double salario, String matricula, double valorVenda, int qtdVendas) {
        super(nome, idade, sexo, salario, matricula);
        this.valorVenda = valorVenda;
        this.qtdVendas = qtdVendas;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public int getQtdVendas() {
        return qtdVendas;
    }

    public void setQtdVendas(int qtdVendas) {
        this.qtdVendas = qtdVendas;
    }
    @Override
    public String toString() {
        return super.toString()
                .concat("\nValor venda: ")
                .concat(Double.toString(valorVenda))
                .concat("\nQuantidade de vendas: ")
                .concat(Integer.toString(qtdVendas));
    }


}
