import java.util.Scanner;

public class Ex01 {
    void main() {
        //숫자를 문자로 바꾸는거
        //문자를 숫자로 바꾸는거

        System.out.println("숫자를 입력하세요");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("a = "+a);


        //둘이 똑같음!  "" 빈문자열을 넣어서 문자열
//        String b = a+"";
        String b = String.valueOf(a);
        int c = Integer.parseInt(b);
        System.out.println("c = "+c);
        try {
            System.out.println(Integer.parseInt("1a"));
            System.out.println("실행");
        }catch(Exception e){
            System.out.println(e);
        }


    }
}
