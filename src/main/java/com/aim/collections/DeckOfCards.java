package com.aim.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeckOfCards {

    private List<Card> cards = null;

    DeckOfCards() {
        cards = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

}