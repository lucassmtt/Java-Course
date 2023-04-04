package ex06_Structure_For;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){


        Scanner MyScanner = new Scanner(System.in);

        System.out.println("Por favor, digite um número: ");
        int x = MyScanner.nextInt();
        int soma = 0;

        for (int cont = 1; cont <= x; cont++){
            System.out.println("Digite um número para somar: ");
            int num = MyScanner.nextInt();
            soma += num;
        }

        System.out.printf("A soma de todos os números foi %d.", soma);
        MyScanner.close();
    }

}