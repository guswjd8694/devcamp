package com.devcamp.practice;

public class Ex05 {
    static double getDistance(int x, int y, int x1, int y1){

        double xResult = Math.pow(x - x1, 2);
        double yResult = Math.pow(y - y1, 2);

        double result = Math.sqrt(yResult + xResult);


        return result;
    }

    public static void main(String[] args) {
        System.out.println(getDistance(1, 1, 2, 2));
    }
}
