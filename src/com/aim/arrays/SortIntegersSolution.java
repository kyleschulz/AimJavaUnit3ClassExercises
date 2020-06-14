import java.util.Scanner;

public class SortIntegersSolution {
    public static void main(String[] args) {
        int[] myIntegers = getArrayFromInput(5);
        int[] sorted = sortArray(myIntegers);
        printArray(sorted);
    }

    public static int[] getArrayFromInput(int number) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + number + " integer values.\r");

        int[] array = new int[number];
        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
        }

        scanner.close();
        return array;

    }

    /**
     * Insert Sorty Algorith
     * 
     * int[] array = {24, 6, 32, 15, 57, 44}
     * 
     * @param array
     * @return
     */
    public static int[] sortArray(int[] array) {
        int temp;

        // Go through the array one at a time
        for (int i = 1; i < array.length; i++) {

            // Go backwards through the array finding where the item should go
            for (int j = i; j > 0; j--) {

                // If number is less than the ... switch places
                if (array[j] < array[j - 1]) {

                    // Temporarily store the value that is being checked
                    temp = array[j];

                    // Store the larger number in the current sport
                    array[j] = array[j - 1];

                    // Move the number back a spot by storing it in
                    array[j - 1] = temp;
                }
            }
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Array element " + i + " is " + array[i]);
        }
    }
}