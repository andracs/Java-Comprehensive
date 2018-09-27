package Chapters.Chapter3;

import java.util.Scanner;

public class three_five {
    public static void main(String[] args) {
        ///////////////////////////////////
        // opgave 3.5                    //
        ///////////////////////////////////

        String[] days = new String[7];
        days[0] = "Sunday";
        days[1] = "Monday";
        days[2] = "Tuesday";
        days[3] = "Wednesday";
        days[4] = "Thursday";
        days[5] = "Friday";
        days[6] = "Saturday";

        Scanner inputObj = new Scanner(System.in);

        System.out.println("Enter today's day:");
        int today = inputObj.nextInt();

        System.out.println("Enter the number of days elapsed since today:");
        int futureDay = today + inputObj.nextInt();

        futureDay = futureDay%7;


        System.out.printf("Today is %s and the future day is %s\n", days[today], days[futureDay]);


    }
}
