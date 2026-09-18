public class Friends {
    String name;
    int age;

    public Friends(){
        this.name="없음";
        this.age=17;
    }

    public Friends(String name, int age){
        System.out.println("친구 생성");

    }

    @Override
    public String toString() {
        return "Friends{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
