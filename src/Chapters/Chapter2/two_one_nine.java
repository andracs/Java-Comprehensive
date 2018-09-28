package Chapters.Chapter2;

import java.util.Scanner;

public class two_one_nine {

    public static void main(String[] args) {
        ///////////////////////////////////
        // opgave 2.19                   //
        ///////////////////////////////////
        System.out.println("\n----\nOPGAVE 2.19:");
        Scanner inputObj = new Scanner(System.in);

        double x1 = inputObj.nextDouble();
        double y1 = inputObj.nextDouble();

        double x2 = inputObj.nextDouble();
        double y2 = inputObj.nextDouble();

        double x3 = inputObj.nextDouble();
        double y3 = inputObj.nextDouble();

        double side1 = calcPointDistance(x1,y1, x2,y2);
        double side2 = calcPointDistance(x2,y2, x3,y3);
        double side3 = calcPointDistance(x3,y3, x1,y1);

        double s =(side1+side2+side3)/2;
        double area = Math.sqrt( s*(s-side1) * (s-side2) * (s-side3) );

        System.out.printf("The area of the triangle is %f\n", area);
    }

    private static double calcPointDistance(double x1, double y1, double x2, double y2 ){

        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

    }
}
