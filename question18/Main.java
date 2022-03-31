package com.company.question18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CircumferenceOfCircle circumferenceOfCircle = new CircumferenceOfCircle();
       double answer = circumferenceOfCircle.circle(20);
        System.out.println("Circumference of circle is "+answer);

        //user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle");
        int r =sc.nextInt();
        double answer2 = circumferenceOfCircle.circle(r);
        System.out.println("Circumference of circle is "+answer2);
    }
}
