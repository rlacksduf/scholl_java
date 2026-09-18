import calculator.Calculate;


import java.util.Scanner;


public class Ex01 {
    public static void main(String[] args){
        System.out.println("main");

        int a = 10;

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자입력?");
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.println("숫자입력?");
        int num2 = Integer.parseInt(sc.nextLine());

        Calculate c = new Calculate();
        c.add1(num1,num2);

        System.out.println("Ex01 main" +num1);
        System.out.println("Ex01 main" +num2);
//        System.out.println(c.add2(num1,num2));
//        String result =c.add2(num1,num2);
//        System.out.println(result);
    }
}
