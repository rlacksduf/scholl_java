/*
    배열을 for 구문
    {1,2,3,4,5}
    {10,20,30,40,50}
    {100,200,300,400,500}
    각 배열안에 있는값 2로나누었을때 값
    {0,1,1,2,3}
    {5,10,15,20,25}
    {50,100,150,200,250}
 */

import java.util.Arrays;

public class Ex05 {
    public static void main(String[] args) {

        int[][] arr = new int[3][5];
        int result = 1;

        for(int i = 0; i < 3; i++){

            for(int j = 0; j < 5; j++) {
                arr[i][j] =  result * (j + 1);
            }
             result *= 10;
        }

        for(int i = 0; i < 3; i++){
            System.out.println(Arrays.toString(arr[i]));
        }

        for(int i = 0; i<3; i++){
            for(int j = 0; j<5; j++){
                arr[i][j] = arr[i][j] / 2;
            }
        }

        for(int i = 0; i < 3; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}