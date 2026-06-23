package autobots.factory;

import autobots.models.AutobotCard;
import autobots.models.RobotAutobots;
import autobots.models.Silverbolt;

public class SilverboltFactory implements AutobotFactory {

    @Override
    public AutobotCard createAutobot(RobotAutobots robot) {
        return new Silverbolt(4,12,2, "Emboscadas aéreas.");
    }

    @Override
    public AutobotCard summonAutobot(RobotAutobots robot) {
        AutobotCard silverbolt = createAutobot(robot);
        silverbolt.assembleAutobot();
        return silverbolt;
    }
}
