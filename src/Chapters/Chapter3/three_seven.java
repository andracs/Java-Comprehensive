package Chapters.Chapter3;

import java.util.Scanner;

public class three_seven {
    public static void main(String[] args) {
        ///////////////////////////////////
        // opgave 3.7                    //
        ///////////////////////////////////

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Receive the amount
        System.out.print(
                "Enter an amount in double, for example 11.56: ");
        double amount = input.nextDouble();

        int remainingAmount = (int)(amount * 100);

        // Find the number of one dollars
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        // Find the number of quarters in the remaining amount
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        // Find the number of dimes in the remaining amount
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        // Find the number of nickels in the remaining amount
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        // Find the number of pennies in the remaining amount
        int numberOfPennies = remainingAmount;

        String dollarName="dollar";
        if(numberOfOneDollars > 1){
            dollarName="dollars";
        }

        String quarterName="quarter";
        if(numberOfQuarters > 1){
            quarterName="quarters";
        }

        String dimeName="dime";
        if(numberOfDimes > 1){
            dimeName="dimes";
        }

        String nickelName="nickel";
        if(numberOfNickels > 1){
            nickelName="nickels";
        }

        String pennielName="pennie";
        if(numberOfPennies > 1){
            pennielName="pennies";
        }

        // Display results
        String output = "Your amount " + amount + " consists of \n" +
                "\t" + numberOfOneDollars + " " + dollarName + "\n" +
                "\t" + numberOfQuarters + " " + quarterName + "\n" +
                "\t" + numberOfDimes + " " + dimeName + "\n" +
                "\t" + numberOfNickels + " " + nickelName + "\n" +
                "\t" + numberOfPennies + " " + pennielName;
        System.out.println(output);

    }
}
