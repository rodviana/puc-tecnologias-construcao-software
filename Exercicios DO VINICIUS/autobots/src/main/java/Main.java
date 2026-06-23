import autobots.factory.*;
import autobots.models.*;

public class Main {
    public static void main(String[] args) {
        OptimusFactory optimusFactory = new OptimusFactory();
        RatchetFactory ratchetFactory = new RatchetFactory();
        SilverboltFactory silverboltFactory = new SilverboltFactory();
        SkydiveFactory skydiveFactory = new SkydiveFactory();
        BumblebeeFactory bumblebeeFactory = new BumblebeeFactory();
        IronhideFactory ironhideFactory = new IronhideFactory();

        Optimus optimus = (Optimus) optimusFactory.createAutobot(RobotAutobots.OptimusPrime);
        Ratchet ratchet = (Ratchet) ratchetFactory.createAutobot(RobotAutobots.Ratchet);
        Silverbolt silverbolt = (Silverbolt) silverboltFactory.createAutobot(RobotAutobots.Silverbolt);
        Skydive skydive = (Skydive) skydiveFactory.createAutobot(RobotAutobots.Skydive);
        Bumblebee bumblebee = (Bumblebee) bumblebeeFactory.createAutobot(RobotAutobots.Bumblebee);
        Ironhide ironhide = (Ironhide) ironhideFactory.createAutobot(RobotAutobots.Ironhide);

        optimus.printCardAutobot();
        ratchet.printCardAutobot();
        silverbolt.printCardAutobot();
        skydive.printCardAutobot();
        bumblebee.printCardAutobot();
        ironhide.printCardAutobot();


    }
}
