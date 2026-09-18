
// 1102 김찬열

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("학생 수 입력");
        int num = Integer.parseInt(sc.nextLine());

        int[] arr = new int[num];

        int sum = 0;
        int high = 0;
        int low = 0;
        int lwo = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1) + "번째 학생 점수 입력: ");
            arr[i] = Integer.parseInt(sc.nextLine());
            sum += arr[i];
            low = arr[i];
            lwo = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > high) {
                high = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > low){
                low = lwo;
            }else{
                low = arr[i];
            }
        }
        System.out.println("[점수 목록]");
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1) + "번째 점수: " + arr[i]);
        }
        System.out.println("총점: "+sum);
        System.out.println("평균: "+(double)sum/arr.length);




        System.out.println("최고점: "+high);
        System.out.println("최저점: "+low);



    }
}