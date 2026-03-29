import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            game.getBoard().printBoard();

            System.out.println("Jogador " + game.getCurrentPlayer() + ", informe linha e coluna (1 a 3):");

            int row;
            int col;

            while (true) {
                if (scanner.hasNextInt()) {
                    row = scanner.nextInt();
                } else {
                    System.out.println("Entrada inválida! Digite números de 1 a 3.");
                    scanner.next(); // limpa entrada inválida
                    continue;
                }

                if (scanner.hasNextInt()) {
                    col = scanner.nextInt();
                } else {
                    System.out.println("Entrada inválida! Digite números de 1 a 3.");
                    scanner.next();
                    continue;
                }

                // valida intervalo (1 a 3)
                if (row >= 1 && row <= 3 && col >= 1 && col <= 3) {
                    row = row - 1;
                    col = col - 1;
                    break;
                } else {
                    System.out.println("Valores fora do intervalo! Use números de 1 a 3.");
                }
            }

            if (game.getBoard().isPositionEmpty(row, col)) {
                char player = game.getCurrentPlayer();

                game.getBoard().makeMove(row, col, player);

                // verifica vitória ANTES de trocar jogador
                if (game.getBoard().checkWin(player)) {
                    game.getBoard().printBoard();
                    System.out.println("Jogador " + player + " venceu!");
                    break;
                }

                game.switchPlayer();
            } else {
                System.out.println("Posição já ocupada! Tente novamente.");
            }
        }
    }
}