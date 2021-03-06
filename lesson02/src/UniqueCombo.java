/*
Write a Java program to create and display unique
three-digit number using 1, 2, 3, 4.
Repeating numbers are not allowed
 */
public class UniqueCombo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        printUnique(arr);
    }

    private static void printUnique(int[] arr) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k <= 4; k++) {
                    if (k != i && k != j && i != j) {
                        System.out.println(i + "" + j + "" + k);
                    }
                }
            }
        }
    }
}
