package Chapters.Chapter2;

import java.util.Scanner;

public class two_one_two {
    public static void main(String[] args) {
        ///////////////////////////////////
        // opgave 2.12                   //
        ///////////////////////////////////
        System.out.println("\n----\nOPGAVE 2.12:");

        double accelerationtwodotonetwo, speed, lengthsomeshity;

        Scanner inputObj = new Scanner(System.in);

        System.out.println("Enter speed and acceleration: ");

        speed = inputObj.nextDouble();
        accelerationtwodotonetwo = inputObj.nextDouble();

        lengthsomeshity = Math.pow(speed,2)/(2*accelerationtwodotonetwo);

        System.out.printf("The minimum runway length for this airplane is %.3f", lengthsomeshity);


    }
}
