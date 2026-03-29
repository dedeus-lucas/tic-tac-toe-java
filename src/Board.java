public class Board {
    private final char[][] grid;

    public Board() {
        grid = new char[3][3];
        initialize();
    }

    private void initialize() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = ' ';
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            System.out.println(
                    grid[i][0] + " | " + grid[i][1] + " | " + grid[i][2]
            );
            if (i < 2) System.out.println("--+---+--");
        }
    }

    public void makeMove(int row, int col, char player) {
        grid[row][col] = player;
    }

    public boolean isPositionEmpty(int row, int col) {
        return grid[row][col] == ' ';
    }

    public boolean checkWin(char player) {
        // verificar linhas
        for (int i = 0; i < 3; i++) {
            if (grid[i][0] == player &&
                    grid[i][1] == player &&
                    grid[i][2] == player) {
                return true;
            }
        }

        // verificar colunas
        for (int j = 0; j < 3; j++) {
            if (grid[0][j] == player &&
                    grid[1][j] == player &&
                    grid[2][j] == player) {
                return true;
            }
        }

        // diagonal principal
        if (grid[0][0] == player &&
                grid[1][1] == player &&
                grid[2][2] == player) {
            return true;
        }

        // diagonal secundária
        if (grid[0][2] == player &&
                grid[1][1] == player &&
                grid[2][0] == player) {
            return true;
        }

        return false;
    }
}
