package exam;

import java.util.Random;

public class exam_7 {

    public static void main (String[] args) {

        int[] arr = new int[8];
        Random rand = new Random();


        arr[0] = rand.nextInt(99) + 1;
        int min = arr[0];
        int max = arr[0];

        System.out.print(arr[0]);


        for (int i = 1; i < arr.length; i++) {

            arr[i] = rand.nextInt(99) + 1;
            System.out.print("\t" + arr[i]);

            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("\n가장 큰 값: " + max);
        System.out.println("가장 작은 값: " + min);
    }
}
