package autobots.models;

public class Bumblebee extends Carbot {
    private RobotAutobots nome;

    public Bumblebee(int ataque, int vida, int defesa, String especialidade) {
        super(ataque, vida, defesa, especialidade);
        this.nome = RobotAutobots.Bumblebee;
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
