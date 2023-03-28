package ex04;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String nome;

        nome = sc.next();//vai scannear a string
        System.out.println("Você digitou " + nome);

        int num;
        num = sc.nextInt();//vai scannear um número inteiro
        System.out.printf("Você digitou %d", num);

        double myNum;
        myNum = sc.nextDouble();//vai scannear seu número com ponto flutuante
        System.out.printf("Você digitou o número %.2f", myNum);

        char myChar;
        myChar = sc.next().charAt(0);
        System.out.printf("Você digitou o caracter %s", myChar);

        sc.close();
    }

}
