package com.company.question13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LargestAmongThreeNumbers largestAmongThreeNumbers = new LargestAmongThreeNumbers();
        int a = largestAmongThreeNumbers.largest(12, 34, 54);
        System.out.println(a + "is the largest number");


        // user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a1 = sc.nextInt();
        System.out.println("Enter second number");
        int b1 = sc.nextInt();
        System.out.println("Enter third number");
        int c1 = sc.nextInt();
        int result = largestAmongThreeNumbers.largest(a1, b1, c1);
        System.out.println(result + " is the largest number");
    }
}
