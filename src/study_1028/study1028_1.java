package study_1028;
import java.util.Scanner;

public class study1028_1 {
    public static void main(String[] args) {


        System.out.println("이름, 도시, 나이, 취미 여부를 빈칸으로 분리해서 입력하세요>>");
        //crtl shift o 누르면 임포트
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        String city = sc.next();
        String age = sc.next();
        String hobby = sc.next();

        System.out.println(" 이름: " + name + " 도시: " + city + " 나이: " + age + " 취미: " + hobby);

    }
}
