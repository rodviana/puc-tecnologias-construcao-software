package exercicio8_2;

import java.text.MessageFormat;

public class Tecnico extends Assistente{
    public Tecnico(String nome, String cpf, int matricula, double bonus) {
        super(nome, cpf, matricula);
        setBonus(bonus);
    }

    protected double getBonus() {
        return bonus;
    }

    protected void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return MessageFormat.format("{0}Tecnico'{'bonus={1}'}'", super.toString(), bonus);
    }

    private double bonus;

    @Override
    public void imprima() {
        System.out.println(toString());;
    }
}
