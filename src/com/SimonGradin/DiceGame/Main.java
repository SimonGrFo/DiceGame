package com.SimonGradin.DiceGame;

// import random and scanner so they can be used.
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Greeting users and asking them to enter their names then saving the information
        // for later so it will be reused in next part.
        System.out.println("Welcome!!!!!!");
        System.out.print("Enter Player 1's name: ");
        String player1Name = scanner.nextLine();
        System.out.print("Enter Player 2's name: ");
        String player2Name = scanner.nextLine();

        // Rolls the dice for random number from 1 to 6.
        int player1sScore = RNG(random);
        int player2sScore = RNG(random);

        // Tells the user what numbers they rolled on the dice.
        System.out.println(player1Name + " rolled a " + player1sScore);
        System.out.println(player2Name + " rolled a " + player2sScore);

        //If player 1 has higher score than player 2 he wins.
        if (player1sScore > player2sScore) {
            System.out.println(player1Name + " wins!");
        //Otherwise if player 2 has a higher score than player 1 he wins.
        } else if (player2sScore > player1sScore) {
            System.out.println(player2Name + " wins!");
        //If neither player 1 nor player 2 wins that means it's a tie.
        } else {
            System.out.println("It's a tie!");
        }

        scanner.close();
    }

    public static int RNG(Random random) {
        // Rolls a normal dice with 6 sides for a number between 1 and 6.
        return random.nextInt(6) + 1;
    }
}