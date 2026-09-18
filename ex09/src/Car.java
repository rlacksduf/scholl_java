public class Car {
    int speed;

    //기번생상자는 생략 가능
    Car(){
        System.out.println("기본생성자");
    }
    void setSpeed(int speed){
        this.speed = speed;
    }
    void doPrintSpeed(){
        System.out.println("speed =" + speed);
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                '}';
    }

    String model;
    String color;

    public void display(){
        System.out.println("Model: "+this.model);
        System.out.println("Color: "+this.color);
    }
}
