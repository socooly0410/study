package exam;

import java.util.Random;
import java.util.Scanner;

public class exam_12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int r = rand.nextInt(3);

        System.out.println("가위 바위 보 게임입니다. " +
                "가위, 바위, 보 중 입력");

            String str = sc.next();
        System.out.println("사용자 >>" + str);

        if (str.equals("총")) {                
            System.out.println("총에 맞아 사망");
            System.exit(0);
        }

        if (!(str.equals("가위") || str.equals("바위") || str.equals("보"))) {
            System.out.println("잘못입력했습니다. 다시실행하세요");
            System.exit(0);
        }

        String com = "";

        if (r == 0) com = "가위";
        else if (r == 1) com = "바위";
        else com = "보";

        System.out.println("컴퓨터 >> " + com);

        if (str.equals(com)) {
            System.out.println("비겼습니다!");
        }
        else if (
                (str.equals("가위") && com.equals("보")) ||
                        (str.equals("바위") && com.equals("가위")) ||
                        (str.equals("보") && com.equals("바위"))
        ) {
            System.out.println("사용자가 이겼습니다~!");
        }
        else {
            System.out.println("컴퓨터가 이겼습니다~!");
        }




    }


}
