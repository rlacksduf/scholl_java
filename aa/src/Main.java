//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
class A{}
class B{}

public class Main {
    public static void main(String[] args) {

        A a = new A();
        B b = new B();
        String name1 ="전예성";
        String name2 = "전예성";
        String name3 = new String("전예성");

        System.out.println(name1 == name2 );
        System.out.println(name1 == name3);
        System.out.println(name2 == name3);
    }
}