package test;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("JAVA 점수 입력: ");
		int num1 = sc.nextInt();

		System.out.print("Web 점수 입력: ");
		int num2 = sc.nextInt();

		System.out.print("Android 점수 입력: ");
		int num3 = sc.nextInt();

		int sum = num1 + num2 + num3;
		double avg = sum / 3.0;

		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
	}
}
