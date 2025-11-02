package exam;

public class exam_3 {

    public static void main(String[] args) {

        int arr[]= new int[100];
        int sum = 0;

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = i + 1;

            if ((i % 2) == 1 ) {
                arr[i] = arr[i] * -1;
            }



            sum += arr[i];
        }

        System.out.println(sum);
    }
}
