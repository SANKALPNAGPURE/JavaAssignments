package com.company.question11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NumberIsEvenOrOdd numberIsEvenOrOdd = new NumberIsEvenOrOdd();
        numberIsEvenOrOdd.check(46);

        // user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        numberIsEvenOrOdd.check(n);
    }
}
