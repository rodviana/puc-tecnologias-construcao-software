package autobots.models;

public class Optimus extends Lider {
    private RobotAutobots nome;
    public Optimus(int ataque, int vida, int defesa, String especialidade) {
        super(ataque, vida, defesa, especialidade);
        this.nome = RobotAutobots.OptimusPrime;
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
