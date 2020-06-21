package com.aim.polydemo;

public class FinalRectangle {

    public static void main(String[] args) {

        // Tells the user what the program does.
        System.out.println("\nThis program creates two rectangle objects and "
                + "displays their width, height, area and perimeter.");

        // Create two rectangle objects
        Rectangle rectangleOne = new Rectangle(4, 40);
        Rectangle rectangleTwo = new Rectangle(3.5, 5);

        // Call the Methods in Rectangle class and output their info
        print(rectangleOne, 1);
        print(rectangleTwo, 2);

        // Output Goodbye
        System.out.println("\nGoodbye ...\n");
    }

    /**
     * Output the width, height, area and permieter of a rectangle, with 2 digits
     * after the decimal point
     * 
     * @param rectangle
     * @param number
     */
    public static void print(Rectangle rectangle, int number) {
        System.out.println("\nRectangle " + number + ":");
        System.out.printf("height = %1.2f", rectangle.getHeight());
        System.out.printf("\nwidth = %1.2f", rectangle.getWidth());
        System.out.printf("\narea = %1.2f", rectangle.getArea());
        System.out.printf("\nperimeter = %1.2f\n", rectangle.getPerimeter());

    }

}