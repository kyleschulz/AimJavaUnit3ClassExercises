package com.aim.cards;

import java.util.Arrays;

public class Deck {

    public static final int DECK_COUNT = 52;
    private Card[] deckOfCards;

    Deck() {

        deckOfCards = new Card[DECK_COUNT];

        int i = 0;
        for (int rank = 1; rank <= 13; rank++) {
            deckOfCards[i++] = new Card("Heart", rank);
            deckOfCards[i++] = new Card("Spade", rank);
            deckOfCards[i++] = new Card("Club", rank);
            deckOfCards[i++] = new Card("Diamond", rank);
        }

    }

    public void shuffle() {
        // [1H, 2H, 3H... 11S, 12S]

        int cardOne = 0;
        int cardTwo = 0;
        Card temp = null;

        for (int i = 0; i < 500; i++) {
            cardOne = (int) (DECK_COUNT * Math.random());
            cardTwo = (int) (DECK_COUNT * Math.random());

            temp = deckOfCards[cardOne];
            deckOfCards[cardOne] = deckOfCards[cardTwo];
            deckOfCards[cardTwo] = temp;
        }

    }

    @Override
    public String toString() {
        StringBuilder deck = new StringBuilder();

        int i = 0;
        for (Card card : deckOfCards) {
            deck.append("[" + ++i + "] " + card + "\n");
        }

        return deck.toString();
    }

    public Card[] getDeckOfCards() {
        return deckOfCards;
    }

    public void setDeckOfCards(Card[] deckOfCards) {
        this.deckOfCards = deckOfCards;
    }

}