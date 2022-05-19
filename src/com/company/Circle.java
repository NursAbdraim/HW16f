package com.company;

public class Circle {
    public static double PI;
    public static int radius;

    public static void area(){
        double areaOfCircle = (PI * (radius * radius));
        System.out.println("The area of a circle is: "+areaOfCircle);
    }


    public static void circumference(){
        double circumferenceOfCircle = (PI * 2 * radius);
        System.out.println("The circumference of a circle is: "+circumferenceOfCircle);
    }
}
