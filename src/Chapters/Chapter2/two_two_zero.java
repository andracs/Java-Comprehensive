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

        String balance_interest_raw = inputObj.nextLine();
        String[] balance_interest_splitted = balance_interest_raw.split(" ");

        double balance = Double.parseDouble(balance_interest_splitted[0]);
        double annualInterestRate = Double.parseDouble(balance_interest_splitted[1]);

        double interest = balance*(annualInterestRate/1200);

        System.out.printf("the interst is %f\n", interest);
    }
}
