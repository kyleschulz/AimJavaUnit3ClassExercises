package com.aim.collections;

public class App {
    public static void main(String[] args) {
        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();

        for (Card card : deck.getCards()) {
            System.out.println("Card: " + card.suit.label + " of " + card.rank.label);
        }

    }
}