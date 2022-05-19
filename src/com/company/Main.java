package com.company;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.PI = 3.14159265359;
        circle.radius = 5;

        circle.area();
        circle.circumference();
        System.out.println("PI equals: "+Circle.PI);
    }
}
