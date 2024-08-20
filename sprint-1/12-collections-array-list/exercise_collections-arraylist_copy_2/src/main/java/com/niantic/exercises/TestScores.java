package com.niantic.exercises;

import com.niantic.models.TestScore;

import java.util.ArrayList;

public class TestScores
{

    /*
    1.  An ArrayList of TestScores contains test results for all students and all of their tests
        Given an input of All testScores and the name of a test - return all scores for the
        requested tests.
     */
    public ArrayList<TestScore> getScoresByTest(ArrayList<TestScore> testScores, String testName)
    {
       ArrayList<TestScore> filteredScores = new ArrayList<>();
        {
            for (int i = 0; i < testScores.size(); i++) {
                TestScore currentTest = testScores.get(i);
                if (currentTest.getTestName().equalsIgnoreCase(testName))
                    filteredScores.add(currentTest);
            }
        }

        return filteredScores;
    }

    /*

    2.  An ArrayList of TestScores contains test results for all students and all of their tests
        Given an input of All testScores and the name of a student - return all scores for the
        requested student.
     */
    public ArrayList<TestScore> getScoresByStudent(ArrayList<TestScore> testScores, String student)
    {
        ArrayList<TestScore>requestedScore= new ArrayList<>();
        {
        for (int i = 0; i < testScores.size(); i++) {
            TestScore currentTest = testScores.get(i);
            if (currentTest.getStudentName().equalsIgnoreCase(student))
                requestedScore.add(currentTest);
            }

        }

        return requestedScore;
    }

    /*


    3.  An ArrayList of TestScores contains test results for all students and all of their tests
        Given an input of All testScores return the highest score.
     */
    public int getHighestScore(ArrayList<TestScore> testScores)
    {
        ArrayList<TestScore> getHighestScores =new ArrayList<>();
        {
            int HighestScores=0;
            for (int i = 0; i < testScores.size(); i++) {
                TestScore currentTest = testScores.get(i);
                if (currentTest.getScore() > HighestScores)
                    HighestScores = currentTest.getScore();

            }

            return HighestScores;
        }

    }
    /*
    4.  An ArrayList of TestScores contains test results for all students and all of their tests
        Given an input of All testScores return the lowest score.
     */
    public int getLowestScore(ArrayList<TestScore> testScores)
    {
        int lowestScore=testScores.get(0).getScore();

        for (int i = 0; i < testScores.size(); i++) {
            TestScore currentTest = testScores.get(i);
            if (currentTest.getScore() <= lowestScore) {
                lowestScore = currentTest.getScore();
            }


        }

        return lowestScore;

    }

    /*
    5.  An ArrayList of TestScores contains test results for all students and all of their tests
        Given an input of All testScores return the lowest score.
     */
    public int getAverageScore(ArrayList<TestScore> testScores)
    {
        int totalScore = 0;
        int averageScore =0;

        for (TestScore testScore : testScores) {
            totalScore += testScore.getScore();
        }

        averageScore = totalScore / testScores.size();


        return averageScore;



    }

    /*
    6.  An ArrayList of TestScores contains test results for all students and all of their tests
        Given an input of All testScores return the highest score for the specified test name.
     */
    public int getHighestScoreByTest(ArrayList<TestScore> testScores, String testName)
    {
        int highestScorebyTest = 0;

        for (TestScore testScore : testScores) {
            if (testScore.getTestName().equalsIgnoreCase(testName)) {
                if (highestScorebyTest == 0 || testScore.getScore() > highestScorebyTest) {
                    highestScorebyTest = testScore.getScore();
                }
            }
        }



        return highestScorebyTest;

    }

    /*
    7.  An ArrayList of TestScores contains test results for all students and all of their tests
        Given an input of All testScores return the lowest score for the specified test name.
     */
    public int getLowestScoreByTest(ArrayList<TestScore> testScores, String testName)
    {  int LowestScoreByTest = 0;
        for (TestScore testScore : testScores) {
            if (testScore.getTestName().equalsIgnoreCase(testName)) {
                if (LowestScoreByTest == 0 || testScore.getScore() < LowestScoreByTest) {
                    LowestScoreByTest = testScore.getScore();
                }
            }
        }



        return LowestScoreByTest;
    }

    /*
    8.  An ArrayList of TestScores contains test results for all students and all of their tests
        Given an input of All testScores return the average score for the specified test name.
     */
    public int getAverageScoreByTest(ArrayList<TestScore> testScores, String testName)
    {
        int totalScore = 0;
        int score = 0;

        for (TestScore testScore : testScores) {
            if (testScore.getTestName().equalsIgnoreCase(testName)) {
                totalScore += testScore.getScore();
                score++;
            }


        }

        return totalScore/score;

    }

    /*
    9.  An ArrayList of TestScores contains test results for all students and all of their tests
        Given an input of All testScores return the highest score for the specified student.
     */
    public int getHighestScoreByStudent(ArrayList<TestScore> testScores, String student)
    {
        int highestScoreByStudent=0;
        for (TestScore testScore : testScores) {
            if (testScore.getStudentName().equalsIgnoreCase(student)) {
                if (testScore.getScore() > highestScoreByStudent) {
                    highestScoreByStudent = testScore.getScore();
                }
            }
        }



        return highestScoreByStudent;
    }

    /*
    10.  An ArrayList of TestScores contains test results for all students and all of their tests
        Given an input of All testScores return the lowest score for the specified student.
     */
    public int getLowestScoreByStudent(ArrayList<TestScore> testScores, String student)
    {
        int lowestScoreByStudent =Integer.MAX_VALUE;

        for (TestScore testScore : testScores) {
            if (testScore.getStudentName().equalsIgnoreCase(student))
                if (testScore.getScore() < lowestScoreByStudent)
                    lowestScoreByStudent = testScore.getScore();

            }


            return lowestScoreByStudent;



    }

    /*
    11.  An ArrayList of TestScores contains test results for all students and all of their tests
        Given an input of All testScores return the average score for the specified student.
     */


    public int getAverageScoreByStudent(ArrayList<TestScore> testScores, String student)
        {
            int totalScore = 0;
            int score = 0;

            for (TestScore testScore : testScores) {
                if (testScore.getStudentName().equals(student)) {
                    totalScore += testScore.getScore();
                    score++;
                }


            }
            return totalScore / score;

        }
}
