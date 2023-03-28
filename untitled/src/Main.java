import java.util.stream.StreamSupport;
import java.util.Locale;

public class Main {
    public static void main(String[] args)
    {
        int x = 64;
        double n = 48392.1233133;
        String nome = "Lucas Motta";
        int idade = 18;
        double peso = 89.5;

        System.out.print("Hello world");//Sem quebra de linha
        System.out.println("Hello world!");//Com quebra de linha
        System.out.println(x);
        System.out.printf("%.2f%n", n);//"%.2f" Serve para formatar as casas decimais
                                       //"%n" Serve para quebrar a linha
        Locale.setDefault(Locale.US);  // Definir a localização como americana, para imprimir com ponto e não virgula
        System.out.printf("%.2f%n", n);// Imprimiu com ponto

        System.out.printf("Meu nome é %s, eu tenho %d anos e tenho %.2f quilos", nome, idade, peso);
                                                  // O "%s" é para formatar uma variável
                                                  // "%f" == Float/Double
                                                  // "%d" == Inteiros
                                                  // "%s" == String
    }

}