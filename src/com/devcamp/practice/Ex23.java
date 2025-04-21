package com.devcamp.practice;
import java.util.ArrayList;
import java.util.List;

public class Ex23 {
    public static void main(String[] args) {
        String input = "자바는너무재미있다하지만가끔은어렵기도하다";
        int chunkSize = 5;

        List<String> list = new ArrayList<>(input.length() / chunkSize);

        for(int i = 0; i < input.length(); i += chunkSize){
            if(i + chunkSize < input.length()){
                list.add(input.substring(i, i + chunkSize));
            }
            else {
                list.add(input.substring(i));
            }
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
