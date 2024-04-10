//WAP to transpose matrix of 2-D array

import java.util.Scanner;

public class Transpose_Matrix {
//Transpose - Row becomes Column and Column becomes Row

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //scanner class for user input
        System.out.println("Please enter no. of Row : ");
        int R = scanner.nextInt();

        System.out.println("Please enter no. of Colomns : ");
        int C = scanner.nextInt();

        int Matrix[][] = new int[R][C]; // Declaration & Instantiation
        System.out.println("Enter any " + (R * C) + " numbers");

        for (int x = 0; x < R; x++) {
            for (int y = 0; y < C; y++)
                Matrix[x][y] = scanner.nextInt();

        }
        System.out.println("Original Matrix"); //to print matrix before transpose
        for (int x = 0; x < R; x++) {
            for (int y = 0; y < C; y++) {
                System.out.print(Matrix[x][y] + "         ");
            }
            System.out.println();
        }
        System.out.println("Transpose Matrix"); // to print matrix after transpose
        for (int x = 0; x < C; x++) {
            for (int y = 0; y < R; y++) {
                System.out.print(Matrix[y][x] + "         ");
            }
            System.out.println();
        }
    }
}