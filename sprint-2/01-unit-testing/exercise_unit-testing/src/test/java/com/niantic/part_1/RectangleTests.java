package com.niantic.part_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTests
{
    @Test
    public void get_sizeofRectangle()

       //arrange
    {
        Rectangle rectangle = new Rectangle();
        int expected=25;

        //act

        int actual=rectangle.getArea();

        //assert

        assertEquals(expected, actual, "Because it should set the size up to be 5*5");

    }

    @Test
    public void get_shouldReturn_theAreaOfRectangle()

    {  //arrange

        Rectangle rectangle=new Rectangle();

        int width =5;
        int height=5;
        int expected=25;
        rectangle.setWidth(width);
        rectangle.setHeight(height);


        //act

        int actual = rectangle.getArea();

       //assert

        assertEquals(expected, actual, "Because it should have calculated 5 * 5");


    }

    @Test
    public void get_thePerimeterOfRectangle()

    {  //arrange

        Rectangle rectangle=new Rectangle(10,5);
        int expected=50;


        //act

        int actual = rectangle.getPerimeter();

        //assert

        assertEquals(expected, actual, "Because it should have calculated 10 * 5");
    }





}








