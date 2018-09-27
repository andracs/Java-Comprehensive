package Chapters.Chapter2;

import java.util.Scanner;

public class two_one_zero {
    public static void main(String[] args) {
        ///////////////////////////////////
        // opgave 2.10                   //
        ///////////////////////////////////
        System.out.println("\n----\nOPGAVE 2.10:");

        double Q;
        double M;
        double finalTemp;
        double initTemp;

        Scanner inputObj = new Scanner(System.in);

        System.out.println("Enter the amount of water in kilograms: ");
        M = inputObj.nextDouble();

        System.out.println("Enter the initial temperature: ");
        initTemp = inputObj.nextDouble();

        System.out.println("Enter the final temperature: ");
        finalTemp = inputObj.nextDouble();

        Q = M * (finalTemp - initTemp) * 4184;

        System.out.printf("The energy needed is %.1f", Q);
    }
}
