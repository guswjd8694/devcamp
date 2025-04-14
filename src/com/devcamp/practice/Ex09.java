package com.devcamp.practice;

import java.util.Arrays;

public class Ex09 {
    public static void main(String[] args) {
        int[] data = {3, 2, 9, 4, 7, 20, 988,1241,48201,433518};
        System.out.println(Arrays.toString(data));
        System.out.println("최대값: " + max(data));
        System.out.println("최대값: " + max(null));
        System.out.println("최대값: " + max(new int[]{}));
    }

    static int max (int[] arr){

        if(arr == null || arr.length == 0) return -999999;

        int result = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(result < arr[i]){
                result = arr[i];
            }
        }

        return result;
    }
}
