package study_1028;
import java.util.Scanner;

public class study1028_2 {
    public static void main(String[] args) {


        System.out.println("총금액 입력 : ");
        //crtl shift o 누르면 임포트
        Scanner sc = new Scanner(System.in);

        int fee = sc.nextInt();



        System.out.println("잔돈 : " + fee);

        System.out.println("10000원 : " + fee/10000);
        fee = fee % 10000;

        System.out.println("5000원 : " + fee/5000);
        fee = fee % 5000;

        System.out.println("1000원 : " + fee/1000);
        fee = fee % 1000;

        System.out.println("500원 : " + fee/500);
        fee = fee % 500;

        System.out.println("100원 : " + fee/100);
        fee = fee % 100;

        System.out.println("남은 금액 : " + fee);

    }
}
