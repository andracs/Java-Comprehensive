package Chapters.Chapter2;

public class two_one_eight {
    public static void main(String[] args) {
        ///////////////////////////////////
        // opgave 2.18                   //
        ///////////////////////////////////

        System.out.println("a\tb\tpow(a, b)");
        for(int i = 1; i <= 5; i++){
            System.out.printf("%d\t%d\t%.0f\n", i, i+1, Math.pow(i, i+1));
        }
    }
}
