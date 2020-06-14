public class ArrayUtilsMain {
    public static void main(String[] args) {

        ArrayUtils utils = new ArrayUtils();

        int[] myIntegers = utils.getArrayFromInput(5);
        int[] sorted = utils.sortArray(myIntegers);
        utils.printArray(sorted);
        System.out.println("The average is " + utils.getAverage(myIntegers));
    }
}