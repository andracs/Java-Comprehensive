package Chapters.Chapter1;

public class Cramers {

    private double x;
    private double y;

    private double a;
    private double b;
    private double e;
    private double c;
    private double d;
    private double f;

    private double calcX(){
        return (e*d - b*f) / (a*d - b*c);
    }

    private double calcY(){
        return (a*f - e*c) / (a*d - b*c);
    }

    public Cramers(double a, double b, double c, double d, double e, double f){

        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.f = f;

        this.x = calcX();
        this.y = calcY();


    }

    public double getX(){ return x; }
    public double getY(){ return y; }

}
