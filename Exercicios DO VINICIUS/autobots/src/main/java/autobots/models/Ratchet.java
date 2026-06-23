package autobots.models;

public class Ratchet extends Medico {
    private RobotAutobots nome;
    public Ratchet(int ataque, int vida, int defesa, String especialidade) {
        super(ataque, vida, defesa, especialidade);
        this.nome = RobotAutobots.Ratchet ;
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
