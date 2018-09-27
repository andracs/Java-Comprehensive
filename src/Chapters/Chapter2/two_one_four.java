package Chapters.Chapter2;

public class two_one_four {
    public static void main(String[] args) {
        ///////////////////////////////////
        // opgave 2.14                   //
        ///////////////////////////////////
        System.out.println("\n----\nOPGAVE 2.14:");

        double poundstwodotonefour;
        double inches;

        double kilos;
        double meterstwodotonefour;

        double bmi;

        final double POUNDS_TO_KILOES_RATIO = 0.45359237;
        final double INCH_TO_METERS_RATIO = 0.0254;

        poundstwodotonefour = 95.5;
        inches = 50;

        kilos = poundstwodotonefour * POUNDS_TO_KILOES_RATIO;
        meterstwodotonefour = inches * INCH_TO_METERS_RATIO;


        System.out.printf("meter: %f\n", meterstwodotonefour);
        System.out.printf("kilo: %f\n", kilos);


        bmi = kilos/Math.pow(meterstwodotonefour, 2);

        System.out.printf("bmi = %f\n", bmi);

    }
}
