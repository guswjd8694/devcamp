package com.devcamp.practice;


import java.util.*;

class Animal {
    public String toString() {
        return "동물";
    }
}

class Dog extends Animal {
    public String toString() {
        return "강아지";
    }
}

class Cat extends Animal {
    public String toString() {
        return "고양이";
    }
}

public class Ex31 {
    public static void printAnimals(List<? super Dog> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        List<Object> objectList = new ArrayList<>();
        List<Dog> dogList = new ArrayList<>();
        List<Cat> catList = new ArrayList<>();

        animalList.add(new Dog());
        animalList.add(new Cat());
        dogList.add(new Dog());
        objectList.add("문자열도 넣을 수 있음");
        objectList.add(new Dog());

        printAnimals(animalList);  // ①
        printAnimals(objectList);  // ②
//      printAnimals(dogList);     // ③ 컴파일 에러날까?
//      printAnimals(catList);     // ④ 가능할까?
    }
}

