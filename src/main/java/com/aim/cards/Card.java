package com.aim.cards;

public class Card {

    private String suit;
    private int rank;

    Card() {

    }

    Card(String suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {

        // 1 Hearts
        String rankName = null;

        switch (rank) {
            case 1:
                rankName = "Ace";
                break;
            case 11:
                rankName = "Jack";
                break;
            case 12:
                rankName = "Queen";
                break;
            case 13:
                rankName = "King";
                break;
            default:
                rankName = String.valueOf(rank);
        }

        // Ace of Hearts
        return "Card: " + rankName + " of " + suit + "s";
    }

}