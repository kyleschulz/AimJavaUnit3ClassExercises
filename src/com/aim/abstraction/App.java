package com.aim.abstraction;

import com.aim.animals.Dog;
import com.aim.animals.Pet;

public class App {
    public static void main(String[] args) {
        playWith(new Dog());
    }

    static void playWith(Pet pet) {
        pet.play();
    }
}