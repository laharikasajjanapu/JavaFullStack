package com.game;

import java.util.Scanner;

public class Tic_Tac_Toe {

    static Scanner sc = new Scanner(System.in);

    static char[][] board = {
            { ' ', ' ', ' ' },
            { ' ', ' ', ' ' },
            { ' ', ' ', ' ' }
    };


    static void Board() {

        System.out.println("-------");

        for (int i = 0; i < 3; i++) {

            System.out.print("|");

            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + "|");
            }

            System.out.println();
            System.out.println("-------");
        }
    }


    static boolean CheckBoard(int mark, char symbol) {

        if (mark < 1 || mark > 9) {
            System.out.println("Please enter a number from 1 to 9");
            return false;
        }

        int row = (mark - 1) / 3;
        int col = (mark - 1) % 3;

        if (board[row][col] != ' ') {
            System.out.println("This position is already filled!");
            return false;
        }

        board[row][col] = symbol;
        return true;
    }


    static boolean isMatched() {

        // Check Rows
        for (int i = 0; i < 3; i++) {

            if (board[i][0] != ' ' &&
                    board[i][0] == board[i][1] &&
                    board[i][1] == board[i][2]) {

                return true;
            }
        }

        // Check Columns
        for (int j = 0; j < 3; j++) {

            if (board[0][j] != ' ' &&
                    board[0][j] == board[1][j] &&
                    board[1][j] == board[2][j]) {

                return true;
            }
        }

        // Check Diagonal
        if (board[0][0] != ' ' &&
                board[0][0] == board[1][1] &&
                board[1][1] == board[2][2]) {

            return true;
        }

        if (board[0][2] != ' ' &&
                board[0][2] == board[1][1] &&
                board[1][1] == board[2][0]) {

            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println("---------Welcome to Tic Tac Toe Game---------");
        System.out.println("---------------------------------------------");

        Board();

        System.out.println("Enter Player1 Name:");
        String p1 = sc.next();

        System.out.println("Enter Player2 Name:");
        String p2 = sc.next();

        int count = 0;

        while (count < 9) {

            // Player 1
            System.out.println(p1 + " (X), choose a position (1 to 9):");

            int mark = sc.nextInt();

            if (CheckBoard(mark, 'X')) {

                count++;
                Board();

                if (isMatched()) {
                    System.out.println( p1 + " is the Winner!");
                    break;
                }

            } else {
                continue;
            }

            if (count == 9) {
                break;
            }

            // Player 2
            System.out.println(p2 + " (O), choose a position (1 to 9):");

            mark = sc.nextInt();

            if (CheckBoard(mark, 'O')) {

                count++;
                Board();

                if (isMatched()) {
                    System.out.println( p2 + " is the Winner!");
                    break;
                }
            }
        }

        // Draw Condition
        if (!isMatched() && count == 9) {
            System.out.println("Game Draw!");
        }

        System.out.println("---------Game Over---------");

        sc.close();
    }
}