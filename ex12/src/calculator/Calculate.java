package calculator;

public class Calculate {
    //void 할떄 리턴 생략 가능 기본생성자도 생략 가능 뭔가 시험 나올거같음
    public  void add1(int num1,int num2){
        System.out.println(num1+num2);
        num1 = 20;
        num2 = 30;
        System.out.println("add1 = "  +num1);
        System.out.println("add2 = " + num2);

        int sum = num1+ num2;
        System.out.println("sum: "+sum);
    }
    public  String  add2(int num1, int num2){
        return num1+num2+"";
    }
}
