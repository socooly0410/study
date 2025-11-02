package exam;

import java.util.Scanner;

public class exam_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("현재 몸무게와 목표 몸무게를 입력하세요 : ");
        int weight = sc.nextInt();
        int goal = sc.nextInt();
        int week = 1;

        System.out.println("현재 몸무게: " + weight);
        System.out.println("목표 몸무게: " + goal);

        while (weight >= goal) {

            System.out.println(week + "주차 감량한 몸무게를 입력하세요 : ");
            int weigth_lose = sc.nextInt();
            System.out.println("주차 감량 몸무게 : " + weigth_lose);
            weight -= weigth_lose;
            System.out.println(week + "주차 몸무게" + weight);
            week++;

        }


        System.out.println("목표 달성! 축하합니다!");
    }
}
