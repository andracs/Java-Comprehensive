package Chapters.Chapter3;

import java.util.Scanner;

public class tree_two {
    public static void main(String[] args) {
        ///////////////////////////////////
        // opgave 3.2                    //
        ///////////////////////////////////

        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() / 7 % 10);
        int number3 = (int)(System.currentTimeMillis() / 7 % 10 * 3.5);

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

        // Create a Scanner
        Scanner input = new Scanner(System.in);
        int answer_user = -1;
        int answer_correct = number1 + number2 + number3;

        while(answer_correct != answer_user){
            System.out.println("What is " + number1 + " + " + number2 + " + " + number3 + "? ");
            answer_user = input.nextInt();
        }

        System.out.println("you are absolutely correct!");



    }

}
