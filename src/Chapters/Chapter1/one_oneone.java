package Chapters.Chapter1;

public class one_oneone {
    public static void main(String[] args) {
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
    }
}
