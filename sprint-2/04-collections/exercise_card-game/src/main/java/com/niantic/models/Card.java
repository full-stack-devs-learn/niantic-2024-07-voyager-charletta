package com.niantic.models;


public class Card
{
    private String letter;
    private String color;

    public Card(String color, String letter)
    {
        this.letter = letter;
        this.color = color;
    }


    public String geColor()
    {
        return color;
    }

    public String getLetter()
    {
        return letter;
    }

}




