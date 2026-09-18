import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("num을 입력하세여");
        int num = sc.nextInt();
        System.out.println("num = " + num);

        // i는 1부터 입력받은 num까지 1씩 증가합니다. (i++)
        for(int i = 1; i <= num; i++){
            // j는 1부터 i까지 반복하며 별을 찍습니다.
            for(int j = 1; j <= i; j++){
                // 옆으로 이어지도록 print로 수정하고 공백을 추가했습니다.
                System.out.print("* ");
            }
            // 한 줄이 끝나면 줄바꿈을 합니다.
            System.out.println();
        }

        sc.close();
    }
}
