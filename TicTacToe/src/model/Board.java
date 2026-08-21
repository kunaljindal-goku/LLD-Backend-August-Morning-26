package model;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private int size;
    private List<List<Cell>> cells;

    public Board(int size) {
        this.size = size;
        for(int r=0;r<size;r++) {
            cells.add(new ArrayList<>());
            for(int c=0;c<size;c++) {
                cells.get(r).add(new Cell(r,c));
            }
        }
    }
}
