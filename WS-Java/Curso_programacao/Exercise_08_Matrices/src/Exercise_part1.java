import java.util.Scanner;
import java.util.Locale;

public class Exercise_part1 {
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = input.nextInt();
        int[][] mat = new int[n][n];

        for (int row = 0; row < n; row++){
            System.out.println("Please send the value for row " + row + ": ");
            for (int collum = 0; collum < n; collum++){
                mat[row][collum] = input.nextInt();
            }
        }

//        for (int row = 0; row < n; row++) {
//            for (int collum = 0; collum < n; collum++) {
//                System.out.print(mat[row][collum] + " ");;
//            }
//            System.out.println();
//        }

        int negative_numbers = 0;
        int[] main_diagonal = new int[n];

        for (int row = 0; row < n; row++) {
            for (int collum = 0; collum < n; collum++) {
                if (row == collum){
                    main_diagonal[row] = mat[row][collum];
                }
                int num = mat[row][collum];
                if (num < 0) {
                    negative_numbers += 1;
                }
            }
        }
        System.out.println("Exercise_part1 diagonal: ");
        for (int i = 0; i < main_diagonal.length; i++){
            System.out.print(main_diagonal[i] + " ");
        }
        System.out.println();
        System.out.println("Negative numbers: ");
        System.out.print(negative_numbers);
        input.close();
    }
}