package autobots.factory;

import autobots.models.AutobotCard;
import autobots.models.Bumblebee;
import autobots.models.RobotAutobots;

public class BumblebeeFactory implements AutobotFactory {

    @Override
    public AutobotCard createAutobot(RobotAutobots robot) {
        return new Bumblebee(4,9,2,"Ataque corpo a corpo.");
    }

    @Override
    public AutobotCard summonAutobot(RobotAutobots robot) {
        AutobotCard bumblebee = createAutobot(robot);
        bumblebee.assembleAutobot();
        return bumblebee;
    }
}
