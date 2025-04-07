public class Ex04 {
    public static void main(String[] args) {
        Student2 s = new Student2("김현정", 1, 1, 100, 60, 76);

        System.out.println(s.info());
    }
}

class Student2 {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    Student2(String name, int ban, int no, int kor, int eng, int math) {
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

