package Chapters.Chapter3;

public class three_four {
    public static void main(String[] args) {
        ///////////////////////////////////
        // opgave 3.4                    //
        ///////////////////////////////////

        String[] months = new String[12];
        months[0] = "January";
        months[1] = "February";
        months[2] = "March";
        months[3] = "April";
        months[4] = "May";
        months[5] = "June";
        months[6] = "July";
        months[7] = "August";
        months[8] = "Septemper";
        months[9] = "October";
        months[10] = "November";
        months[11] = "Devember";

        int month = (int)(Math.random()*13);

        System.out.println(months[month]);


    }
}
