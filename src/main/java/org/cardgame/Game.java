package org.cardgame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Game {
    private final ArrayList<Card> deckOfCards;

    public Game() {
        deckOfCards = new ArrayList<>();
        populateDeck();
        sortDeckInNumberOrder();
        sortDeckBySuits();
        shuffleDeck();
    }

    private void populateDeck() {
        int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        String[] suits = {"♥", "♣", "♦", "♠"};
        String[] type = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for (String suit : suits) {
            for (int j = 0; j < type.length; j++) {
                Card card = new Card(suit, type[j], values[j]);
                deckOfCards.add(card);
            }
        }
    }

    public Card dealCard() {
        if (deckOfCards.isEmpty()) {
            System.out.println("Deck is empty. Cannot deal any more cards. Restart the game");
            return null;
        }
        return deckOfCards.remove(0);
    }

    public void sortDeckInNumberOrder() {
        deckOfCards.sort(Comparator.comparingInt(Card::getValue));
    }

    public void sortDeckBySuits() {
        deckOfCards.sort(Comparator.comparing(Card::getSuit));
    }

    public void shuffleDeck() {
        Collections.shuffle(deckOfCards);
    }

}



