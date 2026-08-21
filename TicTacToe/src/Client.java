import controller.GameController;
import model.Game;
import model.HumanPlayer;
import model.Player;
import model.Symbol;
import strategy.RowWinningStrategy;
import strategy.WinningStrategy;

import java.time.chrono.HijrahChronology;
import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        List<Player> players = List.of(
                new HumanPlayer("Goku", 1, new Symbol('X', "Goku's sumbol")),
                new HumanPlayer("Vegeta", 2, new Symbol('O', "Vegeta's's sumbol")
                ));

        int boardSize = 2;

        List<WinningStrategy> winningStrategies = List.of(new RowWinningStrategy());

        GameController gameController = new GameController();
        Game game = gameController.startGame(boardSize,players,winningStrategies);

        while(/status in progress/) {
            // makeMove -> checlWinner
            // printBoard
        }


    }
}
