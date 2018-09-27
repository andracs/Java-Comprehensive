package Chapters.Chapter1;

public class one_one_three {

    public static void main(String[] args) {
        ///////////////////////////////////
        // opgave 1.13                   //
        ///////////////////////////////////
        System.out.println("\n----\nOPGAVE 1.13:");

        Cramers CramersObj = new Cramers(3.4, 50.2, 2.1, .55, 44.5, 5.9);

        System.out.printf("x=%f, y=%f\n", CramersObj.getX(), CramersObj.getY() );
    }

}
