package Chapters.Chapter3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inputObj = new Scanner(System.in);

        ///////////////////////////////////
        // opgave 3.1                    //
        ///////////////////////////////////

        System.out.println("\n----\nOPGAVE 3.1:");
        System.out.println("Enter a, b, c:");
        String raw = inputObj.nextLine();
        String[] raw_split = raw.split(" ");

        double a; double b; double c;

        a = Double.parseDouble(raw_split[0]);
        b = Double.parseDouble(raw_split[1]);
        c = Double.parseDouble(raw_split[2]);

        double discriminant = Math.pow(b,2)-4*a*c;

        System.out.println(discriminant);

        double root1 = (-b + Math.sqrt(discriminant)) / (2*a);
        double root2 = (-b - Math.sqrt(discriminant)) / (2*a);

        if(discriminant > 0){
            System.out.printf("The equation has two roots %f and %f\n", root1, root2);
        }
        else if(discriminant == 0){
            System.out.printf("The equation has one root%f\n", root1);
        }
        else
        {
            System.out.println("The equation has no real roots");
        }



    }

}