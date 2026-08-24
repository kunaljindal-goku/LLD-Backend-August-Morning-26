package model;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private int size;
    private List<List<Cell>> cells;

    public Board(int size) {
        this.size = size;
        this.cells = new ArrayList<>();
        for(int r=0;r<size;r++) {
            cells.add(new ArrayList<>());
            for(int c=0;c<size;c++) {
                cells.get(r).add(new Cell(r,c));
            }
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<List<Cell>> getCells() {
        return cells;
    }

    public void setCells(List<List<Cell>> cells) {
        this.cells = cells;
    }

    public void printBoard() {
        for(int i=0;i<this.size;i++) {
            for(int j=0;j<this.size;j++) {
                this.getCells().get(i).get(j).printCell();
            }
            System.out.println();
        }
    }
}
