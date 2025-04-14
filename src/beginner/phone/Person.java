package beginner.phone;

public class Person {
    String name;
    String modelName;

    Person(String name){
        this.name = name;
    }

    public void buy(String modelName){
        System.out.println(name + "가 " + modelName + "를 샀습니다.");

        this.modelName = modelName;
    }

    public void brag(){
        System.out.println("나 " + modelName + "폰 샀다!!!");
    }
}


