import java.util.Scanner;

public class CC {
    public void DoA(int num){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[num];
        int sum = 0;

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i< arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("총합"+sum);
        System.out.println("최대"+max);
        System.out.println("최소" + min);

    }
}
