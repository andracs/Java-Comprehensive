package Chapters.Chapter3;

import java.util.Scanner;

public class three_six {



    public static void main(String[] args) {
        ///////////////////////////////////
        // opgave 3.6                    //
        ///////////////////////////////////

        final double METERS_PER_FEET = 0.3048;
        final double METERS_PER_INCH = 0.0254;

        final double KILOGRAMS_PER_POUND = 0.45359237;

        Scanner inputObj = new Scanner(System.in);

        System.out.println("Enter weight in pounds:");
        double pounds = inputObj.nextDouble();

        System.out.println("Enter feet:");
        int feet = inputObj.nextInt();

        System.out.println("enter inches:");
        int inches = inputObj.nextInt();

        double meters = feet*METERS_PER_FEET + inches*METERS_PER_INCH;
        double kg = pounds * KILOGRAMS_PER_POUND;

        double bmi = kg/Math.pow(meters,2);

        System.out.printf("BMI is %f\n", bmi);

        if(bmi < 18.5){
            System.out.println("Underweight");
        }else if(bmi < 25){
            System.out.println("Normal");
        }else if(bmi < 30){
            System.out.println("Overwieght");
        }else{
            System.out.println("Obese");
        }



    }
}
