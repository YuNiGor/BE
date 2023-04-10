import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        System.out.println("Welcome to Tic-Tac-Toe!");
        char player = 'X';
        char computer = 'O';
        boolean vsComputer = true;
        boolean gameEnd = false;

        // Игровой цикл
        while (!gameEnd) {
            System.out.println();
            System.out.println("Current board:");
            printBoard(board);

            if (player == 'X' || !vsComputer) {
                System.out.println("Player " + player + "'s turn");
                System.out.print("Enter row (1-3): ");
                int row = scanner.nextInt() - 1;
                System.out.print("Enter column (1-3): ");
                int col = scanner.nextInt() - 1;
                if (isValidMove(board, row, col)) {
                    board[row][col] = player;
                    if (hasWon(board, player)) {
                        System.out.println("Player " + player + " wins!");
                        gameEnd = true;
                    } else if (isBoardFull(board)) {
                        System.out.println("It's a tie!");
                        gameEnd = true;
                    } else if (!vsComputer) {
                        player = (player == 'X') ? 'O' : 'X';
                    } else {
                        player = 'O';
                    }
                } else {
                    System.out.println("Invalid move. Try again.");
                }
            } else {
                System.out.println("Computer's turn");
                int[] computerMove = getComputerMoveMinimaxAB(board, computer);
                board[computerMove[0]][computerMove[1]] = computer;
                if (hasWon(board, computer)) {
                    System.out.println("Computer wins!");
                    gameEnd = true;
                } else if (isBoardFull(board)) {
                    System.out.println("It's a tie!");
                    gameEnd = true;
                } else {
                    player = 'X';
                }
            }
        }
    }

    private static boolean isBoardFull(char[][] board) {
        // Проверка, заполнена ли доска
        for (char[] row : board) {
            for (char c : row) {
                if (c == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean hasWon(char[][] board, char player) {
        // Проверка, выиграл ли игрок
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true;
            }
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }
        return false;
    }

    private static boolean isValidMove(char[][] board, int row, int col) {
        // Проверка, является ли ход допустимым
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }
        return board[row][col] == ' ';
    }

    private static void printBoard(char[][] board) {
// Вывод игрового поля на экран
        for (char[] row : board) {
            System.out.println(row[0] + "|" + row[1] + "|" + row[2]);
            if (row != board[2]) {
                System.out.println("-+-+-");
            }
        }
    }
    private static char getWinner(char[][] board) {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return board[i][0];
            }
        }

        // Check columns
        for (int j = 0; j < 3; j++) {
            if (board[0][j] != ' ' && board[0][j] == board[1][j] && board[1][j] == board[2][j]) {
                return board[0][j];
            }
        }

        // Check diagonals
        if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return board[0][0];
        }
        if (board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return board[0][2];
        }

        // No winner yet
        return ' ';
    }

    private static int evaluate(char[][] board, char player) {
// Оценка текущего состояния доски
        if (hasWon(board, player)) {
            return 10;
        } else if (hasWon(board, (player == 'X') ? 'O' : 'X')) {
            return -10;
        } else {
            return 0;
        }
    }

    private static int[] getComputerMoveMinimaxAB(char[][] board, char computer) {
        int bestScore = Integer.MIN_VALUE;
        int[] bestMove = new int[2];
        int alpha = Integer.MIN_VALUE;
        int beta = Integer.MAX_VALUE;

// Проверяем, закончилась ли игра
        char winner = getWinner(board);
        if (winner != ' ') {
            // Если игра закончилась, возвращаем ход с соответствующей оценкой
            if (winner == computer) {
                return new int[] {bestScore, bestScore};
            } else {
                return new int[] {-bestScore, -bestScore};
            }
        }

// Проверяем, есть ли еще пустые квадраты на доске
        boolean hasEmptySquare = false;
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (board[row][col] == ' ') {
                    hasEmptySquare = true;
                    break;
                }
            }
            if (hasEmptySquare) {
                break;
            }
        }

        if (!hasEmptySquare) {
            // Если больше нет пустых квадратов на доске, возвращаем любой доступный ход
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    if (board[row][col] == ' ') {
                        return new int[] {row, col};
                    }
                }
            }
        }

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (board[row][col] == ' ') {
                    board[row][col] = computer;
                    int score = minimaxAB(board, 0, false, alpha, beta, computer);
                    board[row][col] = ' ';
                    if (score > bestScore) {
                        bestScore = score;
                        bestMove[0] = row;
                        bestMove[1] = col;
                    }
                    alpha = Math.max(alpha, bestScore);
                    if (beta <= alpha) {
                        break;
                    }
                }
            }
        }
        return bestMove;
    }



        private static int minimaxAB(char[][] board, int depth, boolean isMaximizingPlayer, int alpha, int beta, char computer) {
// Рекурсивная функция алгоритма минимакс с альфа-бета отсечением
            int score = evaluate(board, computer);
            if (score == 10 || score == -10 || isBoardFull(board)) {
                return score;
            }
            if (isMaximizingPlayer) {
                int bestScore = Integer.MIN_VALUE;
                for (int row = 0; row < 3; row++) {
                    for (int col = 0; col < 3; col++) {
                        if (board[row][col] == ' ') {
                            board[row][col] = computer;
                            int currentScore = minimaxAB(board, depth + 1, false, alpha, beta, computer);
                            board[row][col] = ' ';
                            bestScore = Math.max(bestScore, currentScore);
                            alpha = Math.max(alpha, bestScore);
                            if (beta <= alpha) {
                                break;
                            }
                        }
                    }
                }
                return bestScore;
            } else {
                int bestScore = Integer.MAX_VALUE;
                for (int row = 0; row < 3; row++) {
                    for (int col = 0; col < 3; col++) {
                        if (board[row][col] == ' ') {
                            board[row][col] = (computer == 'X') ? 'O' : 'X';
                            int currentScore = minimaxAB(board, depth + 1, true, alpha, beta, computer);
                            board[row][col] = ' ';
                            bestScore = Math.min(bestScore, currentScore);
                            beta = Math.min(beta, bestScore);
                            if (beta <= alpha) {
                                break;
                            }
                        }
                    }
                }
                return bestScore;
            }
        }
    }