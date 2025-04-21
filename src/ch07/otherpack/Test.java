package ch07.otherpack;

import ch07.mypack.Hello;

public class Test {
    public static void main(String[] args) {
        Hello h = new Hello();
//        h.sayHello();
        h.sayPublic();
    }
}
