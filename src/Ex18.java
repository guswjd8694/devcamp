public class Ex18 {
    public static void main(String[] args) {
        Buyer2 b = new Buyer2();
        b.buy(new Tv2());
        b.buy(new Computer2());
        b.buy(new Tv2());
        b.buy(new Audio2());
        b.buy(new Computer2());
        b.buy(new Computer2());
        b.buy(new Computer2());

        b.summary();
    }
}

class Buyer2 {
    int money = 1000;
    Product2[] cart = new Product2[3];

    int i = 0;

    void buy(Product2 p){
        if (money < p.price) {
            System.out.println("잔액이 부족하여 " + p.toString() + "를 살 수 없습니다.");
            return;
        }
        else {
            money -= p.price;
            add(p);
        }
    }

    void add(Product2 p){
        if ( i >= cart.length) {
            Product2[] newCart = new Product2[cart.length * 2];

            for(int i = 0; i < cart.length; i ++){
                newCart[i] = cart[i];
            }
            cart = newCart;
        }

        cart[i] = p;
        i++;
    }

    void summary(){
        int sum = 0;
        System.out.print("구입한 물건 : ");
        for (Product2 product : cart) {
            System.out.print(product + ", ");
            sum += product.price;
        }

        System.out.println();
        System.out.println("사용한 금액: " + sum);
        System.out.println("남은 금액: " + money);
    }
}

class Product2 {
    int price;

    Product2(int price){
        this.price = price;
    }
}

class Tv2 extends Product2 {
    Tv2(){
        super(100);
    }

    public String toString() {
        return "Tv";
    }
}

class Computer2 extends Product2 {
    Computer2() {
        super(200);
    }
    public String toString() {
        return "Computer";
    }
}



class Audio2 extends Product2 {
    Audio2() {
        super(50);
    }
    public String toString() {
        return "Audio";
    }
}
