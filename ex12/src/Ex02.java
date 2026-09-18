public class Ex02 {

    public static void main(String[] args) {
        AA aa = new AA();
        AATest test = new AATest();
        test.doA(aa);
        System.out.println("main aa.num="+aa.num);
    }
}
