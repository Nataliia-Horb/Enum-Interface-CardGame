package org.example;

import lombok.Data;

@Data
public class Players {
    CardsPlay play = new Deck();
    private int players;

    public Players() {
        players = indicateNumberPlayers();
    }

    private int indicateNumberPlayers() {
        while (true) {
            System.out.println("Enter the number of players: ");
            if (play.sc.hasNextInt()) {
                players = play.sc.nextInt();
                if (players == 0) {
                    System.out.println("The game has been terminated.");
                    break;
                } else if (players < 0) {
                    System.out.println("The number of players cannot be less than 0");
                } else if (play.cardsForPlayer * players > play.numberOfCards) {
                    System.out.println("Too many players!");
                } else {
                    break;
                }
            } else {
                System.out.println("You have not entered a number, or your number is too large!");
                play.sc.next();
            }
        }
        return players;
    }
}

