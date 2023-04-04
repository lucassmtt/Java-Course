package ex04;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name;

        name = sc.next();//vai scannear a string
        System.out.printf("Você digitou " + name + "%n");

        int num;
        num = sc.nextInt();//vai scannear um número inteiro
        System.out.printf("Você digitou %d %n", num);

        double myNum;
        myNum = sc.nextDouble();//vai scannear seu número com ponto flutuante
        System.out.printf("Você digitou o número %.2f %n", myNum);

        char myChar;
        myChar = sc.next().charAt(0);
        System.out.printf("Você digitou o caracter %s %n", myChar);
        System.out.printf("--------------------------------------------------------------- %n");

        String other_Name, postname, address;

        sc.nextLine();
        other_Name = sc.nextLine();//vai processar todas na mesma linha
        postname = sc.nextLine();
        address = sc.nextLine();

        System.out.printf("%s, %s, %s", other_Name, postname, address);
        sc.close();
    }

}
