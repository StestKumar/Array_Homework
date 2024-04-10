//9.WAP to input the 5 digit number and then reverse it

import java.util.Scanner;

public class Reverse_input
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any 5 Digit you want : ");
        int Num = scanner.nextInt();

        StringBuilder stringBuilder = new StringBuilder(); //inbuilt String method

        stringBuilder.append(Num); //method in Stringbuilder

        StringBuilder reverse = stringBuilder.reverse();

        System.out.println("Reverse number is :" + reverse);




    }

}
