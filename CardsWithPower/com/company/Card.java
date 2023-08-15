package com.company;

public class Card {
    private Rank rank;
    private Suit suit;
    private int power;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
        this.power = rank.getPower() + suit.getPower();
    }

    public String getName() {
        return rank.name();
    }

    public String getSuit() {
        return suit.name();
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d",this.rank, this.suit, this.power);
    }
}
