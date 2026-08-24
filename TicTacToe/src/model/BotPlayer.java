package model;

import factory.BotPlayingStrategyFactory;
import model.enums.BotPlayingStrategyType;
import model.enums.PlayerType;
import strategy.BotPlayingStrategy;

public class BotPlayer extends Player{

    private BotPlayingStrategy botPlayingStrategy;
    private BotPlayingStrategyType botPlayingStrategyType;

    public BotPlayer(String name, int playerId, Symbol symbol, BotPlayingStrategyType botPlayingStrategyType) {
        super(name, playerId, symbol, PlayerType.BOT);
        this.botPlayingStrategyType = botPlayingStrategyType;
        this.botPlayingStrategy = BotPlayingStrategyFactory.getBotStrategy(botPlayingStrategyType);
    }

    @Override
    public Move makeMove(Board board) {
        Move move = botPlayingStrategy.makeMove(board);
        move.setPlayer(this);
        return move;
    }
}
