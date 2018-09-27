package Chapters.Chapter2;

public class two_one_three {
    public static void main(String[] args) {
        ///////////////////////////////////
        // opgave 2.13                   //
        ///////////////////////////////////
        System.out.println("\n----\nOPGAVE 2.13:");

        int monthlySavings;
        int anualInterestRate;
        double monthlyInterestRate;

        double accountSum = 0;

        monthlySavings = 100;
        anualInterestRate = 5;

        monthlyInterestRate = (anualInterestRate/100.)/12;

        for(int i = 1; i <= 6; i++){

            accountSum = (monthlySavings + accountSum) * (1 + monthlyInterestRate);

            System.out.printf("month %d your account have $%.2f\n", i, accountSum);

        }
    }
}
