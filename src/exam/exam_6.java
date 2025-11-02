package exam;

import java.util.Random;
import java.util.Scanner;

public class exam_6 {

    public static void main (String[] args) {

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자 맞추기 게임! 1~99까지 수를 입력");


        int a = rand.nextInt(99) + 1;



        while (true) {

            System.out.println("숫자를 입력하세요 >>");
            int answer = sc.nextInt();

            if (a < answer) {
                System.out.println("다운!");
            } else if (a > answer) {
                System.out.println("업!");
            } else {
                System.out.println("정답입니다!");
                break;
            }



        }
    }

}
