package exercicio8_1;

public class Novo extends Imovel{
    private double adicional;

    public double getAdicional() {
        return adicional;
    }

    @Override
    public String toString() {
        return new StringBuilder().append(super.toString()).append(",\nadicional=").append(adicional).append('}').toString();
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }

    public Novo(String endereco, double preco, double adicional) {
        super(endereco, preco);
        setAdicional(adicional);
    }
}
