import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any number :");
        int Number = scanner.nextInt();

        int A1 = Number;
        int length = 0;

        while (A1 != 0)
        {
            length = length + 1;
            A1 = A1 / 10;
        }

        int A2 = Number;
        int Armstrong = 0;
        int Remainder;
        while (A2 != 0)
        {
            int Multiply = 1;
            Remainder = A2 % 10;
            for (int i = 1; i <= length; i++)
            {
                Multiply = Multiply * Remainder;
            }

            Armstrong = Armstrong + Multiply;
            A2 = A2 / 10;

        }
        if (Armstrong == Number) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");

        }
    }

}

