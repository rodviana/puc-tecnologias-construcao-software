package exercicio9;

import java.text.MessageFormat;

public abstract class Veiculo {
    protected String tipo;
    protected String motor;

    public String getTipo() {
        return tipo;
    }

    public String getMotor() {
        return motor;
    }

    public Veiculo(String tipo, String motor) {
        this.tipo = tipo;
        this.motor = motor;
    }

    @Override
    public String toString() {
        return MessageFormat.format("Veiculo'{'tipo=''{0}'', motor=''{1}'''}'", tipo, motor);
    }
}
