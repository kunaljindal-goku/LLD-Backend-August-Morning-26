package controller;

import model.Game;
import model.Player;
import model.enums.GameState;
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

    public GameState getGameState(Game game) {
        return game.getGameState();
    }

    public void printBoard(Game game) {
        game.getBoard().printBoard();
    }

    public void makeMove(Game game) {
        game.makeMove();
    }

    public Player getWinner(Game game) {
        return game.getWinner();
    }
}
