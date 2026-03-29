public class Game {
    private final Board board;
    private char currentPlayer;

    public Game() {
        this.board = new Board();
        this.currentPlayer = 'X';
    }

    public Board getBoard() {
        return board;
    }

    public char getCurrentPlayer() {
        return currentPlayer;
    }

    public void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}
