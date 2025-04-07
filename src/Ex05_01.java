public class Ex05_01 {
    public static void main(String[] args) {
        Mypoint p = new Mypoint(1, 1);

        System.out.println(p.getDistance(2, 2));
    }
}

class Mypoint {
    int x;
    int y;

    Mypoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    double getDistance(int x1, int y1){
        double xResult = Math.pow(x - x1, 2);
        double yResult = Math.pow(y - y1, 2);

        double result = Math.sqrt(xResult + yResult);

        return result;
    }
}
