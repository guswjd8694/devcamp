package ch06;

public class Ex02_Student {
    public static void main(String[] args) {
        StudentBasicConstructor s = new StudentBasicConstructor();
        s.name = "김현정";
        s.ban = 1;
        s.no = 1;
        s.kor = 100;
        s.eng = 60;
        s.math = 76;


        System.out.println("이름: " + s.name);
        System.out.println("총점: " + s.getTotal());
        System.out.println("평균: " + s.getAverage());
    }
}

class StudentBasicConstructor {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    int getTotal(){
        int sum;
        sum = kor + eng + math;

        return sum;
    }

    double getAverage(){
        return (double) getTotal() / 3;
    }
}

