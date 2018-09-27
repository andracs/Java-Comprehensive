package Chapters.Chapter2;
import java.util.Scanner;

public class two_one {
    public static void main(String[] args) {
        ///////////////////////////////////
        // opgave 2.1                    //
        ///////////////////////////////////
        System.out.println("OPGAVE 2.1:");

        Scanner inputObj = new Scanner(System.in);

        System.out.println("Enter a degree in Celsius: ");

        double celsius = inputObj.nextDouble();

        double fahrenheit = celsius * 9.0/5 + 32;

        System.out.printf("%f Celsius is %f Fahrenheit", celsius, fahrenheit);
    }
}
