/*
 * This is a test file with a main method to test the
 * Tic-Tac-Toe game logic. It should test every method in
 * the class and simulate a game using normal operations.
 */

public class TTTGameLogicTester {
    public static void main(String[] args) {
        TTTGameLogic game = new TTTGameLogic();

        // Print the board before starting a game
        game.print_board();
        System.out.printf("\nThe winner is: %c!\n", game.find_winner());

        System.out.println("\nAttempting a new move at [1][1]: ");
        game.make_move('x', 1, 1);
        game.print_board();

        System.out.println("\nAttempting a new move at [0][1]: ");
        game.make_move('o', 0, 1);
        game.print_board();

        System.out.println("\nAttempting a new move at [1][2]: ");
        game.make_move('x', 1, 2);
        game.print_board();

        System.out.println("\nAttempting a new move at [1][0]: ");
        game.make_move('o', 1, 0);
        game.print_board();

        System.out.println("\nAttempting a new move at [2][0]: ");
        game.make_move('x', 2, 0);
        game.print_board();

        System.out.println("\nAttempting a new move at [0][0]: ");
        game.make_move('o', 0, 0);
        game.print_board();

        System.out.println("\nAttempting a new move at [0][2]: ");
        game.make_move('x', 0, 2);
        game.print_board();
    }
}
