package Chapters.Chapter2;

import java.util.Scanner;

public class two_two_one {
    public static void main(String[] args) {
        ///////////////////////////////////
        // opgave 2.21                   //
        ///////////////////////////////////
        System.out.println("\n----\nOPGAVE 2.21:");

        Scanner inputObj = new Scanner(System.in);

        System.out.println("Enter investment amount: ");
        double investmentAmount = inputObj.nextDouble();

        System.out.println("Enter annual interest rate in percentage: ");
        double monthlyInterestRate = inputObj.nextDouble() / 1200;

        System.out.println("Enter number of years: ");
        double numberOfYears = inputObj.nextDouble();

        double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate),numberOfYears*12);

        System.out.printf("Accumulated value is $%f\n",futureInvestmentValue);
    }
}
