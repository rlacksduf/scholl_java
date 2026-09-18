import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] score = new int[5];
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            score[i] = sc.nextInt();
            sum += score[i];
        }

        double avg = (double) sum / 5;

        System.out.println("총합: " + sum);
        System.out.println("평균: " + avg);
    }
}