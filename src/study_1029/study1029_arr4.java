package study_1029;

public class study1029_arr4 {
    public static void main(String[] args) {

        int[][] intarr = new int[5][5];
        int num = 1;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                intarr[i][j] = num;
                num++;
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%2d ", intarr[i][j]);
            }
            System.out.println();
        }
    }
}
