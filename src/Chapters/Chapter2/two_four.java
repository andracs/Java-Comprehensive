package Chapters.Chapter2;

import java.util.Scanner;

public class two_four {
    public static void main(String[] args) {
        ///////////////////////////////////
        // opgave 2.4                    //
        ///////////////////////////////////
        System.out.println("\n----\nOPGAVE 2.4:");

        Scanner inputObj = new Scanner(System.in);

        System.out.println("Enter a number in pounds: ");
        double pounds = inputObj.nextDouble();
        double kilograms = pounds * .454;

        System.out.printf("%f pounds is %f kilograms", pounds, kilograms);
    }
}
