package Chapters.Chapter2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    }

    private static double calcPointDistance(double x1, double y1, double x2, double y2 ){

        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

    }

}
