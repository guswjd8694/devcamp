public class Test {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.width = 8;
        rectangle.height = 8;

        int area = rectangle.calculateArea();
        System.out.println("넓이 " + area);

        int perimeter = rectangle.calculatePerimeter();
        System.out.println("둘레 길이 " + perimeter);

        boolean square = rectangle.isSquare();
        System.out.println("정사각형 여부 " + square);
    }


}

class Rectangle {
    int width = 5;
    int height = 8;

     int calculateArea() {
        return width * height;
    }

     int calculatePerimeter() {
        return 2 * (width + height);
    }

     boolean isSquare() {
        return width == height;
    }
}