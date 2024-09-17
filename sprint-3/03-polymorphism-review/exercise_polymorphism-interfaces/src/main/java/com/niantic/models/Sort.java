package com.niantic.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
        List<Card> cards = new ArrayList<Card>();
        cards.add(new Card("spades", "A"));
        cards.add(new Card("spades", "K"));
        cards.add(new Card("spades", "Q"));
        cards.add(new Card("spades", "J"));
        cards.add(new Card("spades", "10"));
        cards.add(new Card("spades", "9"));
        cards.add(new Card("spades", "8"));
        cards.add(new Card("spades", "7"));


        // this method requires that the objects implement Comparable<T>
        Collections.sort(cards);

        // sorting using streams
        var sortedList = cards.stream()
                .sorted((card1, card2) -> card1.getSuit().compareTo(card2.getFaceValue()))
                .toList();

        sortedList.forEach(System.out::println);

    }
}
