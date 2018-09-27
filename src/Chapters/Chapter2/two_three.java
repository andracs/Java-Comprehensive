package Chapters.Chapter2;

import java.util.Scanner;

public class two_three {
    public static void main(String[] args) {
        ///////////////////////////////////
        // opgave 2.3                    //
        ///////////////////////////////////
        System.out.println("\n----\nOPGAVE 2.3:");

        Scanner inputObj = new Scanner(System.in);

        System.out.println("Enter a value for feet: ");
        double feet = inputObj.nextDouble();
        double meters = feet * 0.305;

        System.out.printf("%f feet is %f meters", feet, meters);
    }
}
