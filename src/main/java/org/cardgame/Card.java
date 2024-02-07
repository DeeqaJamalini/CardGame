package org.cardgame;

class Card {
    private final int value;
    private final String suit;
    private final String type;

    public Card(String suit, String type, int value) {

        this.value = value;
        this.suit = suit;
        this.type = type;
    }

    public String getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return type + " of " + suit;
    }
}
