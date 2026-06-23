package autobots.factory;

import autobots.models.AutobotCard;
import autobots.models.RobotAutobots;
import autobots.models.Skydive;

public class SkydiveFactory implements AutobotFactory {
    @Override
    public AutobotCard createAutobot(RobotAutobots robot) {
        return new Skydive(3,8,2,"Táticas aéreas de guerra.");
    }

    @Override
    public AutobotCard summonAutobot(RobotAutobots robot) {
        AutobotCard skydive = createAutobot(robot);
        skydive.assembleAutobot();
        return skydive;
    }
}
