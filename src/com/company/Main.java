package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the radius of the circle: ");

        Circle circle = new Circle();
        Circle.setRadius(scanner.nextFloat());



        System.out.println("The circumference of the circle is " + Circle.getCircumference());

        System.out.println("The circle area is " + Circle.getArea());




    }
}
//Write a Circle class, that takes in the radius as a field
// Create 2 constructors, one with the field as a parameter, and one without.
//write methods find the circumference and area of the circle
//radius should be inserted by user