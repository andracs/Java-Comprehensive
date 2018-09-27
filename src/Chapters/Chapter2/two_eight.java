package Chapters.Chapter2;

import java.util.Scanner;

public class two_eight {
    public static void main(String[] args) {
        ///////////////////////////////////
        // opgave 2.8                    //
        ///////////////////////////////////

        System.out.println("\n----\nOPGAVE 2.8:");

        Scanner inputObj = new Scanner(System.in);
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

    }
}
