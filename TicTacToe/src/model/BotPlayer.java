package model;

import model.enums.PlayerType;

public class BotPlayer extends Player{
    public BotPlayer(String name, int playerId, Symbol symbol) {
        super(name, playerId, symbol, PlayerType.BOT);
    }
}
