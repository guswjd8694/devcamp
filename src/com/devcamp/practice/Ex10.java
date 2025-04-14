package com.devcamp.practice;

public class Ex10 {

    public static void main(String[] args) {
        int value = 5;
        System.out.println(value + "의 절대값: " + abs(value));

        value = -10;
        System.out.println(value + "의 절대값: " + abs(value));

        value = -3251;
        System.out.println(value + "의 절대값: " + abs(value));

        value = 210;
        System.out.println(value + "의 절대값: " + abs(value));
    }

     static int abs(int value){
         return Math.abs(value);
    }
}
