package Chapters.Chapter3;
import java.util.Scanner;

public class three_onezero {
    public static void main(String[] args) {
        ///////////////////////////////////
        // opgave 3.10                   //
        ///////////////////////////////////

        // 1. Generate two random single-digit integers
        int number1 = (int)(Math.random() * 100);
        int number2 = (int)(Math.random() * 100);
        int number3 = (int)(Math.random() * 100);

        // 2. If number1 < number2, swap number1 with number2
        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        // 3. Prompt the student to answer �what is number1 � number2?�
        System.out.print("What is " + number1 + " - " + number2 + "? ");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

        // 4. Grade the answer and display the result
        if (number1 - number2 == answer) {
            System.out.println("You are correct!");
        }
        else {
            System.out.println("Your answer is wrong.\n" + number1 + " - "
                    + number2 + " should be " + (number1 - number2));
        }
    }

    private static int[] sort(int[] l){

        int t;

        for(int i = 0; i < 3; i++){
            for(int j = i; j < 3; j++){

                if(l[j] < l[i]){
                    t = l[j];
                    l[j] = l[i];
                    l[i] = t;
                }

            }
        }

        return l;
    }

}
