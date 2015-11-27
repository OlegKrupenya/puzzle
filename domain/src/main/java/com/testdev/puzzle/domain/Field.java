package com.testdev.puzzle.domain;

/**
 * Created by oleh.krupenia on 11/8/2015.
 */
public class Field {
    private Cell[][] cells;
    private int rows;
    private int columns;

    public Cell[][] getCells() {
        return cells;
    }

    public void setCells(Cell[][] cells) {
        this.cells = cells;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }
}
