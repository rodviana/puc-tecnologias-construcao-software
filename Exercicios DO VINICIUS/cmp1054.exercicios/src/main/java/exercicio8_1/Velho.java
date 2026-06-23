package exercicio8_1;

public class Velho extends Imovel{
    private double desconto;

    @Override
    public String toString() {
        return new StringBuilder().append(super.toString()).append("desconto=").append(desconto).append("\n}").toString();
    }

    public double getDesconto() {
        return desconto;
    }

    public Velho(String endereco, double preco, double desconto) {
        super(endereco, preco);
        this.desconto = desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
}
