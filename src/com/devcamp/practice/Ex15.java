package com.devcamp.practice;

abstract class Unit {
    abstract void move(int x, int y);
    void stop(){
        System.out.println("현재 위치에 정지");
    }
    abstract void act();
}

class Marine extends Unit {
    void move(int x, int y) {
        System.out.println("Marine이 x=" + x + ", y=" + y + " 위치로 이동");
    }
    void stimPack(){ System.out.println("스팀팩을 사용한다."); }

    void act (){
        stimPack();
    }
}

class Tank extends Unit {
    void move(int x, int y) {
        System.out.println("Tank가 x=" + x + ", y=" + y + " 위치로 이동");
    }

    void changeMode() {
        System.out.println("공격모드를 변환한다");
    }
    void act () {
        changeMode();
    }
}

class Dropship extends Unit {
    void move(int x, int y) {
        System.out.println("Dropship이 x=" + x + ", y=" + y + " 위치로 이동");
    }
    void load(){ System.out.println("선택된 대상을 태운다."); }
    void unload(){ System.out.println("선택된 대상을 내린다."); }

    void act () {
        load();
        unload();
    }
}

public class Ex15 {
    public static void main(String[] args) {
        Unit[] unitArr = {new Marine(), new Tank(), new Dropship()};

        for (Unit unit : unitArr) {
            unit.move(2, 2);
            unit.stop();
            unit.act();
        }
    }
}
