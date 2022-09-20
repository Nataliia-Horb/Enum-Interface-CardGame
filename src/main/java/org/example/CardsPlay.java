package org.example;

import java.util.Random;
import java.util.Scanner;


public interface CardsPlay {
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    int cardsForPlayer = 5;

    int numberOfCards = Suits.values().length * Rank.values().length; // number of cards

    String[] fillDeck();

    String[] shufflingDeck(String[] deck);

    void displayedDeck(String[] deck, int players);

}
