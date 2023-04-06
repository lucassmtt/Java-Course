package application;

import entities.Triangle;

import java.util.Scanner;

public class Program{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);

        Triangle Triangle_x, Triangle_y;
        Triangle_x = new Triangle();
        Triangle_y = new Triangle();

        System.out.println("Enter the measures of triangle X:");
        Triangle_x.lado_a = myScanner.nextDouble();
        Triangle_x.lado_b = myScanner.nextDouble();
        Triangle_x.lado_c = myScanner.nextDouble();

        System.out.println("Enter the measures of triangle Y:");
        Triangle_y.lado_a = myScanner.nextDouble();
        Triangle_y.lado_b = myScanner.nextDouble();
        Triangle_y.lado_c = myScanner.nextDouble();

//      double p_X = (Triangle_x.lado_a + Triangle_x.lado_b + Triangle_x.lado_c) / 2;
//      double areaX = Math.sqrt(p_X * (p_X - Triangle_x.lado_a) * (p_X - Triangle_x.lado_b) * (p_X - Triangle_x.lado_c));
//
//      double p_Y = (Triangle_y.lado_a + Triangle_y.lado_b + Triangle_y.lado_c) / 2;
//      double areaY = Math.sqrt(p_Y * (p_Y - Triangle_y.lado_a) * (p_Y - Triangle_y.lado_b) * (p_Y - Triangle_y.lado_c));

        // Ao invés de fazer o cálculo dentro do programa, apenas chamamos a função
        // Instead of doing the calculation inside the program, we just call the function

        double areaX = Triangle_x.getArea();
        double areaY = Triangle_y.getArea();

        System.out.printf("Triangle X area: %.2f\n", areaX);
        System.out.printf("Triangle Y area: %.2f\n", areaY);

        if (areaX > areaY){
            System.out.println("Larger: X \n");
        }
        else{
            System.out.println("Larger: Y \n");
        }
    }
}