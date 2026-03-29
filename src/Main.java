public class Main {
    public static void main(String[] args) {
        Board board = new Board();

        board.makeMove(0, 0, 'X');
        board.makeMove(1, 1, 'O');

        board.printBoard();
    }
}