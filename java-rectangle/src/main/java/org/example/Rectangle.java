package org.example;

public class Rectangle {
    double length;
    double width;
    static int count = 0;

    public Rectangle(){
        this.length = 5;
        this.width = 2;
        count++;
    }

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
        count++;
    }

    public double getArea(){
        return length * width;
    }

    public double getPerimeter(){
        return 2*(length+width);
    }
}
