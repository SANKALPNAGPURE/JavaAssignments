package com.company.question15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SumOfNaturalNumbers sumOfNaturalNumbers = new SumOfNaturalNumbers();
        int summ= sumOfNaturalNumbers.sum(5);
        System.out.println(summ);

        //user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
       int summ1 = sumOfNaturalNumbers.sum(n);
        System.out.println(summ1);
    }
}
