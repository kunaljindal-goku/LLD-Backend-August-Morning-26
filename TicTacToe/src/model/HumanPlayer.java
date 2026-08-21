package model;

import model.enums.PlayerType;

public class HumanPlayer extends Player{
    public HumanPlayer(String name, int playerId, Symbol symbol) {
        super(name, playerId, symbol, PlayerType.HUMAN);
    }
}
