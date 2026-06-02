package card;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
import java.util.Random;

/**
 * Modifier: Om Chauhan
 * Student Number: 991835995
hello
*/

public class CardTrick {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        // Create an array of 7 random cards
  
        Card[] magicHand = new Card[7];

        Card.Rank[] ranks = Card.Rank.values();
        Card.Suit[] suits = Card.Suit.values();

        // Fill the magic hand with random cards
        for (int i = 0; i < magicHand.length; i++) {
            Card.Rank randomRank = ranks[rand.nextInt(ranks.length)];
            Card.Suit randomSuit = suits[rand.nextInt(suits.length)];

            magicHand[i] = new Card(randomRank, randomSuit);
        }
System.out.println("\n--- MAGIC HAND ---");
for (Card c : magicHand) {
    System.out.println(c.getRank() + " of " + c.getSuit());
}
System.out.println("------------------\n");
        // Ask user for a rank
        System.out.println("Enter a rank (ONE-KING or 1-13):");
        String rankInput = sc.next().toUpperCase();

        // Ask user for a suit
        System.out.println("Enter a suit (HEARTS, DIAMONDS, CLUBS, SPADES):");
        String suitInput = sc.next().toUpperCase();

        // Convert input to enums
        Card.Rank userRank = null;
        Card.Suit userSuit = null;

        // Convert rank (supports numbers OR words)
        try {
            if (rankInput.matches("\\d+")) {
                int num = Integer.parseInt(rankInput);
                if (num < 1 || num > 13) {
                    System.out.println("Invalid number for rank.");
                    return;
                }
                userRank = ranks[num - 1]; // ONE = index 0
            } else {
                userRank = Card.Rank.valueOf(rankInput);
            }
        } catch (Exception e) {
            System.out.println("Invalid rank entered.");
            return;
        }

        // Convert suit
        try {
            userSuit = Card.Suit.valueOf(suitInput);
        } catch (Exception e) {
            System.out.println("Invalid suit entered.");
            return;
        }
// Hard-coded lucky card
Card luckyCard = new Card(Card.Rank.ONE, Card.Suit.SPADES);
        // Search for the user's card
        boolean found = false;

        for (Card c : magicHand) {
            if (c.getRank() == userRank && c.getSuit() == userSuit) {
                found = true;
                break;
            }
        }

        // Result
        if (found) {
            System.out.println("Your card is in the magic hand! You win!");
        } else {
            System.out.println("Your card is NOT in the magic hand. You lose!");
        }
    }
}
