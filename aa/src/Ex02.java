public class Ex02 {
    public static void main(String[] args) {
        // 5x5 정방 2차원 배열 선언
        int[][] arr = new int[5][5];

        // 5번 반복
        for (int i = 0; i < 5; i++) {
            // 행마다 기준이 되는 숫자 (5, 4, 3, 2, 1)
            int base = 5 - i;

            // 1배수부터 5배수까지 총 5개 칸을 채움
            for (int j = 0; j < 5; j++) {
                // (j + 1)을 곱해 1배, 2배, 3배, 4배, 5배 값을 계산
                arr[i][j] = base * (j + 1);
            }
        }
        System.out.println(arr);
        // 결과 출력
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println(); // 줄내림
        }
    }
}
