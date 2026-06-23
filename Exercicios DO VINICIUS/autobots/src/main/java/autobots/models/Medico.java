package autobots.models;

public abstract class Medico extends AutobotCard {
    public Medico(int ataque, int vida, int defesa, String especialidade) {
        super(ataque, vida, defesa, especialidade);
        this.tipo = AutobotType.MEDICO;
    }
}
