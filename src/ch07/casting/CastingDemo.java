package ch07.casting;

public class CastingDemo {
    public static void main(String[] args) {
        Car car = new Car();
        Car ferrari = new Ferrari();
        Car casper = new Casper();

        Person hyunjung = new Person();
//      hyunjung.buyCar((Casper)casper);
        hyunjung.buyCar(casper);

        hyunjung.pressBbang();

        hyunjung.buyCar(ferrari);
        hyunjung.pressBbang();

    }
}
