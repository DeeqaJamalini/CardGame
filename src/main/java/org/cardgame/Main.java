package org.cardgame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String lightBlueColor = "\u001B[96m";
        String redColor = "\u001B[31m";
        String darkBlueColor = "\u001B[34m";
        Scanner scanner = new Scanner(System.in);

        System.out.println(redColor + "____________ \n||SNAPGAME|| \n------------");
        System.out.print(lightBlueColor + "player one, please provide your name and press enter: ");
        String firstPlayerName = scanner.nextLine();

        System.out.print(lightBlueColor + "player two, please provide your name and press enter: ");
        String secondPlayerName = scanner.nextLine();

        Player firstPlayer = new Player(firstPlayerName);
        Player secondPlayer = new Player(secondPlayerName);

        Snap snapGame = new Snap(firstPlayer, secondPlayer);
        System.out.println(darkBlueColor + "\n INSTRUCTIONS: \n\n -Two players need to take a turns drawing a card until they match \n -Once you see a match you have the opportunity to call a snap to win\n -To draw a card press enter \n -To win if you get a snap opportunity, write snap in the console within 2 seconds  ");
        snapGame.playSnapGame();

        scanner.close();
    }
}
