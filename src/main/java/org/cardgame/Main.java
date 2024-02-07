package org.cardgame;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String greenColor = "\u001B[32m";
        String purpleColor = "\u001B[35m";
        String lightBlueColor = "\u001B[94m";
        String darkBlueColor = "\u001B[34m";
        String pinkColor = "\u001B[95m";



        Scanner scanner = new Scanner(System.in);


        System.out.println(darkBlueColor + "____________ \n||SNAPGAME|| \n------------");
        System.out.print(lightBlueColor + "player one, please provide your name and press enter: ");
        String firstPlayerName = scanner.nextLine();

        System.out.print(lightBlueColor + "player two, please provide your name and press enter: ");
        String secondPlayerName = scanner.nextLine();

        Player firstPlayer = new Player(firstPlayerName);
        Player secondPlayer = new Player(secondPlayerName);

        Snap snapGame = new Snap(firstPlayer, secondPlayer);
        System.out.println(purpleColor + "\n INSTRUCTIONS: \n\n -Two players need to take a turns drawing a card until they match \n -Once you see a match you have the opportunity to call a snap to win\n -To draw a card press enter \n -To win if you get a snap opportunity, write snap in the console to confirm  ");
        snapGame.playSnapGame();

        scanner.close();
    }
}
