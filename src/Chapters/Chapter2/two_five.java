package Chapters.Chapter2;
import java.util.Scanner;

public class two_five {
    public static void main(String[] args) {
        ///////////////////////////////////
        // opgave 2.5                    //
        ///////////////////////////////////
        System.out.println("\n----\nOPGAVE 2.5:");

        Scanner inputObj = new Scanner(System.in);

        System.out.println("Enter the subtotal and a gratuity rate: ");

        String twoDotFiveInput = inputObj.nextLine();
        String[] twoDotFiveInputSplit = twoDotFiveInput.split(" ");

        double subtotal = Double.parseDouble(twoDotFiveInputSplit[0]);
        double gratuityRate = Double.parseDouble(twoDotFiveInputSplit[1]);

        double gratuity = (gratuityRate/100)*subtotal;
        double total = subtotal+gratuity;

        System.out.printf("The gratuity is $%f and total is $%f", gratuity, total);

    }
}
