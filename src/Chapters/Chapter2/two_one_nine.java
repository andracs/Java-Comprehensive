package Chapters.Chapter2;

import java.util.Scanner;

public class two_one_nine {

    public static void main(String[] args) {
        ///////////////////////////////////
        // opgave 2.19                   //
        ///////////////////////////////////
        System.out.println("\n----\nOPGAVE 2.19:");
        Scanner inputObj = new Scanner(System.in);

        String triangle_raw = inputObj.nextLine();
        String[] triangle_splitted = triangle_raw.split(" ");

        double x1 = Double.parseDouble(triangle_splitted[0]);
        double y1 = Double.parseDouble(triangle_splitted[1]);

        double x2 = Double.parseDouble(triangle_splitted[2]);
        double y2 = Double.parseDouble(triangle_splitted[3]);

        double x3 = Double.parseDouble(triangle_splitted[4]);
        double y3 = Double.parseDouble(triangle_splitted[5]);

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
