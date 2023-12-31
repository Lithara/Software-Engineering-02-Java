package org.example;

public class Main {
    public static void main(String[] args) {
        Rectangle objRectangle1 = new Rectangle();
        System.out.println("Rectangle 1 : " + Rectangle.count);

        Rectangle objRectangle2 = new Rectangle(5,4);
        System.out.println("Rectangle 2 : " + Rectangle.count);

        Rectangle objRectangle3 = new Rectangle(10,6);
        System.out.println("Rectangle 3 : " + Rectangle.count);

        System.out.println("Rectangle 1 => Area : " + objRectangle1.getArea() + " Perimeter : " + objRectangle1.getPerimeter());
        System.out.println("Rectangle 2 => Area : " + objRectangle2.getArea() + " Perimeter : " + objRectangle2.getPerimeter());
        System.out.println("Rectangle 3 => Area : " + objRectangle3.getArea() + " Perimeter : " + objRectangle3.getPerimeter());

        objRectangle1.length = 15;
        objRectangle1.width = 10;

        System.out.println("Rectangle 1 after changing values => Area : " + objRectangle1.getArea() + " Perimeter : " + objRectangle1.getPerimeter());
    }
}