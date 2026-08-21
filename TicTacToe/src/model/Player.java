package model;

import model.enums.PlayerType;

public abstract class Player {

    private String name;
    private int playerId;
    private Symbol symbol;
    private PlayerType playerType;

    public Player(String name,
                  int playerId,
                  Symbol symbol,
                  PlayerType playerType) {
        this.name = name;
        this.playerId = playerId;
        this.symbol = symbol;
        this.playerType = playerType;
    }
}
