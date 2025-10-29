package study_1029;

import java.util.Random;

public class study1029_arr2 {

    public static void main(String[] args) {

        int[] intArray = new int[10];

/*        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i+1;

            System.out.println(intArray[i]);
*/

        Random rand = new Random();

        System.out.println(rand.nextInt(20));


        int sum = 0;

        int[] randomArray = new int[10];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = rand.nextInt(20);


            sum = sum +  randomArray[i];
            System.out.printf(randomArray[i] + " ");
        }

        System.out.println("합계 :" + sum);


        String a = "장재용";
        String b = "장재용";

        System.out.println(b.equals(a));




    }

}

