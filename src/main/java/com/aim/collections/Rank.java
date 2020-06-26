package com.aim.collections;

public enum Rank {
    ACE("Ace"), TWO("Two"), THREE("Three"), FOUR("Four"), FIVE("Five"), SIX("Six"), SEVEN("Seven"), EIGHT("Eight"),
    NINE("Nine"), TEN("Ten"), JACK("Jack"), QUEEN("Queen"), KING("King");

    public final String label;

    private Rank(String label) {
        this.label = label;
    }

}