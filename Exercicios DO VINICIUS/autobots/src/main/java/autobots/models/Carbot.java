package autobots.models;

public abstract class Carbot extends AutobotCard {
    public Carbot(int ataque, int vida, int defesa, String especialidade) {
        super(ataque, vida, defesa, especialidade);
        this.tipo = AutobotType.CARBOT;
    }

    @Override
    public void assembleAutobot() {
        System.out.println("Invocando Autobot...");
    }
}
