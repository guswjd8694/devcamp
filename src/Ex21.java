class Outer {
    static class Inner {
        int iv = 100;
    }
}


public class Ex21 {
    public static void main(String[] args) {
        Outer outer = new Outer();

        System.out.println(outer);
    }
}