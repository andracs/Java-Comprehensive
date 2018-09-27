package Chapters.Chapter2;

import java.util.Scanner;

public class two_one_one {
    public static void main(String[] args) {
        ///////////////////////////////////
        // opgave 2.11                   //
        ///////////////////////////////////
        System.out.println("\n----\nOPGAVE 2.11:");

        Scanner inputObj = new Scanner(System.in);

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

        }
    }
}
