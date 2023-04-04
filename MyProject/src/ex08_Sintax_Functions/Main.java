package ex08_Sintax_Functions;

import java.util.Scanner;

public class Main
{
    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Digite três valores: ");
        int a = myScanner.nextInt();
        int b = myScanner.nextInt();
        int c = myScanner.nextInt();

        int higher = highestValue(a, b, c);
        showResult(higher);
        myScanner.close();
    }

    public static int highestValue(int x, int y, int z){
        int max;
        if (x > y && x > z){
            max = x;
        }
        else if (y > z){
            max = y;
        }
        else{
            max = z;
        }
        return max;
    }

    public static void showResult(int higher){
        System.out.println("HIGHER : " + higher);
    }

}
