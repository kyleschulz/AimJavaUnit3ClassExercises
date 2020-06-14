package com.aim.arrays;

import java.util.Scanner;

public class GetAverageSolution {

    public static void main(String[] args) {

        // Set how many integers
        int number = 5;

        // Ask User to:
        // Enter "number" integer values. Press Enter after each integer.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + number + " integer values.\r");

        int[] array = new int[number];
        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();

        // Print all integer values entered by user
        for (int i = 0; i < array.length; i++) {
            System.out.println("Array element " + i + " is " + array[i]);
        }

        // Get Average of all integers
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = (double) sum / (double) array.length;

        // Print Average
        // The average is "average".
        System.out.println("The average is " + average);

    }

}