package com.kodilla.collections.interfaces;

public class InterfacesDemo {
    public static void main(String[] args) {
            Square square = new Square(10.0);
            System.out.println(square.getArea());
            System.out.println(square.getPerimeter());

            Circle circle = new Circle(7.00);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        Triangle triangle = new Triangle(3,4,5 );
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());
        }
    }

