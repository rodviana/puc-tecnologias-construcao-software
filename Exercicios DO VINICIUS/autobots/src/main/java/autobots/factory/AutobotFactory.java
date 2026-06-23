package autobots.factory;

import autobots.models.AutobotCard;
import autobots.models.RobotAutobots;

public interface AutobotFactory {
    AutobotCard createAutobot(RobotAutobots robot);
    AutobotCard summonAutobot(RobotAutobots robot);
}
