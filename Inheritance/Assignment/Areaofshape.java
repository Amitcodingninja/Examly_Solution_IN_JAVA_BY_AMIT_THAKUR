// You are using Java

import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

class Shape {
    protected double area;

    public void computeArea() {
        area = 0;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}

class Circle extends Shape {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void computeArea() {
        DecimalFormat d = new DecimalFormat("0.00");
        this.area = 3.14 * (radius * radius);
        System.out.println(d.format(this.area));
    }
}

class Rectangle extends Shape {
    private double length;
    private double breadth;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public void computeArea() {
        DecimalFormat d = new DecimalFormat("0.00");
        this.area = length * breadth;
        System.out.println(d.format(this.area));
    }
}

class Triangle extends Shape {
    private double base;

    private double height;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void computeArea() {
        DecimalFormat d = new DecimalFormat("0.00");
        this.area = 0.5 * base * height;
        System.out.println(d.format(this.area));
    }
}

class Main {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();
        if (n == 1) {
            c.setRadius(sc.nextDouble());
            c.computeArea();
        }
        if (n == 2) {
            r.setLength(sc.nextDouble());
            r.setBreadth(sc.nextDouble());
            r.computeArea();
        }
        if (n == 3) {
            t.setBase(sc.nextDouble());
            t.setHeight(sc.nextDouble());
            t.computeArea();
        }
        if (n > 3) {
            System.out.println("Invalid Input");

        }
    }
}
