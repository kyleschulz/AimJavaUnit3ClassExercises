package com.aim.exceptions;

public class ExceptionHandling {

    public static int[] arrayOfNumbers = new int[10];

    public static void main(String[] args) throws Exception {

        System.out.println("\nThis program has a few errors in it and they need to be resolved:\n");

        try {

            arrayOfNumbers[9] = Integer.parseInt(args[0]);
            System.out.println("Element 10: " + arrayOfNumbers[9]);

        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            e.printStackTrace();
        }

        // Code...

        System.out.println("\nGoodbye ...\n");

    }
}