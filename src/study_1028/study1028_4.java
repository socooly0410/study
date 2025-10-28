package study_1028;
import java.util.Scanner;

public class study1028_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("온도를 입력하세요 >>");
        float temperature = sc.nextInt();


        System.out.println("번호를 누르세요 \n (1) 섭씨 C , (2) 화씨 F");
        int sen = sc.nextInt();

        if (sen == 2) System.out.printf("%.0f°F", ((temperature*1.8)+32));
        else if (sen == 1) System.out.printf("%.0f°C", (temperature - 32) / 1.8);
        else System.out.println("잘못된 번호입니다. 1과 2중 하나만 입력하세요");

    }

}
