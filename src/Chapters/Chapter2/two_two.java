package Chapters.Chapter2;

import java.util.Scanner;

public class two_two {
    public static void main(String[] args) {
        ///////////////////////////////////
        // opgave 2.2                    //
        ///////////////////////////////////
        System.out.println("\n----\nOPGAVE 2.2:");

        Scanner inputObj = new Scanner(System.in);

        System.out.println("Enter the radius and length of a cylinder: ");

        String twoDotTwoInput = inputObj.nextLine();
        String[] twoDotTwoInputSplit = twoDotTwoInput.split(" ");

        double radius = Double.parseDouble(twoDotTwoInputSplit[0]);
        double length = Double.parseDouble(twoDotTwoInputSplit[1]);

        double area = radius * radius * Math.PI;
        double volume = area * length;

        System.out.printf("The area is %f\nThe volume is %f\n", area, volume);

        System.out.println(twoDotTwoInput);
    }
}
