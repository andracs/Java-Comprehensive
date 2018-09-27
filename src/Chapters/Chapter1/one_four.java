package Chapters.Chapter1;

public class one_four {

    public static void main(String[] args) {
        ///////////////////////////////////
        // opgave 1.4                    //
        ///////////////////////////////////
        System.out.println("\n----\nOPGAVE 1.4:");

        System.out.println("A\tA^2\tA^3\tA^4");
        for (int i = 1; i < 10; i++){

            System.out.printf("%d\t%.0f\t%.0f\t%.0f\n", i, Math.pow(i, 2), Math.pow(i, 3), Math.pow(i, 4) );

        }
    }

}
