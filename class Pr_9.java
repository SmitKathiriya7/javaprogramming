package Assignment;

class Pr_9 {
    private int[][] sudoku;

    public Pr_9() {
        sudoku = new int[9][9];
    }

    public Pr_9(int sudoku[][]) {
        this.sudoku = sudoku;
    }

    // Check Elements in Row
    private boolean containsInRow(int row, int number) {

        for (int i = 0; i < 9; i++) {
            if (sudoku[row][i] == number) {

                return false;
            }
        }
        return true;
    }

    // Check elements in Collumn
    private boolean containsInCol(int col, int number) {

        for (int i = 0; i < 9; i++) {

            if (sudoku[i][col] == number) {

                return false;
            }
        }
        return true;
    }

    // Check Elements in 3x3 box
    private boolean containsInBox(int row, int col, int number) {

        int r = row - row % 3;
        int c = col - col % 3;
        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3; j++) {
                if (sudoku[i][j] == number) {

                    return false;
                }
            }

        }
        return true;
    }

    boolean isAllowed(int row, int col, int number) {
        boolean checkforCol = containsInCol(col, number);
        boolean checkforBox = containsInBox(row, col, number);
        boolean checkforRow = containsInRow(row, number);

        return !(checkforBox || checkforCol || checkforRow);
    }
}