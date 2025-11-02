package exam;

import java.util.Random;

public class exam_10 {

    public static void main (String[] args) {

        int arr[][] = new int[3][4];
        Random rand = new Random();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                arr[i][j] = rand.nextInt(10);

                System.out.printf("%2d ", arr[i][j]);

                sum += arr[i][j];
            }
            System.out.println();

        }

        System.out.println("합은 : " + sum);


    }

}
