package com.aim.exceptions;

public class ExceptionHandling {

    public static int[] arrayOfNumbers = new int[10];

    public static void main(String[] args) {

        System.out.println("\nThis program has a few errors in it and they need to be resolved:\n");

        arrayOfNumbers[10] = Integer.parseInt(args[0]);
        System.out.println("Element 10: " + arrayOfNumbers[10]);

        System.out.println("\nGoodbye ...\n");

    }
}