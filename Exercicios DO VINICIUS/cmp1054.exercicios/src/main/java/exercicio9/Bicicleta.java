package exercicio9;

import java.text.MessageFormat;

public class Bicicleta extends Veiculo implements EmissaoCO2{
    private double quilometragem;

    public Bicicleta(String tipo, String motor, double quilometragem, double indice) {
        super(tipo, motor);
        this.quilometragem = quilometragem;
        this.indice = indice;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public double getIndice() {
        return indice;
    }

    private double indice;

    @Override
    public double calculaCO2() {
        return this.quilometragem * this.indice;
    }

    @Override
    public String toString() {
        return MessageFormat.format("{0}Bicicleta'{'quilometragem={1}, indice={2}, Emissão de CO2: {3}  KG/mes'}'", super.toString(), quilometragem, indice, calculaCO2());
    }
}
