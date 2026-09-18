import java.util.Arrays;

public class Ex03 {
    public static void main(String[] args) {

        int[][] arr = new int[5][5];

        for (int j = 0; j < 5; j++) {

            int value = 5 - j; // 5, 4, 3, 2, 1
            int add = 5 - j;   // 증가량

            for (int i = 0; i < 5; i++) {
                arr[j][i] = value;
                value += add;
            }
        }

        for (int j = 0; j < 5; j++) {
            System.out.println(Arrays.toString(arr[j]));
        }
    }
}