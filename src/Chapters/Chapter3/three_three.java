package Chapters.Chapter3;

import java.util.Scanner;

public class three_three {
    public static void main(String[] args) {
        ///////////////////////////////////
        // opgave 3.3                    //
        ///////////////////////////////////

        Scanner inputObj = new Scanner(System.in);

        double a;
        double b;
        double c;
        double d;
        double e;
        double f;

        System.out.println("Enter a, b, c, d, e, f:");
        a = inputObj.nextDouble();
        b = inputObj.nextDouble();
        c = inputObj.nextDouble();
        d = inputObj.nextDouble();
        e = inputObj.nextDouble();
        f = inputObj.nextDouble();

        double valid = a*d-b*c;

        if(valid!= 0) {

            double x = (e * d - b * f) / (a * d - b * c);

            double y = (a * f - e * c) / (a * d - b * c);

            System.out.printf("x is %f and y is %f\n",x,y);

        }else{
            System.out.println("The equation has no solution");
        }



    }
}
