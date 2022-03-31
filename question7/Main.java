package com.company.question7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SwappingTwoNumbers swappingTwoNumbers = new SwappingTwoNumbers();
         swappingTwoNumbers.swap(10,20);
         // user input( console input)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a");
        int a = sc.nextInt();
        System.out.println("Enter value of b");
        int b = sc.nextInt();
        swappingTwoNumbers.swap(a,b);


    }
}
