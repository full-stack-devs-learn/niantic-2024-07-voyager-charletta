package com.niantic;

public class Main
{
    public static void main(String[] args)
    {
        examples();
        section01();
        section02();
        section03();
        clairesCookies();
        elliotsYardCare();
    }

    public static void examples()
    {
        // i. Create a variable that stores the name of the best
        // programming language.
        String bestLanguage;
        bestLanguage = "Java";

        System.out.println("i) Best Programming Language");
        System.out.println("language: " + bestLanguage);
        System.out.println();



        // ii. Create a variable to store the speed limit in
        // a school zone.
        int speedLimit;
        speedLimit = 20;

        System.out.println("ii) Speed Limit");
        System.out.println("speedLimit: " + speedLimit);
        System.out.println();
    }

    public static void section01()
    {
        /******************** Section 1 ********************/
        System.out.println();
        System.out.println("**********************************************");
        System.out.println("Section 1: Declaring Variables");
        System.out.println("**********************************************");
        System.out.println();
        System.out.println();



        // 1. Declare a new variable to hold your name.
        // Variable name: name
        // Data Type: string (names/words are strings)

         String name;
         name = "Charletta";

        System.out.println("1) NAME");
        System.out.println("NAME: " + name);
        System.out.println();



        // 2. Declare a variable to hold your age.
        // Variable name: age
        // Data Type: int (age is a whole number)

          int age;
          age= 36;

        System.out.println("2 Age");
        System.out.println("age: " + age);
        System.out.println();


        // 3. Declare a variable that holds the first 5 digits of PI.
        // Variable name: pi
        // Data Type: double (pi is a number with decimal places)

          double PI;
          PI = 3.14159;

          System.out.println("3) PI");
          System.out.println("PI:" +PI);
          System.out.println();


        // 4. Declare a variable holds the price of
        // an adult meal at the buffet.
        // Variable name: price
        // Data Type: double (price contains a dollar and cent value)

        // NOTE: the decimal data type  is not automatically recognized
        // see lecture notes

        double price;
        price = 16.99;

       System.out.println("4) Price");
       System.out.println("price:" +price);
       System.out.println();

    }

    public static void section02()
    {

        /******************** Section 2 ********************/
        System.out.println();
        System.out.println("**********************************************");
        System.out.println("Section 2: Selecting DataTypes");
        System.out.println("**********************************************");
        System.out.println();
        System.out.println();

        // From this point forward you will need to choose
        // the variable name for each of your variables
        // as well as the DataType that will be used for
        // each variable.



        // 5. Declare a variable to store the name of your
        // favorite super hero.

          String favSuperhero;
          favSuperhero = "Black Panther";

        System.out.println("5) FavSuperhero");
        System.out.println("favSuperhero:" +favSuperhero);
        System.out.println();


        // Hint: You cannot use the same variable name
        // as a variable that you have used before.



        // 6. Declare a variable to hold the value of
        // value of a test score. The test has 100
        // questions and each question is worth 1 point.
        // (You can choose the score)

             int score;
             score= 98;

        System.out.println("6) Score");
        System.out.println("Score:" +score);
        System.out.println();


        // 7. Declare a variable that holds the current
        // population in the United States.
        // (search what the population is today)

             int usPopulation;
             usPopulation= 333000000;

        System.out.println("7) usPopulation");
        System.out.println("usPopulation:" +usPopulation);
        System.out.println();


        // 8. Declare a variable that holds the current
        // population in China.
        // (search what the population is today)
             int chinaPopulation;
             chinaPopulation = 1400000000;

        System.out.println("8) chinaPopulation");
        System.out.println("chinaPopulation:" +chinaPopulation);
        System.out.println();


        // 9. Declare a variable that holds the current
        // population in the world.
        // (search what the population is today)

            long worldPopulation;
            worldPopulation= 8169382133L;

        System.out.println("9) worldPopulation");
        System.out.println("worldPopulation:" +worldPopulation);
        System.out.println();


        // 10. Declare a variable that specifies whether
        // or not your mouse is wireless.

            boolean isWireless;
            isWireless= true;

        System.out.println("10) boolean isWireless");
        System.out.println("isWireless:" +isWireless);
        System.out.println();

        // 11. Search what the Latitude and Longitude of your
        // home town are. Then declare 2 variables
        // to store the Latitude and Longitude.

            double latitude;
            latitude=37.8044;

            double longitude;
            longitude = 122.2712;

        System.out.println("11) Latitude");
        System.out.println("latitude:" +latitude);
        System.out.println();


        // 12. Create a variable that holds the current
        // Microsoft stock price.

            double microsoftStock;
            microsoftStock=406.02;

        System.out.println("12) microsoftStock");
        System.out.println("microsoftStock:" +microsoftStock);
        System.out.println();

    }

    
    public static void section03() {
        /******************** Section 3 ********************/
        System.out.println();
        System.out.println("**********************************************");
        System.out.println("Section 3: Expressions and Arithmetic");
        System.out.println("**********************************************");
        System.out.println();
        System.out.println();

        /*
         * In this section you are expected to create
         * multiple variables in each exercise. You should
         * create as many variables as you need in order to
         * solve each problem.
         *
         * Make sure that your variable names are meaningful
         * and that the name describes the purpose of the
         * variable. Also, your code should not have any
         * "magic numbers" but anyone who reads the code
         * should be able to understand your code and
         * the calculations.
         */

        System.out.println("----------------------------");
        System.out.println("Backyard Basketball");
        System.out.println("-----------------------------");
        System.out.println();


        // 13. In his last basketball game Pete made 7 shots,
        // but missed 3 of his shots.

        // How many shots did Pete take?

        int totalShots;
        int madeShots;
        madeShots = 7;
        int missedShots;
        missedShots = 3;

        totalShots = madeShots + missedShots;

        System.out.println("13) totalShots");
        System.out.println("totalShots:" +totalShots);
        System.out.println();





        // 14. In his previous basketball game Pete took 20 shots.
        // He missed 6 shots, and he made 3 three point shots.

        // How many 2 point shots did Pete make?\

        int peteShots;
        peteShots = 20;
        int shotsMissed;
        shotsMissed = 6;
        int threePoint;
        threePoint = 3;
        int twoPoint;

        twoPoint = peteShots - shotsMissed - threePoint;

        System.out.println("14) twoPoint");
        System.out.println("twoPoint:" +twoPoint);
        System.out.println();


        // 15. Pete and Pat are teammates. Pete made 6 shots.
        // Pat made twice as many shots as Pete.


        // How many total shots did they make?

        int peteMade;
        peteMade = 6;
        int patMade;
        patMade = peteMade * 2;
        int bothShots;
        bothShots = peteMade + patMade;

        System.out.println("15) bothShots");
        System.out.println("bothShots:" +bothShots);
        System.out.println();



        // 16. Pete has made 13 shots, Pat has made 9.
        // If both Pete and Pat make 1 more shot each
        // before the game ends, how many total shots
        // did the Terrifying Twosome make in the game?

        int gameDay;
        int peteHit;
        peteHit = 13;
        peteHit += 1;
        int patHit;
        patHit = 9;
        patHit += 1;

        gameDay = peteHit + patHit;

        System.out.println("16) gameDay");
        System.out.println("gameDay:" +gameDay);
        System.out.println();


        // 17. In his last game Pete made 11 shots.
        // he missed 4 shots. // What percentage of his shots did he make?

        double shotsPete;
        shotsPete = 11;
        double missedPete;
        missedPete = 4;
        double totalValue;
        totalValue = shotsPete + missedPete;

        double percent = (shotsPete / totalValue) * 100;

        System.out.println("17) Percent");
        System.out.println("Percent:" + percent);
        System.out.println();



        // 18. Pete and Pat have decided to only take 3 point
        // shots in their next game. Together they make 70%
        // of their 3 point shots.


        // The team that they are playing scores 31 points a game.

        // How many shots do Pete and Pat have to take to win
        // this game?

        double shotPercent;
        shotPercent = 0.70;

        int opponentScore;
        opponentScore = 31;

        int totalToWin;
        totalToWin = opponentScore += 1;


        System.out.println("18) totalToWin");
        System.out.println("totalToWin:" + totalToWin);
        System.out.println();
    }




        public static void clairesCookies()
        {



        System.out.println();
        System.out.println();
        System.out.println("----------------------------");
        System.out.println("Claire's Cookies");
        System.out.println("-----------------------------");
        System.out.println();



        // 19. Claire sells cookies by the dozen. Sean has 14 students
        // in his class. He has bought 3 dozen cookies for his class.

        // Sean wants to divide the cookies evenly between
        // his students. How many cookies will each student
        // receive? (Students can only receive whole cookies)


          int claireCookies;
          claireCookies = 12;
          int students;
          students = 14;
          int dozenCookies;
          dozenCookies= 3;


          int totalCookies;
          totalCookies = dozenCookies * claireCookies;
          int cookieEachStudent;
          int cookiesEachStudent= totalCookies/students;


            System.out.println("19) cookiesEachStudent");
            System.out.println("cookiesEachStudent:" + cookiesEachStudent);
            System.out.println();



        // 20. Sean has 14 students in his class.
        // He has bought 3 dozen cookies for his class.

        // Sean wants to divide the cookies evenly between
        // his students. After giving the students their
        // cookies, how many cookies will be left over?

            int studentsInClass;
            studentsInClass=14;
            int cookiesBought;
            cookiesBought=36;

            int leftOverCookies = cookiesBought % studentsInClass;


            System.out.println("20) leftOverCookies");
            System.out.println("leftOverCookies:" + leftOverCookies);
            System.out.println();



            // 21. Sean's class has earned a cookie party.

        // If Sean has 14 students, how many dozen cookies
        // does he need to buy from Claire's Cookies so that
        // each student can receive 3 cookies.






        // 22. Sean's class has earned a cookie party. The number
        // of cookies that a student receives depends on
        // the score that they received on the cookie test.
        // Sean has 14 students.

        // 100 = 4 cookies
        // 90+ = 3 cookies
        // everyone else 2 cookies

        // Sean has 14 students. Chuck and Andrea scored
        // a perfect 100 on the test. Regina, Glen, Tony and Lorrie
        // all scored above 90. The rest of the class scored
        // below 90.

        // How many dozen cookies does Sean need to buy.

              int students4Cookies;
              students4Cookies=2;
             int students3Cookies;
             students3Cookies=4;
             int totalStudents;
             totalStudents=14;
             int student2Cookies;
             student2Cookies=totalStudents-students4Cookies-students3Cookies;

            int grade100;
            grade100=4 * students4Cookies;
            int grade90;
            grade90=3 * students3Cookies;
            int everyoneElse;
            everyoneElse=2 * student2Cookies;

            int totalCookiesToBuy;
            totalCookiesToBuy= grade100 + grade90+ everyoneElse;
            int Dozens;
            Dozens= totalCookiesToBuy/12;

            System.out.println("22) Dozens");
            System.out.println("Dozens:" + Dozens);
            System.out.println();




        // 23. If Claire's Cookies sells each dozen cookies for 12.99,
        // how much will it cost Sean to buy 4 dozen cookies.

            double claireDozen;
            claireDozen=12.99;
            double seanNeeds;
            seanNeeds=4;
            double totalCost;

            totalCost= claireDozen * seanNeeds;


            System.out.println("23) totalCost");
            System.out.println("totalCost:" + totalCost);
            System.out.println();


        // (Use this information for the next several questions)
        // Claire now charges different prices for different
        // types of cookies as follows:

        // Snicker Doodles = $12.99 / dz
        // Chocolate Chip = $13.99 / dz
        // Frosted Chocolate Chip = $15.99 / dz

        // Each dozen cookies must be the same type of cookie.

        // Sean has allowed his students to choose 3
        // cookies each. Here is what they have selected

        // Snicker Doodles | Chocolate Chip | Frosted Chocolate Chip
        // ---------------------------------------------------------
        // 9                 15               18

        // 24. How many total dozen cookies does Sean need to buy?

            int snickerDoodles;
            snickerDoodles=9;
            int chocolateChip;
            chocolateChip=15;
            int frostedChip;
            frostedChip=18;

            int dozenSnicks;
            dozenSnicks= 12/snickerDoodles;
            int dozenChocChips;
            dozenChocChips=12/chocolateChip;
            int dozenFrosted;
            dozenFrosted= 12/frostedChip;

            int totalDozenCookies;
            totalDozenCookies= dozenSnicks + dozenChocChips + dozenFrosted;

            System.out.println("24) totalDozenCookies");
            System.out.println("totalDozenCookies:" + totalDozenCookies);
            System.out.println();



        // 25. What is the total cost of this order?

            double snicksCost;
            snicksCost= 12.99;
            double chocCost;
            chocCost=13.99;
            double frostCost;
            frostCost=15.99;

            double orderPriceSnick;
            orderPriceSnick= snicksCost * dozenSnicks;
            double orderChoc;
            orderChoc=chocCost * dozenChocChips;
            double orderFrost;
            orderFrost= frostCost * dozenFrosted;

           double totalOrderCost;
           totalOrderCost= orderPriceSnick + orderChoc+ orderFrost;

            System.out.println("25) totalOrderCost");
            System.out.println("totalOrderCost:" + totalOrderCost);
            System.out.println();





        // 26. How many cookies will be left over of each type of cookie?
        // (Snicker Doodles, Chocolate Chip, Frosted Chocolate Chip)

            int Doodles;
            Doodles =9;
            int Chips;
            Chips=15;
            int Frosted;
            Frosted=18;

            int doodlesLeftover;
            doodlesLeftover= Doodles %12;
            int chipsLeftover;
            chipsLeftover= Chips %12;
            int frostedLeftover;
            frostedLeftover = Frosted %12;

            System.out.println("26) doodlesLeftover");
            System.out.println("doodlesLeftover:" + doodlesLeftover);
            System.out.println();

            System.out.println("26) chipsLeftove");
            System.out.println("chipsLeftover:" + chipsLeftover);
            System.out.println();

            System.out.println("26) totalOrderCost");
            System.out.println("totalOrderCost:" + totalOrderCost);
            System.out.println();


        // 27. How much money could Sean have saved if he would
        // have bought: 2 dz Frosted Chocolate Chip
        //              1 dz Chocolate Chip
        //              1 dz Snicker Doodle
    }





    // bonus - challenge
    public static void elliotsYardCare()
    {

        System.out.println();
        System.out.println();
        System.out.println("----------------------------");
        System.out.println("Elliot's Yard Care");
        System.out.println("----------------------------");
        System.out.println();

        // Use the following information to answer the remaining questions.

        // Elliot runs a yard care business named "Elliot's Yard Care".
        // He charges $30 to mow and trim a medium size lawn (100 ft x 50 ft).
        // Elliot takes pride in his work and his lawns look
        // immaculate. In order to maintain such a quality reputation
        // his services include grass clipping removal and
        // complete sweeping of the property after the lawn
        // is mowed.

        // Elliot's goal is to earn at least $10 per hour.
        // It costs him about $2.50 in materials and gas per 1000 sq ft.
        // On average elliot has calculated that it takes him roughly
        // 45 minutes to fully maintain 1000 sq ft.


        // 28. What is the total cost to Elliot when
        // he mows a yard that is 100 x 50 feet?



        // 29. How much total money does Elliot earn
        // to maintain a 100 x 50 ft yard?



        // 30. How much time does it take Elliot to mow
        // a 100 x 50 ft yard?



        // 31. How much money does Elliot earn per hour
        // on a 100 x 50 foot yard?



        // 32. What is Elliot's cost per hour on a medium
        // sized yard?



        // 33. How much money should Elliot charge for a medium yard
        // in order to earn $10 per hour?


    }
}