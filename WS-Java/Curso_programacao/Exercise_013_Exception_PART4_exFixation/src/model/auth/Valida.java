package model.auth;

import java.sql.SQLData;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Scanner;

public class Valida {
    public static boolean cpf(String cpf, Scanner SCANNER){
        while (true) {
            System.out.println("Por favor insira corretamente o cpf!");
            cpf = SCANNER.next();


            ArrayList<Integer> cpf_lista = new ArrayList<Integer>();
            for (int x = 0; x < 18; x++) {
                String primeiros_numeros = cpf.substring(0, 3);
                String primeiro_ponto = cpf.substring(3, 4);
                String segundos_numeors = cpf.substring(4, 7);
                String segundo_ponto = cpf.substring(7, 8);
                String terceitos_numeros = cpf.substring(8, 11);
                String barra = cpf.substring(11, 12);
                String ultimos_dois_numeros = cpf.substring(11, 12);

                String valor = cpf.substring(x, x + 1);
                Integer valor_em_inteiro;

                if (valor.isEmpty()) {
                    System.out.println("Espaço em branco inválido!");
                    break;
                }
                if (x != 3 || x != 7 || x != 11 && valor.equals(".") || valor.equals("-")) {
                    System.out.println("Por favor digite o cpf corretamente...");
                    break;
                } else if (x == 11 && !valor.equals("-")){
                    System.out.println("Digite corretamente o cpf.");
                    break;

                }
                else if (!valor.equals(".")){
                    System.out.println("Digite corretamente a pontuação.");
                    break;
                }
                valor_em_inteiro = Integer.getInteger(valor);
                cpf_lista.add(valor_em_inteiro);
            }
            if (cpf_lista.size() == 11){break;}
        }
    }
}