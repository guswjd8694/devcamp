package com.devcamp.practice;

import static java.util.Collections.shuffle;

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard2[] cards = new SutdaCard2[CARD_NUM];

    SutdaDeck(){
        for(int i = 0; i < CARD_NUM; i++){
            int num = (i % 10) + 1;
            boolean isKwang = (i < 10) && (num == 1 || num == 3 || num == 8);

            cards[i] = new SutdaCard2(num, isKwang);
        }
    }

    void shuffle() {
        for(int i = cards.length - 1; i >= 0; i--){
            int randomIdx = (int)(Math.random() * (i + 1));
            SutdaCard2 tmp = cards[i];
            cards[i] = cards[randomIdx];
            cards[randomIdx] = tmp;
        }
    }

    SutdaCard2 pick (int index) {
        return cards[index];
    }

    SutdaCard2 pick () {
        int randomNum = (int)(Math.random() * 10);
        return cards[randomNum];
    }
}

class SutdaCard2 {
    int num;
    boolean isKwang;

    SutdaCard2(){
        this(1, true);
    }

    SutdaCard2(int num, boolean isKwang){
        this.num = num;
        this.isKwang = isKwang;
    }

    // info() 대신 Object 클래스의 toString()을 오버라이딩
    public String toString(){
        return num + (isKwang ? "K" : "");
    }
}

public class Ex11 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for (int i = 0; i < deck.cards.length; i++){
            System.out.print(deck.cards[i] + ", ");
        }
        System.out.println();
        System.out.println(deck.pick(0));
    }
}
