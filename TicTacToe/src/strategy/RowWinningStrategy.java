package strategy;

import model.Board;
import model.Move;
import model.Player;
import model.Symbol;

import java.util.HashMap;

public class RowWinningStrategy implements WinningStrategy{

    private HashMap<Symbol,Integer> rowsMap[];

    public RowWinningStrategy() {
        this.rowsMap = new HashMap[100];
    }

    @Override
    public boolean checkWinner(Move move, Board board) {
        int currRow = move.getCell().getRow();
        Symbol currPlayerSymbol = move.getPlayer().getSymbol();
        rowsMap[currRow].put(currPlayerSymbol,rowsMap[currRow].getOrDefault(currPlayerSymbol,0)+1);

        return rowsMap[currRow].get(currPlayerSymbol)==board.getSize();
    }
}
