package Study1103;
import java.util.ArrayList;
import java.util.Scanner;



public class ArrayList_Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> fruits = new ArrayList<String>();

        fruits.add("사과");
        fruits.add("오렌지");
        fruits.add("딸기");
        fruits.add("바나나");
        fruits.add("키위");

        //foreach 자동으로 끝까지 반복
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        //특정 인덱스 추출
        System.out.println(fruits.get(2));



    }

}
