package com.SimonGradin.DiceGame;

// import random and scanner so they can be used.
import java.util.Scanner;
import java.util.Random;

public class DiceGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Greeting users
        System.out.println("Welcome!!!!!!");

        // Select how many sides the dice will have
        System.out.print("Choose how many sides the dice will have: ");
        int SidesOfDice = scanner.nextInt();

        // Get the number of dice to roll for each player
        System.out.print("Choose the amount of dice to roll: ");
        int Dices = scanner.nextInt();

        // Get player names
        System.out.print("Enter Player 1's name: ");
        String player1Name = scanner.next();
        System.out.print("Enter Player 2's name: ");
        String player2Name = scanner.next();

        // Roll the dice for each player
        int player1sScore = rollTheDice(random, SidesOfDice, Dices);
        int player2sScore = rollTheDice(random, SidesOfDice, Dices);

        // Display the results
        System.out.println(player1Name + " your score is " + player1sScore);
        System.out.println(player2Name + " your score is " + player2sScore);

        // Determines the winner, or if there is no winner determines if it is a tie and announces it.
        if (player1sScore > player2sScore) {
            System.out.println(player1Name + " wins!");
        } else if (player2sScore > player1sScore) {
            System.out.println(player2Name + " wins!");
        } else {
            System.out.println("It's a tie!");
        }

        scanner.close();
    }

    public static int rollTheDice(Random random, int SidesOfDice, int Dices) {
        int totalScore = 0;
        for (int i = 0; i < Dices; i++) {
            int roll = random.nextInt(SidesOfDice) + 1;
            totalScore += roll;
        }
        return totalScore;
    }
}