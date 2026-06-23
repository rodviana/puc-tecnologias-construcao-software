package autobots.models;

public abstract class AutobotCard extends Autobot {
    protected int ataque;
    protected int vida;
    protected int defesa;
    protected String especialidade;
    protected AutobotType tipo;

    public AutobotCard(int ataque, int vida, int defesa, String especialidade) {
        this.ataque = ataque;
        this.vida = vida;
        this.defesa = defesa;
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return "Tipo: " + tipo.name() +" Autobot" +
                "\nAtaque: " + ataque +
                "\nVida: " + vida +
                "\nDefesa: " + defesa +
                "\nEspecialidade: " + especialidade;

    }

    @Override
    public void assembleAutobot() {
        System.out.println("Invocando Autobot...");
    }
}
