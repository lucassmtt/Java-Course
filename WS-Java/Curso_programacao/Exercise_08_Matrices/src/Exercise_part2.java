import java.util.Scanner;
import java.util.Locale;
public class Exercise_part2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Send the number to rows: ");
        int row = input.nextInt();

        System.out.print("Send the number to collums: ");
        int collums = input.nextInt();

        Integer[][] mat = new Integer[row][collums];
        for (int r = 0; r < row; r++){
            System.out.println("Send the values of row " + r + ": ");
            for (int c = 0; c < collums; c++){
                mat[r][c] = input.nextInt();
            }
        }
        System.out.print("Send a number to be analyzed: ");
        int analyzed_number = input.nextInt();

        for (int r = 0; r < row; r++){
            for (int c = 0; c < collums; c++){
                System.out.print(mat[r][c] + " ");
            }
            System.out.println();
        }


        for (int r = 0; r < row; r++){
            for (int c = 0; c < collums; c++){
                if (mat[r][c] == analyzed_number){
                    System.out.println("Position: " + r + "," + c + ": ");
                    if (c > 0){
                        System.out.println("Left: " + mat[r][c-1]);
                    }

                    if (c > mat[r].length-1){
                        System.out.println("Right: " + mat[r][c+1]);
                    }

                    if (r > 0){
                        System.out.println("Up: " + mat[r-1][c]);
                    }

                    if (r < mat.length-1){
                        System.out.println("Down: "+ mat[(r+1)][c]);
                    }
                }
            }
        }
    }
}
