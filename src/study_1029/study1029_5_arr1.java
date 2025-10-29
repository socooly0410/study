package study_1029;

public class study1029_5_arr1 {

    public static void main(String[] args) {



        int[] intArray = new int[] {10, 20, 30, 40, 50};
        int[] myArray = intArray;

        intArray[1] = 2;
        System.out.println("intArray 1번쨰 인덱스 값 : " + intArray[1]);

        myArray[1] = 6;
        System.out.println("intArray 1번쨰 인덱스 값 : " + intArray[1]);
        System.out.println("myArray 1번쨰 인덱스 값 : " + myArray[1]);

        int[] numbers = {666, 777, 888, 999, 333};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }



        /*

        int[] aSrc = {10, 20 , 30, 40, 50};

        int[] aDst01 = new int[aSrc.length];
        for (int i = 0; i < aSrc.length; i++) {
            aDst01[i] = aSrc[i];
        }

        aDst01[2] = 100;

        System.out.print("  aSrc[]: ");
        for(int data : aSrc)
            System.out.print(data + "\t");

        System.out.print("\naDst01[]: ");
        for(int data : aDst01)
            System.out.print(data + "\t");


        int[] aDst02 = aSrc.clone();
        aDst02[3] = 300;
        System.out.print("\n  aSrc[]: ");
        for(int data : aSrc)
            System.out.print(data + "\t");

        System.out.print("\naDst02[]: ");
        for(int data : aDst02)
            System.out.print(data + "\t");
            */

    }

}
