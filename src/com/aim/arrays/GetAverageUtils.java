package com.aim.arrays;

public class GetAverageUtils {

    public static void main(String[] args) {
        // Get 5 Integers from User, Display them, Calculate, Display Average
        ArrayUtils utils = new ArrayUtils();

        int[] myIntegers = utils.getArrayFromInput(5);
        utils.printArray(myIntegers);
        System.out.println("The average is " + utils.getAverage(myIntegers));

    }

}