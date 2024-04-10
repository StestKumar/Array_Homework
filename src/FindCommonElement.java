//Write a Java program to find the common elements between two arrays (string values).

import java.util.HashSet;
import java.util.Set;

public class FindCommonElement {
    public static void main(String[] args) {
        String[] Array1 = {"India", "London", "Canada", "Australia", "Germany"};
        String[] Array2 = {"India", "Canada", "Australia", "Srilanka", "Germany"};

        Set<String> output = new HashSet<>();

        for (int i = 0; i < Array1.length; i++) {
            {
                for (int j = 0; j < Array2.length; j++) {
                    if (Array1[i] == Array2[j]) {
                        output.add(Array1[i]);
                        break;
                    }
                }
            }
            for (String s : output) {
                System.out.println(s);
            }
        }
    }
}

