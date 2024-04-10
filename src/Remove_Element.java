//WAP to remove specific element from an array

public class Remove_Element {
    public static void main(String[] args) {
        int[] x = {20, 10, 30, 40, 70, 90};
        int Delete = 30; // Element to delete

        for (int i = 0; i < x.length; i++) {
            if (Delete == x[i]) {
                for (int y = i; y < x.length - 1; y++) {
                    x[i] = x[y + 1];
                }
                ;
                break; //so that it does not run after finding the element
            }
        }
        for (int i = 0; i < x.length - 1; i++) {
            System.out.println(x[i] + "");

        }
    }
}

