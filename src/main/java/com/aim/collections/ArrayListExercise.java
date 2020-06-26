package com.aim.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExercise {
    public static void main(String[] args) {

        // Create an ArrayList of 3 Strings
        List<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Orange");
        colors.add("Purple");

        // Remove an element from the List of Strings
        colors.remove("Orange");

        // Add two elements to the List of Strings
        colors.add("Pink");
        colors.add("Red");

        // Create another ArrayList of 3 Strings
        List<String> numbers = new ArrayList<>();
        numbers.add("1");
        numbers.add("2");
        numbers.add("3");

        // Combine both Lists of Strings into a new ArrayList
        List<String> combinedList = new ArrayList<>();
        combinedList.addAll(colors);
        combinedList.addAll(numbers);

        // Iterate through your combined List of Strings and print each element
        Iterator<String> iterator = combinedList.iterator();

        // for ( ; ; ;) {}
        for (Iterator<String> i = combinedList.iterator(); i.hasNext();) {
            System.out.println(i.next());
        }

        // Remove your first List of Strings from your combined List.
        combinedList.removeAll(colors);

        // Clear all your Lists of Strings
        colors.clear();
        numbers.clear();
        combinedList.clear();
    }

}