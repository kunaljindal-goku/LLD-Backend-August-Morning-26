import controller.GameController;
import model.*;
import model.enums.BotPlayingStrategyType;
import model.enums.GameState;
import strategy.RowWinningStrategy;
import strategy.WinningStrategy;

import java.util.List;

public class Client {

    public static void main(String[] args) {

        List<Player> players = List.of(
                new HumanPlayer("Kunal", 1, new Symbol('X', "Goku's sumbol")),
                new BotPlayer("Botty", 2, new Symbol('O', "Botty's sumbol"), BotPlayingStrategyType.EASY
                ));

        int boardSize = 3;

        List<WinningStrategy> winningStrategies = List.of(new RowWinningStrategy());

        GameController gameController = new GameController();
        Game game = gameController.startGame(boardSize, players, winningStrategies);

        while (gameController.getGameState(game).equals(GameState.IN_PROGRESS)) {
            gameController.printBoard(game);
            gameController.makeMove(game);
        }

        gameController.printBoard(game);

        if (gameController.getGameState(game).equals(GameState.DRAW)) {
            System.out.println("Game DRAWN");
        } else {
            Player winner = gameController.getWinner(game);
            System.out.println(winner.getName() + " has WON!!");
        }

    }
}
