package com.testdev.puzzle.core.domain;

/**
 * Created by oleh.krupenia on 11/8/2015.
 */
public class Cell {
    public static final String AMOUNT_OF_MINES_DO_NOT_EXIST = "Amount of mines that surrounds a cell doesn't exist if the cell contains mine";
    private boolean containsMine;
    private int numberOfMinesNearTheCell;

    public boolean containsMine() {
        return containsMine;
    }

    public void setContainsMine(boolean containsMine) {
        this.containsMine = containsMine;
    }

    public int getNumberOfMinesNearTheCell() {
        throwExceptionIfCellIsEmpty();
        return numberOfMinesNearTheCell;
    }

    public void setNumberOfMinesNearTheCell(int numberOfMinesNearTheCell) {
        throwExceptionIfCellIsEmpty();
        this.numberOfMinesNearTheCell = numberOfMinesNearTheCell;
    }

    private void throwExceptionIfCellIsEmpty() {
        if (containsMine()) {
            throw new IllegalStateException(AMOUNT_OF_MINES_DO_NOT_EXIST);
        }
    }
}
