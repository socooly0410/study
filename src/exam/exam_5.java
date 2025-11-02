package exam;
import java.util.Random;
import java.util.Scanner;

public class exam_5 {
    public  static void main (String[] args) {

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);


        int opportunity = 0;

        while (opportunity < 5) {

            int a = rand.nextInt(11);
            int b = rand.nextInt(11);


            System.out.println(a + "\t + \t " + b + "\t = ");

            int answer = sc.nextInt();


            if (answer == (a+b)) {
                System.out.println("Success");

            }else {
                System.out.println("Fail!!");
                opportunity ++;
            }

        }


        System.out.println("가메 오벨!");


    }
}
