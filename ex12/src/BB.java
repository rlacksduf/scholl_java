import java.util.Arrays;

public class BB {

    public void doAA(int num){
        int sum = 0;

        for(int i = 1; i<num+1; i++){
            sum+=i;
        }
        System.out.println(sum);
    }


    public void doA(int num){
        num = 0;
        System.out.println(num);
    }
    //참조 값 (주소값) 복사 메서드
    public void doB(int[] arr){
        arr[0] = 999;
        System.out.println(Arrays.toString(arr));
    }
}
