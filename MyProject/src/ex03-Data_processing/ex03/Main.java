package ex03;

public class Main {
    public static void main(String[] args){

        int x = 10;
        double area, comprimentoX, comprimentoY, altura;
        comprimentoY = 9.0;
        comprimentoX = 8.0;
        altura = 5.0;

        area = (comprimentoX + comprimentoY) / 2.0 * altura;

        System.out.println(area);

        //outra operação

        int numero1 = 5;
        int numero2 = 2;
        double resultado = 0;

        resultado = (double) numero1 / numero2; //casting ou transformação de tipo

        System.out.println(resultado);

    }
}
