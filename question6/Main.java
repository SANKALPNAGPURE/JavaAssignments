package com.company.question6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AreaOfTriangle areaOfTriangle = new AreaOfTriangle();
        double Answer = areaOfTriangle.Area(10,30);
        System.out.println("Area of Triangle is "+Answer);

        // user Input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base of Triangle");
        double a = sc.nextDouble();
        System.out.println("Enter height of Triangle");
        double c = sc.nextDouble();
        double Answer2 = areaOfTriangle.Area(a,c);
        System.out.println("Area of Triangle is "+Answer2);
    }
}
