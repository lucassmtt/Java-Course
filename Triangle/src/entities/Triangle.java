package entities;

public class Triangle{

    public double lado_a;
    public double lado_b;
    public double lado_c;

    public double getArea(){

        double p = (lado_a + lado_b + lado_c) / 2;

        return Math.sqrt(p * (p - lado_a) * (p - lado_b) * (p - lado_c));
    }
}