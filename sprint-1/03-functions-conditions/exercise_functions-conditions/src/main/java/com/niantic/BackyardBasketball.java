package com.niantic;

public class BackyardBasketball
{
    /*
     * Teams that play in the backyard league want to be able
     * to calculate their winning percentage.
     *
     * Each team knows how many games they have won and how many
     * games they have lost. When they call this function they
     * will provide their wins and losses.
     *
     * You need to perform the calculation and return their
     * winning percentage as a whole number.
     *
     * Example:
     * If a team has won 7 games and lost 3 games their winning
     * percentage is 70%.
     *
     * calculateWinningPercentage(7, 3) -> 70
     * calculateWinningPercentage(5, 5) -> 50
     * calculateWinningPercentage(5, 10) -> 33
     *
     */
    public int calculateWinningPercentage(int gamesWon, int gamesLost)
    {
        // calculate the total number of games
        int totalGames= gamesWon+ gamesLost;

        // calculate the winning percentage
        double winningPercent= (double)gamesWon/totalGames;
        winningPercent= winningPercent * 100;

        // return the winning percentage
        return (int)winningPercent;
    }



    /*
     * The calculatePointsScored function should calculate
     * the number of points a player scored in a game.
     *
     * shotPercentage = the percent of shots made
     * shotsTaken = the number of shots the player took
     * isThree = if true, the player shot a 3 pointer otherwise a 2
     *
     * calculatePointsScored(70, 10, false) -> 14
     * calculatePointsScored(70, 10, true) -> 21
     * calculatePointsScored(67, 15, false) -> 20
     *
     */
    public int calculatePointsScored(int shotPercentage, int shotsTaken, boolean isThree)
    {
        // calculate how many shots they made
        double percent = shotPercentage / 100.0;
        double shotsMade = shotsTaken * percent;

        if(isThree == true) {
            return (int) shotsMade *3;
        }
        else {
            return (int) shotsMade *2;
        }

    }


    /*
     * Calculate the minimum number of shots that are required
     * to score the desired number of points.
     *
     * shotPercentage = the estimated % of shots that will go in (whole number)
     * desiredScore = the number of points you want to score
     * isThree = if true, the player will shoot a 3 pointer otherwise a 2
     *
     * Example:
     * If a player has a 50% scoring average, and he wants to score 10 points,
     * how many shots will he have to take (if he is NOT shooting 3 pointers)
     *
     * calculateShotsRequired(50, 10, false) -> 10
     *
     * calculateShotsRequired(50, 10, true) -> 8
     * calculateShotsRequired(75, 15, true) -> 7
     * calculateShotsRequired(80, 18, true) -> 8
     * calculateShotsRequired(67, 24, false) -> 18     *
     *
     */
    public int calculateShotsRequired(int shotPercentage, int desiredScore, boolean isThree)
    {
        //calculate the minimum number of shots

        int shotsRequired;
        int pointsPerShot;
        double accuracy = (double)shotPercentage/100;

        //Determine point-per shot value:

        if(isThree == true) {
            pointsPerShot =3;
        }
        else {
            pointsPerShot =2;
        }


        //calculate how many shots are necessary
        return shotsRequired=(int)((double)desiredScore / (double)pointsPerShot/accuracy);
    }
}