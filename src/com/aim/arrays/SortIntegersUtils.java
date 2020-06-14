public class SortIntegersUtils {
    public static void main(String[] args) {
        // Sort 5 Inputed Integers
        ArrayUtils utils = new ArrayUtils();

        int[] myIntegers = utils.getArrayFromInput(5);
        int[] sorted = utils.sortArray(myIntegers);
        utils.printArray(sorted);
    }
}