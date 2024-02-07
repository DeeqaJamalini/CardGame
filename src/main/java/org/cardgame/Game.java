package org.cardgame;
import java.util.ArrayList;
import java.util.Collections;

class Game {
    private ArrayList<Card> deckOfCards;

    public Game() {

        deckOfCards = new ArrayList<>();
        populateDeck();
        sortDeckInNumberOrder();
        sortDeckIntoSuits();
        shuffleDeck();
    }

    private void populateDeck() {
        int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        String[] suits = {"\u2665", "\u2663", "\u2666", "\u2660"};
        String[] symbols = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};


        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < symbols.length; j++) {
                Card card = new Card(suits[i], symbols[j], values[j]);
                deckOfCards.add(card);
            }
        }
    }

    public Card dealCard() {
        if (deckOfCards.isEmpty()) {
            System.out.println("Deck is empty. Cannot deal card. Restart the game");
            return null;
        }
        return deckOfCards.remove(0);
    }

    public ArrayList<Card> sortDeckInNumberOrder() {
        Collections.sort(deckOfCards, (card1, card2) -> Integer.compare(card1.getValue(), card2.getValue()));
        return deckOfCards;
    }

    public ArrayList<Card> sortDeckIntoSuits() {
        Collections.sort(deckOfCards, (card1, card2) -> {
            int suitComparison = card1.getSuit().compareTo(card2.getSuit());
            if (suitComparison == 0) {
                return Integer.compare(card1.getValue(), card2.getValue());
            }
            return suitComparison;
        });
        return deckOfCards;
    }

    public void shuffleDeck() {
        Collections.shuffle(deckOfCards);
    }

    public ArrayList<Card> getDeck() {
        return deckOfCards;
    }


}



