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

    public int getHandValue()
    {
        return hand.getPointValue();
    }
    public List<Card>

    public Hand getHand()
    {
        return hand;
    }
}
