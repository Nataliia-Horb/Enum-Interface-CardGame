package org.example;

import lombok.Data;

@Data
public class Deck implements CardsPlay {
    private String[] deck;

    public Deck() {
        this.deck = new String[numberOfCards];
    }

    @Override
    public String[] fillDeck() {
        int i = 0;
        for (Rank rankValue : Rank.values()) {
            for (Suits suitsValue : Suits.values()) {
                deck[i] = rankValue.toString() + " " + suitsValue.toString();
                i++;
            }
        }
        return deck;
    }

    @Override
    public String[] shufflingDeck(String[] deck) {
        String[] newDeck = deck;
        for (int i = 0; i < newDeck.length; i++) {
            int card = i + (random.nextInt(newDeck.length - i));
            String temp = newDeck[card];
            newDeck[card] = newDeck[i];
            newDeck[i] = temp;
        }
        return newDeck;
    }

    @Override
    public void displayedDeck(String[] deck, int players) {
        for (int i = 0; i < players * cardsForPlayer; i++) {
            System.out.println(deck[i]);

            if (i % cardsForPlayer == cardsForPlayer - 1)
                System.out.println();
        }
    }
}