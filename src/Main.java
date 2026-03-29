public class Main {
    public static void main(String[] args) {
        Board board = new Board();

        // Primeira jogada
        if (board.isPositionEmpty(0, 0)) {
            board.makeMove(0, 0, 'X');
        }

        // Tentando jogar na mesma posição
        if (board.isPositionEmpty(0, 0)) {
            board.makeMove(0, 0, 'O');
        } else {
            System.out.println("Posição já ocupada!");
        }

        board.printBoard();
    }
}