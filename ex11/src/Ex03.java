import java.util.Arrays;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args){
        //product 클래스 생성후
        // 필드 name price desc(설명)
        // product 배열 5개 생성 후
        // 0 = [{"띠부실", 2000, "집사TV에서 팜}]
        // 1 = [{"AAA", 3000, "AAA상품임"}]
        // 2 = [{"BBB", 4000, "BBB상품"}]
        // 3 = [{"CCC", 6000, "엄청비싸네"}]
        // 4 = [{"DDD", 10000, "음"}]

        //배열의 내용 출력
        //상품 평균값 구하고
        //상품의 평균값이상의 개수를 구하시오..
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int av = 0;
        int more_av = 0;
        Product [] arr = new Product[5];
        for(int i = 0; i<5; i++){
            System.out.println("가격입력");
            int price = sc.nextInt();
            sc.nextLine();
            System.out.println("상품명 입력");
            String name = sc.nextLine();
            System.out.println("상품 설명 입력");
            String desc = sc.nextLine();
            arr[i] = new Product(name,price,desc);
            total +=price;

        }
        av = total /5;


        for(int i = 0; i<5; i++){
            System.out.println(arr[i]);
            if(arr[i].price >= av){
                more_av++;
            }
        }
        System.out.println(av);
        System.out.println(more_av);


    }
}
