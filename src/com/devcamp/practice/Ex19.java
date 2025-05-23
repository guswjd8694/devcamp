package com.devcamp.practice;

public class Ex19 {
    public static void main(String[] args) {
        Parent p = new Child();
        Child c = new Child();

        System.out.println("p.x = " + p.x);
        p.method();

        System.out.println("c.x = " + c.x);
        c.method();
    }
}

class Parent {
    int x = 100;

    void method(){
        System.out.println("com.devcamp.practice.Parent Method");
    }
}

class Child extends Parent {
    int x = 200;

    void method() {
        System.out.println("com.devcamp.practice.Child Method");
    }
}