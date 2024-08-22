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

        int actual=quiz.getPossiblePoints();

        // Assert
        assertEquals(expected, actual,("This test should return the exact Possible Points you can get on Test"));
    }

    @Test
    public void test_GetPercentage() {
        // Arrange
        Quiz quiz = new Quiz(100, "Silk Rose");
        quiz.setScore(100);
        int expectedPercentage = 100;

        // Act
        int actualPercentage = quiz.getPercent();

        // Assert
        assertEquals(expectedPercentage,actualPercentage,"This test should make calculate the percentage");
    }


    @Test
    public void test_getLetterGradeA() {
        // arrange
        Quiz quiz = new Quiz(100, "Silk Rose");
        quiz.setScore(90);
        String expectedGrade = "A";

        //act
        String actualGrade = quiz.getLetterGrade();

        //assert
        assertEquals(expectedGrade, actualGrade, " The letter grade received should be A");
    }
    @Test
    public void testGetLetterGrade_B() {
        // Arrange
        Quiz quiz = new Quiz(100, "Silk Rose");
        quiz.setScore(85);
        String expectedGrade = "B";

        // Act
        String actualGrade = quiz.getLetterGrade();

        // Assert
        assertEquals(expectedGrade, actualGrade,"The letter grade received should be B");
    }

    @Test
    public void testGetLetterGrade_C() {
        // Arrange
        Quiz quiz = new Quiz(100, "Silk Rose");
        quiz.setScore(75);
        String expectedGrade = "C";

        // Act
        String actualGrade = quiz.getLetterGrade();

        // Assert
        assertEquals(expectedGrade, actualGrade, "The letter grade received should be C");
    }

    @Test
    public void testGetLetterGrade_D() {
        // Arrange
        Quiz quiz = new Quiz(100, "Silk Rose");
        quiz.setScore(65);
        String expectedGrade = "D";

        // Act
        String actualGrade = quiz.getLetterGrade();

        // Assert
        assertEquals(expectedGrade, actualGrade, "The letter grade received should be D");
    }

    @Test
    public void testGetLetterGrade_F() {
        // Arrange
        Quiz quiz = new Quiz(100, "Silk Rose");
        quiz.setScore(50);
        String expectedGrade = "F";

        // Act
        String actualGrade = quiz.getLetterGrade();

        // Assert
        assertEquals(expectedGrade, actualGrade, "The letter grade received should be F");
    }

    


}
