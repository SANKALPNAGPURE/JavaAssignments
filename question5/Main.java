package com.company.question5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AreaOfRectangle areaOfRectangle = new AreaOfRectangle();
        double Answer = areaOfRectangle.Area(13,14);
        System.out.println("Area of Rectangle is "+Answer);

        // user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Rectangle");
        double a = sc.nextDouble();
        System.out.println("Enter breadth of rectangle");
        double b = sc.nextDouble();
        double Answer2 = areaOfRectangle.Area(a,b);
        System.out.println("Area of rectangle is "+Answer2);
    }
}
