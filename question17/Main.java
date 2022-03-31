package com.company.question17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SumOfAllOddNumbers sumOfAllOddNumbers = new SumOfAllOddNumbers();
       int sum= sumOfAllOddNumbers.odd(20);
        System.out.println(sum);

        // user input
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum1= sumOfAllOddNumbers.odd(a);
        System.out.println(sum1);

    }
}
