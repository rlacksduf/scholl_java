public class Ex04 {
    public static void main(String[] args){
        int arr[] = {10,20,30};
        int brr[] = {40,50,60};
        int crr[] = brr;

        System.out.println(arr==brr);
        System.out.println(crr==brr);


        String a = new String("안녕하세요");
        String b = new String("안녕하세요");
        String c = a;
        System.out.println(a==b); //주소값이 같은지
        System.out.println(a==c);

        System.out.println(a.equals(b)); //내용이 같은지
        System.out.println(a.equals(c));

    }
}
