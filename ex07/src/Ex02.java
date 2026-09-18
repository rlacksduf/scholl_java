import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("학생수 입력:");
        int studentNum = Integer.parseInt(input.nextLine());
        int sum = 0;
        for(int i = 0; i<studentNum;i++){
            System.out.println((i + 1)+"번째 학생 점수 입력");
            int score = input.nextInt();
            sum+=score;
        }
        System.out.println("종합점수: "+sum);
        System.out.println("평균점수는:"+ (sum/(double)studentNum));
    }
}