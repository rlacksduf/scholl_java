import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("출력할 줄의 수를 입력하세요: ");
        int n = scanner.nextInt();

        // 바깥쪽 반복문: 입력받은 수부터 1까지 감소
        for (int i = n; i >= 1; i--) {
            // 안쪽 반복문: 현재 i값만큼 별 출력
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // 줄 바꿈
            System.out.println();
        }

        scanner.close();
    }
}
