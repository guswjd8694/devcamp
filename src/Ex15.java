import static java.nio.file.Files.move;
class Unit {
    void move(int x, int y) {
        System.out.println("지정된 위치로 이동. x = " + x + ", y = " + y);
    }
    void stop(){
        System.out.println("현재 위치에 정지");
    }
}

class Marine extends Unit {
//    move(1,1);
    void stimPack(){
        System.out.println("스팀팩을 사용한다.");
    }
}

class Tank extends Unit {
    void changeMode(){
        System.out.println("공격모드를 변환한다.");
    }
}

class Dropship extends Unit {
    void load(){
        System.out.println("선택된 대상을 태운다.");
    }
    void unload(){
        System.out.println("선택된 대상을 내린다.");
    }
}

public class Ex15 {
    public static void main(String[] args) {
        Unit unit = new Unit();
        Marine marine = new Marine();
    }
}
