package study_1029;

import java.util.Scanner;

public class study1029_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {

                System.out.println(i + "곱하기" + j + "는" + i*j);
            }
        }
    }
}
