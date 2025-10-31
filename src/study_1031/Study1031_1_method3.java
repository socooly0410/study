package study_1031;

public class Study1031_1_method3 {
    public static void main(String[] args) {


        int base = 2;
        int n = 3;
        int result = powerN(2, 3);

        System.out.println("결과 확인 : " + result);



    }

    public static int powerN(int base, int n) {

        int mult = 1;
        for (int i = 1; i <= n; i++) {


            mult = base * mult;


        }
        return mult;
    }

}
