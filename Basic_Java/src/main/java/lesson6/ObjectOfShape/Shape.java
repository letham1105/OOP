package lesson6.ObjectOfShape;

import java.util.Arrays;

public abstract class Shape implements Comparable<Shape> {
    abstract double area();

    public int compareTo(Shape other) {
        return Double.compare(this.area(), other.area());
    }

    public String toString() {
        return " area= " + area();
    }
}

class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    public String toString() {
        return " Circle: " + super.toString();
    }
}

class Rectangle extends Shape {
    double width, height;

    Rectangle(double widthVal, double heightVal) {
        width = widthVal;
        height = heightVal;
    }

    double area() {
        return width * height;
    }

    public String toString() {
        return " Rectangle: " + super.toString();
    }
}

class EquilateralTriangle extends Shape {
    double length;

    EquilateralTriangle(double length) {
        this.length = length;
    }

    double area() {
        return 0.5 * length * Math.sin((2 * 60 * Math.PI / 360));
    }

    public String toString() {
        return " EquilateralTriangle: " + super.toString();
    }
}

