package autobots.models;

public class Ironhide extends Carbot {
    private RobotAutobots nome;

    public Ironhide(int ataque, int vida, int defesa, String especialidade) {
        super(ataque, vida, defesa, especialidade);
        this.nome = RobotAutobots.Ironhide;
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
