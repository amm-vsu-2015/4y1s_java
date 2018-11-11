package com.pavbox;

class QueenBoard {

    private final static int SIZE = 8;

    private boolean board[][] = new boolean[SIZE][SIZE];
    
    private boolean needToShow = true;

    private void showBoard() {
        for (int idx_a = 0; idx_a < SIZE; ++idx_a) {
            for (int idx_b = 0; idx_b < SIZE; ++idx_b) {
                System.out.print(board[idx_a][idx_b] ? "O " : ". ");
            }
            System.out.println();
        }
        System.out.println();
    }

    /// Queens watch only on row and top left/right diagonalies.
    /// They don't need to know what under them (bc, nothing now).
    private boolean tryQueen(int row, int column) {

        // check only columns
        for (int idx_i = 0; idx_i < column; ++idx_i) {
            if (board[row][idx_i]) {
                return false;
            }
        }

        // check diag top left from queen
        for (int idx_i = 1; idx_i <= column && (row - idx_i >= 0); ++idx_i) {
            if (board[row - idx_i][column - idx_i]) {
                return false;
            }
        }

        // check diag top right from queen
        for (int idx_i = 1; idx_i <= column && (row + idx_i < SIZE); idx_i++) {
            if (board[row + idx_i][column - idx_i]) {
                return false;
            }
        }

        return true;
    }

    // Public API

    // counter is count of solution
    // solution is selected variant of queens positions
    void setQueen(int column) {
        // show selected suluions and similar mirrored solution

        if (column == SIZE && needToShow) {
            showBoard();
            needToShow = false;
            return;
        }

        for (int idx_i = 0; idx_i < SIZE; ++idx_i) {
            if (tryQueen(idx_i, column)) {
                board[idx_i][column] = true; // set queen
                setQueen(column + 1);
                board[idx_i][column] = false; // set queen
            }
        }
    }

}
