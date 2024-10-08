package com.niantic.models;

import java.util.ArrayList;
import java.util.Collections;

public class Deck
{
    private ArrayList<Card> cards;

    public Deck()
    {
        // build the deck of cards
        cards = new ArrayList<>();

        String[] letters = {"A","B","C","D","E","F","G","H","I","J","K","L"};
        String[] colors = {"Red ", "Blue ", " Green", "Yellow","Orange", "Purple", "Pink", "White", "Silver","Dark Blue", "Black","Navy"};

        for(String color : colors)
        {
            for(String letter : letters)
            {
                Card card = new Card(color,letter);
                cards.add(card);
            }
        }
    }

    public int getCardCount()
    {
        return cards.size();
    }

    public Card takeCard()
    {
        Card card = cards.removeFirst();
        return card;

    }

    public void shuffle()
    {
        Collections.shuffle(cards);
    }
}
