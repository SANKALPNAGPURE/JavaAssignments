package com.company.question4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AreaOfCircle areaOfCircle = new AreaOfCircle();
        double answer= areaOfCircle.area(12);
        System.out.println("Area of circle is "+answer);

        //user input(console or terminal input)
        System.out.println("Enter the Radius");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double answer2 = areaOfCircle.area(a);
        System.out.println("Area of circle is "+answer2);
    }
}
