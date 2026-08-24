package factory;

import model.enums.BotPlayingStrategyType;
import strategy.BotPlayingStrategy;
import strategy.EasyBotStrategy;
import strategy.HardBotStrategy;
import strategy.MediumBotStrategy;

public class BotPlayingStrategyFactory {

    public static BotPlayingStrategy getBotStrategy(BotPlayingStrategyType type) {
        if(type.equals(BotPlayingStrategyType.EASY)) {
            return new EasyBotStrategy();
        }
        else if(type.equals(BotPlayingStrategyType.MEDIUM)) {
            return new MediumBotStrategy();
        }
        else if(type.equals(BotPlayingStrategyType.HARD)) {
            return new HardBotStrategy();
        }

        throw new RuntimeException("Please select a diffculty level for Bot");
    }
}
