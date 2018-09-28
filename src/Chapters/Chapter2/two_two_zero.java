package Chapters.Chapter2;

import java.util.Scanner;

public class two_two_zero {
    public static void main(String[] args) {
        ///////////////////////////////////
        // opgave 2.2                    //
        ///////////////////////////////////

        Scanner inputObj = new Scanner(System.in);

        System.out.println("\n----\nOPGAVE 2.2:");

        System.out.println(1000*(3.5/1200));

        double balance = inputObj.nextDouble();
        double annualInterestRate = inputObj.nextDouble();

        double interest = balance*(annualInterestRate/1200);

        System.out.printf("the interst is %f\n", interest);
    }
}
