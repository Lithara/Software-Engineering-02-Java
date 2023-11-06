package org.example;

public class Rectangle {
    double length;
    double width;

    public Rectangle(){
        this.length = 5;
        this.width = 2;
    }

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getArea(){
        return length * width;
    }

    public double getPerimeter(){
        return 2*(length+width);
    }
}
