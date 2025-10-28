package study_1028;
import java.util.Scanner;

public class study1028_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("점수 입력 : ");
        int score = sc.nextInt();

        if (score > 100 || score < 0)
            System.out.println("점수가 아닙니다.");
         else if (score >= 90)
            System.out.println("학점은 A 입니다.");
         else if (score >= 80)
            System.out.println("학점은 B 입니다.");
         else if (score >= 70)
            System.out.println("학점은 C 입니다.");
         else if (score >= 60)
            System.out.println("학점은 D 입니다.");
         else
            System.out.println("학점은 F 입니다.");



    }
}
