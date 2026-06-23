package autobots.factory;

import autobots.models.AutobotCard;
import autobots.models.Ratchet;
import autobots.models.RobotAutobots;

public class RatchetFactory implements AutobotFactory {
    @Override
    public AutobotCard createAutobot(RobotAutobots robot) {
        return new Ratchet(3,14, 0, "Engenharia cybertroniana.");
    }

    @Override
    public AutobotCard summonAutobot(RobotAutobots robot) {
        AutobotCard ratchet = createAutobot(robot);
        ratchet.assembleAutobot();
        return ratchet;
    }
}
