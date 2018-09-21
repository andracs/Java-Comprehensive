package Chapters.Chapter1;

public class Main {
    public static void main(String[] args) {

        // opgave 1.3
        System.out.println("OPGAVE 1.3: ");
        System.out.println( "   J     A     V     V     A\n" +
                            "   J    A A     V   V     A A\n" +
                            "J  J   AAAAA     V V     AAAAA\n" +
                            " JJ   A     A     V     A     A");
        System.out.println("\n-----\n");

        // opgave 1.4
        System.out.println("OPGAVE 1.4: ");

        System.out.println("A\tA^2\tA^3\tA^4");
        for (int i = 1; i < 10; i++){

            System.out.printf("%d\t%.0f\t%.0f\t%.0f\n", i, Math.pow(i, 2), Math.pow(i, 3), Math.pow(i, 4) );

        }

        // opgave 1.5
        System.out.println("OPGAVE 1.5: ");

        System.out.println((9.5*4.5-2.5*3)/(45.5-3.5));

        // opgave 1.6
        System.out.println("OPGAVE 1.6: ");

        System.out.println();

    }
}
