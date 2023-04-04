package ex05_switch_case;

import java.util.Locale;
import java.util.Scanner;
/*
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        String dia_da_Semana;

        if (x == 1){
            dia_da_Semana = "domingo";
        } else if (x == 2){
            dia_da_Semana = "segunda";
        } else if (x == 3){
            dia_da_Semana = "terça";
        } else if (x == 4){
            dia_da_Semana = "quarta";
        } else if (x == 5){
            dia_da_Semana = "quinta";
        } else if (x == 6){
            dia_da_Semana = "sexta";
        } else if (x == 7){
            dia_da_Semana = "sábado";
        } else {
            dia_da_Semana = "inválido";
        }
    }
}

 */
public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String diaDaSemana;
        int num = sc.nextInt();

        diaDaSemana = switch (num) {
            case 1 -> "Domingo";
            case 2 -> "Segunda";
            case 3 -> "Terça";
            case 4 -> "Quarta";
            case 5 -> "Quinta";
            case 6 -> "Sexta";
            case 7 -> "Sábado";
            default -> "Valor inválido";
        };

        System.out.printf("O dia da semana é %s", diaDaSemana);
    }
}