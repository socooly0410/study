package exam;

import java.util.Scanner;

public class exam_9 {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[][] = new int[n][n];
        int x = 1;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                arr[j][i] = x++;


            }

        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%2d ", arr[i][j]);
            }
            System.out.println();
        }

    }


}
