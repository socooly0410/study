package study_1031;

public class Study1031_1_method {

    public static void main(String[] args) {


        //호출
        System.out.println(abc());

        System.out.println(add(1, 3));

    }

    //정의
    public static String abc() {

        System.out.println("나는 abc 메서드 입니다.");
        return "저는 리턴한 데이터에요";

    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }



}
