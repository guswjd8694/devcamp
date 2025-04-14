package com.devcamp.practice;

public class Ex08 {

    public static void main(String[] args) {
        String str = "123";
        System.out.println(str + "는 숫자입니까? " + isNumber(str));

        str = "1234o";
        System.out.println(str + "는 숫자입니까? " + isNumber(str));

        str = "a";
        System.out.println(str + "는 숫자입니까? " + isNumber(str));

        str = "!@#@%^$fabcdzzZA";
        System.out.println(str + "는 숫자입니까? " + isNumber(str));
    }

    static boolean isNumber(String str){
        if (str.isEmpty()) return false;

        for ( int i = 0; i < str.length(); i++){
            if(!(str.charAt(i) >= '0' && str.charAt(i) <= '9')){
                return false;
            }
        }

        return true;
    }
}
