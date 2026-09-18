//2차원 배열 수행

class Student {
    String name;
    String gender;
    int kor;
    int eng;
}

public class Ex02 {
    public static void main(String[] args){
        Student [] stud = new Student[3];
//        System.out.println(stud[0]);
//        stud[0].name = "홍길돌";
        stud[0] = new Student();
        stud[1] = new Student();
        stud[2] = new Student();
        System.out.println(stud[0]);
        stud[0].name="홍길동";
        stud[1].name = "김길동";
        System.out.println(stud[0].name);
        System.out.println(stud[1].name);
        System.out.println(stud[2].name);
        //학생관리 이름 a,b,c, 성별 남자,여자 남자
        //국어 점수 90 80 70
        //영어 점수 60 90 80

//        String names[] = {"AA","BB","CC","BB"};
//        String genders[] = {"남자","여자","남자"};
//        int kor[] = {90,80,70};
//        int eng[] = {60,90,80};

//        kor[1] = 60;
    }
}
