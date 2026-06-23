package autobots.models;

public class Silverbolt extends  Aerialbot {
    private RobotAutobots nome;

    public Silverbolt(int ataque, int vida, int defesa, String especialidade) {
        super(ataque, vida, defesa, especialidade);
        this.nome = RobotAutobots.Silverbolt;
    }
    @Override
    public String toString() {
        return this.nome.name() + '\n' + super.toString();
    }

    @Override
    public void printCardAutobot() {
        System.out.println(this.toString());
    }
}
