package com.aim.animals;

public class Chicken implements Pet, Edible {

    @Override
    public void howToEat() {
        System.out.println("Raising Caines!");
    }

    @Override
    public void play() {
        System.out.println("Chase them around");

    }

    @Override
    public String howToPlay() {
        // TODO Auto-generated method stub
        return null;
    }

}