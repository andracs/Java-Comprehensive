package Chapters.Chapter2;

import java.util.Scanner;

public class two_one_five {
    public static void main(String[] args) {
        ///////////////////////////////////
        // opgave 2.15                   //
        ///////////////////////////////////
        System.out.println("\n----\nOPGAVE 2.15:");

        double x1, x2, y1, y2;

        x1 = 1.5;
        y1 = (-3.4);

        x2 = 4;
        y2 = 5;

        System.out.println(Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));

        ///////////////////////////////////
        // opgave 2.16                   //
        ///////////////////////////////////
        System.out.println("\n----\nOPGAVE 2.16:");

        Scanner inputObj = new Scanner(System.in);
        System.out.println("enter the side lenght of the hexagon: ");
        double side_lenght = inputObj.nextDouble();

        double Area = ( (3 * Math.sqrt(3)) / 2 ) * Math.pow(side_lenght,2);

        System.out.println(Area);
    }
}
