package Chapters.Chapter2;

import java.util.Scanner;

public class two_two_three {

    public static void main(String[] args) {
        ///////////////////////////////////
        // opgave 2.23                   //
        ///////////////////////////////////
        System.out.println("\n----\nOPGAVE 2.23:");

        Scanner inputObj = new Scanner(System.in);

        System.out.println("Enter the driving distance: ");
        double distance = inputObj.nextDouble();

        System.out.println("Enter miles per gallon: ");
        double mpg = inputObj.nextDouble();

        System.out.println("Enter price per gallon: ");
        double gallon_price = inputObj.nextDouble();

        double price = (distance/mpg)*gallon_price;

        System.out.printf("The cost of driving is $%.2f\n",price);
    }

}
