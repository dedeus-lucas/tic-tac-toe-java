import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            game.getBoard().printBoard();

            System.out.println("Jogador " + game.getCurrentPlayer() + ", informe linha e coluna (1 a 3):");

            int row = scanner.nextInt() - 1;
            int col = scanner.nextInt() - 1;

            if (game.getBoard().isPositionEmpty(row, col)) {
                game.getBoard().makeMove(row, col, game.getCurrentPlayer());
                game.switchPlayer();
            } else {
                System.out.println("Posição já ocupada! Tente novamente.");
            }
        }
    }
}