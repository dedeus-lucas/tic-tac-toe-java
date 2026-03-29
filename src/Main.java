import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Board board = game.getBoard();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== JOGO DA VELHA ===");

        while (true) {
            board.printBoard();

            System.out.println("Jogador " + game.getCurrentPlayer() + ", informe linha e coluna (1 a 3):");

            int row;
            int col;

            while (true) {
                if (scanner.hasNextInt()) {
                    row = scanner.nextInt();
                } else {
                    System.out.println("Entrada inválida! Digite números de 1 a 3.");
                    scanner.next();
                    continue;
                }

                if (scanner.hasNextInt()) {
                    col = scanner.nextInt();
                } else {
                    System.out.println("Entrada inválida! Digite números de 1 a 3.");
                    scanner.next();
                    continue;
                }

                if (row >= 1 && row <= 3 && col >= 1 && col <= 3) {
                    row--;
                    col--;
                    break;
                } else {
                    System.out.println("Valores fora do intervalo! Use números de 1 a 3.");
                }
            }

            char player = game.getCurrentPlayer();

            if (board.isPositionEmpty(row, col)) {
                board.makeMove(row, col, player);

                if (board.checkWin(player)) {
                    board.printBoard();
                    System.out.println("Jogador " + player + " venceu!");
                    break;
                }

                if (board.isFull()) {
                    board.printBoard();
                    System.out.println("Empate!");
                    break;
                }

                game.switchPlayer();
            } else {
                System.out.println("Posição já ocupada! Tente novamente.");
            }
        }

        scanner.close();
    }
}