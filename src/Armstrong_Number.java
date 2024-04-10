//WAP to input any number and find out if its Armstrong number or not?

import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        // Declare the variables to be used
        int Number;
        int Rem;
        int Armstrong = 0;

        System.out.println("Please enter any number :");
        Scanner scanner = new Scanner(System.in);
        Number = scanner.nextInt();

        int x = Number;

        while (Number > 0) {
            Rem = Number % 10;
            Armstrong = (Rem * Rem * Rem) + Armstrong;
            Number = Number / 10;

        }
        if (x == Armstrong) // both the variable should be equal
            System.out.println("Number entered is a Armstrong number");
        else {
            System.out.println("Number entered is not a Armstrong number");
        }

    }
}