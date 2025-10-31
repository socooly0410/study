package study_1031;

import java.util.Scanner;

public class Study1031_1_method5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("정수 입력 : ");

        String number = sc.nextLine();
        System.out.println(number);

        String[] numbers = number.split("");
        int sum = 0;
        for (int i = 0; i < numbers.length ; i++) {
            System.out.println(numbers[i]);
            sum += Integer.parseInt(numbers[i]);
        }

        System.out.println(sum);
    }

}
