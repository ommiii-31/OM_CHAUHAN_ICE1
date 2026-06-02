package card;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * Modifier: Om Chauhan
 * Student Number: 991835995
 */
public class Card {

    // Enum for suit types
    public enum Suit {
        HEARTS, DIAMONDS, CLUBS, SPADES
    }

    // Enum for card values
    public enum Rank {
        ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN,
        EIGHT, NINE, TEN, JACK, QUEEN, KING
    }

    private Rank rank;
    private Suit suit;

    // Constructor
    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    // Getters and setters
    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }
}//DHDHD