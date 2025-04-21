package com.devcamp.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex24 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList(2000000);
        LinkedList ll = new LinkedList();


    }

    public static long add1(List list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) list.add(i + "");
        long end = System.currentTimeMillis();
        return end - start;
    }


    public static long add2(List list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) list.add(500, "X");
        long end = System.currentTimeMillis();
        return end - start;
    }

    public static long remove1(List list) {
        long start = System.currentTimeMillis();
        for (int i = list.size()-1; i >= 0; i--) list.remove(i);
        long end = System.currentTimeMillis();
        return end - start;
    }


    public static long remove2(List list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) list.remove(i);
        long end = System.currentTimeMillis();
        return end - start;
    }
}
