package exercicio8_1;

public class Imovel {
    private String endereco;
    private double preco;

    @Override
    public String toString() {
        return new StringBuilder().append("Imovel{\n").append("endereco=',\n").append(endereco).append('\n').append(", preco=").append(preco).append(",\n}").toString();
    }

    public Imovel(String endereco, double preco) {
        this.endereco = endereco;
        this.preco = preco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
