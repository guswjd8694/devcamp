package ch06;

public class Ex03_Student {
    public static void main(String[] args) {
        StudentWithScore s = new StudentWithScore("김현정", 1, 1, 100, 60, 76);

        System.out.println(s.info());
    }
}

class StudentWithScore {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    StudentWithScore(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    String info(){
        return name + ", " + ban + ", " + no + ", " + kor + ", " + eng + ", " + math + ", " + getTotal() + ", " + getAverage();
    }

    int getTotal(){
        int sum;
        sum = kor + eng + math;

        return sum;
    }

    double getAverage(){
        return (double) getTotal() / 3;
    }

}

