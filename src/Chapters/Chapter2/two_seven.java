package Chapters.Chapter2;

import java.util.Scanner;

public class two_seven {
    public static void main(String[] args) {
        ///////////////////////////////////
        // opgave 2.7                    //
        ///////////////////////////////////
        System.out.println("\n----\nOPGAVE 2.7:");
        System.out.println("Enter the number of minutes: ");

        Scanner inputObj = new Scanner(System.in);

        int inputoftwodotseven = inputObj.nextInt();

        final int MINUTES_IN_ONE_DAY = 24*60;
        final int DAYS_PER_YEAR = 365;

        int total_days = inputoftwodotseven/MINUTES_IN_ONE_DAY;

        System.out.println(total_days/DAYS_PER_YEAR);
        System.out.println(total_days%DAYS_PER_YEAR);

    }
}
