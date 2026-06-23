package autobots.models;

public abstract class Lider extends AutobotCard {
    public Lider(int ataque, int vida, int defesa, String especialidade) {
        super(ataque, vida, defesa, especialidade);
        this.tipo = AutobotType.LIDER;
    }
}
