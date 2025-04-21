package ch05;

import java.util.Arrays;

public class Ex01_ArrayComparison {
    public static void main(String[] args) {
        System.out.println("Q1. 1 ~ 9의 숫자 세자리로 이루어진 2개의 배열을 비교해서 결과를 출력하시오.");

        int[] arr11 = {1, 2, 3};
        int[] arr22 = {1, 3, 2};
        int s = 0;
        int b = 0;

        for(int i = 0; i < arr11.length; i++){

            for(int j = 0; j < arr22.length; j++){
                if (arr11[i] == arr22[j]){
                    if (i == j){
                        s++;
                    }
                    else {
                        b++;
                    }
                }
            }
        }
        System.out.print(s + "S");
        System.out.print(b + "B");
        System.out.println();
        System.out.println();




        System.out.println("Q2. 배열에서 카운팅을 이용하여 중복제거, 정렬한 결과를 출력하시오.");

        int[] arr2 = {3, 4, 6, 1, 2, 5, 1, 2, 3, 2, 5};
        int[] arr2copy = new int [arr2.length];

        for(int j = 0; j < arr2.length - 1; j++){
            for(int i = 0; i < arr2.length - 1 - j; i++){
                if(arr2[i] > arr2[i + 1]){
                    int tmp = arr2[i];
                    arr2[i] = arr2[i + 1];
                    arr2[i + 1] = tmp;
                }
            }
        }

        int count = 1;
        for(int i = 1; i < arr2.length; i ++){
            if(!(arr2[i] == arr2[i-1])){
                arr2copy[count] = arr2[i];
                count++;
            }
        }
        arr2copy[0] = arr2[0];

        int[] removearr = new int[count];

        for(int i = 0; i < count; i ++){
            removearr[i] = arr2copy[i];
        }


        System.out.println("중복제거: " + Arrays.toString(removearr));
        System.out.println("정렬: " + Arrays.toString(arr2));
        System.out.println();


        System.out.println("Q3. ");
    }
}
