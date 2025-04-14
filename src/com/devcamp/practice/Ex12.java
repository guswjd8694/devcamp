package com.devcamp.practice;

class Product {
    int price;  // 제품의 가격
    int bonusPoint; // 제품 구매시 제공하는 보너스 점수

    Product(int price){
        this.price = price;
        bonusPoint = (int) (price / 10.0);  // 보너스점수는 제품가격의 10%
    }
}

class Tv extends Product {
    Tv() {
        // 조상클래스의 생성자 com.devcamp.practice.Product(int price)
        super(100); // Tv의 가격을 100만원으로 한다.
    }

    //Object클래스의 toString을 오버라이딩한다.
    public String toString() {
        return "com.devcamp.practice.Tv";
    }
}

class Computer extends Product {
    Computer() {
        super(200);
    }

    public String toString() {
        return "com.devcamp.practice.Computer";
    }
}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;
    Product[] item = new Product[10];   // 구입한 제품을 저장하기 위한 배열 추가
    int i = 0;  // com.devcamp.practice.Product 배열 item에 사용될 index

    void buy(Product p) {
        if(money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        item[i++] = p;  // 제품을 com.devcamp.practice.Product[] item에 저장한다.
        System.out.println(p + "을/를 구입하셨습니다.");
    }
}


