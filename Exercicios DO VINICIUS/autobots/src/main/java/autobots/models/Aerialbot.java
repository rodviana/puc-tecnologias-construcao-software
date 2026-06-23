package autobots.models;

public abstract class Aerialbot extends AutobotCard {
    public Aerialbot(int ataque, int vida, int defesa, String especialidade) {
        super(ataque, vida, defesa, especialidade);
        this.tipo = AutobotType.AERIALBOT;
    }
}
