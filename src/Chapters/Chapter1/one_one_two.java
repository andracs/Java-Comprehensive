package Chapters.Chapter1;

public class one_one_two {
    public static void main(String[] args) {
        ///////////////////////////////////
        // opgave 1.12                   //
        ///////////////////////////////////
        System.out.println("\n----\nOPGAVE 1.12:");

        double kilometer1DOT12 = 24 * 1.6;
        int hours1DOT12 = 1;
        int minutes1DOT12 = 40;
        int seconds1DOT12 = 35;
        double timeInSeconds1DOT12 = hours1DOT12*60*60 + minutes1DOT12*60 + seconds1DOT12;

        System.out.println( (kilometer1DOT12/timeInSeconds1DOT12) * 60 * 60 );

    }
}
