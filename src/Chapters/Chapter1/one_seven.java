package Chapters.Chapter1;

public class one_seven {
    public static void main(String[] args) {
        ///////////////////////////////////
        // opgave 1.7                    //
        ///////////////////////////////////
        System.out.println("\n----\nOPGAVE 1.7:");

        double calculatePI = 0;
        boolean additiveSwitch = true;

        for (double i = 3; i < 12; i+=2) {
            if (additiveSwitch){
                calculatePI = calculatePI + 1/i;

            }
            else{
                calculatePI = calculatePI - 1/i;

            }
            // switch it!
            additiveSwitch=!additiveSwitch;
        }
        calculatePI=1-calculatePI;
        calculatePI=calculatePI*4;

        System.out.printf("pi=%f\n", calculatePI);

        // mere præcist svar til opgave 1.7
        System.out.println(4. * (1 - 1./3 + 1./5 - 1./7 + 1./9 - 1./11) );
        System.out.println(4. * (1 - 1./3 + 1./5 - 1./7 + 1./9 - 1./11 + 1./13) );
    }
}
