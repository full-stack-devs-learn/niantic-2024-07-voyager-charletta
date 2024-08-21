package com.niantic.part_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QuizTests
{
    @Test
    public void test_GetScore()

    { // Arrange
        Quiz quiz = new Quiz (100,"Silk Rose");
        int expected=65;
        quiz.setScore(expected);

        // Act
        int actualScore = quiz.getScore();

        // Assert
        assertEquals(expected,actualScore, "The score that runs should match the get score and the set score");

    }


        @Test
        public void test_GetPossiblePoints()
    {
        // Arrange
        Quiz quiz = new Quiz(100,"Silk Rose");
        int expected=100;

        // Act
        int actual = quiz.getPossiblePoints();

        // Assert
        assertEquals(expected, actual,("This test should return the exact Possible Points you can get on Test"));
    }
        @Test
        public void test_StudentName()
        {@Test
            public void testGetStudentName() {
            // Arrange
            Quiz quiz = new Quiz(100,"Silk Rose");
            int expected=100;

            // Act
            String actual= quiz.getStudentName();

            // Assert
            assertEquals(expected, actual, "This should return the actual student Names");
    }




        }









}





