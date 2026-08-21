package strategy;

import model.Board;
import model.Move;
import model.Player;

public interface WinningStrategy {

    boolean checkWinner(Move move, Board board);
}
