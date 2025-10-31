package MainLauncher;

import study_1031.Study1030_1_method3;  // ← 여기 부분은 네가 실행할 클래스에 맞게 수정 가능
import java.util.Scanner;

public class MainLauncher {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("\n===== 실행할 코드 선택 =====");
            System.out.println("1) Study1030_1_method3 실행");
            System.out.println("0) 종료");
            System.out.print("> 선택 : ");

            int select = sc.nextInt();

            switch(select) {
                case 1:
                    // 이 부분이 실행되는 class 의 run() 이나 main() 호출 부분
                    Study1030_1_method3.main(null);
                    // 또는 Study1030_1_method3.run(); 으로 변경해도 됨 (네가 run() 함수로 구조 바꾸면)
                    break;

                case 0:
                    System.out.println("종료합니다.");
                    return;

                default:
                    System.out.println("잘못된 선택입니다.");
            }
        }
    }
}
