package Study1103;

import java.util.Scanner;

public class Tv_Main {

    public static void main(String[] args) {

        //클래스를 사용해서 객체(인스턴스)를 만들기
        // My라는 클래스를 사용해서 my1 이라는 객체를 생성

        Tv samsungTv = new Tv();


        //tv클래스 사용해서 samsung Tv 만들기 (붕어빵 틀을 사용해서 붕어빵 만들기)
        samsungTv.powerON();
        System.out.println("TV 전원 상태 : " + samsungTv.power);

        samsungTv.powerOFF();
        System.out.println("TV 전원 상태 : " + samsungTv.power);






    }

}
