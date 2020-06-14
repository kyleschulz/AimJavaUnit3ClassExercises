package com.aim.arrays;

import java.util.Scanner;

public class GetAverageSolutionRefactored {

    public static void main(String[] args) {
        int[] myIntegers = getArrayFromInput(5);
        printArray(myIntegers);
        System.out.println("The average is " + getAverage(myIntegers));
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

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / (double) array.length;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Array element " + i + " is " + array[i]);
        }
    }

}