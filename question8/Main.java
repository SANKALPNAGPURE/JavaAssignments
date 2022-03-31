package com.company.question8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CheckEvenNumber checkEvenNumber = new CheckEvenNumber();
        checkEvenNumber.even(25);

        //user input
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter a number");
        int n = sc.nextInt();
        checkEvenNumber.even(n);
    }
}
