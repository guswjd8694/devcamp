package com.devcamp.practice;


class Box3<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem(){
        return item;
    }

}

public class Ex29 {
    public static void main(String[] args) {
        Box3<String> s = new Box3();
        Box3<Integer> i = new Box3();

        s.setItem("ddd");
        System.out.println(s.getItem());
        i.setItem(123);
        System.out.println(i.getItem());

    }


}
