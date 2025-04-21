package com.devcamp.practice;

class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

public class Ex30 {
    public static void printBoxContents(Box3<?> box) {
        System.out.println("Box contains: " + box.getItem());
    }

    public static void main(String[] args) {
        Box3<String> stringBox = new Box3<>();
        stringBox.setItem("Hello");

        Box3<Integer> intBox = new Box3<>();
        intBox.setItem(123);

        printBoxContents(stringBox);
        printBoxContents(intBox);
    }
}
