package com.niantic.models;

import java.util.List;

public class Player
{
    private String name;
    private Hand hand;


    public Player(String name)
    {
        this.name = name;
        hand = new Hand();
    }

    public String getName()
    {
        return name;
    }

    public void dealTo(Card card)
    {
        hand.dealTo(card);
    }

    public Hand getHand ()
    {
        return hand;
    }

    public int getHandCardCount()
    {
        return hand.getCardCount();
    }

    public boolean hasCardWithLetter(String letter)
    {
        return hand.hasCardWithLetter(letter);
    }
    public Card giveCardWithLetter(String letter)
    {
        return hand.removeCardWithLetter(letter);
    }
    public void checkForMatches()
    {
        hand.checkForMatches();
    }
    public int getMatchCount() {
        return hand.getMatchCount();
    }

    public String displayHand() {
        return hand.toString();
    }


}


