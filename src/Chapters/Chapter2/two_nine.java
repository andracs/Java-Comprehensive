package Chapters.Chapter2;

import java.util.Scanner;

public class two_nine {
    public static void main(String[] args) {
        ///////////////////////////////////
        // opgave 2.9                    //
        ///////////////////////////////////
        System.out.println("\n----\nOPGAVE 2.9:");

        System.out.println("Enter v0, v1, and t: ");

        double acceleration, velocity1, velocity2, time;

        Scanner inputObj = new Scanner(System.in);

        velocity1 = inputObj.nextDouble();
        velocity2 = inputObj.nextDouble();

        time = inputObj.nextDouble();

        acceleration = (velocity2-velocity1)/time;

        System.out.printf("The average acceleration is %f", acceleration);

    }
}
