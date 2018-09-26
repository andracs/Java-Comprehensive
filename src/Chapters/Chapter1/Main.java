package Chapters.Chapter1;

public class Main {

    public static void main(String[] args) {

        ///////////////////////////////////
        // opgave 1.3                    //
        ///////////////////////////////////
        System.out.println("OPGAVE 1.3:");
        System.out.println( "   J     A     V     V     A\n   J    A A     V   V     A A\nJ  J   AAAAA     V V     AAAAA\n JJ   A     A     V     A     A");

        ///////////////////////////////////
        // opgave 1.4                    //
        ///////////////////////////////////
        System.out.println("\n----\nOPGAVE 1.4:");

        System.out.println("A\tA^2\tA^3\tA^4");
        for (int i = 1; i < 10; i++){

            System.out.printf("%d\t%.0f\t%.0f\t%.0f\n", i, Math.pow(i, 2), Math.pow(i, 3), Math.pow(i, 4) );

        }

        ///////////////////////////////////
        // opgave 1.5                    //
        ///////////////////////////////////
        System.out.println("\n----\nOPGAVE 1.5:");

        System.out.println((9.5*4.5-2.5*3)/(45.5-3.5));

        ///////////////////////////////////
        // opgave 1.6                    //
        ///////////////////////////////////
        System.out.println("\n----\nOPGAVE 1.6:");

        int sum1dot6 = 0;

        for (int i = 1; i < 10; i++){

            sum1dot6 += i;

        }

        System.out.println(sum1dot6);

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

        ///////////////////////////////////
        // opgave 1.8                    //
        ///////////////////////////////////
        System.out.println("\n----\nOPGAVE 1.8:");

        double perimeter1dot8 = 2 * 5.5 * Math.PI;
        double area1dot8 = 5.5 * 5.5 * Math.PI;

        System.out.printf("perimeter: %f, area: %f\n", perimeter1dot8, area1dot8);

        ///////////////////////////////////
        // opgave 1.9                    //
        ///////////////////////////////////
        System.out.println("\n----\nOPGAVE 1.9:");

        System.out.printf("area = %f\nperimeter = %f", 4.5*7.9, 2*(4.5+7.9));

        ///////////////////////////////////
        // opgave 1.10                   //
        ///////////////////////////////////
        System.out.println("\n----\nOPGAVE 1.10:");

        // convert km to miles
        double miles1DOT10      = 14/1.6;

        System.out.printf( "%.2f mph\n", (miles1DOT10/45.5)*60 );

        ///////////////////////////////////
        // opgave 1.11                   //
        ///////////////////////////////////
        System.out.println("\n----\nOPGAVE 1.11:");

        int secondsPerDay = 60*60*24;
        int birthsPerDay = secondsPerDay/7;
        int deathsPerDay = secondsPerDay/13;
        int immigrantsPerDay = secondsPerDay/45;

        int dayPerYear = 365;
        int birthsPerYear = dayPerYear * birthsPerDay;
        int deathsPerYear = deathsPerDay * dayPerYear;
        int immigrantsPerYear = immigrantsPerDay * dayPerYear;

        int startPopulation = 312032486;

        for (int i = 1; i < 6; i++) {

            int births = birthsPerYear * i;
            int deaths = deathsPerYear * i;
            int immigrants = immigrantsPerYear * i;

            int people = startPopulation + births + immigrants - deaths;


            System.out.printf("year: %d, population: %d\n", i, people);

        }

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

        ///////////////////////////////////
        // opgave 1.13                   //
        ///////////////////////////////////
        System.out.println("\n----\nOPGAVE 1.13:");

        Cramers CramersObj = new Cramers(3.4, 50.2, 2.1, .55, 44.5, 5.9);

        System.out.printf("x=%f, y=%f\n", CramersObj.getX(), CramersObj.getY() );

    }

}
