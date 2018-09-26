package Chapters.Chapter2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // opgave 2.1
        // System.out.println("OPGAVE 2.1:");

        Scanner inputObj = new Scanner(System.in);

        // System.out.println("Enter a degree in Celsius: ");

        // double celsius = inputObj.nextDouble();

        // double fahrenheit = celsius * 9.0/5 + 32;

        // System.out.printf("%f Celsius is %f Fahrenheit", celsius, fahrenheit);

        // // opgave 2.2
        // System.out.println("\n----\nOPGAVE 2.2:");

        // inputObj = new Scanner(System.in);

        // System.out.println("Enter the radius and length of a cylinder: ");

        // String twoDotTwoInput = inputObj.nextLine();
        // String[] twoDotTwoInputSplit = twoDotTwoInput.split(" ");

        // double radius = Double.parseDouble(twoDotTwoInputSplit[0]);
        // double length = Double.parseDouble(twoDotTwoInputSplit[1]);

        // double area = radius * radius * Math.PI;
        // double volume = area * length;

        // System.out.printf("The area is %f\nThe volume is %f\n", area, volume);

        // System.out.println(twoDotTwoInput);

        // // opgave 2.3
        // System.out.println("\n----\nOPGAVE 2.3:");

        // inputObj = new Scanner(System.in);

        // System.out.println("Enter a value for feet: ");
        // double feet = inputObj.nextDouble();
        // double meters = feet * 0.305;

        // System.out.printf("%f feet is %f meters", feet, meters);

        // opgave 2.4
        // System.out.println("\n----\nOPGAVE 2.4:");

        // inputObj = new Scanner(System.in);

        // System.out.println("Enter a number in pounds: ");
        // double pounds = inputObj.nextDouble();
        // double kilograms = pounds * .454;

        // System.out.printf("%f pounds is %f kilograms", pounds, kilograms);

        // opgave 2.5
        // System.out.println("\n----\nOPGAVE 2.5:");

        // inputObj = new Scanner(System.in);

        // System.out.println("Enter the subtotal and a gratuity rate: ");

        // String twoDotFiveInput = inputObj.nextLine();
        // String[] twoDotTwoInputSplit = twoDotFiveInput.split(" ");

        // double subtotal = Double.parseDouble(twoDotTwoInputSplit[0]);
        // double gratuityRate = Double.parseDouble(twoDotTwoInputSplit[1]);

        // double gratuity = (gratuityRate/100)*subtotal;
        // double total = subtotal+gratuity;

        // System.out.printf("The gratuity is $%f and total is $%f", gratuity, total);

        // opgave 2.6
//        System.out.println("\n----\nOPGAVE 2.6:");
//
//        inputObj = new Scanner(System.in);
//        System.out.println("Enter a number between 0 and 1000:");
//        int integer = inputObj.nextInt();
//
//        int sum;
//
//        if(integer < 10){ // integer has only 1 integer
//
//            System.out.printf("The sum of the digits is %d", integer);
//
//        }else if(integer < 100){ // integer has only 10 integer
//
//            sum = integer % 10;
//            integer = integer / 10;
//            sum = sum + integer;
//
//            System.out.printf("The sum of the digits is %d", sum);
//
//        }else if(integer < 1000){ // integer has only 100 integer
//
//            sum = integer % 10;
//            integer = integer / 10;
//
//            sum = sum + (integer % 10);
//            integer = integer / 10;
//            sum = sum + integer;
//
//            System.out.printf("The sum of the digits is %d", sum);
//
//        }else{ // this number must be 1000 and the result would be 1.
//            System.out.println("The sum of the digits is 1");
//        }
/*
        // opgave 2.7
        System.out.println("\n----\nOPGAVE 2.7:");
        System.out.println("Enter the number of minutes: ");

        inputObj = new Scanner(System.in);

        int inputoftwodotseven = inputObj.nextInt();

        final int MINUTES_IN_ONE_DAY = 24*60;
        final int DAYS_PER_YEAR = 365;

        int total_days = inputoftwodotseven/MINUTES_IN_ONE_DAY;

        System.out.println(total_days/DAYS_PER_YEAR);
        System.out.println(total_days%DAYS_PER_YEAR);
*/

        // opgave 2.8

/*
        System.out.println("\n----\nOPGAVE 2.8:");

        inputObj = new Scanner(System.in);
        System.out.println("Enter the time zone offset to GMT: ");
        int GMT_OFFSET = inputObj.nextInt();

        // Obtain the total milliseconds since midnight, Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();

        // Obtain the total seconds since midnight, Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;

        // Compute the current second in the minute in the hour
        long currentSecond = totalSeconds % 60;

        // Obtain the total minutes
        long totalMinutes = totalSeconds / 60;

        // Compute the current minute in the hour
        long currentMinute = totalMinutes % 60;

        // Obtain the total hours

        long totalHours = (totalMinutes + GMT_OFFSET*60 ) / 60; // <<------ HER SKER MIN ÆNDRING!

        // Compute the current hour
        long currentHour = totalHours % 24;

        // Display results
        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
*/

/*
        // opgave 2.9
        System.out.println("\n----\nOPGAVE 2.9:");

        System.out.println("Enter v0, v1, and t: ");

        double acceleration, velocity1, velocity2, time;

        inputObj = new Scanner(System.in);

        String twoDotNineInput = inputObj.nextLine();
        String[] twoDotNineInputSplit = twoDotNineInput.split(" ");

        velocity1 = Double.parseDouble( twoDotNineInputSplit[0] );
        velocity2 = Double.parseDouble( twoDotNineInputSplit[1] );

        time = Double.parseDouble( twoDotNineInputSplit[2] );

        acceleration = (velocity2-velocity1)/time;

        System.out.printf("The average acceleration is %f", acceleration);
*/

        // opgave 2.10

        /*(Science: calculating energy) Write a program that calculates the energy needed
        to heat water from an initial temperature to a final temperature. Your program
        should prompt the user to enter the amount of water in kilograms and the initial
        and final temperatures of the water. The formula to compute the energy is

        Q = M * (finalTemperature – initialTemperature) * 4184

        where M is the weight of water in kilograms, temperatures are in degrees Celsius,
        and energy Q is measured in joules.
        */

/*        System.out.println("\n----\nOPGAVE 2.10:");

        double Q;
        double M;
        double finalTemp;
        double initTemp;

        inputObj = new Scanner(System.in);

        System.out.println("Enter the amount of water in kilograms: ");
        M = inputObj.nextDouble();

        System.out.println("Enter the initial temperature: ");
        initTemp = inputObj.nextDouble();

        System.out.println("Enter the final temperature: ");
        finalTemp = inputObj.nextDouble();

        Q = M * (finalTemp - initTemp) * 4184;

        System.out.printf("The energy needed is %.1f", Q);*/

/*        // opgave 2.11
        System.out.println("\n----\nOPGAVE 2.11:");

        inputObj = new Scanner(System.in);

        System.out.println("Enter the number of years: ");
        int years = inputObj.nextInt();

        int secondsPerDay = 60*60*24;
        int birthsPerDay = secondsPerDay/7;
        int deathsPerDay = secondsPerDay/13;
        int immigrantsPerDay = secondsPerDay/45;

        int dayPerYear = 365;
        int birthsPerYear = dayPerYear * birthsPerDay;
        int deathsPerYear = deathsPerDay * dayPerYear;
        int immigrantsPerYear = immigrantsPerDay * dayPerYear;

        int startPopulation = 312032486;

        for (int i = 1; i < years+1; i++) {

            int twoDotOneOnebirths = birthsPerYear * i;
            int twoDotOneOnedeaths = deathsPerYear * i;
            int twoDotOneOneimmigrants = immigrantsPerYear * i;

            int people = startPopulation + twoDotOneOnebirths + twoDotOneOneimmigrants - twoDotOneOnedeaths;


            System.out.printf("year: %d, population: %d\n", i, people);

        }*/

/*        // opgave 2.12
        System.out.println("\n----\nOPGAVE 2.12:");

        double acceleration, speed, length;

        inputObj = new Scanner(System.in);

        System.out.println("Enter speed and acceleration: ");

        String twoDotNineInput = inputObj.nextLine();
        String[] twoDotNineInputSplit = twoDotNineInput.split(" ");

        speed = Double.parseDouble( twoDotNineInputSplit[0] );
        acceleration = Double.parseDouble( twoDotNineInputSplit[1] );

        length = Math.pow(speed,2)/(2*acceleration);

        System.out.printf("The minimum runway length for this airplane is %.3f", length);

        */

/*        // opgave 2.13
        System.out.println("\n----\nOPGAVE 2.13:");

        int monthlySavings;
        int anualInterestRate;
        double monthlyInterestRate;

        double accountSum = 0;

        monthlySavings = 100;
        anualInterestRate = 5;

        monthlyInterestRate = (anualInterestRate/100.)/12;

        for(int i = 1; i <= 6; i++){

            accountSum = (monthlySavings + accountSum) * (1 + monthlyInterestRate);

            System.out.printf("month %d your account have $%.2f\n", i, accountSum);

        }*/

/*        // opgave 2.14
        System.out.println("\n----\nOPGAVE 2.14:");

        double pounds;
        double inches;

        double kilos;
        double meters;

        double bmi;

        final double POUNDS_TO_KILOES_RATIO = 0.45359237;
        final double INCH_TO_METERS_RATIO = 0.0254;

        pounds = 95.5;
        inches = 50;

        kilos = pounds * POUNDS_TO_KILOES_RATIO;
        meters = inches * INCH_TO_METERS_RATIO;


        System.out.printf("meter: %f\n", meters);
        System.out.printf("kilo: %f\n", kilos);


        bmi = kilos/Math.pow(meters, 2);

        System.out.printf("bmi = %f\n", bmi);*/

/*        // opgave 2.15
        System.out.println("\n----\nOPGAVE 2.15:");

        double x1, x2, y1, y2;

        x1 = 1.5;
        y1 = (-3.4);

        x2 = 4;
        y2 = 5;

        System.out.println(Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));*/

        /*2.16 (Geometry: area of a hexagon) Write a program that prompts the user to enter the
        side of a hexagon and displays its area. The formula for computing the area of a
        hexagon is*/

        /*System.out.println("\n----\nOPGAVE 2.16:");
        inputObj = new Scanner(System.in);
        System.out.println("enter the side lenght of the hexagon: ");
        double side_lenght = inputObj.nextDouble();

        double Area = ( (3 * Math.sqrt(3)) / 2 ) * Math.pow(side_lenght,2);

        System.out.println(Area);*/

        /*2.17 (Science: wind-chill temperature) How cold is it outside? The temperature alone
         is not enough to provide the answer. Other factors including wind speed, relative
         humidity, and sunshine play important roles in determining coldness outside.
         In 2001, the National Weather Service (NWS) implemented the new wind-chill
         temperature to measure the coldness using temperature and wind speed. The
         formula is*/

/*        System.out.println("\n----\nOPGAVE 2.17:");
        inputObj = new Scanner(System.in);

        double Twc;
        double Ta;
        double v;

        System.out.println("Enter the temperature in Fahrenheit between -58°F and 41°F:");
        Ta = inputObj.nextDouble();

        System.out.println("Enter the wind speed (>=2) in miles per hour:");
        v = inputObj.nextDouble();

        Twc = 35.74 + 0.6215*Ta - 35.75*Math.pow(v,0.16) + 0.4275 * Ta * Math.pow(v,0.16) ;

        System.out.printf("The wind chill index %f\n", Twc);*/

        /*2.18 (Print a table) Write a program that displays the following table. Cast floatingpoint
        numbers into integers.*/

        /*System.out.println("a\tb\tpow(a, b)");
        for(int i = 1; i <= 5; i++){
            System.out.printf("%d\t%d\t%.0f\n", i, i+1, Math.pow(i, i+1));
        }*/

        /*2.19 (Geometry: area of a triangle) Write a program that prompts the user to enter
        three points (x1, y1), (x2, y2), (x3, y3) of a triangle and displays its area.
        The formula for computing the area of a triangle is*/
/*        inputObj = new Scanner(System.in);

        String triangle_raw = inputObj.nextLine();
        String[] triangle_splitted = triangle_raw.split(" ");

        double x1 = Double.parseDouble(triangle_splitted[0]);
        double y1 = Double.parseDouble(triangle_splitted[1]);

        double x2 = Double.parseDouble(triangle_splitted[2]);
        double y2 = Double.parseDouble(triangle_splitted[3]);

        double x3 = Double.parseDouble(triangle_splitted[4]);
        double y3 = Double.parseDouble(triangle_splitted[5]);

        double side1 = calcPointDistance(x1,y1, x2,y2);
        double side2 = calcPointDistance(x2,y2, x3,y3);
        double side3 = calcPointDistance(x3,y3, x1,y1);

        double s =(side1+side2+side3)/2;
        double area = Math.sqrt( s*(s-side1) * (s-side2) * (s-side3) );

        System.out.printf("The area of the triangle is %f\n", area);*/

        /*2.20 (Financial application: calculate interest) If you know the balance and the annual
        percentage interest rate, you can compute the interest on the next monthly payment
        using the following formula:

        interest = balance * (annualInterestRate/1200)

        Write a program that reads the balance and the annual percentage interest rate and
        displays the interest for the next month.*/

/*        System.out.println(1000*(3.5/1200));

        String balance_interest_raw = inputObj.nextLine();
        String[] balance_interest_splitted = balance_interest_raw.split(" ");

        double balance = Double.parseDouble(balance_interest_splitted[0]);
        double annualInterestRate = Double.parseDouble(balance_interest_splitted[1]);

        double interest = balance*(annualInterestRate/1200);

        System.out.printf("the interst is %f\n", interest);*/

        /*2.21 (Financial application: calculate future investment value) Write a program that
        reads in investment amount, annual interest rate, and number of years, and displays
        the future investment value using the following formula:*/

/*        inputObj = new Scanner(System.in);

        System.out.println("Enter investment amount: ");
        double investmentAmount = inputObj.nextDouble();

        System.out.println("Enter annual interest rate in percentage: ");
        double monthlyInterestRate = inputObj.nextDouble() / 1200;

        System.out.println("Enter number of years: ");
        double numberOfYears = inputObj.nextDouble();

        double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate),numberOfYears*12);

        System.out.printf("Accumulated value is $%f\n",futureInvestmentValue);*/

        /*2.22 (Financial application: monetary units) Rewrite Listing 2.10, ComputeChange
        .java, to fix the possible loss of accuracy when converting a double value to an
        int value. Enter the input as an integer whose last two digits represent the cents.
        For example, the input 1156 represents 11 dollars and 56 cents.*/

/*        inputObj = new Scanner(System.in);

        // Receive the amount
        System.out.println("Enter an amount in double, for example 11.56: ");
        int amount = inputObj.nextInt();

        int remainingAmount = amount;

        // Find the number of one dollars
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        // Find the number of quarters in the remaining amount
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        // Find the number of dimes in the remaining amount
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        // Find the number of nickels in the remaining amount
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        // Find the number of pennies in the remaining amount
        int numberOfPennies = remainingAmount;

        // Display results
        System.out.println("Your amount " + amount + " consists of");
        System.out.println("    " + numberOfOneDollars + " dollars");
        System.out.println("    " + numberOfQuarters + " quarters ");
        System.out.println("    " + numberOfDimes + " dimes");
        System.out.println("    " + numberOfNickels + " nickels");
        System.out.println("    " + numberOfPennies + " pennies");*/

        /*2.23 (Cost of driving) Write a program that prompts the user to enter the distance to
        drive, the fuel efficiency of the car in miles per gallon, and the price per gallon,
        and displays the cost of the trip.*/

/*        inputObj = new Scanner(System.in);

        System.out.println("Enter the driving distance: ");
        double distance = inputObj.nextDouble();

        System.out.println("Enter miles per gallon: ");
        double mpg = inputObj.nextDouble();

        System.out.println("Enter price per gallon: ");
        double gallon_price = inputObj.nextDouble();

        double price = (distance/mpg)*gallon_price;

        System.out.printf("The cost of driving is $%.2f\n",price);*/

    }

    private static double calcPointDistance(double x1, double y1, double x2, double y2 ){

        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

    }

}
