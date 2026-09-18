import entity.Car;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        Student s1 = new Student();
//        s1.name = "박길동";


        Car c = new Car();

        Scanner sc = new Scanner(System.in);
        Car car[] = new Car[10];
        for(int i = 0; i<car.length; i++){
            car[i] = new Car();

            System.out.print("모델 입력: ");
            String model = sc.nextLine();
            car[i].setModel(model);

            System.out.print("색상 입력: ");
            String color = sc.nextLine();
            car[i].setColor(color);

            System.out.print("최속 입력: ");
            int maxSpeed = sc.nextInt();
            car[i].setMaxSpeed(maxSpeed);

            sc.nextLine();
        }

        for(int i = 0; i<car.length; i++){
            System.out.println("모델: "+car[i].getModel());
            System.out.println("색상: "+car[i].getColor());
            System.out.println("최고속도: "+car[i].getMaxSpeed());
        }

        System.out.println("____________________");

        int red = 0;
        for(int i = 0; i<car.length; i++){
            if(car[i].getColor().equals("red")){
                red++;
            }
        }
        System.out.println("빨간 차: "+ red + "대" );

        System.out.println("____________________");

        int totalSpeed = 0;

        for (int i=0; i<car.length; i++){
            totalSpeed += car[i].getMaxSpeed();
        }
        int avgSpeed = totalSpeed / car.length;
        System.out.println("평균 속도: "+avgSpeed);

        System.out.println("____________________");



        //1차 수행평가 3번째 ..
        //배열 크기  10개 선언해
        //1차 등록
        //2 차 보기
        //3 차 색상 빨간거의 개수
        //등록된 자동차의 평균 속도
        //5 종료
    }
}

