package autobots.factory;

import autobots.models.AutobotCard;
import autobots.models.Optimus;
import autobots.models.RobotAutobots;

public class OptimusFactory implements AutobotFactory {
    @Override
    public AutobotCard createAutobot(RobotAutobots robot) {
        return new Optimus(3,10,2,"Estrategista em combates.");
    }

    @Override
    public AutobotCard summonAutobot(RobotAutobots robot) {
        AutobotCard optimus = createAutobot(robot);
        optimus.assembleAutobot();
        return optimus;
    }
}
