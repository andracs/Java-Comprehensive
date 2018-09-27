package Chapters.Chapter3;

import java.util.Scanner;

public class three_eight {
    public static void main(String[] args) {
        ///////////////////////////////////
        // opgave 3.8                    //
        ///////////////////////////////////

        Scanner inputObj = new Scanner(System.in);

        System.out.println("Enter 3 integers a, b, c");

        int Integers[] = new int[3];

        for(int i = 0; i < 3; i++){
            Integers[i] = inputObj.nextInt();
        }

        System.out.printf("original order: %d, %d, %d\n", Integers[0], Integers[1], Integers[2] );

        Integers = sort(Integers);

        System.out.printf("sorted order: %d, %d, %d\n", Integers[0], Integers[1], Integers[2] );

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
