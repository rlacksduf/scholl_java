import java.util.Arrays;

public class Ex03 {
    public static void main(String[] args) {
        int a = 10;
        int arr[] = {10,20,30};

        int b = a;
        int brr[] = arr;

        a= 50;
        arr[0] = 50;

        System.out.println("a = "+a);
        System.out.println("b = "+b);

        System.out.println("arr = "+Arrays.toString(arr));
        System.out.println("brr= "+Arrays.toString(brr));
        System.out.println("arr= "+arr);
        System.out.println("brr= "+brr);
    }
}
