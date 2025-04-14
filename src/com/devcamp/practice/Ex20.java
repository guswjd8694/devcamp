package com.devcamp.practice;

abstract class Shape {
    Point p;

    Shape(){
        this(new Point(0, 0));
    }

    Shape(Point p) {
        this.p = p;
    }


    abstract double clacArea();

    Point getPosition(){
        return p;
    }

    void setPosition(Point p){
        this.p = p;
    }
}

class Circle extends Shape {
    double r;

    public Circle(double r) {
        this.r = r;
    }

    double clacArea() {
        return Math.PI * r * r;
    }
}

class Rectangle extends Shape {
    double width = 0;
    double height = 0;

    public Rectangle(double w, double h) {
        this.width = w;
        this.height = h;
    }

    double clacArea(){
        isSquare(width, height);

        return width * height;
    }

    boolean isSquare(double w, double h){
        return w == h;
    }
}


class Point {
    int x;
    int y;

    Point(){
        this(0, 0);
    }

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "[" + x + "," + y + "]";
    }
}


public class Ex20 {

    static double sumArea(Shape[] arr) {
        double sum = 0;

        for (Shape shape : arr) {
            sum += shape.clacArea();
        }

        return sum;
    }


    public static void main(String[] args) {
        Shape[] arr = {new Circle(5.0), new Rectangle(3, 4), new Circle(1)};
        System.out.println("면접의 합 : " + sumArea(arr));
    }
}

