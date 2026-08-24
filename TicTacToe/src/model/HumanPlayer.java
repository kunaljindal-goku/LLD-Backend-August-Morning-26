package model;

import model.enums.PlayerType;

import java.util.Scanner;

public class HumanPlayer extends Player{

    // singleton scanner built at class loading
    private final static Scanner sc = new Scanner(System.in);

    public HumanPlayer(String name, int playerId, Symbol symbol) {
        super(name, playerId, symbol, PlayerType.HUMAN);
    }

    @Override
    public Move makeMove(Board board) {
        System.out.println("Please enter row and col in which you want to make the move");
        int row = sc.nextInt();
        int col = sc.nextInt();
        return new Move(new Cell(row,col),this);
    }
}
