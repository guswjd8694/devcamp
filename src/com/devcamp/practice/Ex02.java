package com.devcamp.practice;

public class Ex02 {
    public static void main(String[] args) {
        SutdaCard card1 = new SutdaCard(3, false);
        SutdaCard card2 = new SutdaCard();

        System.out.println(card1.info());
        System.out.println(card2.info());

    }
}

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard(int a, boolean b){
        num = a;
        isKwang = b;
    }

    SutdaCard(){
        num = 1;
        isKwang = true;
    }


    String info(){
        return num + (isKwang == true ? "K" : "");
    }
}
