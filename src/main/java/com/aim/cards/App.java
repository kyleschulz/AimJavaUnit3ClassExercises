package com.aim.cards;

public class App {

    public static void main(String[] args) {

        Deck deck = new Deck();
        deck.shuffle();
        System.out.println(deck);

    }

}