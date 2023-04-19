package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static final double PI = 3.1415;
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner mySc = new Scanner(System.in);

        System.out.println("Enter value to radius: ");
        double radius = mySc.nextDouble();

        double circun = circumference(radius);

        double volum = volume(radius);

        System.out.printf("Circumference: %.2f \n", circun);
        System.out.printf("Volume: %.2f \n", volum);
        System.out.printf("PI: %.2f", PI);

        mySc.close();
    }
    public static double circumference(double rad){
        return 2.0 * PI * rad;
    }
    public static double volume(double rad){
        return 4.0 * PI * rad * rad * rad / 3.0;
    }
}
