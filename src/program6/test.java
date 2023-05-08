package program6;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side of the square");
        double s= sc.nextDouble();
        shape square = new square(s);
        System.out.println("Area of Square: " + square.area());

        System.out.println("Enter the base and height");
        double b= sc.nextDouble();
        double h= sc.nextDouble();
        shape triangle = new triangle(b,h);
        System.out.println("Area of Triangle: " + triangle.area());

        System.out.println("Enter the radius of the circle");
        double r= sc.nextDouble();
        shape circle = new circle(r);
        System.out.println("Area of Circle: " + circle.area());
    }
}
