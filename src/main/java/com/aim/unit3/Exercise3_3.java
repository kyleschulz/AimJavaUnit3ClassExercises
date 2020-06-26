package com.aim.unit3;

import java.util.Scanner;

import com.aim.polydemo.Triangle;

public class Exercise3_3 {
    public static void main(String[] args) {
        System.out.println("This program gets input for three triangles from the user.");
        System.out.println(" It then creates three Triangle objects and displays the ");
        System.out.println("description of each.");

        Triangle[] triangles = new Triangle[3];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < triangles.length; i++) {
            Triangle triangle = new Triangle();
            triangles[i] = triangle;

            System.out.println("Enter the color of a triangle (e.g. \"red\"");
            triangle.setColor(input.next());

            System.out.println("Is the triangle filled (y or n)");
            String filled = input.next();

            if (filled.equals("y")) {
                triangle.setFilled(true);
            } else if (filled.equals("n")) {
                triangle.setFilled(false);
            }

            System.out.println("Enter the lengths of the three sides of the triangle:");
            triangle.setSide1(input.nextDouble());
            triangle.setSide2(input.nextDouble());
            triangle.setSide3(input.nextDouble());

        }

        input.close();

        for (Triangle triangle : triangles) {

            // Triangle: side1 = 3.0, side2 = 4.0, side 3 = 5.0
            // created on Wed May...
            // color: red and filled = true
            System.out.println(triangle);
            // Area
            System.out.println("Area = " + triangle.getArea());
        }

        System.out.println("Goodbye ...");

    }
}