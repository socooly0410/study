package exam;

import java.util.Scanner;

public class exam_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        int result = 0;
        int A = -1;
        int B = -1;

        while (!(A == 0 && B == 0)) {

            System.out.println("A를 입력하세요");
            A = sc.nextInt();
            System.out.printf("A는 : " + A);

            System.out.println("\nB를 입력하세요");
            B = sc.nextInt();
            System.out.printf("B는 : " + B);



            if (A == 0 && B == 0) {
                break;
            }

            result = A - B;
            System.out.println("결과 >> " + result);


        }



    }
}
