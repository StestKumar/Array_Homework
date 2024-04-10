
//Write a Java program to test the equality of two arrays.

import java.lang.reflect.Array;
import java.util.Arrays;

public class Equality_Check {

    public static void main(String[] args) {
        int x1[] = {8, 7, 6, 5, 4};  //Defining array
        int x2[] = {8, 7, 6, 5, 4,}; //Defining array

        Boolean status = Arrays.equals(x1, x2); //using equals method to check the equality

        if (status == true) { //using if, else
            System.out.println(" \"Arrays are equal\"");
        } else {
            System.out.println(" \"Arrays are not equal\"");
        }
    }
}