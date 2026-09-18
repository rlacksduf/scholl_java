import java.util.Arrays;

public class Ex03 {
    public static void main(String[] args) {
        BB bb = new BB();
        int num = 999999999;
        System.out.println(num);
        bb.doA(num);
        System.out.println(num);
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        int[] brr=arr;
        brr[0]=8;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(brr));
        System.out.println(Arrays.toString(arr));
        bb.doB(arr);
        System.out.println(Arrays.toString(arr));

    }
}
