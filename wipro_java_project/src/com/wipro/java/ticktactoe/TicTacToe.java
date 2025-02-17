package com.wipro.java.ticktactoe;

import java.util.Scanner;

public class TicTacToe {
    private static char[][] board = new char[3][3]; // 3x3 board
    private static char currentPlayer = 'X'; // Start with 'X'

    // Method to initialize the board
    public static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' '; // Empty spaces on the board
            }
        }
    }

    // Method to display the board
    public static void displayBoard() {
        System.out.println("\nCurrent Board:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) System.out.print(" | ");
            }
            System.out.println();
            if (i < 2) System.out.println("---------");
        }
    }

    // Method to check if a player has won
    public static boolean checkWin() {
        // Check rows, columns, and diagonals
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                return true;
            }
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
                return true;
            }
        }
        // Diagonals
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
            return true;
        }
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
            return true;
        }
        return false;
    }

    // Method to check if the board is full (draw)
    public static boolean checkDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false; // There's still an empty spot
                }
            }
        }
        return true; // No empty spots left, it's a draw
    }

    // Method to play the game
    public static void playGame() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayBoard();
            System.out.println("Player " + currentPlayer + "'s turn:");
            System.out.print("Enter row (1-3): ");
            int row = scanner.nextInt() - 1; // 0-based indexing
            System.out.print("Enter column (1-3): ");
            int col = scanner.nextInt() - 1;

            // Check if the position is valid
            if (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != ' ') {
                System.out.println("Invalid move, try again.");
                continue;
            }

            // Make the move
            board[row][col] = currentPlayer;

            // Check for win or draw
            if (checkWin()) {
                displayBoard();
                System.out.println("Player " + currentPlayer + " wins!");
                break;
            } else if (checkDraw()) {
                displayBoard();
                System.out.println("It's a draw!");
                break;
            }

            // Switch player
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }

        scanner.close();
    }

    public static void main(String[] args) {
        // Initialize the board and start the game
        initializeBoard();
        playGame();
    }
}
