import java.util.Scanner;

public class Mang2Chieu {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int[][] x= new int[5][5];
        for (int j=0;j<x.length;j++){
            for (int k=0;k< x[j].length;k++){
                System.out.printf("x[%d][%d]", j, k);
                x[j][k]= scanner.nextInt();
            }
        }
    }
}
