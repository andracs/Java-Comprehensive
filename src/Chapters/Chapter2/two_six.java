package Chapters.Chapter2;

import java.util.Scanner;

public class two_six {
    public static void main(String[] args) {
        ///////////////////////////////////
        // opgave 2.6                    //
        ///////////////////////////////////
        System.out.println("\n----\nOPGAVE 2.6:");

        Scanner inputObj = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 1000:");
        int integer = inputObj.nextInt();

        int sum;

        if(integer < 10){ // integer has only 1 integer

            System.out.printf("The sum of the digits is %d", integer);

        }else if(integer < 100){ // integer has only 10 integer

            sum = integer % 10;
            integer = integer / 10;
            sum = sum + integer;

            System.out.printf("The sum of the digits is %d", sum);

        }else if(integer < 1000){ // integer has only 100 integer

            sum = integer % 10;
            integer = integer / 10;

            sum = sum + (integer % 10);
            integer = integer / 10;
            sum = sum + integer;

            System.out.printf("The sum of the digits is %d", sum);

        }else{ // this number must be 1000 and the result would be 1.
            System.out.println("The sum of the digits is 1");
        }

    }
}
