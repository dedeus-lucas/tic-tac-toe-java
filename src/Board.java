public class Board {
    private char[][] grid;

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
}
