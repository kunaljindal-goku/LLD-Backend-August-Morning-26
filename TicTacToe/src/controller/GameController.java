package controller;

import model.Game;
import model.Player;
import strategy.WinningStrategy;

import java.util.List;

public class GameController {

    // /start
    public Game startGame(int boardSize,
                          List<Player> players,
                          List<WinningStrategy> winningStrategies) {
        return Game.getBuilder()
                .setPlayers(players)
                .setBoardSize(boardSize)
                .setWinningStrategies(winningStrategies)
                .build();
    }
}
