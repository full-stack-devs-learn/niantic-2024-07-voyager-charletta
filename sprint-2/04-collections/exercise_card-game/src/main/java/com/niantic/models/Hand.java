package com.niantic.models;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Hand
{
    private final ArrayList<Card> cards = new ArrayList<>();
    private final ArrayList<Card> matchPile = new ArrayList<>();

    public ArrayList<Card> getCards()
    {
        return cards;
    }

    public boolean hasCardWithLetter(String letter)
    {
        return cards.stream().anyMatch(card -> card.getLetter().equals(letter));
    }

        public Card removeCardWithLetter(String letter)
        {
            Card card = cards.stream()
                    .filter(c -> c.getLetter().equals(letter))
                    .findFirst()
                    .orElse(null);
            if (card != null) {
                cards.remove(card);

            }
            return card;
    }

    public int getCardCount()
    {
        return cards.size();
    }

    public void dealTo(Card card)
    {
        cards.add(card);
    }

    // Checks for pairs in the hand and moves them to the match pile
    public void checkForMatches() {
        List<Card> matchedCards = new ArrayList<>();
        List<String> lettersInHand = cards.stream()
                                          .map(Card::getLetter)
                                          .distinct()
                                          .collect(Collectors.toList());

        for (String letter : lettersInHand) {
            List<Card> matchingCards = cards.stream()
                                            .filter(card -> card.getLetter().equals(letter))
                                            .collect(Collectors.toList());

            if (matchingCards.size() > 1) {
                matchPile.addAll(matchingCards);
                matchedCards.addAll(matchingCards);
            }
        }


        cards.removeAll(matchedCards);
    }


    public int getMatchCount()
    {
        return matchPile.size()/2;
    }


    @Override
    public String toString()
    {
        return cards.stream()
                    .map(Card::toString)
                    .collect(Collectors.joining(", "));
    }

}
