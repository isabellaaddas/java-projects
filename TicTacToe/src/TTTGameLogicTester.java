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
        System.out.printf("The winner is: %c!\n", game.find_winner());
    }
}
