package exam;

import java.util.Scanner;

public class exam_8 {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + "번쨰 정수 입력 : ");
            int a = sc.nextInt();
            arr[i] = a;
        }

        System.out.println("3의 배수 : ");
        for (int i = 0; i < 10; i++) {
            if (arr[i] % 3 == 0) {
                System.out.print(arr[i] + "\t");
            }
        }

    }


}
