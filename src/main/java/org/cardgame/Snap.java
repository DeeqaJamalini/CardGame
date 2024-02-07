package org.cardgame;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;


class Snap extends Game {
    private final Player firstPlayer;
    private final Player secondPlayer;
    private final Timer snapTimer;
    String redColor = "\u001B[31m";
    private boolean isGameOver;
    private boolean isSnap;
    private Player currentPlayer;

    public Snap(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
        this.currentPlayer = firstPlayer;
        isSnap = false;
        isGameOver = false;
        snapTimer = new Timer();
    }

    public void playSnapGame() {
        Scanner scanner = new Scanner(System.in);
        Card lastCard = null;

        while (!isGameOver) {
            String pinkColor = "\u001B[95m";
            System.out.println(pinkColor + "\n" + currentPlayer.getName() + "press enter to take your turn!");
            scanner.nextLine();
            Card currentCard = dealCard();
            System.out.println(redColor + currentPlayer.getName() + " drew: " + currentCard);

            if (lastCard != null && currentCard.getType().equals(lastCard.getType())) {
                isSnap = true;
                break;
            }
            lastCard = currentCard;
            currentPlayer = (currentPlayer == firstPlayer) ? secondPlayer : firstPlayer;
        }
        if (isSnap) {
            System.out.println("\nSNAP found by " + currentPlayer.getName() + " Type 'snap' in two seconds to win!");
            snapTimer.schedule(new TimerTask() {
                @Override
                public void run() {
                    if (!isGameOver) {
                        System.out.println("\nTime's up! You lost!");
                        isGameOver = true;
                    }
                }
            }, 2000);
            while (!isGameOver) {
                String userInput = scanner.nextLine();
                if (userInput.equalsIgnoreCase("snap")) {
                    System.out.println("\nCongratulations, " + currentPlayer.getName() + "!! You win!");
                    System.out.println("END OF GAME");
                    isGameOver = true;


                }
            }
        } else {
            System.out.println("\nSNAP was not found, please continue");
        }

        scanner.close();
    }
}