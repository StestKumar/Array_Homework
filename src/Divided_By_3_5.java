//10.WAP to print the numbers between 1 to 100 which can be divided by 3 and 5 separately

import java.util.Scanner;

public class Divided_By_3_5 {
    public static void main(String[] args) {

        int Number;

        for (Number = 1; Number <= 100; Number++) {
            if (Number % 3 == 0 || Number % 5 == 0) { //logical operator OR used
                System.out.println(Number);
            }
        }
    }
}