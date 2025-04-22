package ch07.oop;


class Parent {
    protected void show(){
        System.out.println("protected 메서드");
    }
}

class Child extends Parent {
    void display(){
        show();
    }
}

public class Ex01_protected {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}
