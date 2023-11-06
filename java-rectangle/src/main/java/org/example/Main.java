package org.example;

public class Main {
    public static void main(String[] args) {
        Rectangle objRectangle1 = new Rectangle();
        Rectangle objRectangle2 = new Rectangle(5,4);
        Rectangle objRectangle3 = new Rectangle(10,6);

        System.out.println("Rectangle 1 => Area : " + objRectangle1.getArea() + " Perimeter : " + objRectangle1.getPerimeter());
        System.out.println("Rectangle 2 => Area : " + objRectangle2.getArea() + " Perimeter : " + objRectangle2.getPerimeter());
        System.out.println("Rectangle 3 => Area : " + objRectangle3.getArea() + " Perimeter : " + objRectangle3.getPerimeter());
    }
}