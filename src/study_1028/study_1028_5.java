package study_1028;

import java.util.Scanner;

public class study_1028_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        System.out.println("정수 입력 (0 입력 시 종료) : ");
        int number = sc.nextInt();

        while (number != 0) {
            sum += number;
            System.out.println("누적결과 : " + sum);

            number = sc.nextInt();
        }

        System.out.println("프로그램 종료");
    }
}
