package application;

import java.util.Locale;
import entities.Rectangle;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        Rectangle myRect = new Rectangle();
        Scanner mySc = new Scanner(System.in);

        System.out.println("Enter two values to rectangle: ");
        System.out.println("For height: ");
        myRect.height = mySc.nextInt();

        System.out.println("For width: ");
        myRect.width = mySc.nextInt();

        System.out.printf("AREA = %.2f \n", myRect.area());
        System.out.printf("PERIMETER = %.2f \n", myRect.perimeter());
        System.out.printf("DIAGONAL = %.2f \n", myRect.diagonal());

        mySc.close();

    }
}
