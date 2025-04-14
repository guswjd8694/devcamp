class Outer {
    static class Inner {
        int iv = 200;
    }
}


public class Ex21 {
    public static void main(String[] args) {
        Outer.Inner si = new Outer.Inner();

        System.out.println(si.iv);
    }
}