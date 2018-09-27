package Chapters.Chapter2;

import java.util.Scanner;

public class two_one_seven {
    public static void main(String[] args) {
        ///////////////////////////////////
        // opgave 2.17                   //
        ///////////////////////////////////
        System.out.println("\n----\nOPGAVE 2.17:");
        Scanner inputObj = new Scanner(System.in);

        double Twc;
        double Ta;
        double v;

        System.out.println("Enter the temperature in Fahrenheit between -58°F and 41°F:");
        Ta = inputObj.nextDouble();

        System.out.println("Enter the wind speed (>=2) in miles per hour:");
        v = inputObj.nextDouble();

        Twc = 35.74 + 0.6215*Ta - 35.75*Math.pow(v,0.16) + 0.4275 * Ta * Math.pow(v,0.16) ;

        System.out.printf("The wind chill index %f\n", Twc);

    }
}
