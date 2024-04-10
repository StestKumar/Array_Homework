import java.util.Arrays;
import java.util.Scanner;

//WAP to enter array and sort the values in ascending order

public class Ascending_Order {
    public static void main(String[] args) {
        int x[] = {30, 40, 70, 20, 90}; // Defining array

        System.out.println("Arrays BEFORE sorting in ascending order  :" + Arrays.toString(x));
        Arrays.sort(x); // Method used to sort the array in ascending order
        System.out.println("Arrays AFTER sorting in ascending order :" + Arrays.toString(x));
    }

}
