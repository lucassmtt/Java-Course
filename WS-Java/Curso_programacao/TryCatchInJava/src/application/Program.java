package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int pos = 0;
        try{
            String[] vect = input.nextLine().split(" ");
            pos = input.nextInt();
            System.out.println(vect[pos]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Impossible accessing index " + pos);
        }
        catch (java.util.InputMismatchException e){
            System.out.println("You sent invalid input! ");
        }
        finally {
            System.out.println("END THE PROGRAM");
        }
        input.close();
    }
}
