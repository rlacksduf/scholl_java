//배열 배열의 크기 입력받아 할당후 크기만큼 점수 입력받고 출력 시험!!


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("배열의 크기 입력");
        int num = Integer.parseInt(sc.nextLine());

        int[] arr = new int[num];
        System.out.println("arr.length = " + arr.length);

        // 1. 점수 입력받기
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1) + "번째 점수 입력하세요");
            arr[i] = Integer.parseInt(sc.nextLine());
        }

        // 2. 입력받은 점수 출력하기 (시험 요구사항 반영)
        System.out.println("\n--- 입력된 점수 출력 ---");
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1) + "번째 점수: " + arr[i]);
        }
    }
}