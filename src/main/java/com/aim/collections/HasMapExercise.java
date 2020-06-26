package com.aim.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HasMapExercise {

    public static void main(String[] args) {

        // Create a HashMap of 5 colors and their hex values
        Map<String, String> colors = new HashMap<>();
        colors.put("Red", "#FF0000");
        colors.put("Black", "#000000");
        colors.put("White", "#FFFFFFF");
        colors.put("Light Gray", "#CCCCCC");
        colors.put("Dark Gray", "#999999");

        // Loop through and print each key and value of the map
        Iterator iter = colors.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry element = (Map.Entry) iter.next();
            System.out.println("Key" + element.getKey() + ", Value: " + element.getValue());
        }

        // Check to see if one of the colors exist in the map
        boolean containsRed = colors.containsKey("Red");

        // Remove that color from the Map
        String removedColor = colors.remove("Red");

        // Write a condition to check for the existence of that color again in the Map
        // Print out something for each condition
        if (colors.containsKey(removedColor)) {
            //
            System.out.println("Color is in Map");
        } else {
            System.out.println("Color not in Map");
        }

        // Use the keySet() method to print out all keys in the map
        System.out.println(colors.keySet());

        // Use the values() method to print out all the values in the map
        System.out.println(colors.values());
    }
}