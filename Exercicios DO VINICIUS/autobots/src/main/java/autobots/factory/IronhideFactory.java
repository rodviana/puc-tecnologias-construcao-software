package autobots.factory;

import autobots.models.AutobotCard;
import autobots.models.Ironhide;
import autobots.models.RobotAutobots;

public class IronhideFactory implements AutobotFactory {
    @Override
    public AutobotCard createAutobot(RobotAutobots robot) {
        return new Ironhide(5,12,2,"Armas pesadas.");
    }

    @Override
    public AutobotCard summonAutobot(RobotAutobots robot) {
        AutobotCard ironhide = createAutobot(robot);
        ironhide.assembleAutobot();
        return ironhide;
    }
}
