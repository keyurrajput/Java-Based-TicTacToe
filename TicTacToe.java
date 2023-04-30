import java.util.Scanner;

public class TicTacToe {
    private static final int BOARD_SIZE = 3;
    private static final char PLAYER_X = 'X';
    private static final char PLAYER_O = 'O';

    public static void main(String[] args) {
        char[][] board = new char[BOARD_SIZE][BOARD_SIZE];
        initializeBoard(board);
        int player1Score = 0;
        int player2Score = 0;
        char currentPlayer = PLAYER_X;
        boolean isGameOver = false;
        while (!isGameOver) {
            System.out.printf("Score - Player X: %d | Player O: %d%n", player1Score, player2Score);
            displayBoard(board);
            int[] move = getPlayerMove(currentPlayer);
            int row = move[0] - 1;
            int col = move[1] - 1;

            if (board[row][col] == '\u0000') {
                board[row][col] = currentPlayer;

                if (isWinningMove(board, currentPlayer)) {
                    displayBoard(board);
                    System.out.printf("Player %s wins!", currentPlayer);
                    if (currentPlayer == PLAYER_X) {
                        player1Score++;
                    } else {
                        player2Score++;
                    }
                    System.out.printf("Score - Player X: %d | Player O: %d%n", player1Score, player2Score);
                    isGameOver = true;
                } else if (isBoardFull(board)) {
                    displayBoard(board);
                    System.out.println("The game is a tie!");
                    if (isBoardFull(board)) {
                        displayBoard(board);
                        System.out.println("The game is a tie!");
                        System.out.print("Do you want to play again? (y/n): ");
                        Scanner scanner = new Scanner(System.in);
                        String input = scanner.next();
                        if (input.equalsIgnoreCase("y")) {
                            initializeBoard(board);
                            isGameOver = false;
                        } else {
                            isGameOver = true;
                        }
                    }
                } else {
                    currentPlayer = currentPlayer == PLAYER_X ? PLAYER_O : PLAYER_X;
                }
            } else {
                System.out.println("That cell is already taken. Try again.");
            }
        }
    }

    private static void initializeBoard(char[][] board) {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                board[i][j] = '\u0000';
            }
        }
    }

    private static void displayBoard(char[][] board) {
        System.out.println("   1 2 3");
        for (int i = 0; i < BOARD_SIZE; i++) {
            System.out.printf("%d ", i + 1);
            for (int j = 0; j < BOARD_SIZE; j++) {
                System.out.printf("%s ", board[i][j] == '\u0000' ? " " : board[i][j]);
                if (j < BOARD_SIZE - 1) {
                    System.out.print("| ");
                }
            }
            System.out.println();
            if (i < BOARD_SIZE - 1) {
                System.out.println("  ----------");
            }
        }
    }

    private static int[] getPlayerMove(char currentPlayer) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Player %s, enter your move (row column):%n", currentPlayer);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        return new int[] { row, col };
    }

    private static boolean isWinningMove(char[][] board, char player) {
        for (int i = 0; i < BOARD_SIZE; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true; // horizontal win
            }
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true; // vertical win
            }
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true; // diagonal win
        }
        return false;
        
    }
    private static boolean isBoardFull(char[][] board) {
        for (int i = 0; i < BOARD_SIZE; i++) {
        for (int j = 0; j < BOARD_SIZE; j++) {
        if (board[i][j] == '\u0000') {
        return false;
            }
        }
    }
        return true;
   }
}
