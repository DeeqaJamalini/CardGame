package org.cardgame;

class Card {
    private int value;

    private String suit;
    private String type;

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
