package study_1029;
import java.util.Scanner;

public class study1029_arr3 {

    public static void main(String[] args) {

        String language[] = {"Java", "Web", "Android", "Database"};




        Scanner sc = new Scanner(System.in);

        System.out.print("배열값 : " );

        for (int i = 0; i < language.length; i++) {
            System.out.printf(language[i] + " ");
        }


        System.out.println("\n검색 할 정보를 입력하세여 : ");
        String str = sc.nextLine();

        int index = 0;

        System.out.println("찾는 정보\t" + str);

        for (int i = 0; i < language.length; i++) {
            if (str.equals(language[i])) index = i;
        }


        System.out.println(index + "번쨰 인덱스에 저장되어 있습니다.");



    }
}
