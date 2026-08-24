package strategy;

import model.Board;
import model.Cell;
import model.Move;
import model.Player;
import model.enums.CellState;

public class EasyBotStrategy implements BotPlayingStrategy{
    @Override
    public Move makeMove(Board board) {
        for(int i=0;i<board.getSize();i++) {
            for(int j=0;j<board.getSize();j++) {
                if(board.getCells().get(i).get(j).getCellState().equals(CellState.EMPTY)) {
                    return new Move(new Cell(i,j),null);
                }
            }
        }

        return null;
    }
}
