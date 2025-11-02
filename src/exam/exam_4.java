package exam;

import java.util.Scanner;

public class exam_4 {

    public  static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("단수 입력 : ");
        int mult = sc.nextInt();
        System.out.println(mult);

        System.out.println("어느 수 까지 츨략");
        int x = sc.nextInt();
        System.out.println(x);

        for (int i = 1; i < x + 1; i++) {
            System.out.println(mult + "\t*\t" + i + "\t=" + (mult*i));
        }
    }
}
