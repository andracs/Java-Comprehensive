package Chapters.Chapter3;

import java.util.Scanner;

public class three_nine {

    public static void main(String[] args) {
        ///////////////////////////////////
        // opgave 3.9                    //
        ///////////////////////////////////
        Scanner inputObj = new Scanner(System.in);

        String isbn = inputObj.nextLine();
        String[] split = isbn.split("");


        int d1 = Integer.parseInt(split[0]);
        int d2 = Integer.parseInt(split[1]);
        int d3 = Integer.parseInt(split[2]);
        int d4 = Integer.parseInt(split[3]);
        int d5 = Integer.parseInt(split[4]);
        int d6 = Integer.parseInt(split[5]);
        int d7 = Integer.parseInt(split[6]);
        int d8 = Integer.parseInt(split[7]);
        int d9 = Integer.parseInt(split[8]);

        int d10 = (d1*1 + d2*2 + d3*3 + d4*4 + d5*5 + d6*6 + d7*7 + d8*8 + d9*9) % 11;

        isbn = "";
        isbn = isbn + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9;

        if(d10 == 10){
            isbn = isbn + "X";
        }else{
            isbn = isbn + d10;
        }

        System.out.printf("The ISBN-10 number is %s\n", isbn);

    }

}
