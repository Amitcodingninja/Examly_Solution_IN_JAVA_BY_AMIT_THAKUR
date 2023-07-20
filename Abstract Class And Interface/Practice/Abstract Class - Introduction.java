// You are using Java

import java.util.*;
import java.text.DecimalFormat;

abstract class Shape {
    public abstract Double calculatePerimeter();
}

class Circle extends Shape {
    private float radius;

    @Override
    public Double calculatePerimeter() {
        return 3.14 * 2 * radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

}

class Rectangle extends Shape {
    private float length;
    private float breadth;

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getBreadth() {
        return breadth;
    }

    public void setBreadth(float breadth) {
        this.breadth = breadth;
    }

    @Override
    public Double calculatePerimeter() {
        return (double) (2 * (length + breadth));
    }
}

class Square extends Shape {
    private float side;

    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        this.side = side;
    }

    @Override
    public Double calculatePerimeter() {
        return (double) (4 * side);
    }

}

class Main {
    public static void main(String[] args) {
        int choice, n;
        double perimeter;
        Scanner sc = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("0.00");
        choice = sc.nextInt();
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        Square s = new Square();
        if (choice == 1) {
            c.setRadius(sc.nextFloat());
            perimeter = c.calculatePerimeter();
            System.out.println(d.format(perimeter));
        }
        if (choice == 2) {
            r.setLength(sc.nextFloat());
            r.setBreadth(sc.nextFloat());
            perimeter = r.calculatePerimeter();
            System.out.println(d.format(perimeter));
        }
        if (choice == 3) {
            s.setSide(sc.nextFloat());
            perimeter = s.calculatePerimeter();
            System.out.println(d.format(perimeter));
        }
    }
}
