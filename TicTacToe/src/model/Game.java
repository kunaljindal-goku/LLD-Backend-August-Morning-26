package model;

import exception.InvalidBoardSizeException;
import model.enums.GameState;
import strategy.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private Board board;
    private List<Player> players;
    private List<Move> moves;
    private Player winner;
    private int currPlayerTurn;
    private GameState gameState;
    private List<WinningStrategy> winningStrategies;

    public static Builder getBuilder() {
        return new Builder();
    }

    private Game(int boardSize,
                List<Player> players,
                List<WinningStrategy> winningStrategies) {
        this.board = new Board(boardSize);
        this.players = players;
        this.moves = new ArrayList<>();
        this.winner = null;
        this.currPlayerTurn = 0;
        this.gameState = gameState;
        this.winningStrategies = winningStrategies;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public int getCurrPlayerTurn() {
        return currPlayerTurn;
    }

    public void setCurrPlayerTurn(int currPlayerTurn) {
        this.currPlayerTurn = currPlayerTurn;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }

    public static class Builder {
        private int boardSize;
        private List<Player> players;
        private List<WinningStrategy> winningStrategies;

        public Builder setBoardSize(int boardSize) {
            this.boardSize = boardSize;
            return this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }

        public Game build() {
            validate();
            return new Game(boardSize,players,winningStrategies);
        }

        public void validate() {
            validateNumberOfPlayers();
            validateMinSize();
        }

        private void validateMinSize() {
            if(boardSize < 3) {
                throw new InvalidBoardSizeException("Min board size is 3");
            }
        }

        private void validateNumberOfPlayers() {
            // 2 -> n-1
        }
    }
}
