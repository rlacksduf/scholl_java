import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args){
        /*
        Scanner를 이용해 무한 반복
         */
        while(true){
            System.out.println("무한루프");
            Scanner sc = new Scanner(System.in);
            String a = sc.nextLine();
            System.out.println("a = "+a);
            if(a.equals("exit")){
                break;
            }
        }
    }
}
