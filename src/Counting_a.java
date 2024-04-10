
//WAP to enter any String and count total number of 'a' in that String.

import java.util.Scanner;

public class Counting_a {
    public static void main(String[] args) {

        String x = "Please enter any String : ";

        int totalcount = x.length();           // total length of the string
        int totalwithouta = x.replace("a", "").length();    //total length after removing a

        int count = totalcount - totalwithouta;

        System.out.println("Total number of a is : " + count);

    }
}
