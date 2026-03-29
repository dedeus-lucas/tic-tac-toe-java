import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            game.getBoard().printBoard();

            System.out.println("Jogador " + game.getCurrentPlayer() + ", informe linha e coluna (0 a 2):");

            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (game.getBoard().isPositionEmpty(row, col)) {
                game.getBoard().makeMove(row, col, game.getCurrentPlayer());
                game.switchPlayer();
            } else {
                System.out.println("Posição já ocupada! Tente novamente.");
            }
        }
    }
}