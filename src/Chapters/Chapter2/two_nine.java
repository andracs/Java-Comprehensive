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

        String twoDotNineInput = inputObj.nextLine();
        String[] twoDotNineInputSplit = twoDotNineInput.split(" ");

        velocity1 = Double.parseDouble( twoDotNineInputSplit[0] );
        velocity2 = Double.parseDouble( twoDotNineInputSplit[1] );

        time = Double.parseDouble( twoDotNineInputSplit[2] );

        acceleration = (velocity2-velocity1)/time;

        System.out.printf("The average acceleration is %f", acceleration);

    }
}
